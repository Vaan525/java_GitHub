package June;

import java.util.*;

interface  IStack{
    boolean isEmpty();
    // 스텍, 배열의 값이 지정이 됬는지 확인
    boolean isFull();
    // 풀스텍 인지
    void push(char item);
    // 0번인덱스부터 값을 지정
    int pop();
    // 마지막 인덱스의 값을 추출 정확히는 삭제
    int peek();
    // 마지막 인덱스의 값 확인
    void clear();
    // 인덱스 초기화
    
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
		// 빠게스 비었는지 참거짓
		return (top == -1); // -1인 이유는 배열 인덱스의 시작은 0부터 니까.
	}
	
	
	public boolean isFull() {
		// 빠게스 다찼는지 참거짓
		return (top == this.stackSize -1); // -1하는 이유도 배열이 3칸이면 마지막 인덱스는 2
	}
	
	
	public void push(char item) {
		// 빠게쓰에 넣는 함수
		if(isFull()) {
			System.out.println("Stack is Full");
		} else {
			stackArr[++top] = item; // 스텍에 넣으면 스텍 배열 순서대로 배열 값 저장.
						// ++하는 이유는 애초에 top를 -1로 설정했기 떄문. 1씩 더하니까
						// -1에서 1더해서 0번째 인덱스 부터 item을 채운다.
			System.out.println("Inserted item : "+item);
		}
	}
	
	
	
	public int pop() {
		// 빠게스에서 나오는 함수
		if(isFull()) {
			System.out.println("Stack is Empty");
			return 0; // 비었으니 스텍에서 나갈 값이 없다.
		} else {
			System.out.println("Deleted Item : "+stackArr[top]);
			// 3개짜리 스텍이라 치면 마지막인덱스가 2니까 
			// push의 반대
			return stackArr[--top];
		}
		
	}
	
	public int peek() {
		// 빠게쓰의 마직막 입력값 확인
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		} else 
			System.out.println("peeked item : "+ stackArr[top]);
			return stackArr[top];
	}
	
	public void clear() {
		// 분리수거
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
