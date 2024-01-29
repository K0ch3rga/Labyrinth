package labyrinth.Domain.rooms;

public interface IRoom {
    public RoomTypes getType();
    public void onEnter();
}
