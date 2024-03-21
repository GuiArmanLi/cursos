public class Fish extends Animal {
    private String characteristics;

    public Fish() {
    }

    public Fish(String name, double width, double speed, String characteristics) {
        super(name, width, 0, "Cinza", "Mar", speed);
        this.characteristics = characteristics;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public void displayObject() {
        System.out.println("====================================");
        System.out.println("Nome: " + getName());
        System.out.println("Comprimento: " + getWidth());
        System.out.println("Patas: " + getPaws());
        System.out.println("Cor: " + getColor());
        System.out.println("Ambiente: " + getEnvironment());
        System.out.println("Velocidade: " + getSpeed() + " m/s");
        if (getCharacteristics() != null) {
            System.out.println("Comida: " + getCharacteristics());
        }
    }
}