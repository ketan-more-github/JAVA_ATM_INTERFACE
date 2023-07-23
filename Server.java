package code;

import java.io.FileWriter;
import java.io.IOException;

public class Server {

	public static int transition_history;
	
	public static int withdraw;
	public static int user_balance;
	public static int deposite;
	public static int transfer;
	
	
	public int getTransition_history() {
		return transition_history;
	}
	public void setTransition_history(int transition_history) {
		Server.transition_history = transition_history;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		Server.withdraw = withdraw;
	}
	public int getUser_balance() {
		return user_balance;
	}
	public void setUser_balance(int user_balance) {
		Server.user_balance = user_balance;
	}
	public int getDeposite() {
		return deposite;
	}
	public void setDeposite(int deposite) {
		Server.deposite  = deposite;
	}
	public int getTransfer() {
		return transfer;
	}
	public void setTransfer(int transfer) {
		Server.transfer = transfer;
	}
	
	
		
	
	
	
	public static void main(String[] args) {
		
	}
	
	
}
