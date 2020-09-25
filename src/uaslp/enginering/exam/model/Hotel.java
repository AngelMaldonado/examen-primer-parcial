package uaslp.enginering.exam.model;

import java.util.ArrayList;

public class Hotel {
    private String hotelName;

    private ArrayList<Reservation> reservations;
    private ArrayList<Room> rooms;
    private int numberOfRooms;

    public Hotel(String hotelName) {
        this.hotelName = hotelName;
        reservations = new ArrayList<>();
        rooms = new ArrayList<>();
        numberOfRooms = 0;
    }

    public String getName() {
        return hotelName;
    }

    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        int roomPosition;
        // Searches for the roomNumber in the array of rooms of the hotel
        for (roomPosition = 0;
             roomPosition < numberOfRooms && rooms.get(roomPosition).getRoomNumber() != roomNumber;
             roomPosition++);

        if (roomNumber == numberOfRooms) {
            System.out.println("Invalid room number!");
            return;
        }

        Room reservatedRoom = new Room(rooms.get(roomPosition).getRoomNumber(), rooms.get(roomPosition).getBedType(), rooms.get(roomPosition).getRoomStatus());

        Reservation reservation = new Reservation(reservatedRoom);

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);

        reservations.add(reservation);
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void addRoom(Room newRoom) {
        rooms.add(newRoom);

        numberOfRooms++;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
