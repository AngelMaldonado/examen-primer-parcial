package uaslp.enginering.exam.model;

public class Reservation {
    private Room reservatedRoom;
    private String arrivalDate;
    private Guest guest;
    private int nights;
    public Reservation(Room reservatedRoom) {
        this.reservatedRoom = reservatedRoom;
    }

    public void setRoomNumber(int roomNumber) {
        reservatedRoom.setRoomNumber(roomNumber);
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public int getRoomNumber() {
        return reservatedRoom.getRoomNumber();
    }

    public Guest getGuest() {
        return guest;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public int getNights() {
        return nights;
    }
}
