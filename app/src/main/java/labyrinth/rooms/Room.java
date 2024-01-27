package labyrinth.rooms;

// Made with State pattern
public class Room implements IRoom {
    IRoom roomType ;

    public void changeType(RoomTypes types) {
        switch (types) {
            case EMPTY:
                roomType = new EmptyRoom();
                break;
            case MISSING:
                roomType = new MissingRoom();
                break;
            case START:
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public void onEnter() {
        roomType.onEnter();
    }

    @Override
    public String toString() {
        return roomType.toString();
    }
}
