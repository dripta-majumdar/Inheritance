import java.util.*;
class A{
    int a,b,c;
    void add(){
        System.out.println();
        System.out.println("Enter the values of a & b for addition:");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println("Sum is:"+ c);
    }
    void sub(){
        System.out.println();
        System.out.println("Enter the values of a & b for substraction:");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a-b;
        System.out.println("Sub is:"+ c);
    }
}
class B extends A{
    void multiply(){
        System.out.println();
        System.out.println("Enter the values of a & b for multiplication:");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a*b;
        System.out.println("Multiplication is:"+ c);
    }
    void Division(){
        System.out.println();
        System.out.println("Enter the values of a & b for division:");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a/b;
        System.out.println("Div is:"+ c);
    }
}
class C extends B{
    void rem(){
        System.out.println();
        System.out.println("Enter the values of a & b for remainder:");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a%b;
        System.out.println("Remainder is:"+ c);
    }
}

public class Inheritance {
    public static void main(String[] args){
        C obj= new C();
        obj.add();
        obj.sub();
        obj.multiply();
        obj.Division();
        obj.rem();
    }
}
