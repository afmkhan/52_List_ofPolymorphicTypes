/**
  Implement a list of integer intElements, including
  both data and operations.
 */

public class List_inArraySlots {

    private Object[] objectElements;
    private int filledElements; // the number of intElements in this list
    
    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
                                     1 means element i is a double;
                                     2 means element i is a String.
        Optional extra education in programming (not comp sci):
            replace these "magic numbers" with an "enumerated type".
     */
    private String[] typeOfElements;

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        objectElements = new Object[INITIAL_CAPACITY];
        typeOfElements = new String[INITIAL_CAPACITY];
                
    }


    /**
      @return the number of intElements in this list
     */
    public int size() {
        return filledElements;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
    String total = "[";
    for (Object o: objectElements) {total += o + ", ";}
    return (total + "]");
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( String type,   // same meaning as in typeOfElements
                         Object actualObject
                       ) {
        if( filledElements == objectElements.length) expand();
        typeOfElements[filledElements] = type;
        objectElements[filledElements++] = actualObject;        
        
        return true;
                       
     }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
     private void expand() {
        System.out.println( "expand... (for debugging)");
           /* S.O.P. rules for debugging:
              Working methods should be silent. But during
              development, the programmer must verify that
              this method is called when that is appropriate.
              So test using the println(), then comment it out.
              */
        Object[] typeBigger = new Object[ typeOfElements.length * 2];
        String[] stringBigger = new String[ typeOfElements.length * 2];
        for( int elemIndex = 0; elemIndex < filledElements; elemIndex++) {
            typeBigger[ elemIndex] = objectElements[ elemIndex];
            stringBigger[ elemIndex] = typeOfElements[ elemIndex];
        }
        objectElements = typeBigger;
        typeOfElements = stringBigger;
        
        

        
      }
}
