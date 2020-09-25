package uaslp.enginering.exam.model;

public class Room {
    private int roomNumber;
    private String bedType;
    public RoomStatus roomStatus;

    public Room(int roomNumber, String bedType, RoomStatus roomStatus) {
        this.roomNumber = roomNumber;
        this.bedType = bedType;
        this.roomStatus = roomStatus;
    }
}
