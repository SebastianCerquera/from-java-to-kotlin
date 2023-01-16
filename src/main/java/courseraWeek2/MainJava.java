package courseraWeek2;

import java.awt.*;

import static java.awt.Color.*;

public class MainJava {
    public static void main(String[] args) {
        PersonJava personJava = new PersonJava("Alicia", 23);
        System.out.println("NOMBRE: " + personJava.getName());
    }

    public void updateWeather (int degrees) {
        String description;
        Color color;
        if (degrees < 10) {
            description = "cold";
            color = BLUE;
        } else if (degrees < 25) {
            description = "mild";
            color = ORANGE;
        } else {
            description = "hot";
            color = RED;
        }
    }
}
