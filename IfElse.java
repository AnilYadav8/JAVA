import java.util.Scanner;
public class IfElse
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
//take integer input for number
System.out.println("Enter the nubmer of integer");
int a = sc.nextInt();
 int rem = a%2;
if(rem==0)
{
System.out.println("divisible by 2 even");
}
else
{
System.out.println("divisible by 2 odd");
}
}
}