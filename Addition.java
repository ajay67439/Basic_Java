package pack1;

import java.util.Scanner; //if you use scanner then always write import package

//addition of two number using input
//addition ofwo number using without input

/*
public class example2 {

	public static void main(String[] args) {
	int a=2,b=3;
	int c=a+b;
	System.out.println(c);

	}

}
*/


public class example2{
	public static void main (String args[])
	{
		int num1, num2, sum;                                  //variable-num,sum
        Scanner sc = new Scanner(System.in);                 //scanner -when we want to user input then use scanner and always use import package see in up
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();                                //+nextINt is input an integer value from the user and assign it to the variable n .
                                                             //num1 is variable and it storesuser input  value 
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();                                                //no need to write  in every program
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);    // final output
	}
}



/*
output:-
Enter First Number: 
4
Enter Second Number: 
5
Sum of these numbers: 9
*/
