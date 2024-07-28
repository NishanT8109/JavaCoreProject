import java.util.Scanner;

public class NISHANTSTORE

{
	
	 static Scanner sc=new Scanner(System.in);
	 static int a1;
	 static int a2;
	 static int a3;
	 static int a4;
	 static int b1;
	 static int b2;
	 static int b3;
	 static int b4;
	 static int c1;
	 static int c2;
	 static int c3;
	 static int c4;
	 static int d1;
	 static int d2;
	 static int d3;
	 static int d4;
	 static int f;
	
 void Fruits()
{
	
	System.out.println("------------------------------------------->");
	
	System.out.println("101--APPLES IN KG..> : 110rs");
	System.out.println("102-- IN MANGO IN KG..> 150rs:");
	System.out.println("103--BANANA IN KG..> 60rs");
	System.out.println("104--GRAPES IN KG..> 80rs");
	System.out.println("105---EXIT");
	System.out.println("------------------------------------------->");
	
	System.out.println("PLEASE CHOOSE YOUR PRODUCT CODE: ");
	 
	
	int a=sc.nextInt();
	System.out.println("You enterd an option: "+a);
	switch(a)
	{
	case 101:
	{
		System.out.println("HOW MANY KG APPLES DO YOU WANT PLEASE ENTER :");
		int k=sc.nextInt();
		
		System.out.println( "apples amount:" + (a1= k*110));
	
		new NISHANTSTORE().SumOfAll();
		break;
	}
				case 102:
	{
		System.out.print("HOW MANY KG MANGOES DO YOU WANT PLEASE ENTER :");
	
		int k=sc.nextInt();
		System.out.println( "mangoes amount:" + (a2= k*150));
		new NISHANTSTORE().SumOfAll();
		break;
	}
		
	case 103:
	{

		System.out.print("HOW MANY KG BANANA DO YOU WANT PLEASE ENTER :");
		int k=sc.nextInt();
	
		System.out.println( "banana amount:" + (a3= k*60));
		new NISHANTSTORE().SumOfAll();
		break;
	}
	case 104:
	{
		System.out.print("HOW MANY KG GRAPES DO YOU WANT PLEASE ENTER :");
		int k=sc.nextInt();

		System.out.println( "grapes amount:" + (a4= k*80));
		new NISHANTSTORE().SumOfAll();
		break;
	}
		
	
	case 105:
	{
		System.out.println("are you sure to exit if yes then press 1 or contine to shopping press 2:");
		int p =sc.nextInt();
		if(p==1)
		{
			new NISHANTSTORE().Exit();
		}
		
		else if(p==2)
		{
			new NISHANTSTORE().Fruits();
		}
		else
		{
		new NISHANTSTORE().Exit();	
		}
		break;
	}
	default:
	{
		System.out.println("you enterd an wrong input enter right one:");
		System.out.print("press 1 to see Fruit list and 2 to exit or 3 to main list:");
		int p=sc.nextInt();
		if(p==1)
		{
		new NISHANTSTORE().Fruits();
		}else if(p==2)
		{
			new NISHANTSTORE().Exit();
		}else
		{
			new NISHANTSTORE().list();
		}
	}
	}
}

void Vegetables()
{

	System.out.println("------------------------------------------->");
	System.out.println("201--QUALIFLOWER IN KG..> : 70rs");
	System.out.println("202-- IN TAMATO IN KG..> 90rs:");
	System.out.println("203--POPATO IN KG..> 75rs");
	System.out.println("204--REDISH IN KG..> 80rs");
	System.out.println("205---EXIT--->");
	System.out.println("------------------------------------------->");
	System.out.println("PLEASE CHOOSE YOUR PRODUCT CODE: ");
	int a=sc.nextInt();
	System.out.println("You enterd an option: "+a);
	switch(a)
	{
		case 201:
		{
			System.out.print("HOW MANY KG QUALIFLOWER DO YOU WANT PLEASE ENTER :");
			int k=sc.nextInt();
			
			System.out.println("your QUALIFLOWER amount is :"+(b1=k*70));
			new NISHANTSTORE().SumOfAll();
			break;
		}
		
		case 202:
		{
			System.out.print("HOW MANY KG TOMATO DO YOU WANT PLEASE ENTER :");
			int k=sc.nextInt();
		
			System.out.println("your tomato amount is :"+(b2=k*90));
			new NISHANTSTORE().SumOfAll();
			break;
		}
		case 203:
		{
			System.out.print("HOW MANY KG POTATO DO YOU WANT PLEASE ENTER :");
			int k=sc.nextInt();
		
			System.out.println("your potato amount is :"+(b3=k*75));
			new NISHANTSTORE().SumOfAll();
			break;
		}
		case 204:
		{

			System.out.print("HOW MANY KG RADISH DO YOU WANT PLEASE ENTER :");
			int k=sc.nextInt();
		
			System.out.println("your radish amount is :"+(b4=k*80));
			new NISHANTSTORE().SumOfAll();
			break;
		}
		
		
		case 205:
		{
			System.out.println("are you sure to exit if yes then press 1 ,continue to press 2,and main list to 3");
			int k =sc.nextInt();
			if(k==1)
			{
				new NISHANTSTORE().Exit();
			}else if(k==2)
			{
				new NISHANTSTORE().Vegetables();
			}else if(k==3)
			{
				new NISHANTSTORE().list();
			}
			
		
			break;
		}


		 default :
		{
			System.out.println("you enterd an wrong input enter right one:");
			System.out.print("press 1 to see Fruit list and 2 to exit or 3 to main list:");
			int p=sc.nextInt();
			if(p==1)
			{
			new NISHANTSTORE().Fruits();
			}else if(p==2)
			{
				new NISHANTSTORE().Exit();
			}else
			{
				new NISHANTSTORE().list();
			}
		}
	}
}

void Cosmetics()
{
	System.out.println("------------------------------------------->");
	System.out.println("301-- kAJAL...> : 20rs");
	System.out.println("302-- POWDER..> 60rs:");
	System.out.println("303--BINDI IN KG..> 30rs");
	System.out.println("304--COMB IN KG..> 40rs");
	System.out.println("305--EXIT-->");
	System.out.println("------------------------------------------->");
	System.out.println("PLEASE CHOOSE YOUR PRODUCT CODE: ");
	int a=sc.nextInt();
	System.out.println("You enterd an option: "+a);
	switch(a)
	{
	case 301:
	{
		System.out.print("HOW MANY KAJAL'S DO YOU WANT PLEASE ENTER :");
		int k=sc.nextInt();
		//int c1=k*20;
		System.out.println("your kajal amount is :"+(c1=k*20));
		new NISHANTSTORE().SumOfAll();

	//	System.out.print("DO YOU WANT TO PURCHASE SOMETHING MORE IF,YES PLEASE ENTER 1 OR EXIT 2 :");
		int l=sc.nextInt();
		if(l==1)
		{
			new NISHANTSTORE().list();
		
		}else if(l==2)
		{
			new NISHANTSTORE().Exit();
		}
		else if(l>=3)
		{
			
				System.out.println("you entered an wrong option choose the right one");
				System.out.print("DO YOU WANT TO PURCHASE SOMETHING MORE IF,YES PLEASE ENTER 1 OR EXIT 2 :");
				int p=sc.nextInt();
				if(p==1)
				{
					new NISHANTSTORE().list();
				}
				
			
			else
			{
				new NISHANTSTORE().Exit();
			} 			
		}
		break;
	}
	
	case 302:
	{
		System.out.print("HOW MANY POWDER'S DO YOU WANT PLEASE ENTER :");
		int k=sc.nextInt();
		//int c2=k*60;
		System.out.println("your powder amount is :"+(c2=k*60));
		new NISHANTSTORE().SumOfAll();
	
	//	System.out.print("DO YOU WANT TO PURCHASE SOMETHING MORE IF,YES PLEASE ENTER 1 OR EXIT 2 :");
		int l=sc.nextInt();
		if(l==1)
		{
			new NISHANTSTORE().list();
		}else if(l==2)
		{
			new NISHANTSTORE().Exit();
		}
		else if(l>=3)
		{
			System.out.println("you entered an wrong option choose the right one");
			System.out.print("DO YOU WANT TO PURCHASE SOMETHING MORE IF,YES PLEASE ENTER 1 OR EXIT 2 :");
			int p=sc.nextInt();
			if(p==1)
			{
				new NISHANTSTORE().list();
			}
			else
			{
				new NISHANTSTORE().Exit();
			}
		}
		break;
	}
	case 303:
	{
		System.out.print("HOW MANY PACKET BINDI DO YOU WANT PLEASE ENTER :");
		int k=sc.nextInt();
		//int c3=k*30;
		System.out.println("your bindi amount is :"+(c3=k*30));
		new NISHANTSTORE().SumOfAll();
	
	//	System.out.print("DO YOU WANT TO PURCHASE SOMETHING MORE IF,YES PLEASE ENTER 1 OR EXIT 2 :");
		int l=sc.nextInt();
		if(l==1)
		{
			new NISHANTSTORE().list();
		}else if(l==2)
		{
			new NISHANTSTORE().Exit();
		}
		else if(l>=3)
		{
			System.out.println("you entered an wrong option choose the right one");
			System.out.print("DO YOU WANT TO PURCHASE SOMETHING MORE IF,YES PLEASE ENTER 1 OR EXIT 2 :");
			int p=sc.nextInt();
			if(p==1)
			{
				new NISHANTSTORE().list();
			}
			else
			{
				new NISHANTSTORE().Exit();
			}
	}
		break;
	}
	case 304:
	{
		System.out.print("HOW MANY COMB DO YOU WANT PLEASE ENTER :");
		int k=sc.nextInt();
		//int c4=k*40;
		System.out.println("your comb amount is :"+(c4=k*40));
		new NISHANTSTORE().SumOfAll();	
		//System.out.print("DO YOU WANT TO PURCHASE SOMETHING MORE IF,YES PLEASE ENTER 1 OR EXIT 2 :");
		int l=sc.nextInt();
		if(l==1)
		{
			new NISHANTSTORE().list();
		}else if(l==2)
		{
			new NISHANTSTORE().Exit();
		}
		else if(l>3)
		{
			System.out.println("you entered an wrong option choose the right one");
			System.out.print("DO YOU WANT TO PURCHASE SOMETHING MORE IF,YES PLEASE ENTER 1 OR EXIT 2 :");
			int p=sc.nextInt();
			if(p==1)
			{
				new NISHANTSTORE().list();
			}
			else
			{
				new NISHANTSTORE().Exit();
			}
		}
		break;
	}
	case 305:
	{
		System.out.println("are you sure to exit if yes then press 1 or contine to shopping press 2:");
		int p =sc.nextInt();
		if(p==1)
		{
			new NISHANTSTORE().Exit();
		}
		
		else if(p==2)
		{
			new NISHANTSTORE().Cosmetics();
		}
		else
		{
		new NISHANTSTORE().Exit();	
		}
		break;
	}
	
	

default:
{
	System.out.println("you enterd an wrong input enter right one:");
	System.out.print("press 1 to see cosmetic list and 2 to exit or 3 to main list:");
	int p=sc.nextInt();
	if(p==1)
	{
	new NISHANTSTORE().Cosmetics();
	}else if(p==2)
	{
		new NISHANTSTORE().Exit();
	}else
	{
		new NISHANTSTORE().list();
	}
}
	}
}
void MasalaPowder()
{
	System.out.println("------------------------------------------->");
	System.out.println("401-- GARAM MASALA...> : 90rs");
	System.out.println("402-- TURMERIC POWDER..> 100rs:");
	System.out.println("403--CHICKEN MASALA IN KG..> 80rs");
	System.out.println("404--coriander(dhaniya) POWDER IN KG..> 110rs");
	System.out.println("405---exit-->");
	System.out.println("------------------------------------------->");
	System.out.println("PLEASE CHOOSE YOUR PRODUCT CODE: ");
	int a=sc.nextInt();
	System.out.println("You enterd an option: "+a);
	System.out.println();
	switch(a)
	{
	case 401:
	
		System.out.print("HOW MANY GARAM MASALA DO YOU WANT PLEASE ENTER :");
		int k=sc.nextInt();
		//int d1=k*90;
		System.out.println("your garam masala amount is :"+(d1=k*90));
		new NISHANTSTORE().SumOfAll();	
		//System.out.print("DO YOU WANT TO PURCHASE SOMETHING MORE IF,YES PLEASE ENTER 1 OR EXIT 2 :");
		int l=sc.nextInt();
		if(l==1)
		{
			new NISHANTSTORE().list();
		
		}else if(l==2)
		{
			System.out.println("thanks for visting my store please come back soon");
		}
		else if(l>=3)
		{
			
				System.out.println("you entered an wrong option choose the right one");
				System.out.print("DO YOU WANT TO PURCHASE SOMETHING MORE IF,YES PLEASE ENTER 1 OR EXIT 2 :");
				int p=sc.nextInt();
				if(p==1)
				{
					new NISHANTSTORE().list();
				}
				
			
			else
			{
				System.out.println("thanks for visting my store please come back soon");
			} 
				break;
				}

		case 402:
	{
		System.out.println("HOW MANY TURMERIC POWDER DO YOU WANT PLEASE ENTER :");
		int k1 =sc.nextInt();
	//	int d2=k1*100;
		System.out.println("your turmeric amount is :"+(d2=k1*100));
		new NISHANTSTORE().SumOfAll();	
		//System.out.print("DO YOU WANT TO PURCHASE SOMETHING MORE IF,YES PLEASE ENTER 1 OR EXIT 2 :");
		int l1=sc.nextInt();
		if(l1==1)
		{
			new NISHANTSTORE().list();
		}else if(l1==2)
		{
			new NISHANTSTORE().Exit();
		}
		else if(l1>=3)
		{
			System.out.println("you entered an wrong option choose the right one");
			//System.out.print("DO YOU WANT TO PURCHASE SOMETHING MORE IF,YES PLEASE ENTER 1 OR EXIT 2 :");
			int p=sc.nextInt();
			if(p==1)
			{
				new NISHANTSTORE().list();
			}
			else
			{
				new NISHANTSTORE().Exit();
			}
		}
		break;
	}
		case 403:
		{
			System.out.print("HOW MANY CHICKEN MASALA DO YOU WANT PLEASE ENTER :");
			int k1=sc.nextInt();
			
			System.out.println("YOUR  CHICKEN MASALA AMOUNT IS :"+(d3=k1*80));
			new NISHANTSTORE().SumOfAll();	
		
		
			int l1=sc.nextInt();
			if(l1==1)
			{
				new NISHANTSTORE().list();
			}else if(l1==2)
			{
				new NISHANTSTORE().Exit();
			}
			else if(l1>=3)
			{
				System.out.println(" YOU ENTERED AN WRONG OPTION CHOOSE THE RIGHT ONE");
				System.out.print("DO YOU WANT TO PURCHASE SOMETHING MORE IF,YES PLEASE ENTER 1 OR EXIT 2 :");
				int p=sc.nextInt();
				if(p==1)
				{
					new NISHANTSTORE().list();
				}
				else
				{
					new NISHANTSTORE().Exit();
				}
			}
			break;
		}
		case 404:
		{
			System.out.print("HOW MANY CORIANDER(DHANIYA) POWDER DO YOU WANT PLEASE ENTER :");
			int k1=sc.nextInt();
		
			System.out.println("YOR GARAM MASALA AMOUNT IS  :"+(d4=k1*110));
			new NISHANTSTORE().SumOfAll();	
		
	
			int l1=sc.nextInt();
			if(l1==1)
			{
				new NISHANTSTORE().list();
			}else if(l1==2)
			{
				new NISHANTSTORE().Exit();
			}
			else if(l1>3)
			{
				System.out.println("YOU ENTERED AN WRONG OPTION CHOOSE THE RIGHT ONE");
				System.out.print("DO YOU WANT TO PURCHASE SOMETHING MORE IF,YES PLEASE ENTER 1 OR EXIT 2 :");
				int p=sc.nextInt();
				if(p==1)
				{
					new NISHANTSTORE().list();
				}
				else
				{
					new NISHANTSTORE().Exit();
				}
			}
			break;
		}
		case 405:
		{
			System.out.println("ARE YOU SURE TO EXIT IF YES THEN PRESS 1,TO SEE THE GARAM MASALA LIST PRESS 2,AND PRESS 3 TO SEE MAIN LIST");
			int p=sc.nextInt();
			if(p==1)
			{
				new NISHANTSTORE().Exit();
			}
			else if(p==2)
			{
				new NISHANTSTORE().MasalaPowder();
			}
			else if(p==3)
			{
				new NISHANTSTORE().list();
			}else
			{
				System.out.println("you enter an wrong input enter right one,press 1 to see MasalaPowder list ,press 2 to see main list nd press 3 to exit:");
				int k1 =sc.nextInt();
				if(k1==1)
				{
					new NISHANTSTORE().MasalaPowder();
				}else if(k1==2)
				{
					new NISHANTSTORE().list();
				}else if(k1==3)
				{
					new NISHANTSTORE().Exit();
				}
				else
				{
					new NISHANTSTORE().Exit();
				}
				
			}
		}
		default:
		{

			System.out.println("you enterd an wrong input enter right one:");
			System.out.print("press 1 to see MasalaPowder list and 2 to exit or 3 to main list:");
			int p=sc.nextInt();
			if(p==1)
			{
			new NISHANTSTORE().MasalaPowder();
			}else if(p==2)
			{
				new NISHANTSTORE().Exit();
			}else
			{
				new NISHANTSTORE().list();
			}
		}	
		}
}
	


	
	
void Exit()
{
	System.out.println("ARE YOU SURE TO EXIT ? IF YES PRESS 1 OR TO CONTINUE PRESS 2 :");
	int k =sc.nextInt();
	
	switch(k)
	{
	case 1:
	{
		new NISHANTSTORE().UserData();
	//	new NISHANTSTORE().Bill();
		System.out.println("THANKS FOR VISTING NISHANTSTORE COME BACK SOON");
		System.out.println("##########################################################");
		break;
	}
	case 2:
	{
		new NISHANTSTORE().list();
		break;
	}
	default:
	{
		System.out.println("you entered an wrong option choose the right one");
		System.out.print("DO YOU WANT TO PURCHASE SOMETHING MORE IF,YES PLEASE ENTER 1 OR EXIT 2 :");
		int p=sc.nextInt();
		if(p==1)
		{
			new NISHANTSTORE().list();
		}
		else if(p==2)
		{
			new NISHANTSTORE().Exit();
			
		}
		else
		{
			
			new NISHANTSTORE().Exit();
		}
	}
	}
}
	
