package getMinStack;

import org.junit.Test;

public class MyTest {

	@Test
	public void test1() {
		MyStack1 stack1 = new MyStack1();
		stack1.push(3);
		stack1.push(4);
		stack1.push(5);
		stack1.push(1);
		stack1.push(2);
		stack1.push(1);
		System.out.println(stack1);
		System.out.println(stack1.pop());
		System.out.println(stack1.getMin());
		System.out.println(stack1);
	}
}
