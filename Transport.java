public class Transport {
    private int id;
    private String destination;
    private String departureTime;
    private String routeName;

    public Transport(int id , String destination , String departureTime , String routeName) {
        this.id = id;
        this.destination = destination;
        this.departureTime = departureTime;
        this.routeName = routeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "id=" + id +
                ", destination='" + destination + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", routeName='" + routeName + '\'' +
                '}';
    }
}
