import java.util.ArrayList;
/** During compilation, compiles but returns "Note: StringBag.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details."
*/
public class StringBag extends java.util.ArrayList implements SimpleCollection {
	/** Private Data:
            An Array of Strings called "strings" contains the strings that compose the StringBag
     */
  private ArrayList strings;
    /** Initializes an array of n empty strings */
	public StringBag() {
        this.strings = new ArrayList();
	}
   
   /** Ensures that this collection contains the specified element (optional operation). */
   
   public boolean add( Object o ){
   		return this.strings.add(o);
   }
   
    /** Removes all of the elements from this collection (optional operation). */

   public void clear(){
        this.strings.clear();
   }
   /** Returns true if this collection contains the specified element. */

    public boolean contains ( Object o ) {
    	return this.strings.contains(o);
    }
    
    /** Returns true if this collection contains no elements. */
    public boolean isEmpty() {
        return this.strings.size() == 0;
    }
    
    /** Removes a single instance of the specified element from this collection, if it is present. */
    public boolean remove ( Object o ) {
        return this.strings.remove(o);
    }
    
    /** Returns the number of elements in this collection. */
    public int size() {
    	return this.strings.size();
    }
    
    /** Returns an array containing all of the elements in this collection. */
    public Object[] toArray() {
    	return this.strings.toArray();
    }

}

