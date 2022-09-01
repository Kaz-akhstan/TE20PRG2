package map;

import java.util.ArrayList;
import java.util.Random;

public class drawMap {
    public static void main(String[] args) {
        int width = 16;
        int height = 16;
        int x = 7;
        int y = 7;
        int direction = 0;
        boolean b = false;
        ArrayList<room>roomList = new ArrayList<>();

        for (int i = 0; i < 18; i++) {
            Random rn = new Random();
            direction = rn.nextInt(4);
            room nr = new room();
            switch (direction)
            {
                case 0: //Upp
                    y++;
                    break;
                case 1: //Höger
                    x++;
                    break;
                case 2: //Ner
                    y--;
                    break;
                case 3: //Vänster
                    x--;
                    break;
            }
            nr.x = x;
            nr.y = y;
            roomList.add(nr);
        }
        for (int i = 0; i < height; i++) {
            String s = "";
            for (int j = 0; j < width; j++) {
                for (int k = 0; k < roomList.size(); k++) {
                    if(roomList.get(k).x == j && roomList.get(k).y == i)
                    {
                        b = true;
                        break;
                    }
                    else{
                        b = false;
                    }
                }
                if(b)
                {
                    s+="#";
                }
                else{
                    s+=".";
                }
            }
            System.out.println(s);
        }
    }
}
