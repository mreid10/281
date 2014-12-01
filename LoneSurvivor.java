/**
works for given case but not much else, I dont think the 0 node is ever deleted
*/
public class LoneSurvivor {
	public static void main(String[] args) {
		int kills = 0;
		int n = Integer.parseInt( args[ 0 ] ); //parses # of people
		int k = Integer.parseInt( args[ 1 ] ); //parses # of passes
		CircularList cl = new CircularList();  //creates new circle of people
		for ( int i = 0; i < n ; i++ ) {	   //fill the circle
			cl.add(i);	
		}
		cl.next();							   // makes current 0
		while ( kills < n ){				   // while the # kills < # people, 
			for ( int a = 0; a < k ; a++) {    // steps through k passes
				cl.next();
			}
			//System.out.println ( cl.current.get() ); //prints kills							// reset a
			cl.delete();
			kills++;
		}
		System.out.println ( cl.current.get() ); 	//prints "name" of last kill
	}
}