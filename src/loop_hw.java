import java.util.Scanner;

public class loop_hw
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//1.Write a program in C to display the first 10 natural numbers.

//        for(int i=1;i<=10;i++)
//        {
//            System.out.println(i);
//        }

//2.Write a C program to compute the sum of the first 10 natural numbers.

//        int sum=0;
//        for(int i=1;i<=10;i++)
//        {
//            System.out.println(i);
//            sum=sum+i;
//            i++;
//        }
//        System.out.println(sum);

//3.Write a program in C to display n terms of natural numbers and their sum.

//        int no,sum=0;
//        System.out.print("Enter last number:");
//        no = input.nextInt();
//        for(int i=1;i<=no;i++)
//        {
//            System.out.println(i);
//            sum=sum+i;
//            i++;
//        }
//        System.out.println(sum);

//4.Write a program in C to read 10 numbers from the keyboard and find their sum and average.

//        int no1,no2,no3,no4,no5,no6,no7,no8,no9,no10,sum,average;
//
//        System.out.println("Enter all 10 numbers: ");
//        no1=input.nextInt();
//        no2=input.nextInt();
//        no3=input.nextInt();
//        no4=input.nextInt();
//        no5=input.nextInt();
//        no6=input.nextInt();
//        no7=input.nextInt();
//        no8=input.nextInt();
//        no9=input.nextInt();
//        no10=input.nextInt();
//
//        sum=no1+no2+no3+no4+no5+no6+no7+no8+no9+no10;
//        average=sum/10;
//
//        System.out.print("The sum is : "+sum);
//        System.out.println("The average number is: "+average);

//5.Write a program in C to display the cube of the number up to an integer.

//        int n,qube;
//        System.out.print("Enter no: ");
//        n = input.nextInt();
//        for(int i=0;i<=n;i++)
//        {
//            qube=i*i*i;
//            System.out.println(qube);
//        }

//6.Write a program in C to display the multiplication table for a given integer.

//    int table;
//
//    System.out.print("Enter the table: ");
//    table = input.nextInt();
//
//    for (int i = 1; i <= 10; i++)
//    {
//        System.out.println(table + " x " + i + " = " + (table * i));
//    }

//7.Write a program in C to display the multiplier table vertically from 1 to n. 

        int no;
        System.out.println("Enter no:");
        no = input.nextInt();
        for (int i = 1; i <= no; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                System.out.print(no + " x " + j + " = " + (no * j)+" ");
                j++;
            }
            System.out.println();
            i++;
        }

//8.

    }
}

