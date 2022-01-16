package Homework;

public class Lesson_4 {
}


class Student {

    int StudentIDcard;
    String Name;
    String Surname;
    int course;
    double mathematicsAverageGrade;
    double economicsAverageGrade;
    double ForeignLanguageAverageGrade;

}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

        st1.StudentIDcard = 111231;
        st1.Name = "Djo";
        st1.Surname = "Freeman";
        st1.course = 4;
        st1.mathematicsAverageGrade = 6.2;
        st1.economicsAverageGrade = 4.7;
        st1.ForeignLanguageAverageGrade = 7.5;

        System.out.println (st1.Name + " " + st1.Surname + ": " + "average rating - " +
                (st1.mathematicsAverageGrade+st1.economicsAverageGrade+st1.ForeignLanguageAverageGrade)/3);


        st2.StudentIDcard = 111233;
        st2.Name = "Philip";
        st2.Surname = "Moris";
        st2.course = 5;
        st2.mathematicsAverageGrade = 8.3;
        st2.economicsAverageGrade = 6.9;
        st2.ForeignLanguageAverageGrade = 8.1;

        System.out.println (st2.Name + " " + st2.Surname + ": " + "average rating - " +
                (st2.mathematicsAverageGrade+st2.economicsAverageGrade+st2.ForeignLanguageAverageGrade)/3);


        st3.StudentIDcard = 111235;
        st3.Name = "Fred";
        st3.Surname = "Potter";
        st3.course = 4;
        st3.mathematicsAverageGrade = 10.0;
        st3.economicsAverageGrade = 9.7;
        st3.ForeignLanguageAverageGrade = 9.5;

        System.out.println (st3.Name + " " + st3.Surname + ": " + "average rating - " +
                (st3.mathematicsAverageGrade+st3.economicsAverageGrade+st3.ForeignLanguageAverageGrade)/3);
    }
}