public class MarksReportMethods {

    public static int calculateTotal(int[] marks) {
        int total = 0;

        for (int mark : marks) {
            total = total + mark;
        }

        return total;
    }

    public static double calculateAverage(int[] marks) {
        return calculateTotal(marks) / (double) marks.length;
    }

    public static int findHighest(int[] marks) {
        int highest = marks[0];

        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
        }

        return highest;
    }

    public static int findLowest(int[] marks) {
        int lowest = marks[0];

        for (int mark : marks) {
            if (mark < lowest) {
                lowest = mark;
            }
        }

        return lowest;
    }

    public static void printReport(int[] marks) {
        System.out.println("Marks Report");
        System.out.println("------------");
        System.out.println("Total       : " + calculateTotal(marks));
        System.out.printf("Average     : %.2f%n", calculateAverage(marks));
        System.out.println("Highest Mark: " + findHighest(marks));
        System.out.println("Lowest Mark : " + findLowest(marks));
    }

    public static void main(String[] args) {
        int[] marks = {80, 75, 90, 68, 88};

        printReport(marks);
    }
}
