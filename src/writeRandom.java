import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class writeRandom {
    public static void main(String[] args) {
        int width = 1920;
        int height = 1080;
        int limit = 0xffffff;
        String readFile = "fil.txt";
        ArrayList<Integer> intList = new ArrayList<>();
        Random rn = new Random();

        for (int i = 0; i < width*height; i++) {
            intList.add(rn.nextInt(limit));
        }

        try {
            FileWriter fw = new FileWriter(readFile);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int i = 0; i < intList.size(); i++) {
                pw.println(intList.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
