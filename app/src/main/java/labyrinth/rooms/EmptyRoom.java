package labyrinth.rooms;

public class EmptyRoom implements IRoom {
    RoomTypes type = RoomTypes.EMPTY;

    @Override
    public RoomTypes getType() {
        return type;
    }

    @Override
    public void onEnter() {
        System.out.println("Empty");
    }
}
