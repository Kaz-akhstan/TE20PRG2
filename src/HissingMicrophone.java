import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.contains("ss"))
        {
            System.out.println("Hiss");
        }
        else {
            System.out.println("No Hiss");
        }
    }
}
