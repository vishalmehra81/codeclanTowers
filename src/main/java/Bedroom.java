public class Bedroom extends Room {
    private int roomNumber;
    private RoomType roomType;

    public Bedroom(int capacity){
        super(capacity);
        this.roomNumber = roomNumber;
        this.roomType = null;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }
}
