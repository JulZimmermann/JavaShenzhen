package day4.unit1;

import java.util.LinkedList;
import java.util.List;

public class Train {

    private List<Wagon> wagons = new LinkedList<>();

    private String origin;
    private String destination;

    public Train(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public Train(String origin, String destination, List<Wagon> wagons) {
        this.origin = origin;
        this.destination = destination;
        this.wagons = wagons;
    }

    public List<Wagon> getWagons() {
        return wagons;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /***
     * Live
     * @param color
     * @return
     */
    public List<Wagon> getWagonsByColor(String color) {
        List<Wagon> coloredWagons = new LinkedList<>();

        for(Wagon wagon : wagons) {
            if(wagon.getColor().equals(color)) {
                coloredWagons.add(wagon);
            }
        }

        return coloredWagons;
    }

    /***
     * Live
     */
    @Override
    public String toString() {
        String msg = "Train originates from " + origin + " with destination " + destination
                + " has wagons:\n";

        for(Wagon wagon : wagons) {
            msg += wagon.toString() + "\n";
        }

        return msg;
    }

}
