public class BannerApp {
    public static void main(String[] args) {
        // Total pens and total students as per the problem
        int totalPens = 14;
        int totalStudents = 3;

        // Using Division (/) to find the quantity of pens per student
        int pensPerStudent = totalPens / totalStudents;

        // Using Modulus (%) to find the remaining non-distributed pens
        int remainingPens = totalPens % totalStudents;

        // Output exactly as required by your manual
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}