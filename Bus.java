public class Bus extends Transport {
    private int numOfSeats;

    public Bus(int id , String destination , String routeName , String departureTime , int numOfSeats) {
        super(id , destination , routeName , departureTime);
        this.numOfSeats = numOfSeats;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + getId() +
                ", destination='" + getDestination() + '\'' +
                ", routeName='" + getRouteName() + '\'' +
                ", departureTime='" + getDepartureTime() + '\'' +
                ", numOfSeats=" + getNumOfSeats() +
                '}';
    }
}
