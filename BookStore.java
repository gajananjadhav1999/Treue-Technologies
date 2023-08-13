import java.util.Scanner;

class BookStore 
{
	static String Name;
	static String Gmail;
	static int MobileNo;
	static String BookName;
	static String Pass;
	static String CPass;
	
	static Scanner sc=new Scanner(System.in);
	static void MainPage()
	{
		System.out.println("===================================");
		System.out.println("||     WELCOME TO BOOK STORE     ||");
		System.out.println("===================================");
		System.out.println("   Create New Account  : Press 1   ");
		System.out.println("===================================");
		System.out.println("  Login as Existing User : Press 2 ");
		System.out.println("===================================");
        System.out.println("        ENTER YOUR CHOICE          ");
        System.out.println("===================================");

		
		
		switch(sc.nextInt())
		{
		case 1:
			Account();
			break;
			
		case 2:
			Login();
			break;
		}
	}
	static void Account()
	{
		System.out.println("=============================");
		System.out.println("||   CREATE YOUR ACCOUNT   ||");
		System.out.println("=============================");
		
		System.out.println("Enter Your Name");
		sc.nextLine();
		String Name = sc.nextLine();
		
		System.out.println("Enter Gmail");
		//sc.nextLine();
		String Gmail = sc.nextLine();
		
		System.out.println("Enter Mobile Number");
		//sc.nextLine();
		long MobileNo =sc.nextLong();
		
		System.out.println("Enter Password");
		sc.nextLine();
		String Pass=sc.nextLine();
		
		System.out.println("Confirm Your Password");
		String CPass=sc.nextLine();
			
		
		 if(CPass.equals(Pass))
	        {
	            System.out.println("===============================================");
	            System.out.println("||  CONGRATULATION YOUR ACCOUNT HAS CREATED  ||");
	            System.out.println("===============================================");
	            System.out.println("||         PRESS ENTER TO CONTINUE           ||");
	            System.out.println("===============================================");
	            Pass=sc.nextLine();
	            Login();
	        }
		 else
		 {
			 System.out.println("===============================");
			 System.out.println("||   PASSWORD NOT MATCHED    ||");
			 System.out.println("===============================");
			 Account();
		 }
		
	}
	
	static void Login()
	{
		
		System.out.println("====================================");
		System.out.println("||      WELCOME TO BOOK STORE     ||");
		System.out.println("====================================");
		System.out.println("Enter Your Gmail");
		sc.nextLine();
		String Gmail=sc.nextLine();
		System.out.println("Enter Your Password");
		String Pass=sc.nextLine();
		if(Gmail.equals(Gmail) || Pass.equals(Pass))
		{
			System.out.println("Login Successuful");
			Books();
		}
		
		else
		{
			System.out.println("UserName or Password Incorrect");
			Login();
		}
	}
	static void Books()
	{
		System.out.println("==================================================================");
		System.out.println("||                      ONLINE LIBRARY                          ||");
		System.out.println("==================================================================");
		System.out.println("||		We Have Following Books		Price ||");
		System.out.println("==================================================================");
		System.out.println("|| 1] JAVA 'A Learners Guide to Real-World Programming' 750 INR ||");
		System.out.println("||							        ||");
		System.out.println("|| 2] PYTHON CRASH COURSE                   	        500 INR ||");
		System.out.println("||							        ||");
		System.out.println("|| 3] MASTERING HTML, CSS & JavaScript                  350 INR ||");
		System.out.println("||							        ||");
		System.out.println("|| 4] HANDS ON SQL                                      400 INR ||");
		System.out.println("||                                                              ||");
		System.out.println("|| 5]                      TO EXIT                              ||");
		System.out.println("==================================================================");
	
		System.out.println("==================================================================");
		System.out.println("||            ENTER YOUR CHOICE TO ADD BOOK IN CART             ||");
		System.out.println("==================================================================");
		
		switch(sc.nextInt())
		{
		case 1:
			
			System.out.println(" JAVA BOOKS ADDED IN CART");
			sc.nextInt();

		case 2:
			
			System.out.println(" PYTHON BOOK ADDED IN CART");
			sc.nextInt();

		case 3:
			
			System.out.println(" HTML, CSS, JavaScript BOOK ADDED IN CART");
			sc.nextInt();
		
		case 4:
		   
			System.out.println(" SQL BOOK ADDED IN CART");
			sc.nextInt();

		case 5:
			
			System.out.println("  !!!...Thank You...!!!  \n !!!...Visit Again...!!!");
			MainPage();
		break;	
			
		default:
		System.out.println("Invalid data");
		}
		
	}
	static void Addition()
	{
		
	}
		
	public static void main(String[] args) 
	{
		MainPage();
		
	}
}
