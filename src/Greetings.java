import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String nS = "h";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='e')
            {
                nS += "ee";
            }
        }
        nS += "y";
        System.out.println(nS);
    }
}
