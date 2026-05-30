package com.shoping.consoleapp;
import java.util.Scanner;

public class MiniShopingDemo {
	
	
		public static void main(String[]args) {
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("welcome to blinkit");
			System.out.println("Enter your location");
			System.out.println("Enter 1 for Mumbai location");
			System.out.println("Enter 2 for Uttar Pradesh location");
			System.out.println("Enter 3 for Madhya Pradesh location");
			System.out.println("Enter 4 for Tamilnadu location");
			System.out.println("Enter 5 for Jharkhand location");
			int loc=sc.nextInt();
			
			switch(loc) {
			case 1:{
				System.out.println("Mumbai location choosed");
				System.out.println("Enter 1 for Electronics Products");
				System.out.println("Enter 2 for Beauty Products");
				System.out.println("Enter 3 for Gifting Products");
				System.out.println("Enter 4 for Kids Products");
				System.out.println("Enter 5 for Decor Products");
				int product1=sc.nextInt();
			   if(product1==1) {
				   System.out.println("You have selected Electronics Products"); 
				   System.out.println("Enter 1 for Earbuds");
				   System.out.println("Enter 2 for Smartwatch");
				   System.out.println("Enter 3 for Moblie Phone");
				   System.out.println("Enter 4 for Video Games");
				   int item1=sc.nextInt();
				   switch(item1) {
				   case 1:
					   System.out.println("Earbuds----rupees=499");
					   break;
				   case 2:
					   System.out.println("Smartwatch---rupees=999");
					   break;
				   case 3:
					   System.out.println("Mobile Phone----rupees=9999");
					   break;
				   case 4:
					   System.out.println("Video Games-----rupees=1499");
					   break;
					   default:
					   System.out.println("Invalid item");
				   }
			   }
			   else if(product1==2) {
				   System.out.println("You have selected Beauty Products");
				   System.out.println("Enter 1 for Sunscream");
				   System.out.println("Enter 2 for Lipstick");
				   System.out.println("Enter 3 for Perfumes");
				   System.out.println("Enter 4 for Kajal");
				   int item2=sc.nextInt();
				   switch(item2) {
				   case 1:
					   System.out.println("Sunscream----rupees=499");
					   break;
				   case 2:
					   System.out.println("Lipstick----rupees=999");
					   break;
				   case 3:
					   System.out.println("Perfumes-----rupees=299");
					   break;
				   case 4:
					   System.out.println("Kajal---rupees=199");
					   break;
					   default:
						   System.out.println("Invalid item");
				   }
			   }
			   else if(product1==3) {
				   System.out.println("You have selected Gifting Products");
				   System.out.println("Enter 1 for TeddyBear");
				   System.out.println("Enter 2 for Photo Frame");
				   System.out.println("Enter 3 for Rose");
				   System.out.println("Enter 4 for Bouquet");
				   int item3=sc.nextInt();
				   switch(item3) {
				   case 1:
					   System.out.println("TeddyBear----rupees=899");
					   break;
				   case 2:
					   System.out.println("Photo Frame-----rupees=399");
					   break;
				   case 3:
					   System.out.println("Rose----rupees=99");
					   break;
				   case 4:
					   System.out.println("Bouquet-----rupees=499");
					   break;
					   default:
					   System.out.println("Invalid item");
				   }
			   }
			   else if(product1==4) {
				   System.out.println("You have selected Kids Products");
				   System.out.println("Enter 1 for Mamy Poko Pants");
				   System.out.println("Enter 2 for Milk Powder");
				   System.out.println("Enter 3 for Bottle");
				   System.out.println("Enter 4 for Baby Food");
				   int item4=sc.nextInt();
				   switch(item4) {
				   case 1:
					   System.out.println("Many Poko Pants----rupees=899");
					   break;
				   case 2:
					   System.out.println("Milk Powder-----rupees=399");
					   break;
				   case 3:
					   System.out.println("Bottle----rupees=99");
					   break;
				   case 4:
					   System.out.println("Baby Food-----rupees=499");
					   break;
					   default:
					   System.out.println("Invalid item");
				   }
			   }
			   else if(product1==5) {
				   System.out.println("You have selected Decor Products");
				   System.out.println("Enter 1 for Lamps");
				   System.out.println("Enter 2 for Plants");
				   System.out.println("Enter 3 for Jhummar");
				   System.out.println("Enter 4 for Lightings");
				   int item5=sc.nextInt();
				   switch(item5) {
				   case 1:
					   System.out.println("Lamps---rupees=899");
					   break;
				   case 2:
					   System.out.println("Plants-----rupees=399");
					   break;
				   case 3:
					   System.out.println("Jhumar----rupees=99");
					   break;
				   case 4:
					   System.out.println("Lightings-----rupees=499");
					   break;
					   default:
					   System.out.println("Invalid item");
			   }
			   }
			   else {
				   System.out.println("Invalid Products");
			   }
				break;
			}
			case 2:{
				System.out.println("Uttar Pradesh location choosed");
				System.out.println("Enter 1 for Electronics Products");
				System.out.println("Enter 2 for Beauty Products");
				System.out.println("Enter 3 for Gifting Products");
				System.out.println("Enter 4 for Kids Products");
				System.out.println("Enter 5 for Decor Products");
				int product2=sc.nextInt();
				   if(product2==1) {
					   System.out.println("You have selected Electronics Products"); 
					   System.out.println("Enter 1 for Earbuds");
					   System.out.println("Enter 2 for Smartwatch");
					   System.out.println("Enter 3 for Moblie Phone");
					   System.out.println("Enter 4 for Video Games");
					   int item1=sc.nextInt();
					   switch(item1) {
					   case 1:
						   System.out.println("Earbuds----rupees=499");
						   break;
					   case 2:
						   System.out.println("Smartwatch---rupees=999");
						   break;
					   case 3:
						   System.out.println("Mobile Phone----rupees=9999");
						   break;
					   case 4:
						   System.out.println("Video Games-----rupees=1499");
						   break;
						   default:
						   System.out.println("Invalid item");
					   }
				   }
				   else if(product2==2) {
					   System.out.println("You have selected Beauty Products");
					   System.out.println("Enter 1 for Sunscream");
					   System.out.println("Enter 2 for Lipstick");
					   System.out.println("Enter 3 for Perfumes");
					   System.out.println("Enter 4 for Kajal");
					   int item2=sc.nextInt();
					   switch(item2) {
					   case 1:
						   System.out.println("Sunscream----rupees=499");
						   break;
					   case 2:
						   System.out.println("Lipstick----rupees=999");
						   break;
					   case 3:
						   System.out.println("Perfumes-----rupees=299");
						   break;
					   case 4:
						   System.out.println("Kajal---rupees=199");
						   break;
						   default:
							   System.out.println("Invalid item");
					   }
				   }
				   else if(product2==3) {
					   System.out.println("You have selected Gifting Products");
					   System.out.println("Enter 1 for TeddyBear");
					   System.out.println("Enter 2 for Photo Frame");
					   System.out.println("Enter 3 for Rose");
					   System.out.println("Enter 4 for Bouquet");
					   int item3=sc.nextInt();
					   switch(item3) {
					   case 1:
						   System.out.println("TeddyBear----rupees=899");
						   break;
					   case 2:
						   System.out.println("Photo Frame-----rupees=399");
						   break;
					   case 3:
						   System.out.println("Rose----rupees=99");
						   break;
					   case 4:
						   System.out.println("Bouquet-----rupees=499");
						   break;
						   default:
						   System.out.println("Invalid item");
					   }
				   }
				   else if(product2==4) {
					   System.out.println("You have selected Kids Products");
					   System.out.println("Enter 1 for Mamy Poko Pants");
					   System.out.println("Enter 2 for Milk Powder");
					   System.out.println("Enter 3 for Bottle");
					   System.out.println("Enter 4 for Baby Food");
					   int item4=sc.nextInt();
					   switch(item4) {
					   case 1:
						   System.out.println("Many Poko Pants----rupees=899");
						   break;
					   case 2:
						   System.out.println("Milk Powder-----rupees=399");
						   break;
					   case 3:
						   System.out.println("Bottle----rupees=99");
						   break;
					   case 4:
						   System.out.println("Baby Food-----rupees=499");
						   break;
						   default:
						   System.out.println("Invalid item");
					   }
				   }
				   else if(product2==5) {
					   System.out.println("You have selected Decor Products");
					   System.out.println("Enter 1 for Lamps");
					   System.out.println("Enter 2 for Plants");
					   System.out.println("Enter 3 for Jhummar");
					   System.out.println("Enter 4 for Lightings");
					   int item5=sc.nextInt();
					   switch(item5) {
					   case 1:
						   System.out.println("Lamps---rupees=899");
						   break;
					   case 2:
						   System.out.println("Plants-----rupees=399");
						   break;
					   case 3:
						   System.out.println("Jhumar----rupees=99");
						   break;
					   case 4:
						   System.out.println("Lightings-----rupees=499");
						   break;
						   default:
						   System.out.println("Invalid item");
				   }
				   }
				   else {
					   System.out.println("Invalid Products");
				   }
				break;
			}
			case 3:{
				System.out.println("Madhya Pradesh location choosed");
				System.out.println("Enter 1 for Electronics Products");
				System.out.println("Enter 2 for Beauty Products");
				System.out.println("Enter 3 for Gifting Products");
				System.out.println("Enter 4 for Kids Products");
				System.out.println("Enter 5 for Decor Products");
				int product3=sc.nextInt();
				   if(product3==1) {
					   System.out.println("You have selected Electronics Products"); 
					   System.out.println("Enter 1 for Earbuds");
					   System.out.println("Enter 2 for Smartwatch");
					   System.out.println("Enter 3 for Moblie Phone");
					   System.out.println("Enter 4 for Video Games");
					   int item1=sc.nextInt();
					   switch(item1) {
					   case 1:
						   System.out.println("Earbuds----rupees=499");
						   break;
					   case 2:
						   System.out.println("Smartwatch---rupees=999");
						   break;
					   case 3:
						   System.out.println("Mobile Phone----rupees=9999");
						   break;
					   case 4:
						   System.out.println("Video Games-----rupees=1499");
						   break;
						   default:
						   System.out.println("Invalid item");
					   }
				   }
				   else if(product3==2) {
					   System.out.println("You have selected Beauty Products");
					   System.out.println("Enter 1 for Sunscream");
					   System.out.println("Enter 2 for Lipstick");
					   System.out.println("Enter 3 for Perfumes");
					   System.out.println("Enter 4 for Kajal");
					   int item2=sc.nextInt();
					   switch(item2) {
					   case 1:
						   System.out.println("Sunscream----rupees=499");
						   break;
					   case 2:
						   System.out.println("Lipstick----rupees=999");
						   break;
					   case 3:
						   System.out.println("Perfumes-----rupees=299");
						   break;
					   case 4:
						   System.out.println("Kajal---rupees=199");
						   break;
						   default:
							   System.out.println("Invalid item");
					   }
				   }
				   else if(product3==3) {
					   System.out.println("You have selected Gifting Products");
					   System.out.println("Enter 1 for TeddyBear");
					   System.out.println("Enter 2 for Photo Frame");
					   System.out.println("Enter 3 for Rose");
					   System.out.println("Enter 4 for Bouquet");
					   int item3=sc.nextInt();
					   switch(item3) {
					   case 1:
						   System.out.println("TeddyBear----rupees=899");
						   break;
					   case 2:
						   System.out.println("Photo Frame-----rupees=399");
						   break;
					   case 3:
						   System.out.println("Rose----rupees=99");
						   break;
					   case 4:
						   System.out.println("Bouquet-----rupees=499");
						   break;
						   default:
						   System.out.println("Invalid item");
					   }
				   }
				   else if(product3==4) {
					   System.out.println("You have selected Kids Products");
					   System.out.println("Enter 1 for Mamy Poko Pants");
					   System.out.println("Enter 2 for Milk Powder");
					   System.out.println("Enter 3 for Bottle");
					   System.out.println("Enter 4 for Baby Food");
					   int item4=sc.nextInt();
					   switch(item4) {
					   case 1:
						   System.out.println("Many Poko Pants----rupees=899");
						   break;
					   case 2:
						   System.out.println("Milk Powder-----rupees=399");
						   break;
					   case 3:
						   System.out.println("Bottle----rupees=99");
						   break;
					   case 4:
						   System.out.println("Baby Food-----rupees=499");
						   break;
						   default:
						   System.out.println("Invalid item");
					   }
					  
				   }
				   else if(product3==5) {
					   System.out.println("You have selected Decor Products");
					   System.out.println("Enter 1 for Lamps");
					   System.out.println("Enter 2 for Plants");
					   System.out.println("Enter 3 for Jhummar");
					   System.out.println("Enter 4 for Lightings");
					   int item5=sc.nextInt();
					   switch(item5) {
					   case 1:
						   System.out.println("Lamps---rupees=899");
						   break;
					   case 2:
						   System.out.println("Plants-----rupees=399");
						   break;
					   case 3:
						   System.out.println("Jhumar----rupees=99");
						   break;
					   case 4:
						   System.out.println("Lightings-----rupees=499");
						   break;
						   default:
						   System.out.println("Invalid item");
				   }
				   }
				   else {
					   System.out.println("Invalid Products");
				   }
				break;
			}
			case 4:{
				System.out.println("Tamilnadu location chossed");
				System.out.println("Enter 1 for Electronics Products");
				System.out.println("Enter 2 for Beauty Products");
				System.out.println("Enter 3 for Gifting Products");
				System.out.println("Enter 4 for Kids Products");
				System.out.println("Enter 5 for Decor Products");
				int product4=sc.nextInt();
				   if(product4==1) {
					   System.out.println("You have selected Electronics Products"); 
					   System.out.println("Enter 1 for Earbuds");
					   System.out.println("Enter 2 for Smartwatch");
					   System.out.println("Enter 3 for Moblie Phone");
					   System.out.println("Enter 4 for Video Games");
					   int item1=sc.nextInt();
					   switch(item1) {
					   case 1:
						   System.out.println("Earbuds----rupees=499");
						   break;
					   case 2:
						   System.out.println("Smartwatch---rupees=999");
						   break;
					   case 3:
						   System.out.println("Mobile Phone----rupees=9999");
						   break;
					   case 4:
						   System.out.println("Video Games-----rupees=1499");
						   break;
						   default:
						   System.out.println("Invalid item");
					   }
				   }
				   else if(product4==2) {
					   System.out.println("You have selected Beauty Products");
					   System.out.println("Enter 1 for Sunscream");
					   System.out.println("Enter 2 for Lipstick");
					   System.out.println("Enter 3 for Perfumes");
					   System.out.println("Enter 4 for Kajal");
					   int item2=sc.nextInt();
					   switch(item2) {
					   case 1:
						   System.out.println("Sunscream----rupees=499");
						   break;
					   case 2:
						   System.out.println("Lipstick----rupees=999");
						   break;
					   case 3:
						   System.out.println("Perfumes-----rupees=299");
						   break;
					   case 4:
						   System.out.println("Kajal---rupees=199");
						   break;
						   default:
							   System.out.println("Invalid item");
					   }
				   }
				   else if(product4==3) {
					   System.out.println("You have selected Gifting Products");
					   System.out.println("Enter 1 for TeddyBear");
					   System.out.println("Enter 2 for Photo Frame");
					   System.out.println("Enter 3 for Rose");
					   System.out.println("Enter 4 for Bouquet");
					   int item3=sc.nextInt();
					   switch(item3) {
					   case 1:
						   System.out.println("TeddyBear----rupees=899");
						   break;
					   case 2:
						   System.out.println("Photo Frame-----rupees=399");
						   break;
					   case 3:
						   System.out.println("Rose----rupees=99");
						   break;
					   case 4:
						   System.out.println("Bouquet-----rupees=499");
						   break;
						   default:
						   System.out.println("Invalid item");
					   }
				   }
				   else if(product4==4) {
					   System.out.println("You have selected Kids Products");
					   System.out.println("Enter 1 for Mamy Poko Pants");
					   System.out.println("Enter 2 for Milk Powder");
					   System.out.println("Enter 3 for Bottle");
					   System.out.println("Enter 4 for Baby Food");
					   int item4=sc.nextInt();
					   switch(item4) {
					   case 1:
						   System.out.println("Many Poko Pants----rupees=899");
						   break;
					   case 2:
						   System.out.println("Milk Powder-----rupees=399");
						   break;
					   case 3:
						   System.out.println("Bottle----rupees=99");
						   break;
					   case 4:
						   System.out.println("Baby Food-----rupees=499");
						   break;
						   default:
						   System.out.println("Invalid item");
					   }
				   }
				   else if(product4==5) {
					   System.out.println("You have selected Decor Products");
					   System.out.println("Enter 1 for Lamps");
					   System.out.println("Enter 2 for Plants");
					   System.out.println("Enter 3 for Jhummar");
					   System.out.println("Enter 4 for Lightings");
					   int item5=sc.nextInt();
					   switch(item5) {
					   case 1:
						   System.out.println("Lamps---rupees=899");
						   break;
					   case 2:
						   System.out.println("Plants-----rupees=399");
						   break;
					   case 3:
						   System.out.println("Jhumar----rupees=99");
						   break;
					   case 4:
						   System.out.println("Lightings-----rupees=499");
						   break;
						   default:
						   System.out.println("Invalid item");
				   }
				   }
				   else {
					   System.out.println("Invalid Products");
				   }
				
				break;
			}
			case 5:{
				System.out.println("Jharkhand location choosed ");System.out.println("Enter 1 for Electronics Products");
				System.out.println("Enter 2 for Beauty Products");
				System.out.println("Enter 3 for Gifting Products");
				System.out.println("Enter 4 for Kids Products");
				System.out.println("Enter 5 for Decor Products");
				int product5=sc.nextInt();
				   if(product5==1) {
					   System.out.println("You have selected Electronics Products"); 
					   System.out.println("Enter 1 for Earbuds");
					   System.out.println("Enter 2 for Smartwatch");
					   System.out.println("Enter 3 for Moblie Phone");
					   System.out.println("Enter 4 for Video Games");
					   int item1=sc.nextInt();
					   switch(item1) {
					   case 1:
						   System.out.println("Earbuds----rupees=499");
						   break;
					   case 2:
						   System.out.println("Smartwatch---rupees=999");
						   break;
					   case 3:
						   System.out.println("Mobile Phone----rupees=9999");
						   break;
					   case 4:
						   System.out.println("Video Games-----rupees=1499");
						   break;
						   default:
						   System.out.println("Invalid item");
					   }
				   }
				   else if(product5==2) {
					   System.out.println("You have selected Beauty Products");
					   System.out.println("Enter 1 for Sunscream");
					   System.out.println("Enter 2 for Lipstick");
					   System.out.println("Enter 3 for Perfumes");
					   System.out.println("Enter 4 for Kajal");
					   int item2=sc.nextInt();
					   switch(item2) {
					   case 1:
						   System.out.println("Sunscream----rupees=499");
						   break;
					   case 2:
						   System.out.println("Lipstick----rupees=999");
						   break;
					   case 3:
						   System.out.println("Perfumes-----rupees=299");
						   break;
					   case 4:
						   System.out.println("Kajal---rupees=199");
						   break;
						   default:
							   System.out.println("Invalid item");
					   }
				   }
				   else if(product5==3) {
					   System.out.println("You have selected Gifting Products");
					   System.out.println("Enter 1 for TeddyBear");
					   System.out.println("Enter 2 for Photo Frame");
					   System.out.println("Enter 3 for Rose");
					   System.out.println("Enter 4 for Bouquet");
					   int item3=sc.nextInt();
					   switch(item3) {
					   case 1:
						   System.out.println("TeddyBear----rupees=899");
						   break;
					   case 2:
						   System.out.println("Photo Frame-----rupees=399");
						   break;
					   case 3:
						   System.out.println("Rose----rupees=99");
						   break;
					   case 4:
						   System.out.println("Bouquet-----rupees=499");
						   break;
						   default:
						   System.out.println("Invalid item");
					   }
				   }
				   else if(product5==4) {
					   System.out.println("You have selected Kids Products");
					   System.out.println("Enter 1 for Mamy Poko Pants");
					   System.out.println("Enter 2 for Milk Powder");
					   System.out.println("Enter 3 for Bottle");
					   System.out.println("Enter 4 for Baby Food");
					   int item4=sc.nextInt();
					   switch(item4) {
					   case 1:
						   System.out.println("Many Poko Pants----rupees=899");
						   break;
					   case 2:
						   System.out.println("Milk Powder-----rupees=399");
						   break;
					   case 3:
						   System.out.println("Bottle----rupees=99");
						   break;
					   case 4:
						   System.out.println("Baby Food-----rupees=499");
						   break;
						   default:
						   System.out.println("Invalid item");
					   }
				   }
				   else if(product5==5) {
					   System.out.println("You have selected Decor Products");
					   System.out.println("Enter 1 for Lamps");
					   System.out.println("Enter 2 for Plants");
					   System.out.println("Enter 3 for Jhummar");
					   System.out.println("Enter 4 for Lightings");
					   int item5=sc.nextInt();
					   switch(item5) {
					   case 1:
						   System.out.println("Lamps---rupees=899");
						   break;
					   case 2:
						   System.out.println("Plants-----rupees=399");
						   break;
					   case 3:
						   System.out.println("Jhumar----rupees=99");
						   break;
					   case 4:
						   System.out.println("Lightings-----rupees=499");
						   break;
						   default:
						   System.out.println("Invalid item");
						   
						   sc.close();
				   }
				   }
				   else {
					   System.out.println("Invalid Products");
				   }
				
				break;
			}
			default:
				System.out.println("Invalid location choosed");
			}
			
				
			}
		}


