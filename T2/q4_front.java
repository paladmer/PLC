import java.util.*;
public class front{
	/*** Variables */
	public static int charClass;

	public static byte[] lexeme = new byte[100];

	public static byte nextChar;

	public static int lexLen;

	public static int token;

	public static int nextToken;

	/** * Function declarations */
	public static native int lookup(byte ch);

	public static native void addChar();

	public static native void getChar();

	public static native void getNonBlank();

	public static native int lex();


     public static void main(String []args){
       
     }
}
