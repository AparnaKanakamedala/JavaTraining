package alternate;

public class StackExample {

	static final int MAX = 1000;
	int top;
	int arr[] = new int[MAX];
	
	boolean isEmpty() {
		return(top<0);
	}
	StackExample() {
		top = -1;
	}
	
	boolean push(int x) {
		if(top>=(MAX-1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			arr[++top] = x;
			System.out.println(x+" pushed into stack");
			return true;
		}
	}
	int pop() {
		if(top<0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x= arr[top--];
			return x;
		}
	}
	int top() {
		if(top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x=arr[top];
			return x;
		}
	}
	public static void main(String[] args) {
		StackExample se=new StackExample();
		se.push(10);
		se.push(15);
		se.push(45);
		System.out.println(se.pop()+" popped from stack");
	}
}
