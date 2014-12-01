public class ExpressionEvaluator{
	// private CustomStack stack;
	public static void main (String[] args){
		CustomStack stack = new CustomStack();
		int n;
		for (int i = 0; i<args.length; i++ ) {
			if( i < 2 ){
				try{
					n = Integer.parseInt( args[ i ] );
					stack.push(n);
				}
				catch( NumberFormatException e ) {
					System.out.println( "Illegal Input, there must be at least two operands before an operator." );
				}
			}else {
				try{
					n = Integer.parseInt( args[ i ] );
					stack.push(n);
				}
				catch( NumberFormatException e ) {

					int k = stack.pop();
					int j = stack.pop();
					switch( args[ i ] ){
						case "-": stack.push( j - k );
							break;
						case "x": stack.push( j * k );
							break;
						case "+": stack.push( j + k );
							break;
						case "/": stack.push( j / k );
							break;
						case "%": stack.push( j % k );
					}
				}
			}
		}
		System.out.println( stack.pop() );

		
	}
}