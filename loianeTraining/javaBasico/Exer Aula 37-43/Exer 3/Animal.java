public abstract class Animal {
    private String name;
    private double width;
    private int paws;
    private String color;
    private String environment;
    private double speed;

    public Animal() {
    }

    public Animal(String name, double width, int paws, String color, String environment, double speed) {
        this.name = name;
        this.width = width;
        this.paws = paws;
        this.color = color;
        this.environment = environment;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}