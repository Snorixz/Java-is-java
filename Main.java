import java.time.LocalTime;
import java.util.ArrayList;


public class Main {

    public static void getAllTrains(ArrayList<Transport> transports) {
        System.out.println("Transports:");
        for (Transport transport : transports) {
                System.out.println(transport);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Transport> transports= new ArrayList<>();
        transports.add(new Train(1,"Kyiv",  "10:15","toKyiv", 120, 50, 30, 10, 5));
        transports.add(new Train(2,"Ternopil",  "10:30","toTernopil", 120, 50, 30, 10, 5));
        transports.add(new Bus(3, "Lviv", "toLviv", "4:00 PM", 50));
        transports.add(new Transport(4, "Kharkiv", "toKharkiv", "22:30"));
        getAllTrains(transports);
    }

}

