package ch1.catDogQueue;

import java.util.LinkedList;
import java.util.Queue;

public class CatDogQueue {

	private Queue<PetEnterQueue> dogQueue;	
	private Queue<PetEnterQueue> catQueue;
	private long count;	//时间戳

	public CatDogQueue() {
		this.dogQueue = new LinkedList<PetEnterQueue>();
		this.catQueue = new LinkedList<PetEnterQueue>();
		this.count = 0;
	}

	public void add(Pet pet) {
		if(pet.getPetType().equals("dog")) {
			dogQueue.add(new PetEnterQueue(pet, this.count++));
		} else if(pet.getPetType().equals("cat")) {
			catQueue.add(new PetEnterQueue(pet, this.count++));
		} else {
			throw new RuntimeException("type error, not cat or dog");
		}
	}

	public Pet pollAll() {
		if(!dogQueue.isEmpty() && !catQueue.isEmpty()) {
			//如果dog添加时间早，poll狗
			if(dogQueue.peek().getCount() < catQueue.peek().getCount()) {
				return dogQueue.poll().getPet();
			} else {
				//否则poll猫
				return catQueue.poll().getPet();
			}
		} else if(!dogQueue.isEmpty()) {
			return dogQueue.poll().getPet();
		} else if(!catQueue.isEmpty()) {
			return catQueue.poll().getPet();
		} else {
			throw new RuntimeException("the queue is empty");
		}
	}

	public Dog pollDog() {
		if(!this.isDogEmpty()) {
			return (Dog) dogQueue.poll().getPet();
		} else {
			throw new RuntimeException("dog queue is empty");
		}
	}

	public Cat pollCat() {
		if(!this.isCatEmpty()) {
			return (Cat) catQueue.poll().getPet();
		} else {
			throw new RuntimeException("cat queue is empty");
		}
	}

	public boolean isEmpty() {
		return dogQueue.isEmpty() && catQueue.isEmpty();
	}

	public boolean isDogEmpty() {
		return dogQueue.isEmpty();
	}

	public boolean isCatEmpty() {
		return catQueue.isEmpty();
	}
}
