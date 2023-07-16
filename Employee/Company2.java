import java.util.Scanner;

public class Company2 {
    Scanner sc = new Scanner(System.in);
    int MAX_EMPLOYEE = 10;
    int addemp;
    Employee[] emp;

    public Company2() {
        emp = new Employee[MAX_EMPLOYEE];
        addemp = 0;
    }


    void addEmployee() {
        int i = 1;
        while (i == 1) {
            System.out.println("1.Developer");
            System.out.println("2.Tester");
            System.out.println("9.Back");
            System.err.println("Enter choice");
            int add_emp = sc.nextInt();
            if (add_emp == 1) {
                if (addemp < MAX_EMPLOYEE) {
                    System.out.println("Enter the Name");
                    String name = sc.next();
                    System.out.println("Enter the Phone Number");
                    long ph = sc.nextLong();
                    System.out.println("Enter the Salary");
                    double sal = sc.nextDouble();
                    long temp = ph;
                    int k = 0;
                    while (temp > 0) {
                        temp = temp / 10;
                        k++;
                    }
                    if (name.length() >= 3) {
                        if (k == 10) {
                            emp[addemp++] = new Developers(name, ph, sal);
                            System.out.println("Employee is Added(Developer)");
                            i=0;
                        } else {
                            System.err.println("Phone Number length should be 10");
                        }
                    } else {
                        System.out.println("Name Should be Greater than 3 Characters");
                    }
                } else {
                    System.out.println("Employees are Full");
                }
            } else if (add_emp == 2) {
                if (addemp < MAX_EMPLOYEE) {
                    System.out.println("Enter the Name");
                    String name = sc.next();
                    System.out.println("Enter the Phone Number");
                    long ph = sc.nextLong();
                    System.out.println("Enter the Salary");
                    double sal = sc.nextDouble();
                    long temp = ph;
                    int k = 0;
                    while (temp > 0) {
                        temp = temp / 10;
                        k++;
                    }
                    if (name.length() >= 3) {
                        if (k == 10) {
                            emp[addemp++]  = new Testors(name, ph, sal);
                            System.out.println("Employee is Added(Tester)");
                            i=0;
                        } else {
                            System.err.println("Phone Number length should be 10");
                        }
                    } else {
                        System.out.println("Name Should be Greater than 3 Characters");
                    }
                } else {
                    System.out.println("Employees are Full");
                }
            } else if (add_emp == 9) {
                i = 0;
            }

        }
    }


    void removeEmployee() {
        if (emp[0] == null && emp[1] == null && emp[2] == null && emp[3] == null && emp[4] == null && emp[5] == null && emp[6] == null && emp[7] == null && emp[8] == null && emp[9] == null) {
            System.err.println("Empty....");
        } else {
            for (int k = 0; k < emp.length; k++) {
                if (emp[k] != null) {
                    System.out.println("Emp ID : " + k + "  Emp Name : " + emp[k].name);
                }
            }
            System.out.println("Enter Emp ID you want to Remove");
            int id = sc.nextInt();

            if (emp[id] != null) {
                emp[id] = null;
                System.err.println("Employee is  Removed");
            } else if (emp[id] == null) {
                System.out.println("Employee is already Removed");
            }
        }
    }

        void updateSalary () {
            if (emp[0] == null && emp[1] == null && emp[2] == null && emp[3] == null && emp[4] == null && emp[5] == null && emp[6] == null && emp[7] == null && emp[8] == null && emp[9] == null) {
                System.err.println("Empty.....");
            } else {
                System.out.println("1 - Developers \n2 - Testor");
                int test = sc.nextInt();
                System.err.println("---------Employee List-------");
                for (int k = 0; k < emp.length; k++) {
                    if (emp[k] == null) {
                    } else {
                        switch (test) {
                            case 1:
                                if (emp[k] instanceof Developers) {
                                    System.out.println("Emp ID : " + k + "  Emp Name(Devs) : " + emp[k].name);
                                    System.out.println("Enter the Developer Emp_No for Updating Salary");
                                    int in = sc.nextInt();
                                    double hike = Developers.salary_hike * 100 * emp[in].salary;
                                    emp[in].salary = hike;
                                    System.err.println("Updated Salary 45% for Developers : " + emp[in].salary);
                                } else {
                                    System.out.println("there no Developers");
                                }
                                break;
                            case 2:
                                if (emp[k] instanceof Testors) {
                                    System.out.println("Emp ID : " + k + "  Emp Name(Tester) : " + emp[k].name);
                                    System.out.println("Enter the  Testor Emp_No for Updating Salary");
                                    int in = sc.nextInt();
                                    double hike =  Testors.salary_hike * 100 * emp[in].salary;
                                    emp[in].salary = hike;
                                    System.err.println("Updated Salary 25% for Testors is : " + emp[in].salary);
                                }else{
                                    System.out.println("There no Testers");
                            }
                                break;
                            default:
                                System.out.println("Invalid Input");
                        }

                    }
                }
            }
        }

    void display() {
        if (emp[0] == null && emp[1] == null && emp[2] == null && emp[3] == null && emp[4] == null && emp[5] == null && emp[6] == null && emp[7] == null && emp[8] == null && emp[9] == null) {
            System.err.println("Empty.....");
        } else {
            System.out.println("----------------Employee Details---------------");
            System.out.printf("| %10s | %10s | %15s | %10s |%n"," Emp ID"," Name "," Phone Number "," Salary ");
            for (int i = 0; i < emp.length; i++) {
                if (emp[i] != null) {
//                    System.out.println("   "+i+"       "+emp[i].name+"         "+ emp[i].ph_no+"           "+emp[i].salary);
                    System.out.printf("| %10s | %10s | %15s | %10s |%n", i , emp[i].name , emp[i].ph_no , emp[i].salary );

                }
            }
            System.out.println("-------------------------------------------------------");
            int devs=0;int tester=0;int total=0;
            for(int i=0;i<emp.length;i++){
                if(emp[i] instanceof Developers){
                    total++;
                    devs++;
                }else if(emp[i] instanceof Testors) {
                    total++;
                    tester++;
                }
            }
            System.out.println("| No.of Devs : "+devs+"  "+"| No.of Tester : "+tester+"| Total Emps : "+total+" |");
            System.out.println("--------------------------------------------------------");
        }
    }
}



