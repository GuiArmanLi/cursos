package model;

public class Password {
    private int number;
    private boolean priority;
    private int priorityLevel;

    public Password() {
    }

    public Password(int number, boolean priority) {
        this.number = number;
        this.priority = priority;
    }

    public Password(int number, int priorityLevel) {
        this.number = number;
        this.priorityLevel = priorityLevel;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean getPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }
}
