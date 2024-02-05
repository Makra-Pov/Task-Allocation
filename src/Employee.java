import java.util.Locale;
import java.util.Scanner;

public class Employee  {
    private int id;
    private String sex;
    private String name;

    public void input(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Input Employee ID:");
        this.id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input Employee Sex:");
        this.sex= scanner.nextLine();
        System.out.println("Input Employee Name:");
        this.name=scanner.nextLine();
    }
    public void output(){
        System.out.printf("%-10d %-20s %-20s ", id ,sex ,name);

    }
    int getId(){
        return id;
    }





}
