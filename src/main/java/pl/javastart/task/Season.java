package pl.javastart.task;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

public enum Season {
    SPRING("Wiosna", new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("Lato", new String[]{"czerwiec", "lipiec", "sierpień"}),
    AUTUMN("Jesień", new String[]{"wrzesień", "październik", "listopad"}),
    WINTER("Zima", new String[]{"grudzień", "styczeń", "luty"});

    private final String description;
    private final String[] months;

    Season(String description, String[] months) {
        this.description = description;
        this.months = months;
    }

    public String[] getMonths() {
        return months;
    }

    public String getDescription() {
        return description;
    }

    public static Season fromDescription(String description) {
        Season[] values = values();
        for (Season season : values) {
            if (season.getDescription().equalsIgnoreCase(description)) {
                return season;
            }
        }
        return  null;
    }

    @Override
    public String toString() {
        return Arrays.toString(months);
    }
}