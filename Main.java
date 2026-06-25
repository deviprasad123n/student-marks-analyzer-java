public class Main {
    public static void main(String[] args) {
        System.out.println("=== Student Marks Analyzer ===");
        
        // Arrays concept from Durga Sir playlist
        int[] marks = {85, 92, 78, 64, 95};
        int totalStudents = marks.length;
        
        int sum = 0;
        int highest = marks[0];
        int lowest = marks[0];
        
        // Loop and Conditions Fundamentals
        for (int i = 0; i < totalStudents; i++) {
            sum = sum + marks[i]; 
            
            if (marks[i] > highest) {
                highest = marks[i];
            }
            
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }
        
        double average = (double) sum / totalStudents;
        
        // Output insights
        System.out.println("Total number of students: " + totalStudents);
        System.out.println("Sum of all marks: " + sum);
        System.out.println("Average mark of the class: " + average);
        System.out.println("Highest mark: " + highest);
        System.out.println("Lowest mark: " + lowest);
    }
}