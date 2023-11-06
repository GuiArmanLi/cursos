public class Student {
    private String name;
    private int register;
    private int[] notes = new int[4];

    public Student() {
    }

    public Student(String name, int register, int[] notes) {
        this.name = name;
        this.register = register;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegister() {
        return register;
    }

    public void setRegister(int register) {
        this.register = register;
    }

    public int[] getNotes() {
        return notes;
    }

    public void setNotes(int[] notes) {
        this.notes = notes;
    }

    public double averageNotes(int[] notes) {
        int sum = 0;
        for (int note : notes) {
            sum += note;
        }

        return sum / notes.length;
    }

    public String isApproval(double averageNotes) {
        if (averageNotes >= 7) {
            return "Aprovado";
        }
        return "Reprovado";
    }
}
