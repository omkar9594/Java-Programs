import java.util.*;
import java.lang.*;

public class HotelManagement_Demo {

	public static void main(String[] args) {
		
		int choice,item_qnt=0,amount=0;
		char ans;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("                        Welcomes To Maharashtrian Hotels");
		System.out.println("Display Our Menu:");
		System.out.println();
		System.out.println("\n1.Starter \n2.Veg Thali \n3.Non-Veg Thali \n4.Maharashtrian Thali \n5.Sweet Dish");
		
		
		do
		{
			System.out.println("\nEnter Your Choice");
			choice = sc.nextInt() ;
			
			switch(choice)
			{
			case 1:
				System.out.println("\nSelect Startup Menu:");
				System.out.println("1.Papad=10 \n2.Masala Papad=20 \n3.Fruit=50");
				
				System.out.println("Enter Your Favourite Dish Choice No:");
				int ch1 =sc.nextInt();
				switch(ch1)
					{
					case 1:
						System.out.println("You are Successfully Selected Papad");
						 item_qnt =item_qnt +1;
						amount = amount + 10;
						break;
						
					case 2:
						System.out.println("You are Successfully Selected Masala Papad");
						 item_qnt =item_qnt +1;
						amount = amount + 20;
						break;
						
					case 3:
						System.out.println("You are Successfully Selected Fruit");
						 item_qnt =item_qnt +1;
						amount = amount + 50;
						break;
						
					default:
						System.out.println("Invalid Choice");
					}
				break;
				
			case 2:
				System.out.println("\nSelect Veg Thali:");
				System.out.println("1.Panjabi Thali=150 \nItems:A.Paneer Chilli B.Paneer Tikka C.Dal Rice D.Two Roti");
				System.out.println("\n2.Kolhapuri Veg Thali=200 \nItems:A.Kaju Katli B.Potato Mix C.Dal Rice D.Bhakari ");
				System.out.println("\n3.Rajput Thali=550");
				
				System.out.println("Enter Your Favourite Dish Choice No:");
				int ch2 =sc.nextInt();
				switch(ch2)
					{
					case 1:
						System.out.println("You are Successfully Selected Panjabi Thali");
						 item_qnt =item_qnt +1;
						amount = amount + 150;
						break;
						
					case 2:
						System.out.println("You are Successfully Selected Kolhapuri Veg Thali");
						 item_qnt =item_qnt +1;
						amount = amount + 200;
						break;
						
					case 3:
						System.out.println("You are Successfully Selected Rajput Thali");
						 item_qnt =item_qnt +1;
						amount = amount + 550;
						break;
						
					default:
						System.out.println("Invalid Choice");
						break;
					}
				break;
				
			case 3:
				System.out.println("\nSelect Non-Veg Thali:");
				System.out.println("1.Chikken Thali=650");
				System.out.println("\n2.Mutton Thali=2000");
		
				
				System.out.println("Enter Your Favourite Dish Choice No:");
				int ch3 =sc.nextInt();
                switch(ch3)
					{
					case 1:
						System.out.println("You are Successfully Selected Chikken Thali");
						 item_qnt =item_qnt +1;
						amount = amount + 650;
						break;
						
					case 2:
						System.out.println("You are Successfully Selected Mutton Thali");
						 item_qnt =item_qnt +1;
						amount = amount + 2000;
						break;
						
					default:
						System.out.println("Invalid Choice");
						break;
					}
                break;
				
			case 4:
				System.out.println("\nSelect Our SPECIAL Maharashtrian Thali:");
				System.out.println("1.Veg-Maharashtrian Thali=1500");
				System.out.println("\n2.Non-Veg Maharashtrian Thali=4500");
				
				System.out.println("Enter Your Favourite Dish Choice No:");
				int ch4 =sc.nextInt();
                switch(ch4)
					{
					case 1:
						System.out.println("You are Successfully Selected Veg-Maharashtrian Thali");
						 item_qnt =item_qnt +1;
						amount = amount + 1500;
						break;
						
					case 2:
						System.out.println("You are Successfully Selected Non Veg-Maharashtrian Thali");
						 item_qnt =item_qnt +1;
						amount = amount + 4500;
						break;
						
					default:
						System.out.println("Invalid Choice");
						break;
					}
                break;
                
			case 5:
				System.out.println("\nSelect Our Sweet Dish:");
				System.out.println("1.Gulab-Jam=150");
				System.out.println("\n2.Rus-Gulle=40");
				
				System.out.println("Enter Your Favourite Dish Choice No:");
				int ch5 =sc.nextInt();
                switch(ch5)
					{
					case 1:
						System.out.println("You are Successfully Selected Gulabjam");
						 item_qnt =item_qnt +1;
						amount = amount + 150;
						break;
						
					case 2:
						System.out.println("You are Successfully Selected Rus-Gulle");
						 item_qnt =item_qnt +1;
						amount = amount + 40;
						break;
						
					default:
						System.out.println("Invalid Choice");
						break;
					}
                break;
				
			default:
				System.out.println("Your Choice Is Invalid");
				break;
				
				
			}
			
			System.out.println("\n\nSelect Our Items in Menu Card Y/N:");
			ans=sc.next().charAt(0);
			    
		}while(ans=='y' || ans=='Y');
		
		System.out.println("\n\n");
		System.out.println("Thank Your For Visit Maharashtrians Hotel !");
		System.out.println("Your Billing Details Is");
		System.out.println("Item Quantity:"+item_qnt);
		System.out.println("Total Amount:"+amount);
		
		System.out.println("\n\nSWEET JOURNEY");
		
	}
}

