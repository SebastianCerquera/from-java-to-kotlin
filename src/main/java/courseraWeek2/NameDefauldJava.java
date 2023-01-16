package courseraWeek2;

public class NameDefauldJava {

    //Sobrecarga de funciones:
    public void displaySeparator(char character, int size) {

    }

    public void displaySeparator(char character) {
        displaySeparator(character, 10);
    }

    public void displaySeparator() {
        displaySeparator('*');
    }

}

