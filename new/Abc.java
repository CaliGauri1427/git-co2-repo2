import java.util.*;
class Employee
{
String name;
int sal;
void get()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter name and salary");
name=sc.next();
sal=sc.nextInt();
}
void show()
if(sal>=50000)
{
System.out.println( "Name="+name);
System.out.println("Salary="+sal);
}
}
class Abc
{
public static void main(String ar[])
{
Employee e1=new Employee();
Employee e2=new Employee();
System.out.println("enter details of two employees");
e1.get();
e2.get();
System.out.println("employee having sal>=50000);
e1.show();
e2.show();
}
}
