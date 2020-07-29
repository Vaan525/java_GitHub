package June;

import java.util.*;

interface  IStack{
    boolean isEmpty();
    // ����, �迭�� ���� ������ ����� Ȯ��
    boolean isFull();
    // Ǯ���� ����
    void push(char item);
    // 0���ε������� ���� ����
    int pop();
    // ������ �ε����� ���� ���� ��Ȯ���� ����
    int peek();
    // ������ �ε����� �� Ȯ��
    void clear();
    // �ε��� �ʱ�ȭ
    
}


public class stack implements IStack {
	
	private int top;
	private static int stackSize;
	private char stackArr[];
	
	public stack(int stackSize) {
		this.stackSize = stackSize;
		stackArr = new char[this.stackSize];
	}
	
	
	public boolean isEmpty() {
		// ���Խ� ������� ������
		return (top == -1); // -1�� ������ �迭 �ε����� ������ 0���� �ϱ�.
	}
	
	
	public boolean isFull() {
		// ���Խ� ��á���� ������
		return (top == this.stackSize -1); // -1�ϴ� ������ �迭�� 3ĭ�̸� ������ �ε����� 2
	}
	
	
	public void push(char item) {
		// ���Ծ��� �ִ� �Լ�
		if(isFull()) {
			System.out.println("Stack is Full");
		} else {
			stackArr[++top] = item; // ���ؿ� ������ ���� �迭 ������� �迭 �� ����.
						// ++�ϴ� ������ ���ʿ� top�� -1�� �����߱� ����. 1�� ���ϴϱ�
						// -1���� 1���ؼ� 0��° �ε��� ���� item�� ä���.
			System.out.println("Inserted item : "+item);
		}
	}
	
	
	
	public int pop() {
		// ���Խ����� ������ �Լ�
		if(isFull()) {
			System.out.println("Stack is Empty");
			return 0; // ������� ���ؿ��� ���� ���� ����.
		} else {
			System.out.println("Deleted Item : "+stackArr[top]);
			// 3��¥�� �����̶� ġ�� �������ε����� 2�ϱ� 
			// push�� �ݴ�
			return stackArr[--top];
		}
		
	}
	
	public int peek() {
		// ���Ծ��� ������ �Է°� Ȯ��
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		} else 
			System.out.println("peeked item : "+ stackArr[top]);
			return stackArr[top];
	}
	
	public void clear() {
		// �и�����
		if(isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			top = -1;
			stackArr = new char[this.stackSize];
			System.out.println("Stack is clean");
		}
	}
	
	public void showStack() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Stack elements : ");
			for(int i = 0; i <=top; i++) {
				System.out.print(stackArr[i]+"  ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		
		
		stack sc = new stack(5);
		
		sc.push('A');
		sc.showStack();
		
		System.out.println("-----");
		
		sc.push('B');
		sc.showStack();
		
		System.out.println("-----");
		
		sc.push('1');
		sc.showStack();
;		sc.peek();

		System.out.println("-----");

		sc.pop();
		sc.showStack();    
		    
		System.out.println("-----");
		
		    
		    
	}



}
