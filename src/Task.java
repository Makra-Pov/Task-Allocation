import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task {
    private int taskId;
    private String taskName;
    private String startDate;
    private String endDate;
    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // You can adjust the date format as needed

    public void input() {
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();

        System.out.println("Input Task ID:");
        this.taskId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Input Task Name:");
        this.taskName = scanner.nextLine();

        System.out.println("Start Date: " + dateFormat.format(date));
        this.startDate = dateFormat.format(date);

        System.out.println("Input End Date:");
        this.endDate = scanner.nextLine();
    }

    public void output() {
        System.out.printf("%-10s %-20s %-20s %-20s %-10s%n", "TaskID", "TaskName", "StartDate", "EndDate", "TimeLine(day)");
        try {
            System.out.printf("%-10d %-20s %-20s %-20s %-10d%n", taskId, taskName, startDate, endDate, timeLine());
        } catch (ParseException e) {
            System.out.println("Error calculating progress: " + e.getMessage());
        }
    }

    public int getId() {
        return taskId;
    }

    public int timeLine() throws ParseException {
        Date startD = dateFormat.parse(startDate);
        Date endD = dateFormat.parse(endDate);

        long diff = endD.getTime() - startD.getTime();

        return (int) (diff / (24 * 60 * 60 * 1000));
    }
}
