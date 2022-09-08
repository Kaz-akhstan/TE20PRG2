import java.util.Random;
import java.util.Scanner;

public class BSP {
    Node root;
    BSP(int x, int y, int width, int height)
    {
        root = new Node(x, y, width, height);
    }
    public static void main(String[] args) {
        int width = 16;
        int height = 16;
        boolean vertical = false;
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        while (true)
        {
            if(sc.nextLine()!=null)
            {
                vertical = !vertical;
                if(vertical)
                {

                }
                else
                {

                }
            }
        }
    }
}
