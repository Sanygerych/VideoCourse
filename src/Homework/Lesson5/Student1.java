package Homework.Lesson5;

public class Student1 {

    int StudentIDcard;
    String Name;
    String Surname;
    int course;
    double mathematicsAverageGrade;
    double economicsAverageGrade;
    double ForeignLanguageAverageGrade;

    void info() {
        System.out.println ("ID "+StudentIDcard+". "+Name + " " + Surname + ": " + "average rating - " +
                (mathematicsAverageGrade+economicsAverageGrade+ForeignLanguageAverageGrade)/3);
    }

}

class StudentTest {
    public static void main(String[] args) {
        Student1 st1 = new Student1();
        Student1 st2 = new Student1();
        Student1 st3 = new Student1();

        st1.StudentIDcard = 111231;
        st1.Name = "Djo";
        st1.Surname = "Freeman";
        st1.course = 4;
        st1.mathematicsAverageGrade = 6.2;
        st1.economicsAverageGrade = 4.7;
        st1.ForeignLanguageAverageGrade = 7.5;
        st1.info();


        st2.StudentIDcard = 111233;
        st2.Name = "Philip";
        st2.Surname = "Moris";
        st2.course = 5;
        st2.mathematicsAverageGrade = 8.3;
        st2.economicsAverageGrade = 6.9;
        st2.ForeignLanguageAverageGrade = 8.1;
        st2.info();


        st3.StudentIDcard = 111235;
        st3.Name = "Fred";
        st3.Surname = "Potter";
        st3.course = 4;
        st3.mathematicsAverageGrade = 10.0;
        st3.economicsAverageGrade = 9.7;
        st3.ForeignLanguageAverageGrade = 9.5;
        st3.info();
    }
}