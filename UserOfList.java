/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inArraySlots list = new List_inArraySlots();

        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list);

        // Populate the list with diverse elements.
        list.add( "String", "okay!");
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added string: " + list);

        list.add( "Double", -2.618);
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added double: " + list);

        list.add( "Integer", 41);
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added int: " + list);

         // Add enough elements that expansion is expected
        for(int elemIndex = 0 ; elemIndex < 15; elemIndex++ ) {

             if( elemIndex == 10) System.out.println( "expansion expected");

             list.add( "Integer", -4);
             System.out.println( "number of elements: " + list.size() );
         }
         System.out.println("result of expanded list: "
              + list.size() + " elements:");
         System.out.println( list + System.lineSeparator());
    }
}
