import java.time.LocalTime;
import java.util.ArrayList;

public class Main {

    public static void getAllTrains(ArrayList<Train> trains) {
        System.out.println("Trains:");
        for (Train train : trains) {
                System.out.println(train);
        }
        System.out.println();
    }
    public static void getTrainsByDestination(ArrayList<Train> trains, String destination) {
        System.out.println("Trains to " + destination + ":");
        for (Train train : trains) {
            if (train.getDestination().equals(destination)) {
                System.out.println(train);
            }
        }
        System.out.println();
    }

    public static void getTrainsByDestinationAndDepartureTime(ArrayList<Train> trains, String destination, String departureTime) {
        System.out.println("Trains to " + destination + " after " + departureTime + ":");
        for (Train train : trains) {
            if (train.getDestination().equalsIgnoreCase(destination)) {
                if (train.getDestination().equalsIgnoreCase(destination)) {
                    if (LocalTime.parse(train.getDepartureTime()).isAfter(LocalTime.parse(departureTime))) {
                        System.out.println(train);
                    }
                }
            }
        }
        System.out.println();
    }


    public static void getTrainsByDestinationAndGeneralSeats(ArrayList<Train> trains, String destination) {
        System.out.println("Trains to " + destination + " that have general seats:");
        for (Train train : trains) {
            if (train.getDestination().equals(destination) && train.getGeneralSeats() > 0) {
                System.out.println(train);

            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Train> trains = new ArrayList<>();
        trains.add(new Train("Kyiv", 123, "10:15", 120, 50, 30, 10));
        trains.add(new Train("Lviv", 456, "12:30", 100, 40, 50, 5));
        trains.add(new Train("Lviv", 456, "09:30", 100, 40, 50, 5));
        trains.add(new Train("Ternopil", 789, "14:45", 150, 60, 40, 15));
        trains.add(new Train("Ternopil", 321, "16:00", 0, 20, 60, 2));
        getAllTrains(trains);
        getTrainsByDestination(trains, "Kyiv");
        getTrainsByDestinationAndDepartureTime(trains, "Lviv", "10:20");
        getTrainsByDestinationAndGeneralSeats(trains, "Ternopil");
    }

}