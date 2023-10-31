import java.util.UUID;

public class Lamp {
    private UUID id = UUID.randomUUID();
    private boolean isOn;

    Lamp() {
    }

    Lamp(boolean isOn) {
        this.isOn = isOn;
    }

    public UUID getId() {
        return id;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

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
        Lamp lamp = new Lamp(true);

        lamp.displayStatus();
        lamp.turnOn();
        lamp.displayStatus();
        lamp.turnOff();
        lamp.displayStatus();
        lamp.turnOn();
        lamp.displayStatus();
    }
}