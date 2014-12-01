public class Node{
	private int value;
	public Node next;

	public Node(){
		this.next = this;
	}
	public Node( int i ){
		this.value = i;
		this.next = this;
	}
	public int get() {
		return this.value;
	}
	public void set (int i ) {
		this.value = i;
	}
	public void setNext ( Node p ) {
		this.next = p;
	}

	public Node getValue () {
		return next;
	}

	public void delete() {
		this.next = this.getValue();
	}

}