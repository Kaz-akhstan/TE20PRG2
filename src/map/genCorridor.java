package map;

import java.util.ArrayList;
import java.util.Random;

public class genCorridor {

    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        int direction = 1;
        ArrayList<room>roomList = new ArrayList<>();
        while (true)
        {
            Random rn = new Random();
            int randDir = rn.nextInt(4);
            room newRoom = new room();
            switch (randDir)
            {
                case 0:
                    if(direction != 0) //Gå vänster
                    {
                        newRoom.x = x-1;
                        newRoom.y = y;
                    }
                    else
                    {
                        newRoom.x = x;
                        newRoom.y = y;
                    }
                    break;
                case 1:
                    if(direction != 1) //Gå upp
                    {
                        newRoom.x = x;
                        newRoom.y = y-1;
                    }
                    else
                    {
                        newRoom.x = x;
                        newRoom.y = y;
                    }
                    break;
                case 2:
                    if(direction != 2) //Gå höger
                    {
                        newRoom.x = x+1;
                        newRoom.y = y;
                    }
                    else
                    {
                        newRoom.x = x;
                        newRoom.y = y;
                    }
                    break;
                case 3:
                    if(direction != 3) //Gå ner
                    {
                        newRoom.x = x;
                        newRoom.y = y+1;
                    }
                    else
                    {
                        newRoom.x = x;
                        newRoom.y = y;
                    }
                    break;
            }
            roomList.add(newRoom);
        }
    }
}
