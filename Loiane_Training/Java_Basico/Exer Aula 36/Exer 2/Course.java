class Course {
    private String name;
    private String hour;
    private Professor professor;
    private Student[] students = new Student[5];

    public Course() {
    }

    public Course(String name, String hour, Professor professor, Student[] students) {
        this.name = name;
        this.hour = hour;
        this.professor = professor;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

}