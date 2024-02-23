package labyrinth.Domain;

import java.util.List;
import java.util.Random;

import labyrinth.Domain.rooms.Room;
import labyrinth.Domain.rooms.RoomTypes;

// Made with Builder pattern
public class RandomGenerator implements LabyrinthGenerator {
    private Random random;
    private int width = 10;
    private int height = 10;
    private int roomChance = 90;
    private int closePathChanse = 75;

    public RandomGenerator(long seed) {
        random = new Random(seed);
    }

    // #region parameters
    public RandomGenerator setWidth(int width) {
        this.width = width;
        return this;
    }

    public RandomGenerator setHeigth(int height) {
        this.height = height;
        return this;
    }

    public RandomGenerator setRoomChance(float roomChance) {
        // TODO make sure roomChanse only 0-1
        this.roomChance = (int)Math.floor(roomChance * 100)%100;
        return this;
    }
    // #endregion

    public Labyrinth generateLabyrinth() {
        Labyrinth labyrinth = new Labyrinth(width, height);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                generateRooms(labyrinth, x, y);
                generatePaths(labyrinth, x, y);
            }
        }
        return labyrinth;
    }

    private void generateRooms(Labyrinth labyrinth, int width, int height) {
        int rnd = random.nextInt(100);
        if (rnd > roomChance) {
            labyrinth.getRoom(width, height).changeType(RoomTypes.MISSING);
        } else {
            labyrinth.getRoom(width, height).changeType(RoomTypes.EMPTY);
        }
    }

    private void generatePaths(Labyrinth labyrinth, int width, int height) {
        List<Room> paths = labyrinth.getAllPaths(width, height);
        for (Room room : labyrinth.getNearRooms(width, height)) {
            int rnd = random.nextInt(100);
            if (rnd > closePathChanse) {
                paths.add(room);
            } else {
                // paths.remove(room);
            }
        }
    }
}