 void SumOfAll()
{
	f=((NISHANTSTORE.a1)+(NISHANTSTORE.a2)+(NISHANTSTORE.a3)+(NISHANTSTORE.a4)+(NISHANTSTORE.b1)+(NISHANTSTORE.b2)+(NISHANTSTORE.b3)+(NISHANTSTORE.b4)+(NISHANTSTORE.c1)+(NISHANTSTORE.c2)+(NISHANTSTORE.c3)+(NISHANTSTORE.c4)+(NISHANTSTORE.d1)+(NISHANTSTORE.d2)+(NISHANTSTORE.d3)+(NISHANTSTORE.d4));
	
	//System.out.println("total value of your product is:"+( (NISHANTSTORE.a1)+(NISHANTSTORE.a2)+(NISHANTSTORE.a3)+(NISHANTSTORE.a4)+(NISHANTSTORE.b1)+(NISHANTSTORE.b2)+(NISHANTSTORE.b3)+(NISHANTSTORE.b4)+(NISHANTSTORE.c1)+(NISHANTSTORE.c2)+(NISHANTSTORE.c3)+(NISHANTSTORE.c4)+(NISHANTSTORE.d1)+(NISHANTSTORE.d2)+(NISHANTSTORE.d3)+(NISHANTSTORE.d4)));
	
	new NISHANTSTORE().Exit();
	

}
void UserData()
{
	System.out.println("enter your name :");
	sc.nextLine();
	String name=sc.nextLine();
	
	System.out.println("enter your address :");
	
	String address=sc.nextLine();
	System.out.println("enter your contact no:");
	long num=sc.nextLong();
	System.out.println();
	new NISHANTSTORE().Bill();
	System.out.println("your name is:"+name);
	System.out.println("your address is:"+address);
	System.out.println("your contact no is:"+num);
}
public void Bill()
{
	System.out.println("--------------------------------------------");
	System.out.println("------welcome to nishant store------");
	System.out.println();
	System.out.println("your bill details");
	
	System.out.println("--------------------------------------------");
	//System.out.println("S.No  |  QYT    |NAME      |PRICE");
	if(f>=1000)
	{
		System.out.println("Discount applicable of rs 10% :");
		//int m=1000;
		//int discount=10;
		int k=(1000/100)*10;
		System.out.println("Your total amount is: "+f);
		System.out.println("You saved rs : "+k);
		System.out.println("You need to pay rs:"+(f-k));
	}else
	{
		System.out.println("No discount is applicable your current amount is "+f);
	}
}
	
	
	

		
	
