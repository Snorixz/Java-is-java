public class Train {
    private String destination;
    private int trainNumber;
    private String departureTime;
    private int generalSeats;
    private int economicSeats;
    private int compartmentSeats;
    private int luxurySeats;

    public Train(String destination , int trainNumber , String departureTime , int generalSeats ,
                 int economicSeats , int compartmentSeats , int luxurySeats) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
        this.generalSeats = generalSeats;
        this.economicSeats = economicSeats;
        this.compartmentSeats = compartmentSeats;
        this.luxurySeats = luxurySeats;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getGeneralSeats() {
        return generalSeats;
    }

    public void setGeneralSeats(int generalSeats) {
        this.generalSeats = generalSeats;
    }

    public int getEconomicSeats() {
        return economicSeats;
    }

    public void setEconomicSeats(int economicSeats) {
        this.economicSeats = economicSeats;
    }

    public int getCompartmentSeats() {
        return compartmentSeats;
    }

    public void setCompartmentSeats(int compartmentSeats) {
        this.compartmentSeats = compartmentSeats;
    }

    public int getLuxurySeats() {
        return luxurySeats;
    }

    public void setLuxurySeats(int luxurySeats) {
        this.luxurySeats = luxurySeats;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + getDestination() + '\'' +
                ", trainNumber=" + getTrainNumber() +
                ", departureTime='" + getDepartureTime() + '\'' +
                ", generalSeats=" + getGeneralSeats() +
                ", economicSeats=" + getEconomicSeats() +
                ", compartmentSeats=" + getCompartmentSeats() +
                ", luxurySeats=" + getLuxurySeats() +
                '}';
    }
}
