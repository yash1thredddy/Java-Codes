import java.util.Scanner;
public class Account {
private float currentBalance =15000f; //Current balance
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Your Current Balance is :- 15000");
System.out.println(" ");
System.out.print("Please enter amount to add in your balance: ");
float newAmount = sc.nextFloat();
try{
float totalAmount = new
Account().AddAmount(newAmount);
System.out.println("Total Account Balance = "+ totalAmount);
}
catch (AccountBalanceException a){
float fdAmount = a.getAccountBalance() - 20000 ;
System.out.println(" ");
System.out.println("Your account balance is more than 20K now, So creating FD of Amount: "+ fdAmount);
new Account().createFixDeposit(fdAmount);
System.out.println(" ");
System.out.println("Account Balance = "+20000);
}
}
public float AddAmount(float amount) throws
AccountBalanceException{
float total = currentBalance+amount;
if (total>20000){
throw new AccountBalanceException(total);
}
return total;
}
public void createFixDeposit(float fxAmount){
}
}
class AccountBalanceException extends Exception
{private float accountBalance ;
public AccountBalanceException(float f){
super();
this.accountBalance =f;
}
public AccountBalanceException(String message){
super(message);
}
public float getAccountBalance(){
return accountBalance;
}
}