	public void list()
	{
		System.out.println("==============================|");
		System.out.println("1) FRUITS                     |");
		System.out.println("2) VEGETABLES");
		System.out.println("3) COSMETIC");
		System.out.println("4) MASALA POWDER");
		System.out.println("5) EXIT");
		System.out.println("==============================|");
		System.out.println("SELECT AN OPTION ");
		//Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		switch(k)
		{
		case 1:
		{
			new NISHANTSTORE().Fruits();
			break;
		}
		case 2:
		{
			new NISHANTSTORE().Vegetables();
			break;
		}
		case 3:
		{
			new NISHANTSTORE().Cosmetics();
			break;
		}
		case 4:
		{
			new NISHANTSTORE().MasalaPowder();
			break;
		}
		case 5:
		{
			new NISHANTSTORE().Exit();
			break;
		}
		default:
		{
			System.out.println("you entered an wrong input check and enter right one,to press 1 to exit,press 2 to main menu");
			int k1 =sc.nextInt();
			if(k1==1)
			{
				new NISHANTSTORE().Exit();
			}else if(k1==2)
			{
				new NISHANTSTORE().list();
			}
			else
			{
				System.out.println("you entered an wrong output check and enter right one,to press 1 to exit,press 2 to main menu");
				int k2 =sc.nextInt();
				if(k2==1)
				{
					new NISHANTSTORE().Exit();
				}else if(k2==2)
				{
					new NISHANTSTORE().list();
				}
			}
		}
		}
	}
	
	
	
public static void main(String[]args)
{
	System.out.println("------welcome to nishant store------");
	System.out.println("Here are the list of our products :");
	System.out.println();
	new NISHANTSTORE().list();

}
}


