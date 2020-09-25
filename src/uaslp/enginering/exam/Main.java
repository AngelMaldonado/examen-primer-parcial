package uaslp.enginering.exam;

import uaslp.enginering.exam.model.Guest;
import uaslp.enginering.exam.model.Hotel;
import uaslp.enginering.exam.model.Reservation;
import uaslp.enginering.exam.model.Room;
import uaslp.enginering.exam.model.RoomStatus;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Hotel hotel = prepareHotel();
        Guest gregorio = new Guest();
        Guest lucia = new Guest();

        gregorio.setName("Gregorio H. Latham");
        gregorio.setAddress("Colonia Ofir 8720 65001 San Javier");
        gregorio.setCountry("Uruguay");
        gregorio.setPhoneNumber("5132343313");

        lucia.setName("Lucia J. Schultz");
        lucia.setAddress("Via del Pontiere, 27 10020-Valle Sauglio TO");
        lucia.setCountry("Italy");
        lucia.setPhoneNumber("0317 2637392");

        hotel.reserveRoom(100, lucia, "2020-10-03", 3);
        hotel.reserveRoom(101, lucia, "2020-12-23", 10);
        hotel.reserveRoom(201, gregorio, "2020-11-25", 6);
        hotel.reserveRoom(203, lucia, "2021-02-10", 5);
        hotel.reserveRoom(103, gregorio, "2020-01-31", 15);

        printInformation(hotel);

        printReservations(hotel);

    }

    private static Hotel prepareHotel() {
        Hotel hotel = new Hotel("Comfort POO Inn");

        hotel.addRoom(new Room(100, "1-BED-KING", RoomStatus.CLEAN)); // Room receives room number and room description
        hotel.addRoom(new Room(101, "2-BED-QUEEN", RoomStatus.CLEAN));
        hotel.addRoom(new Room(102, "1-BED-KING", RoomStatus.CLEAN));
        hotel.addRoom(new Room(103, "1-BED-KING", RoomStatus.DIRTY));
        hotel.addRoom(new Room(200, "2-BED-QUEEN", RoomStatus.DIRTY));
        hotel.addRoom(new Room(201, "2-BED-QUEEN", RoomStatus.CLEAN));
        hotel.addRoom(new Room(202, "2-BED-QUEEN", RoomStatus.DIRTY));
        hotel.addRoom(new Room(203, "2-BED-QUEEN", RoomStatus.CLEAN));
        hotel.addRoom(new Room(204, "2-BED-QUEEN", RoomStatus.CLEAN));
        hotel.addRoom(new Room(205, "2-BED-QUEEN", RoomStatus.DIRTY));

        return hotel;
    }

    public static void printInformation(Hotel hotel) {

        System.out.println("---------------------------------------------------------------------");
        System.out.println(hotel.getName() + " - Hotel information");

        ArrayList<Room> rooms = hotel.getRooms();

        System.out.println("Total rooms: " + rooms.size());
        System.out.println();
        System.out.println("Room statuses");
        for (Room room : rooms) {
            System.out.println(room.getRoomNumber() + " - " + room.getRoomStatus());
        }
        System.out.println("---------------------------------------------------------------------");
    }

    public static void printReservations(Hotel hotel) {
        System.out.println("---------------------------------------------------------------------");
        System.out.println(hotel.getName() + " - reservations");
        for (Reservation reservation : hotel.getReservations()) {
            System.out.println(reservation.getRoomNumber() + " - " +
                    reservation.getGuest().getName() + " - " +
                    reservation.getArrivalDate() + " - " +
                    reservation.getNights() + " nights");
        }
        System.out.println("---------------------------------------------------------------------");
    }
}
