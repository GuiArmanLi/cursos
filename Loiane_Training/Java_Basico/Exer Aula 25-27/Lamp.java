import java.util.UUID;

public class Lamp {
    UUID id = UUID.randomUUID();
    boolean isOn;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void displayStatus() {
        if (isOn) {
            System.out.println("Lampada ligada");
        } else {
            System.out.println("Lampada desligada");
        }
    }

    public static void main(String[] args) {
        Lamp lamp = new Lamp();

        lamp.displayStatus();
        lamp.turnOn();
        lamp.displayStatus();
        lamp.turnOff();
        lamp.displayStatus();
        lamp.turnOn();
        lamp.displayStatus();
    }
}