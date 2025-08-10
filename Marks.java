public class Marks {

    static int avge; 

    static void clgName() {
        System.out.println("MREC");
    }


    static void avgMarks() {
        System.out.println("Your avg is: " + avge);
    }


    void displayGrade() {
        if (avge > 80) {
            System.out.println("Grade: A");
        } else if (avge > 60) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
    }


    void done() {
        System.out.println("End");
    }

    public static void main(String[] args) {

        int[] marks = {98, 87, 90};
        int len = marks.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += marks[i];
        }

        avge = sum / len;         
        clgName();
        avgMarks();

        Marks obj = new Marks();
        obj.displayGrade();
        obj.done();
    }
}
