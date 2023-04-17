public class Train extends Transport {
    private int trainNumber;
    private int generalSeats;
    private int economicSeats;
    private int compartmentSeats;
    private int luxurySeats;

    public Train(int id, String destination, String departureTime, String routeName,
                 int trainNumber, int generalSeats, int compartmentSeats, int economicSeats, int luxurySeats) {
        super(id, destination, departureTime, routeName);
        this.trainNumber = trainNumber;
        this.generalSeats = generalSeats;
        this.compartmentSeats = compartmentSeats;
        this.economicSeats = economicSeats;
        this.luxurySeats = luxurySeats;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public int getGeneralSeats() {
        return generalSeats;
    }

    public void setGeneralSeats(int generalSeats) {
        this.generalSeats = generalSeats;
    }

    public int getCompartmentSeats() {
        return compartmentSeats;
    }

    public void setCompartmentSeats(int compartmentSeats) {
        this.compartmentSeats = compartmentSeats;
    }

    public int getEconomicSeats() {
        return economicSeats;
    }

    public void setEconomicSeats(int economicSeats) {
        this.economicSeats = economicSeats;
    }

    public int getluxurySeats() {
        return luxurySeats;
    }

    public void setluxurySeats(int luxurySeats) {
        this.luxurySeats = luxurySeats;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + getId() +
                ", destination='" + getDestination() + '\'' +
                ", departureTime='" + getDepartureTime() + '\'' +
                ", routeName='" + getRouteName() + '\'' +
                ", trainNumber=" + getTrainNumber() +
                ", generalSeats=" + getGeneralSeats() +
                ", compartmentSeats=" + getCompartmentSeats() +
                ", economicSeats=" + getEconomicSeats() +
                ", luxurySeats=" + getluxurySeats() +
                "} ";
    }
}

