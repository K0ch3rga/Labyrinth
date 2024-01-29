package labyrinth.Domain;

import labyrinth.Domain.rooms.Room;

/**
 * Class to contain information about Labyrinth
 * It must have methods to get data
 * @see Room
 */
public class Labyrinth {
    Room[][] rooms;

    /**
     * Initializes all rooms according to the specified width and height
     * 
     * @param width
     * @param height
     */
    public Labyrinth(int width, int height) {
        rooms = new Room[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                rooms[x][y] = new Room();
            }
        }
    }

    /**
     * @return Width of Labyrinth
     */
    public int getWidth() {
        return rooms.length;
    }

    /**
     * @return Heigth of Labyrinth
     */
    public int getHeigth() {
        return rooms[0].length;
    }

    /**
     * Returns Room from specified location
     * 
     * @param width
     * @param height
     * @return Room
     * @see Room
     */
    public Room getRoom(int width, int height) {
        return rooms[width][height];
    }

    /**
     * Creates grid of Rooms by width and height
     */
    @Override
    public String toString() {
        String result = "";
        for (int x = 0; x < rooms.length; x++) {
            for (int y = 0; y < rooms[0].length; y++) {
                result = result + rooms[x][y] + "\t";
            }
            result = result + "\n";
        }
        return result;
    }

}
