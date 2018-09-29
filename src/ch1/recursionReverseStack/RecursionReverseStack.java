package ch1.recursionReverseStack;

import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

public class RecursionReverseStack {

	private Stack<Integer> stack;

	public static int getAndRemoveLastElement(Stack<Integer> stack) {
		int result = stack.pop();
		if(stack.empty()) {
			//递归出口
			return result;
		} else {
			//最终的last为栈底元素
			int last = getAndRemoveLastElement(stack);
			stack.push(result);
			return last;
		}
	}
	
	public static void reverse(Stack<Integer> stack) {
		if(stack.empty()) {
			//递归出口
			return;
		}
		int i = getAndRemoveLastElement(stack);
		reverse(stack);
		stack.push(i);
	}
	
	@Before
	public void before() {
		stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
	}
	
	@Test
	public void test1() {
		System.out.println(getAndRemoveLastElement(stack));	
	}
	
	@Test
	public void test2() {
		System.out.println("Before reverse: " + stack);
		reverse(stack);
		System.out.println("After reverse" + stack);
	}
}
