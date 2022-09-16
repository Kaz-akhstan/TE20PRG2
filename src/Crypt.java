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
            msgByte.add(openFile.readByte());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < msgByte.size(); i++) {
            msg += msgByte.get(i);
        }
        System.out.println(msg);
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

    public String encrypt(String message, String key) {
        char[] encMsg = new char[message.length()];
        char[] keyList = new char[message.length()];
        String msg = "";

        for (int i = 0; i < key.length(); i++) {
            keyList[i] = key.charAt(i);
        }
        for (int i = 0; i < message.length(); i++) {
            encMsg[i] = (char) (message.charAt(i)^keyList[i]);
            msg += encMsg[i];
        }
        return msg;
    }

    public void outputToFile(String message, String filename)
    {
        DataOutputStream dos;
        try {
            dos = new DataOutputStream(new FileOutputStream(filename));
            dos.writeInt(Integer.parseInt(message));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
