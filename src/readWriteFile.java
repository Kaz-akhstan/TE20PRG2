import java.io.*;
import java.util.ArrayList;

public class readWriteFile {
    public static void main(String[] args) {
        String filename = "fil.txt";
        String binFileName = "binFil.txt";
        BufferedReader inFile = openReadFile(filename);
        ArrayList<String> fileContent = readFile(inFile);
        DataOutputStream outFile = writeToBinary(binFileName);
        writeFile(fileContent, outFile);
    }

    private static void writeFile(ArrayList<String> fileContent, DataOutputStream outFile) {
        for (int i = 0; i < fileContent.size(); i++) {
            try {
                byte[] newByte = fileContent.get(i).getBytes(); //NullPointerException
                outFile.write((newByte));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static DataOutputStream writeToBinary(String binFileName) {
        DataOutputStream outFile = null;
        try {
            outFile = new DataOutputStream(new FileOutputStream(binFileName));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return outFile;
    }

    private static ArrayList<String> readFile(BufferedReader inFile) {
        ArrayList<String> content = new ArrayList<>();
        try {
            String ln = inFile.readLine();
            while (ln != null)
            {
                ln = inFile.readLine();
                content.add(ln);
            }
            inFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    private static BufferedReader openReadFile(String filename) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return in;
    }
}
