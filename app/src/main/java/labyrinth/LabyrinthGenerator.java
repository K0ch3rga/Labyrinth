package labyrinth;

import java.util.Random;

import labyrinth.rooms.RoomTypes;

// Made with Builder pattern
public class LabyrinthGenerator {
    private Random random;
    private int width = 10;
    private int height = 10;
    private int roomChance = 50;

    public LabyrinthGenerator(long seed) {
        random = new Random(seed);
    }

    // #region parameters
    public LabyrinthGenerator setWidth(int width) {
        this.width = width;
        return this;
    }

    public LabyrinthGenerator setHeigth(int height) {
        this.height = height;
        return this;
    }

    public LabyrinthGenerator setRoomChance(float roomChance) {
        // TODO make sure roomChanse only 0-1
        this.roomChance = Math.round(Integer.MAX_VALUE * roomChance);
        return this;
    }
    // #endregion

    public Labyrinth generateLabyrinth() {
        Labyrinth labyrinth = new Labyrinth(width, height);
        generateRooms(labyrinth);
        return labyrinth;
    }

    private void generateRooms(Labyrinth labyrinth) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int rnd = random.nextInt(100);
                System.out.println(rnd);
                if (rnd > roomChance) {
                    labyrinth.getRoom(x, y).changeType(RoomTypes.MISSING);
                } else {
                    labyrinth.getRoom(x, y).changeType(RoomTypes.EMPTY);
                }
            }
        }
    }
}
