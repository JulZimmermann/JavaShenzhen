package day4.unit1;

import java.util.List;

public class Main {

    /***
     * Live
     */
    public static void main(String[] args) {

        Train train = new Train("Würzburg", "Shenzhen");

        train.getWagons().add(new Wagon("yellow", 1));
        train.getWagons().add(new Wagon("red", 3));
        train.getWagons().add(new Wagon("green", 2));
        train.getWagons().add(new Wagon("blue", 4));

        for(int i = 0; i < 500; i++) {
            train.getWagons().add(new Wagon("black", i + 100));
        }

        System.out.println(train);

        List<Wagon> yellowWagons = train.getWagonsByColor("yellow");

        Train yellowTrain = new Train("Würzburg", "Shenzhen", yellowWagons);

        System.out.println(yellowWagons);

    }
}
