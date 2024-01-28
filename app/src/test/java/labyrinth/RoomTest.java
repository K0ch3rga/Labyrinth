package labyrinth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import labyrinth.rooms.Room;
import labyrinth.rooms.RoomTypes;

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
