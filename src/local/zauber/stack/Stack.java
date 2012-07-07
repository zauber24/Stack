package local.zauber.stack;

public class Stack {
	
	int size = 0;
	int[] stack = new int[10];

	public Boolean isEmpty() {
		return this.size == 0;
	}

	public void push(int i) {
		
		if(size == stack.length){
			int[] largeStack = new int[size * 2];
			for(int j = 0; j < size; j++){
				largeStack[j] = this.stack[j];
			}
			this.stack = largeStack;
		}
		
		this.stack[size] = i;
		this.size++;
	}

	public int size() {
		return this.size;
	}

	public int pop() {
		return stack[--size];
	}

	public int top() {
		return stack[size - 1];
	}

	public int search(int i) {
		for(int j = size - 1; j >= 0 ; j--){
			if(this.stack[j] == i){
				return size - j;
			}
		}
		return -1;
	}

}
