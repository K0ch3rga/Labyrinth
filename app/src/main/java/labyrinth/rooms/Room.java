package labyrinth.rooms;


/**
 * Room of Labyrinth <p>
 * Made with State pattern <p>
 * For all types see {@link RoomTypes}
 * 
 */
public class Room implements IRoom {
    private IRoom roomType;


    /**
     * Creates new Room of type {@link MissingRoom}
     */
    public Room() {
        roomType = new MissingRoom();
    }

    /**
     * Changes Room type
     * @param types 
     */
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
    public RoomTypes getType() {
        return roomType.getType();
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
