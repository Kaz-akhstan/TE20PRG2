import java.util.Scanner;

public class HumanCannonball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        float v = 0;
        float a = 0;
        float x = 0;
        float h1 = 0;
        float h2 = 0;
        int current = 0;
        String temp = "";
        
        for (int i = 0; i < num; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != ' ')
                {
                    temp+= s.charAt(j);
                }
                else {
                    switch (current)
                    {
                        case 0:
                            v = Float.parseFloat(temp);
                            break;
                        case 1:
                            a = Float.parseFloat(temp);
                            break;
                        case 2:
                            x = Float.parseFloat(temp);
                            break;
                        case 3:
                            h1 = Float.parseFloat(temp);
                            break;
                        case 4:
                            h2 = Float.parseFloat(temp);
                            break;
                    }
                    current++;
                    temp = "";
                }
            }
        }
    }
}
