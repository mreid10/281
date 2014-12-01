public class CustomStack{
	private Node end;
	private Node current;

	public CustomStack(){
		this.end = new Node();
		this.current = this.end;
	}

	public int pop(){
		Node p = this.current;
		current = p.next;
		return p.get();
	}

	public boolean push( int i ) {
		Node n = new Node(i);
		n.setNext(current);
		current = n;
		return true;
	}


}