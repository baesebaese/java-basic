package class1;

public class ClassStart5 {
    public static void main(String[] args) {

        String a = "배세은";

        Student student1 = new Student(); // 학생을 실제 메모리에 만든다.
        student1.name = "학생1";
        student1.age = 14;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 15;
        student2.grade = 80;

        Student[] students = {student1, student2};

        for(Student s : students) { //향상된 for문
            System.out.println("이름:" + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
