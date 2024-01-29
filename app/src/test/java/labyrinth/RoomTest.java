package labyrinth;

import org.junit.jupiter.api.Test;

import labyrinth.Domain.rooms.Room;
import labyrinth.Domain.rooms.RoomTypes;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {
    Room room = new Room();

    @Test void isMissingOnInit() {
        assertEquals(room.getType(), RoomTypes.MISSING);
    }

    @Test void correctTypeChange() {
        room.changeType(RoomTypes.EMPTY);
        assertEquals(room.getType(), RoomTypes.EMPTY);
    }
}
