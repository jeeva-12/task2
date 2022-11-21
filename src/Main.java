import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
    int choice;
        Scanner sc=new Scanner(System.in);

        {
            System.out.println("Press 1 for largest of 3 numbers ");
            System.out.println("Press 2 for smallest of 3 numbers ");
            System.out.println("Press 3 for check for prime number ");
            System.out.println("Press 4 for check even or odd ");
            System.out.println("Press 5 to reverse ");
            System.out.println("Press 6 to Quit ");

            System.out.println("Make your choice");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    int a, b, c, largest, temp;
                    System.out.println("Enter the first number:");
                    a = sc.nextInt();
                    System.out.println("Enter the second number:");
                    b = sc.nextInt();
                    System.out.println("Enter the third number:");
                    c = sc.nextInt();
                    temp=a>b?a:b;
                    largest=c>temp?c:temp;
                    System.out.println("The largest number is: "+largest);
                    break;

                case 2:
                    int d, e, f, smallest, tempe;
                    System.out.println("Enter the first number:");
                    d = sc.nextInt();
                    System.out.println("Enter the second number:");
                    e = sc.nextInt();
                    System.out.println("Enter the third number:");
                    f = sc.nextInt();
                    tempe=d<e?d:f;
                    smallest=f<tempe?f:tempe;
                    System.out.println("The smallest number is: "+smallest);
                    break;


            }
        }

    }
}