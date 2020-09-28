public abstract class Room {
    private Guest guest;
    private RoomType roomType;

    public Room(Guest guest, RoomType roomType) {
        this.guest = guest;
        this.roomType = roomType;
    }

    public Guest getGuest() {
        return this.guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }
}
