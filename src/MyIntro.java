import java.util.Scanner;

public class MyIntro {


    public static void main(String[] args)
    {
        //Information about me
        String name;
        Scanner input= new Scanner(System.in);

        System.out.println("Please Enter your FullName:-");
        name= input.nextLine();

        System.out.println("please Enter Your Java Expriance Level:-");
        name= input.nextLine();

        System.out.println("please Enter Your Major:-");
        name= input.nextLine();

        System.out.println("please Enter Something Interesting about you:-");
        name= input.nextLine();

        System.out.println("please Enter where you are from:-");
        name= input.nextLine();

        System.out.println("My Full Name is :-"+name);
        System.out.println("I am from :-"+name);
        System.out.println("My Level of experiance is :-"+name);
        System.out.println("My Major is :-"+name);
        System.out.println("Interesting about me is :-"+name);

        input.close();




    }
}

