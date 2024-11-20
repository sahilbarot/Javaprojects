import java.util.Scanner;

public class student
{
    public static void main(String[] args) {
        int roll_no,maths,science,english,Passing_marks=33;
        String name;
        double total,avg;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the roll no");
        roll_no = input.nextInt();
        System.out.print("Enter your name");
        name = input.next();

        do {
            System.out.print("Enter maths: ");
            maths = input.nextInt();
        }while(maths<0 || maths>100);
        do {
            System.out.print("Enter science: ");
            science = input.nextInt();

        }while(science<0 || science>100);
        do {
            System.out.print("Enter english: ");
            english = input.nextInt();

        }while(english<0 || english>100);


        System.out.println("roll number: "+roll_no);
        System.out.println("Name: "+name);
        System.out.println("maths"+maths);
        System.out.println("science"+science);
        System.out.println("english"+english);

        if(maths>=Passing_marks && english>=Passing_marks && science>=Passing_marks)
        {
            total=maths+science+english;
            avg=total/3.0f;
            System.out.println("Total Marks :"+total);
            System.out.println("Avg Marks :"+avg);
        }
        else
        {
            System.out.println("\nyou are fail ");
        }
    }
}
