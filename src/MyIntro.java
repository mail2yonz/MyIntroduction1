import java.util.Scanner;

public class MyIntro {


    public static void main(String[] args)
    {
        //Information about me
        String name,experiance,major,interesting,wherefrom;
        Scanner input= new Scanner(System.in);

        System.out.println("Please Enter your FullName:-");
        name= input.nextLine();

        System.out.println("please Enter Your Java Expriance Level:-");
        experiance= input.nextLine();

        System.out.println("please Enter Your Major:-");
        major= input.nextLine();

        System.out.println("please Enter Something Interesting about you:-");
        interesting= input.nextLine();

        System.out.println("please Enter where you are from:-");
        wherefrom= input.nextLine();

        System.out.println("My Full Name is :-"+name);
        System.out.println("I am from :-"+wherefrom);
        System.out.println("My Level of experiance is :-"+experiance);
        System.out.println("My Major is :-"+major);
        System.out.println("Interesting about me is :-"+interesting);

        input.close();




    }
}

