package ch1.twoStacksQueue;

import org.junit.Test;

public class MyTest {

	@Test
	public void test1() {
		TwoStacksQueue queue = new TwoStacksQueue();
		for(int i=1; i<=5; i++) {
			queue.add(i);
		}
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		for(int i=6; i<=8; i++) {
			queue.add(i);
		}
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
