package labyrinth;

import org.junit.jupiter.api.Test;

import labyrinth.Domain.Labyrinth;
import labyrinth.Domain.rooms.Room;

import static org.junit.jupiter.api.Assertions.*;

public class LabyrinthTest {
    Labyrinth lab = new Labyrinth(3, 3);

    @Test
    void correctWidth() {
        assertEquals(lab.getWidth(), 3, "Incorrect labyrinth width");
    }

    @Test
    void correctHeight() {
        assertEquals(lab.getHeigth(), 3, "Incorrect labyrinth height");
    }

    @Test
    void isRoom() {
        assertInstanceOf(Room.class, lab.getRoom(0, 0));
    }

    @Test 
    void correctRoomList1() {
        assertEquals(lab.getNearRooms(0, 0).size(), 2);
    }
    
    @Test 
    void correctRoomList2() {
        assertEquals(lab.getNearRooms(2, 2).size(), 2);
    }

    @Test
    void correctRoomList3() {
        assertEquals(lab.getNearRooms(1, 1).size(), 4);
    }

    
}
