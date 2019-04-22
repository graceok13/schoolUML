public class Section {
    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize;

    public Section(String name) {
        this.name = name;
    }

    public Teacher getTeacher(){
        return teacher;
    }
    public void setTeacher(Teacher t){
        this.teacher = t;
    }
    public Student[] getStudents(){
        return students;
    }
    public void addStudent(Student s){
        this.students[currentSize] = s;
        currentSize++;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        String[] st = new String[currentSize];
        for (int i=0; i<currentSize; i++){
            st[i] = students[i].getName();
        }
        return "This " + this.name + " class is taught by " + this.teacher.getName() + " and has " + currentSize + " students: " + st;
    }
}
