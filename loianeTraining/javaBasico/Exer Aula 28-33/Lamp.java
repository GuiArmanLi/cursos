import java.util.UUID;

public class Lamp {
    private UUID id = UUID.randomUUID();
    private boolean on;

    Lamp() {
    }

    Lamp(boolean on) {
        this.on = on;
    }

    public UUID getId() {
        return id;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void turnOn() {
        setOn(true);
    }

    public void turnOff() {
        setOn(false);
    }

    public void displayStatus() {
        if (isOn()) {
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