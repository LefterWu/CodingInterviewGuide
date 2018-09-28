package getMinStack;

import java.util.ArrayList;
import java.util.List;

public class MyStack1 {

	//分别定义两个栈
	private List<Integer> stackData =  new ArrayList<>();
	private List<Integer> stackMin	= new ArrayList<>();

	
	@Override
	public String toString() {
		return "MyStack1 [stackData=" + stackData + ", stackMin=" + stackMin + "]";
	}

	/**
	 * 压入
	 * @param newNum 新压入的数
	 */
	public void push(int newNum) {
		stackData.add(newNum);
		if(stackMin.isEmpty()) {
			stackMin.add(newNum);
		} else if(newNum < stackMin.get(stackMin.size()-1)) {
			stackMin.add(newNum);
		}
	}
	
	/**
	 * 弹出
	 * @return 弹出的值
	 */
	public int pop() {
		if(stackData.isEmpty()) {
			throw new RuntimeException("Your dataStack is empty");
		}
		Integer value = stackData.get(stackData.size()-1);
		stackData.remove(stackData.size()-1);
		if(value == stackMin.get(stackMin.size()-1)) {
			stackMin.remove(stackMin.size()-1);
		}
		return value;
	}
	
	/**
	 * 得到栈中的最小值
	 * @return 最小元素
	 */
	public int getMin() {
		if(stackMin.isEmpty()) {
			throw new RuntimeException("Your minStack is empty");
		}
		Integer min = stackMin.get(stackMin.size()-1);
		return min;
	}
}
