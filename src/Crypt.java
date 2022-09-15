import java.io.*;
import java.util.ArrayList;

public class Crypt {
    String filename;
    String message;

    String keyFilename;
    String key;

    public String readFile(String filename)
    {
        String msg = "";
        ArrayList<Byte>msgByte = new ArrayList<>();
        try {
            DataInputStream openFile = new DataInputStream(new FileInputStream(filename));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return msg;
    }

    public void crypt(String message, String key, String keyFilename)
    {
        if(key == null)
        {
            key = readKey(keyFilename);
        }
        encrypt(message, key);
    }

    public String readKey(String keyFilename)
    {
        String key = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(keyFilename));
            key = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return key;
    }

    private void encrypt(String message, String key) {

    }
}
