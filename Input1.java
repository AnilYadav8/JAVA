import java.util.Scanner;
public class Input1
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter the value in first value in integer:");
int first = sc.nextInt();
System.out.println("Enter the value in second value in integer:");
int second = sc.nextInt();
System.out.println("Enter the value in third value in integer:");
int third = sc.nextInt();


int sum = first+second+third;
System.out.println(sum);

int difference = first-second-third;
System.out.println(difference);
int product = first*second*third;
System.out.println(product);

}
}

