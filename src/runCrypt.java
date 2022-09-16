public class runCrypt {
    public static void main(String[] args) {
        Crypt c = new Crypt();
        c.filename = "key.txt";
        c.keyFilename = "message.txt";

        c.message = c.readFile(c.filename);
        c.message = "jurkaburka33,59753867 din moder på en pizza";
        c.crypt(c.message, c.key, c.keyFilename);
        c.key = c.readKey(c.keyFilename);
        System.out.println(c.key);
        c.message = c.encrypt(c.message, c.key);
        c.outputToFile(c.message, c.filename);
    }
}
