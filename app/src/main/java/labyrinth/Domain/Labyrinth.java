package labyrinth.Domain;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import labyrinth.Domain.rooms.Room;

/**
 * Class to contain information about Labyrinth
 * It must have methods to get data
 * @see Room
 */
public class Labyrinth {
    Room[][] rooms;
    Map<Room, List<Room>> paths;

    /**
     * Initializes all rooms according to the specified width and height
     * 
     * @param width
     * @param height
     */
    public Labyrinth(int width, int height) {
        rooms = new Room[width][height];
        paths = new HashMap<Room, List<Room>>();
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                rooms[x][y] = new Room();
                paths.put(rooms[x][y], new ArrayList<>());
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
     * @param width
     * @param height
     * @return list of Rooms in cross pattern
     */
    public List<Room> getNearRooms(int width, int height) {
        List<Room> nearRooms = new ArrayList<>();
        if (height > 0)
            nearRooms.add(getRoom(width, height-1));
        if (height < getHeigth()-1)
            nearRooms.add(getRoom(width, height+1));
        if (width > 0)
            nearRooms.add(getRoom(width-1, height));
        if (width < getWidth()-1)
            nearRooms.add(getRoom(width+1, height));
        return nearRooms;
    }

    /**
     * @param width
     * @param height
     * @return list of path leading from specified location
     */
    public List<Room> getPaths(int width, int height) {
        return paths.get(getRoom(width, height));
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
