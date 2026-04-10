abstract class Room {
    protected String roomType;
    protected double pricePerNight;
    protected int capacity;

    public Room(String roomType, double pricePerNight, int capacity) {
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.capacity = capacity;
    }

    public abstract void displayRoomDetails();
}

class SingleRoom extends Room {

    public SingleRoom() {
        super("Single Room", 2000.0, 1);
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Price Per Night: " + pricePerNight);
        System.out.println("Capacity: " + capacity + " person");
    }
}

class DoubleRoom extends Room {

    public DoubleRoom() {
        super("Double Room", 3500.0, 2);
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Price Per Night: " + pricePerNight);
        System.out.println("Capacity: " + capacity + " persons");
    }
}

class SuiteRoom extends Room {

    public SuiteRoom() {
        super("Suite Room", 6000.0, 4);
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Price Per Night: " + pricePerNight);
        System.out.println("Capacity: " + capacity + " persons");
    }
}

public class BookMyApp {

    public static void main(String[] args) {

        int singleRoomAvailable = 5;
        int doubleRoomAvailable = 3;
        int suiteRoomAvailable = 2;

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        System.out.println("=== HOTEL ROOM DETAILS ===\n");

        single.displayRoomDetails();
        System.out.println("Available: " + singleRoomAvailable + "\n");

        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleRoomAvailable + "\n");

        suite.displayRoomDetails();
        System.out.println("Available: " + suiteRoomAvailable + "\n");
    }
}