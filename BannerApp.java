public class BannerApp {
    public static void main(String[] args) {
    int totalPens = 14;
        int totalStudents = 3;

        // Using / for quantity and % for remainder
        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;

        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}