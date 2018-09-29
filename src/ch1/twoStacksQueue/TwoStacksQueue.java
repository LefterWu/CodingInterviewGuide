package ch1.twoStacksQueue;

import java.util.Stack;

public class TwoStacksQueue {

	private Stack<Integer> stackPush;
	private Stack<Integer> stackPop;
	
	public TwoStacksQueue() {
		stackPush = new Stack<Integer>();
		stackPop = new Stack<Integer>();
	}
	
	/**
	 * 添加到队列末尾
	 * @param newNum 新加入的数
	 */
	public void add(int newNum) {
		stackPush.push(newNum);
	}
	
	/**
	 * 取出队首元素
	 * @return 取出的数值
	 */
	public int poll() {
		//如果两个栈都为空，则抛出异常
		if(stackPush.empty() && stackPop.empty()) {
			throw new RuntimeException("The queue is empty");
		} else if(stackPop.empty()) {
			//如果只有stackPop为空，则一次性将数据从stackPush压入stackPop
			while(!stackPush.empty()) {
				stackPop.push(stackPush.pop());
			}
		}
		//执行pop操作并返回队首元素
		return stackPop.pop();
	}
	
	/**
	 * 查看队首元素
	 * @return 
	 */
	public int peek() {
		//如果两个栈都为空，则抛出异常
		if(stackPush.empty() && stackPop.empty()) {
			throw new RuntimeException("The queue is empty");
		} else if(stackPop.empty()) {
			//如果只有stackPop为空，则一次性将数据从stackPush压入stackPop
			while(!stackPush.empty()) {
				stackPop.push(stackPush.pop());
			}
		}
		//返回队首元素
		return stackPop.peek();
	}

	@Override
	public String toString() {
		return "TwoStacksQueue [stackPush=" + stackPush + ", stackPop=" + stackPop + "]";
	}
	
	
}
