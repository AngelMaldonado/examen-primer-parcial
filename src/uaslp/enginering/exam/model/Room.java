package uaslp.enginering.exam.model;

public class Room {
    private int roomNumber;
    private String bedType;
    private RoomStatus roomStatus;

    public Room(int roomNumber, String bedType, RoomStatus roomStatus) {
        this.roomNumber = roomNumber;
        this.bedType = bedType;
        this.roomStatus = roomStatus;
    }

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }
}
