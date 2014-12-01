
public class CircularList {

	public Node current;
	private Node prev;

	public CircularList(){
		this.current = new Node();
		this.prev = new Node();
		this.prev.setNext( this.current );
	}
 
	public void add( int i ) {
		Node p = new Node( i );
		p.next = current.next;
		current.next = p;
		prev = current;

	}

	public boolean delete() {
		Node k = current;
		prev.next = k.next;
		current = k.next;
		return true;
	}

	public void next() {
		this.prev = current;
		current = current.next;
	}
}