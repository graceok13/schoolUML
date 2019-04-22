public class Runner {
    public static void main(String[] args) {
        School bhigh = new School("Berkeley High");

        Section compsci = new Section("Computer Science");
        Section biology = new Section("Biology");
        Section math = new Section("Math");

        Teacher alb = new Teacher("Albinson", 1, "Computer Science");
        Teacher t2 = new Teacher("Teacher2", 2, "Biology");
        Teacher t3 = new Teacher("Teacher3", 3, "Math");

        Student me = new Student("Me", 1, 12);
        Student f1 = new Student("Friend1", 1, 10);
        Student f2 = new Student("Friend2", 2, 11);
        Student f3 = new Student("Friend3", 3, 12);
        Student f4 = new Student("Friend4", 4, 10);
        Student f5 = new Student("Friend5", 5, 11);

        compsci.setTeacher(alb);
        biology.setTeacher(t2);
        math.setTeacher(t3);

        compsci.addStudent(me);
        compsci.addStudent(f1);
        compsci.addStudent(f3);

        biology.addStudent(f1);
        biology.addStudent(f2);
        biology.addStudent(f3);
        biology.addStudent(f5);

        math.addStudent(f4);
        math.addStudent(f5);

        System.out.println(compsci.toString());
        System.out.println(biology.toString());
        System.out.println(math.toString());
    }
}
