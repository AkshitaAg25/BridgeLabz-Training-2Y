import java.util.Scanner;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking: Guest - " + defaultBooking.guestName + ", Room - " + defaultBooking.roomType + ", Nights - " + defaultBooking.nights);

        System.out.print("Enter guest name: ");
        String guestName = scanner.nextLine();
        System.out.print("Enter room type: ");
        String roomType = scanner.nextLine();
        System.out.print("Enter number of nights: ");
        int nights = scanner.nextInt();

        HotelBooking paramBooking = new HotelBooking(guestName, roomType, nights);
        System.out.println("Parameterized Booking: Guest - " + paramBooking.guestName + ", Room - " + paramBooking.roomType + ", Nights - " + paramBooking.nights);

        // Using copy constructor
        HotelBooking copyBooking = new HotelBooking(paramBooking);
        System.out.println("Copied Booking: Guest - " + copyBooking.guestName + ", Room - " + copyBooking.roomType + ", Nights - " + copyBooking.nights);

        scanner.close();
    }
}
