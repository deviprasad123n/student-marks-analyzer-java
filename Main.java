public class Main {
    public static void main(String[] args) {
        System.out.println("=== Student Marks Analyzer ===");
        
        int[] marks = {85, 92, 78, 64, 95};
        int totalStudents = marks.length;
        
        // 1. Create a variable to accumulate the sum
        int sum = 0;
        
        // 2. Use a loop to visit every mark and add it to our sum
        for (int i = 0; i < totalStudents; i++) {
            sum = sum + marks[i]; 
        }
        
        // 3. Calculate the average score
        double average = (double) sum / totalStudents;
        
        // 4. Print the analytical insights
        System.out.println("Sum of all marks: " + sum);
        System.out.println("Average mark of the class: " + average);
    }
}