import java.util.Scanner;

public class Task {
    private int taskId;
    private String taskName;

    private  String startDate;
    private String endDate;


//    public Task(int taskId, String taskName, String startDate, String endDate) {
//        this.taskId = taskId;
//        this.taskName = taskName;
//        this.startDate = startDate;
//        this.endDate = endDate;
//    }


        public void input() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Input Task ID:");
            this.taskId = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Input Task Name:");
            this.taskName = scanner.nextLine();

            System.out.println("Input Start Date:");
            this.startDate = scanner.nextLine();

            System.out.println("Input End Date:");
            this.endDate = scanner.nextLine();
        }

        // Getters and setters for the class variables go here




    public void output() {
        System.out.printf("%-10s %-20s %-20s %-20s%n", "TaskID", "TaskName", "StartDate", "EndDate");
        System.out.printf("%-10d %-20s %-20s %-20s%n", taskId, taskName, startDate, endDate);
    }
    int getId(){
            return taskId;
    }






}
