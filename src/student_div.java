import java.util.ArrayList;
import java.util.Scanner;

public class student_div {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<String>> division = new ArrayList<>();
        String[] divisionlist = {"A", "B", "C", "D"};
        double total, avg;
        int Passing_marks = 33;
        int choice = 0, i = 0;
        String option;


        for (String title : divisionlist) {
            ArrayList<String> studentlist = new ArrayList<>();
            division.add(studentlist);
        }


        for (int j = 0; j < division.size(); j++) {
            System.out.println(divisionlist[j] + division.get(j));
        }

        do {
            System.out.println("Press 1 Entry\nPress 2 View\nPress 3 Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    do {
                        for (int div = 0; div < divisionlist.length; div++) {
                            System.out.println("Enter " + div + " for " + divisionlist[div]);
                        }
                        int divoption = input.nextInt();
                        ArrayList<String> student = new ArrayList<>();
                        System.out.print("Enter the roll no: ");
                        int rollno = input.nextInt();
                        student.add(String.valueOf(rollno));

                        System.out.print("Enter your name: ");
                        String name = input.next();
                        student.add(name);

                        System.out.print("Enter maths: ");
                        int maths = input.nextInt();
                        while (maths < 0 || maths > 100) {
                            System.out.print("Invalid input. Enter maths (0-100): ");
                            maths = input.nextInt();
                        }
                        student.add(String.valueOf(maths));

                        System.out.print("Enter science: ");
                        int science = input.nextInt();
                        while (science < 0 || science > 100) {
                            System.out.print("Invalid input. Enter science (0-100): ");
                            science = input.nextInt();
                        }
                        student.add(String.valueOf(science));

                        System.out.print("Enter english: ");
                        int english = input.nextInt();
                        while (english < 0 || english > 100) {
                            System.out.print("Invalid input. Enter english (0-100): ");
                            english = input.nextInt();
                        }
                        student.add(String.valueOf(english));

                        division.get(divoption).add(String.join(", ", student));
                        System.out.println("Do you want to continue? (Y or N)");
                        option = input.next();
                        i++;
                    } while (option.equalsIgnoreCase("y"));
                    break;

                case 2:
                    System.out.println("\nThe output \n");
                    System.out.println("Choose the division to view:");
                    for (int div = 0; div < divisionlist.length; div++) {
                        System.out.println("Enter " + div + " for " + divisionlist[div]);
                    }
                    int divoption = input.nextInt();
                    System.out.println("Students in Division " + divisionlist[divoption] + ":");

                    for (String student : division.get(divoption)) {
                        String[] studentData = student.split(", ");
                        System.out.println("Roll no: " + studentData[0]);
                        System.out.println("Name: " + studentData[1]);
                        System.out.println("Maths: " + studentData[2]);
                        System.out.println("Science: " + studentData[3]);
                        System.out.println("English: " + studentData[4]);

                        int rollNo = Integer.parseInt(studentData[0]);
                        String name = studentData[1];
                        int maths = Integer.parseInt(studentData[2]);
                        int science = Integer.parseInt(studentData[3]);
                        int english = Integer.parseInt(studentData[4]);

                        if (maths >= Passing_marks && english >= Passing_marks && science >= Passing_marks) {
                            total = maths + science + english;
                            avg = total / 3.0;
                            System.out.println("Total Marks: " + total);
                            System.out.println("Avg Marks: " + avg);
                        } else {
                            System.out.println("\nYou have failed ");
                        }
                    }
                    break;
                case 3:
                    System.out.println("You have exited");
                    break;
                default:
                    System.out.println("\nPlease enter a valid option");
                    break;
            }
        } while (choice != 3);
    }
}
