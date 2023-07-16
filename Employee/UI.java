import java.util.Scanner;

public class  UI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Company2 cp=new Company2();
        int i=1;
        while(i==1){
            System.out.println("1.Add Employee");
            System.out.println("2.Remove Employee");
            System.out.println("3.Update Salary");
            System.out.println("4.Display Database");
            System.out.println("0.Exit");
            System.out.println("Enter the Number");
            int in=sc.nextInt();
            switch (in){
                case 1:cp.addEmployee();break;
                case 2:cp.removeEmployee();break;
                case 3:cp.updateSalary();break; 
                case 4:cp.display();break;
                case 0:i=0;
                    System.err.println("Thank You......");
                    break;
            }
        }
    }
}
