package com.coding.school.stringprograms;

public class CombinationString {
    private StringBuilder output = new StringBuilder();
    private final String inputstring;
    public CombinationString( final String str ){
        inputstring = str;
        System.out.println("The input string  is  : " + inputstring);
    }


    public static void main (String args[])
    {

        CombinationString combobj= new CombinationString("Leader");
        System.out.println("");
        System.out.println("");
        System.out.println("All possible combinations are :  ");
        System.out.println("");
        System.out.println("");
        combobj.combine();
    }

    public void combine() { combine( 0 ); }
    private void combine(int start ){
        for( int i = start; i < inputstring.length(); ++i ){
            output.append( inputstring.charAt(i) );
            System.out.println( output );
            if ( i < inputstring.length() )
                combine( i + 1);
            output.setLength( output.length() - 1 );
        }
    }
}
