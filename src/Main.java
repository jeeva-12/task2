import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        {
            System.out.println("Press 1 for largest of 3 numbers ");
            System.out.println("Press 2 for smallest of 3 numbers ");
            System.out.println("Press 3 for check for prime number ");
            System.out.println("Press 4 for check even or odd ");
            System.out.println("Press 5 to reverse ");
            System.out.println("Press 6 to Quit ");

            System.out.println("Make your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int a, b, c, largest, temp;
                    System.out.println("Enter the first number:");
                    a = sc.nextInt();
                    System.out.println("Enter the second number:");
                    b = sc.nextInt();
                    System.out.println("Enter the third number:");
                    c = sc.nextInt();
                    temp = a > b ? a : b;
                    largest = c > temp ? c : temp;
                    System.out.println("The largest number is: " + largest);
                    break;

                case 2:
                    int d, e, f, smallest, tempe;
                    System.out.println("Enter the first number:");
                    d = sc.nextInt();
                    System.out.println("Enter the second number:");
                    e = sc.nextInt();
                    System.out.println("Enter the third number:");
                    f = sc.nextInt();
                    tempe = d < e ? d : f;
                    smallest = f < tempe ? f : tempe;
                    System.out.println("The largest number is: " + smallest);
                    break;

                case 3:
                    int i, n = 0, m = 0, flag = 0;

                    System.out.println("Enter the  number to check:");
                    n = sc.nextInt();
                    m = n / 2;
                    if (n == 0 || n == 1) {
                        System.out.println(n + " not a prime number");
                    } else {
                        for (i = 2; i <= m; i++) {
                            if (n % i == 0) {
                                System.out.println(n + " not a prime number");
                                flag = 1;
                                break;
                            }
                        }
                        if (flag == 0) {
                            System.out.println(n + " is a prime number");
                            break;
                        }
                    }
                case 4:
                    Scanner reader = new Scanner(System.in);

                    System.out.print("Enter a number: ");
                    int num = reader.nextInt();

                    if(num % 2 == 0)
                        System.out.println(num + " is even");
                    else
                        System.out.println(num + " is odd");
                    break;

                case 5:
                    System.out.print("Enter an integer number:");
                    int number = new Scanner(System.in).nextInt();
                    int reverse = 0;
                    int tempNumber = number;
                    while(number > 0) {
                        int remainder = number % 10;
                        reverse = reverse * 10 + remainder;
                        number = number / 10;
                    }
                    System.out.print("The reverse of the given number is = "+reverse);
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!!! Please make a valid choice. \\n\\n");



            }
            }
        }
    }


