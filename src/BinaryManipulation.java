import java.util.Random;
import java.util.Scanner;

public class BinaryManipulation {
    //z=x^y && x=z^y
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] msg = new char[s.length()];
        int[] cMsg = new int[s.length()];
        String crypt = "";

        int k = 2035;
        System.out.println("Key: " + k);

        for (int i = 0; i < s.length(); i++) {
            msg[i] = s.charAt(i);
        }

        for (int i = 0; i < msg.length; i++) {
            cMsg[i]=msg[i]^k;
            crypt+=(char)cMsg[i];
        }

        System.out.println(crypt + "\nEncrypted");

        crypt="";
        for (int i = 0; i < msg.length; i++) {
            msg[i]= (char) (cMsg[i]^k);
            crypt+=msg[i];
        }
        System.out.println(crypt + "\nDecrypted");
    }
}
