import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class readWriteRandom {
    public static void main(String[] args) {
        String openFile = "fil.txt";
        String readFile = "binFil.txt";
        int i = 0;
        ArrayList<Integer>intList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(openFile));
            String x = "";
            while ((x = br.readLine()) != null)
            {
                intList.add(Integer.parseInt(x));
                i++;
                System.out.println(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        DataOutputStream outFile = openFile(readFile);
        writeFile(outFile, intList);
    }

    private static void writeFile(DataOutputStream outFile, ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size(); i++) {
            try {
                outFile.writeInt(intList.get(i));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static DataOutputStream openFile(String readFile) {
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(new FileOutputStream(readFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return out;
    }
}
