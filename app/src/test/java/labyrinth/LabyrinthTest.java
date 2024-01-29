package labyrinth;

import org.junit.jupiter.api.Test;

import labyrinth.Domain.Labyrinth;
import labyrinth.Domain.rooms.Room;

import static org.junit.jupiter.api.Assertions.*;

public class LabyrinthTest {
    Labyrinth lab = new Labyrinth(2, 2);

    @Test
    void correctWidth() {
        assertEquals(lab.getWidth(), 2, "Incorrect labyrinth width");
    }

    @Test
    void correctHeight() {
        assertEquals(lab.getHeigth(), 2, "Incorrect labyrinth height");
    }

    @Test
    void isRoom() {
        assertInstanceOf(Room.class, lab.getRoom(0, 0));
    }
}
