package labyrinth.rooms;

public class EmptyRoom implements IRoom {

    @Override
    public void onEnter() {
        System.out.println("Empty");
    }
}
