public class Student {
    String StudentName;
    int age;
    int marksMath;
    int marksEng;
    int marksArt;

    public void CalculateMarks(){
        marksMath = 10;
        marksEng = 20;
        marksArt = 20;
        System.out.println("The total marks are " + (marksArt + marksMath + marksEng));
    }

    public static void main(String[] args) {
        Student S1 = new Student();
        S1.CalculateMarks();
    }
}
