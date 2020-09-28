public class ConferenceRoom extends Room {
    private String conRoomName;

    public ConferenceRoom(int capacity){
        super(capacity);
        this.conRoomName = conRoomName;
    }

    public String getConRoomName() {
        return conRoomName;
    }

    public void setConRoomName(String conRoomName) {
        this.conRoomName = conRoomName;
    }
}
