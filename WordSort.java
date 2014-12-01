public class WordSort {
	public static void main(String[] args) throws Exception{
		ArrayList list = new ArrayList();
		java.io.BufferedReader stdIn = new java.io.BufferedReader(new java.io.inputStreamReader( System.in ) );
		String s = stdIn.readLine(); //grab first line of stdIn
		while (s != null ){
			process( s );
			s = stdIn.readLine();
		} 
		if ( args[0] == "-sensitive" ) {


		}else{

		}

	}
}