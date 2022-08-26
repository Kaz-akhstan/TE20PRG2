import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Therapist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int limit = 3+rn.nextInt(5);
        if(sc.nextLine().toLowerCase().equals("hej"))
        {
            System.out.println("Välkommen till Terapi. Börja prata.");
        }
        else {
            System.exit(1);
        }
        for (int i = 0; i < limit; i++) {
            String s = sc.nextLine();
            if(!s.equals(""))
            {
                save(s);
                respond();
            }
        }
        sc.nextLine();
        System.out.println("Bort från mitt ansikte, mötet är över.");
        System.exit(1);
    }
    static void respond()
    {
        int lines = 6;
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader("C:\\Users\\rasmus.johansson27\\IdeaProjects\\TE20PRG2\\src\\Lines"));
            String line = reader.readLine();
            Random rn = new Random();
            int randLine = rn.nextInt(lines);
            for (int i = 0; i < randLine; i++) {
                line = reader.readLine();
            }
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void save(String s)
    {
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader("C:\\Users\\rasmus.johansson27\\IdeaProjects\\TE20PRG2\\src\\Lines"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
