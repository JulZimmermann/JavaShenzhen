package day4.unit1;

public class Wagon {

    private String color;
    private int number;

    public Wagon(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    /***
     * Live
     */
    @Override
    public String toString() {
        return "Wagon number " + number + " has color " + color;
    }

}
