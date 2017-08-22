import java.util.*; //importing Scanner class to take data from the user

public class BitwiseLogicalAnd {

	public static void main(String[] args) {    //main method
		
		byte num1, num2;   //initialization of the variable in byte 
		Scanner sc = new Scanner(System.in);   //creating of scanner object
		boolean b1, b2;   //initializing of variables in boolean
		
		System.out.println("Enter the 1st value in 0 or 1: ");  //taking input in byte in num1
		num1 = sc.nextByte();
		System.out.println("Enter the 2nd value in 0 or 1: ");  //taking input in byte in num2
		num2 = sc.nextByte();
		sc.close();     //closing the scanner class 
		
		if(num1==0)     //condition to check if the value entered in num1 is 0 or 1
		{
			 b1 = false;   //if the value entered is 0 then boolean value will be false
		}
		else {
			 b1 = true;   //if the value entered is 1 then boolean value will be true
		}
		if(num2==1)        //condition to check if the value entered in num2 is 0 or 1
		{
			 b2 = true;    //if the value entered is 1 then boolean value will be true
		}
		else {
			 b2 =false;		//if the value entered is 0 then boolean value will be false
		}
		
		System.out.println("*********Truth Table for Bitwise and Logicl AND*********");
		System.out.println(num1+ " & " +num2+ " = "+(num1&num2));	//printing the output for bitwise AND
		System.out.println(b1+ " & " +b2+ " = " +(b1&b2));		//printing the output for logical AND
		
	}

}
