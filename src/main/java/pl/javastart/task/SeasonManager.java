package pl.javastart.task;

import java.util.Scanner;

public class SeasonManager {

    // uzupełnij metodę - do wczytywania danych użyj przekazany Scanner
    public void run(Scanner scanner) {
        Season season = readSeason(scanner);
        printMonths(season);

    }

    private void printMonths(Season season) {
        System.out.println(season);
    }

    private Season readSeason(Scanner scanner) {
        System.out.println("Podaj porę roku:");
        for (Season season : Season.values()) {
            System.out.println(season.getDescription());
        }
        String pickedSeasonDesc = scanner.nextLine();
        return Season.fromDescription(pickedSeasonDesc);
    }

}
