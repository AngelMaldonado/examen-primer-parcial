package uaslp.enginering.exam.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {
    private String hotelName;

    private ArrayList<Reservation> reservations;
    private Room[] rooms;
    private int numberOfRooms;

    private static final int DEFAULT_ROOMS = 10;

    public Hotel(String hotelName) {
        this.hotelName = hotelName;
        numberOfRooms = 0;
    }

    public String getName() {
        return hotelName;
    }

    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();

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
        rooms[numberOfRooms] = newRoom;
        numberOfRooms++;
    }
}
