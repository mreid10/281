public class Node{
	private int value;
	public Node next;

	public Node(){
		this.next = null;
	}
	public Node( int i ){
		this.value = i;
		this.next = null;
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