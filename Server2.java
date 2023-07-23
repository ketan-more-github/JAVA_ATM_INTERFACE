package code;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Server2 {
	
	 final static int  user_id = 100203;
	 final static int  user_pass = 1137;
	 public static boolean valid = false;
	 public static boolean auth ;
	 final static int  auth_pin = 3;
	
	 
	 @SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException {
		 
		 
		ArrayList<Integer> arr = new ArrayList<>();
		Server s = new Server();
		System.out.println("***************Welcome to ATM******************");
		System.out.println();
		
		Scanner sc = new  Scanner(System.in);
		while(!auth)
		{
			System.out.println("*************Login Page ***********************");
			System.out.println();
		    System.out.println("---Please Enter Your 6 Digit User ID---");
		    int id = sc.nextInt();
		    System.out.println("---Please Enter Your 4 Digit Password---");
		    int pass = sc.nextInt();
		
		//===validations
		
		if(user_id==id)
		{
			if(user_pass==pass)
			{
				System.out.println();
				System.out.println("******** User  Login Succesfully****");
				System.out.println();
				valid = true;
				auth = true;
				break;
			}
			else
			{
				System.out.println("---Incorrect password Please Check---");
				System.out.println();
				auth = false;
			}
		}
		else {
			System.out.println("---Incorrect User ID Please check---");
			System.out.println();
			auth = false;
		}
		}
		
		
		
		
		// --interface
		
		while(valid)
		{
			
			
			System.out.println("---Welcome user Choose One Option--");
			System.out.println();
			System.out.printf(" 1.  Please press 1 to Show Balanace   ");
			System.out.printf("    2.  Please press 2 to Withdraw Amount ");
			System.out.println();
			System.out.printf(" 3.  Please press 3 to Deposite Amount ");
			System.out.printf("    4.  Please press 4 to transfer Amount ");
			System.out.println();
			System.out.printf(" 5.  Please press 5 to show Trans_history ");
			System.out.printf(" 6.  Please press 6 to Exite ");
			System.out.println();
			
			int ch = sc.nextInt();

			 if(ch==1)
			{
				//show
				System.out.println("Your Account Balance is : " + s.user_balance );
				System.out.println();
				
			}
			else if(ch==2)
			{
				//withdraw
				System.out.println("---Enter Amount You Want to Withdraw from Your Account---");
				int w_amt = sc.nextInt();
				
				if(w_amt<s.user_balance)
				{
				s.user_balance = s.user_balance - w_amt;
				System.out.println("Amount Widraw Succesfully");
				System.out.println();
				arr.add(-w_amt);
				}
				else
				{
					System.out.println("--- You dont have Sufficient balance to procesd this transiction");
					System.out.println();
				}
				
			}
			else if(ch==3)
			{
				System.out.println("---Enter Amount You Want to Add in Your Account---");
				int dept = sc.nextInt();
				s.setDeposite(dept);
				s.user_balance = s.user_balance + s.deposite;
				System.out.println("amount Deposited Succesfully");
				System.out.println();
				arr.add(dept);
				
			}
			else if(ch==4)
			{
				BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("----Welcome to E-transfer---");
				System.out.println();
				System.out.println("Enter the User_name of a patner bank ");
				String name = br.readLine();
				System.out.println("Enter user_id of patner bank to transfer Amount");
				String id = br.readLine();
				
				if(id.length()!=6) {
					System.out.println("---invaild user Id--");
				}
				else
				{
					System.out.println("Enter A Amount You Want to Trasfer to " + name);
					int amtt = sc.nextInt();
					if(amtt<s.user_balance)
					{
					s.user_balance = s.user_balance - amtt;
					System.out.println("Amount transfer Succesfully.... to :" + name + " with user_id :" +id);
					System.out.println();
					arr.add(-amtt);
					}
					else
					{
						System.out.println("--- You dont have Sufficient balance to procesd this transiction");
						System.out.println();
						
					}
				}
				
				
				
			}
			else if(ch==5)
			{
				//transcition histry
				if(arr.isEmpty())
				{
					System.out.println("--- No Transiction History Found");
				}
				System.out.println("---Your transictions are : ");
				System.out.println();
				for(int k : arr)
				{
					if(k>0)
					{
						System.out.println("  Deposit : " + k);
						
					}
					else
					{
						System.out.println("  Withdraw : " + k);
						
					}
				}
				System.out.println();
			
				
								
			}
			else if(ch==6)
			{
				//exite
				System.out.println("****************Thank You To Visit Us*******************");
				System.out.println("byeee");
				break;
				
			}
			
			
			
			
		}
		
		
		
	}
}
