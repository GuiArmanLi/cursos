import java.util.UUID;

public class Lamp {
    UUID id = UUID.randomUUID();
    boolean isOn;

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public static void main(String[] args) {
        Lamp lampada = new Lamp();

        System.out.println("A lampada esta ligada?\t" + lampada.isOn);
        lampada.turnOn();
        System.out.println("A lampada esta ligada?\t" + lampada.isOn);
        lampada.turnOff();
        System.out.println("A lampada esta ligada?\t" + lampada.isOn);
    }
}