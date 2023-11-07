public class Mammal extends Animal {
    private String food;

    public Mammal(String name, double width, int paws, String color, double speed) {
        super(name, width, paws, color, "Terra", speed);

    }

    public Mammal(String name, double width, int paws, String color, double speed, String food) {
        super(name, width, paws, color, "Terra", speed);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Mammal() {
    }

    public void displayObject() {
        System.out.println("====================================");
        System.out.println("Nome: " + getName());
        System.out.println("Comprimento: " + getWidth());
        System.out.println("Patas: " + getPaws());
        System.out.println("Cor: " + getColor());
        System.out.println("Ambiente: " + getEnvironment());
        System.out.println("Velocidade: " + getSpeed() + " m/s");
        if (getFood() != null) {
            System.out.println("Comida: " + getFood());
        }
    }
}
