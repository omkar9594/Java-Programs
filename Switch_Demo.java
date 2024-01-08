//WAP to accept choice from user and accordingly display the output
//1:Given no is even or odd
//2:Find out the grade (accept marks of 5 subject)
//3:Accept no and find out cube if no is divisble by 5
//4:Accept 3 nofrom user and find out the greatest


import java.util.*;
public class Switch_Demo {

	public static void main(String[] args) {
		
		int no;
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("1:Given no is even or odd \n2:Find out the grade (accept marks of 5 subject) \n3:Accept no and find out cube if no is divisble by 5 \n4:Accept 3 nofrom user and find out the greatest"
);
		
		System.out.println("Enter Your Choice:");
		int n = sc.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.println("Enter Your No");
			no = sc.nextInt();
			
			if(no%2==0)
			{
				System.out.println("The No Is Even");
			}
			else
			{
				System.out.println("The No is Odd");
			}
			break;
			
		case 2:
			int math,bio,phy,chem,hin;
			
			System.out.println("Enter Math Marks Out of 100");
			math = sc.nextInt();
			
			System.out.println("Enter Biology Marks Out of 100");
			bio = sc.nextInt();
			
			System.out.println("Enter Physics Marks Out of 100");
			phy = sc.nextInt();
			
			System.out.println("Enter Chemistry Marks Out of 100");
			chem = sc.nextInt();
			
			System.out.println("Enter Hindi Marks");
			hin = sc.nextInt();
			
			int percentage = (math+bio+phy+chem+hin/500)*100;
			
			if(percentage>=80)
			{
				System.out.println("A+ Grade");
			}
			else if(percentage>=60)
			{
				System.out.println("A Grade");
			}
			else
			{
				System.out.println("B Grade");
			}
			break;
			
		case 3:
			System.out.println("Enter no to check Whether Divisible by 5");
			
			int a = sc.nextInt();
			if(a%5==0)
			{
				int b = a*a*a;
				System.out.println(b);
			}
			break;
			
		case 4:
			System.out.println("Accept The Three No From User:");
			
			System.out.println("Enter The First No:");
			int p = sc.nextInt();
			
			System.out.println("Enter The First No:");
			int q = sc.nextInt();
			
			System.out.println("Enter The First No:");
			int r = sc.nextInt();
			
			if(p<r)
			{
				System.out.println("r is a greatest no");
			}
			else if(p<q)
			{
				System.out.println("q is a greatest no");
			}
			else
			{
				System.out.println("p is a greatest no");
				
			}
			break;
			
		default :
			
			System.out.println("The Invalid Choice");
				
		    
		}
	}

}
