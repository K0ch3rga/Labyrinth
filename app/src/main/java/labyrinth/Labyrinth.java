package labyrinth;

import labyrinth.rooms.Room;

public class Labyrinth {
    Room[][] rooms;

    public Labyrinth(int width, int height) {
        rooms = new Room[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                rooms[x][y] = new Room();
            }
        }
    }

    public Room getRoom(int width, int height) {
        return rooms[width][height];
    }

    public void toConsole() {
        for (int x = 0; x < rooms.length; x++) {
            for (int y = 0; y < rooms[0].length; y++) {
                System.out.print(rooms[x][y] + "\t");
            }
            System.out.print("\n");
        }
    }

}
