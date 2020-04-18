/**
 * Write a description of class Encryption here.
 *
 * @author Sam Stephens
 * @version 2/17/20
 */
import java.util.Scanner;
public class CaesarTester
{
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int shiftKey = -1;
        int choice = 0;
        String message;
        while(shiftKey < 0 || shiftKey > 25)
        {
            System.out.println("Enter a value between 0 and 25: ");
            shiftKey = in.nextInt();
        }
        String cipherALPHABET = Encryption.cipherShift(shiftKey);
        System.out.println("Alphabet: " + ALPHABET);
        System.out.println("Cipher Alphabet: " + cipherALPHABET);
        while(choice != 3)
        {
            System.out.println("Would you like to encrypt or decrypt?");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.println("3. quit");
            choice = in.nextInt();
            
            if(choice == 1)
            {
                System.out.println("Please enter a message");
                message = in.next() + in.nextLine();
                message = message.toLowerCase();
                message = Encryption.messageCipher(shiftKey, message);
                System.out.println("your encrypted message is: " + message);
            }
            if(choice == 2)
            {
                System.out.println("Please enter a message");
                message = in.next() + in.nextLine();
                message = message.toLowerCase();
                message = Decryption.messageCipher(shiftKey, message);
                System.out.println("your decrypted message is: " + message);
            }
        }
    }
}