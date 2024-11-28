import java.util.ArrayList;
import java.util.Scanner;

public class institute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StudentDetail> studentList = new ArrayList<>();

        int option = 0;

        do {
            System.out.println("\t\t Student Details ");
            System.out.println("\t\t Press 1 for Entry");
            System.out.println("\t\t Press 2 for View");
            System.out.println("\t\t Press 3 for Search");
            System.out.println("\t\t Press 4 for Update");
            System.out.println("\t\t Press 5 for Exit");

            System.out.print("Enter Your option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    String option2 = "y";
                    do {
                        StudentDetail student = new StudentDetail();

                        System.out.println("Enter Student ID:");
                        student.setId(sc.nextInt());
                        System.out.println("Enter Student Name:");
                        student.setName(sc.next());
                        System.out.println("Enter Student Maths Marks:");
                        student.setMaths(sc.nextInt());
                        System.out.println("Enter Student Science Marks:");
                        student.setScience(sc.nextInt());
                        System.out.println("Enter Student English Marks:");
                        student.setEnglish(sc.nextInt());
                        student.setTotal();
                        student.setAvg();
                        studentList.add(student);

                        System.out.println("Do you want to add another student (y/n)?:");
                        option2 = sc.next();

                    } while (option2.equalsIgnoreCase("y"));
                    break;
                case 2:
                    System.out.println("\t\t View ");
                    for (StudentDetail student : studentList) {
                        student.display();
                    }
                    break;
                case 3:
                    System.out.println("\t\t Search ");
                    System.out.println("Enter Roll no for Search:");
                    int rollno = sc.nextInt();
                    boolean found = false;
                    for (StudentDetail student : studentList) {
                        if (rollno == student.getId()) {
                            student.display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;
                case 4:
                    System.out.println("\t\t Update ");
                    System.out.println("Enter the roll number to update: ");
                    rollno = sc.nextInt();
                    found = false;

                    for (StudentDetail student : studentList) {
                        if (rollno == student.getId()) {
                            System.out.println("Enter new Student Name:");
                            student.setName(sc.next());
                            System.out.println("Enter new Student Maths Marks:");
                            student.setMaths(sc.nextInt());
                            System.out.println("Enter new Student Science Marks:");
                            student.setScience(sc.nextInt());
                            System.out.println("Enter new Student English Marks:");
                            student.setEnglish(sc.nextInt());
                            student.setTotal();
                            student.setAvg();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found!");
                    } else {
                        System.out.println("Student details updated successfully!");
                    }
                    break;
                case 5:
                    System.out.println("\t\t Exit ");
                    break;
                default:
                    System.out.println("\t\t Invalid Option try again!!");
                    break;
            }

        } while (option != 5);
    }
}

class StudentDetail {
    private int id;
    private String name;
    private String address;
    private String phno;
    private int maths;
    private int science;
    private int english;
    private int total;
    private float avg;
    private boolean isPass;

    public void display() {
        System.out.println("Student Id: " + this.getId());
        System.out.println("Student Name: " + this.getName());
        System.out.println("Student Maths Marks: " + this.getMaths());
        System.out.println("Student Science Marks: " + this.getScience());
        System.out.println("Student English Marks: " + this.getEnglish());
        if (this.isPass()) {
            System.out.println("You are Pass");
            System.out.println("Total: " + this.getTotal());
            System.out.println("Avg: " + this.getAvg());
        } else {
            System.out.println("You are Fail");
        }
    }

    // Getters and Setters
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = this.maths + this.science + this.english;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg() {
        this.avg = this.total / 3.0f;
    }

    public boolean isPass() {
        return this.maths >= 35 && this.science >= 35 && this.english >= 35;
    }

    public void setPass(boolean pass) {
        isPass = pass;
    }
}
