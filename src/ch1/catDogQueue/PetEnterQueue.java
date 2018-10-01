package ch1.catDogQueue;

/**
 * 这个类用来记录不同pet类型进出队列的时间
 */
public class PetEnterQueue {

	private Pet pet;
	private long count; // 记录pet进队时间

	public PetEnterQueue(Pet pet, long count) {
		this.pet = pet;
		this.count = count;
	}

	public Pet getPet() {
		return pet;
	}

	public long getCount() {
		return count;
	}

	public String getEnterPetType() {
		return this.pet.getPetType();
	}
}
