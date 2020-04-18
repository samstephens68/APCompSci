
/**
 * Write a description of class Decryption here.
 *
 * @author Sam Stephens
 * @version 2/17/20
 */
public class Decryption
{
    private static String cipher = "";
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static String messageC = "";
    public static String messageCipher(int shiftKey, String message)
    {
        int ascii = 0;
        char[] array = new char[message.length()];
        for(int i = 0; i < message.length(); i++)
        {
            char character = message.charAt(i);
            if(((int) character- shiftKey) < 123 && ((int)character - shiftKey)  >= 97)
            {
               ascii = character - shiftKey;
            }
            else
            {
                ascii = (character - shiftKey) + 26;
            }
            array[i] = (char)ascii;
            System.out.println(array[i]);
        }
        messageC = new String(array);
        return messageC;
    } 
}
