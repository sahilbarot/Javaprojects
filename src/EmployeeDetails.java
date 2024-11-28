import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeDetails {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Employee> emp = new ArrayList<>();
//        Employee functions = new Employee();


        int option=0;

        do {
            System.out.println("\t\t Employee ");
            System.out.println("Press 1 for entry");
            System.out.println("Press 2 for view");
            System.out.println("Press 3 for search");
            System.out.println("Press 4 for update");
            System.out.println("Press 5 for exit");
            System.out.println("Enter your option: ");
            option = input.nextInt();

            switch (option)
            {
                case 1:
                    String choice="Y";
                    do
                    {
                        Employee emp1=new Employee();
                        emp1.takeEmployeeDetails();
                        emp.add(emp1);
                        System.out.println("Do you want to add another employee? (Y/N)?");
                        choice = input.next();

                    }while(choice.equalsIgnoreCase("y"));
                    break;
                case 2:
                    System.out.println("\t\tALL STUDENTS");
                    for(Employee emp1: emp)
                    {
                        emp1.seeEmployeeDetails();
                    }
                    break;
                case 3:
                    System.out.println("Enter the id of employee to search: ");
                    int id = input.nextInt();
                    boolean found=false;
                    for(Employee emp1: emp)
                    {
                        if(emp1.getId()==id)
                        {
                            emp1.seeEmployeeDetails();
                            found=true;
                            break;
                        }

                    }
                    if (!found){
                            System.out.println("Enter the valid id of employee to search: ");
                            }
                    break;
                case 4:
                    System.out.println("Enter the id of employee to update: ");
                    int id2 = input.nextInt();
                    boolean found2=false;
                    for (Employee emp1: emp)
                    {
                        if(emp1.getId()==id2)
                        {
                            emp1.takeEmployeeDetails();
                            found2=true;
                            break;
                        }
                    }
                    if (!found2)
                    {
                        System.out.println("Enter the valid id of employee to update: ");
                    }
                    break;
                case 5:
                {
                    System.out.println("\t\t!!You are exited!! ");
                    break;
                }
                default:
                {
                    System.out.println("Enter valid option: ");
                    break;
                }

            }

        }while(option!=5);




    }
}


class Employee {
    int id;
    String name;
    int salary;
    String address;
    String phone;
    String email;



    public void takeEmployeeDetails()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the employee ID");
        this.setId(input.nextInt());
        System.out.println("Enter the employee name");
        this.setName(input.next());
        System.out.println("Enter the employee salary");
        this.setSalary(input.nextInt());
        System.out.println("Enter the employee address");
        this.setAddress(input.next());
        System.out.println("Enter the employee phone number");
        this.setPhone(input.next());
        System.out.println("Enter the employee email");
        this.setEmail(input.next());
    }


    public void seeEmployeeDetails()
    {
        System.out.println("Employee ID: " + this.getId());
        System.out.println("Employee Name: " + this.getName());
        System.out.println("Employee Salary: " + this.getSalary());
        System.out.println("Employee Address: " + this.getAddress());
        System.out.println("Employee Phone: " + this.getPhone());
        System.out.println("Employee Email: " + this.getEmail());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}