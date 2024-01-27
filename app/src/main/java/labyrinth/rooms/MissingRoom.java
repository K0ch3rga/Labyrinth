package labyrinth.rooms;

public class MissingRoom implements IRoom {
    RoomTypes type = RoomTypes.MISSING;

    @Override
    public void onEnter() {
        System.out.println("Missing");
    }

}
