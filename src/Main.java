import java.awt.*;
import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice,n=0;
        Scanner scanner=new Scanner(System.in);

        Task[] tasks= new Task[10];

        Employee[] employees=new Employee[10];

      while(true) {
          System.out.println("\tMenu");
          System.out.println("1.Add Employee");
          System.out.println("2.View Employee");
          System.out.println("3.Assign Task");
          System.out.println("4.Remove tasks");
          System.out.println("5.View assigned tasks");
          System.out.println("6.Exit");
          System.out.println("Please select!");
          choice=scanner.nextInt();
          scanner.nextLine();




          switch (choice){
              case 1:
                  System.out.println("Input number of employee:");
                  n=scanner.nextInt();

                  inputAll(n,employees);
                  System.out.println("\n");
                    break;
              case 2:
                  outputAll(n,employees);
                  break;
              case 3:
                  System.out.println("\n");
                  assignTask(n,tasks,employees);
                  break;
              case 4:
                  System.out.println("\n");
                  removeTask(n,tasks);
                    break;
              case 5:
                  System.out.println("\n");
                  assignedTask(tasks,employees);
                  break;
              case 6:
                  System.out.println("Program Exited!");
                  System.exit(0);
                  break;


          }




      }
    }
    public static void inputAll(int n,Employee[] e){
        for (int i=0;i<n;i++){
            System.out.println("Employee Number["+(i+1)+"]");
            e[i]= new Employee();
            e[i].input();
        }
    }
    public static void outputAll(int n,Employee[] e){
        if(e.length==0){
            System.out.println("No Employee registered yet!");
        }
        else {

            System.out.printf("%-10s %-20s %-20s","ID","Sex" ,"Name" );
            System.out.println("\n");
            for (int i = 0; i < n; i++) {
                e[i].output();
                System.out.println("\n");
            }
        }
    }
    public static void assignTask(int n, Task[] t, Employee[] e) {
        int empId;
        boolean found = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Employee ID:");

        empId = scanner.nextInt();

        // Search for the employee with the specified ID
        for (int i = 0; i < n; i++) {
            if (empId == e[i].getId()) {
                t[i] = new Task();
                t[i].input();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Wrong ID or Employee not Registered!");
        }
    }

    public static void assignedTask(Task[] t, Employee[] e) {
        boolean tasksAssigned = false;

        for (int i = 0; i < t.length; i++) {
            if (t[i] != null && e[i] != null) { // Check if both task and employee are not null
                System.out.println("----------------------------------Task[" + (i + 1) + "]----------------------------------");
                System.out.println("Employee ID: " + e[i].getId());
                t[i].output();
                System.out.println("\n");
                tasksAssigned = true;
            }
        }

        if (!tasksAssigned) {
            System.out.println("No tasks assigned!");
        }
    }


    public static void removeTask(int n, Task[] t) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Task ID to delete:");
        int taskIdToDelete = scanner.nextInt();
        boolean taskFound = false;
        for (int i = 0; i < n; i++) {
            if (t[i] != null && taskIdToDelete == t[i].getId()) {
                taskFound = true;

                t[i] = null;
                System.out.println("Task with Task ID " + taskIdToDelete + " deleted successfully.");
            }
            if (!taskFound) {
                System.out.println("Task with Task ID " + taskIdToDelete + " not found.");
            }
        }

    }
}
