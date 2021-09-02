import java.util.*;
class CourseRegistration
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("  **$$ Welcome to Online Course Registration $$** ");
		System.out.println("1.sign in / 2.sign up");
		int i=in.nextInt();
		switch(i)
		{
			case 1 :
				System.out.println("User name");
				char s=in.next().charAt(0);
				System.out.println("Password");
				char n=in.next().charAt(0);
				break;
			case 2 :
				System.out.println("First name");
				char aa=in.next().charAt(0);
				System.out.println("Last name");
				char ab=in.next().charAt(0);
				System.out.println("set new password");
				char ac=in.next().charAt(0);
				System.out.println("confirm password");
				char ad=in.next().charAt(0);
				if(ac==ad)
					System.out.println("U r account is ready");
				else
					System.out.println("password not matching pleas try again");

				break;
			default:
				System.out.println("invalid responce");
		}
		System.out.println("1.For New Registration");
		System.out.println("2.Previous Registrations");
		int x=in.nextInt();
		switch(x){
			case 1 :
				System.out.println("Collages are:");
				System.out.println();
				System.out.println("1.VIT-AP University");
				System.out.println("2.SRM-AP University");
				System.out.println("3.KL University");
				System.out.println("4.Vignan University");
				System.out.println("5.BITS-Pilani");
				System.out.println("6.Amrita University");
				int cost=0,FEE=0,sn,n,st,hn;

				char ch='a',area,firstname,lastname,email;
				int j=in.nextInt();
				int price[]={1000,2000,12000,5000,6000,4000,8000,7000,4500,2500};
				switch(j)
				{
					case 1 :
						System.out.println("U selected VIT-AP University ");
						System.out.println();

						while(ch!='n')
						{
							System.out.println("1.Animation and Design");
							System.out.println("2.Commerce ");
							System.out.println("3.Computer Applications and IT");
							System.out.println("4.Engineering and Architecture");
							System.out.println("5.Hospitality and Tourism");
							System.out.println("6.Management and Business Administration");
							System.out.println("7.Medicine and Allied Sciences");
							System.out.println("8.Languages");
							System.out.println("Enter the serial no of Course you want : ");
							sn=in.nextInt();
							n=sn-1;
							cost=price[n];
							FEE=FEE+cost;

						System.out.println("Enter Your First Name:");
						firstname = in.next().charAt(0);
						System.out.println("Enter Your Last Name:");
						lastname = in.next().charAt(0);
						System.out.println("Enter Your E-mail ID:");
						email = in.next().charAt(0);
						System.out.println("Enter Your Date Of Birth");
						char dob = in.next().charAt(0);
						System.out.println("Enter Your Father Name:");
						char fathername=in.next().charAt(0);
						System.out.println("Enter Your Mother Name:");
						char mothername=in.next().charAt(0);
						System.out.println("Enter Your  Mobile Number:");
						long phone = in.nextLong();
						System.out.println("Please enter your Parent Phone number : ");
                        long ph = in.nextLong();
						System.out.println("Enter Your Address:");
						System.out.println();
						System.out.println("Enter Your City/Town Name");
						char c=in.next().charAt(0);
						System.out.println("Enter Area Name : ");
						area=in.next().charAt(0);
						System.out.println("Enter street number : ");
						st=in.nextInt();
						System.out.println("Enter house number : ");
						hn=in.nextInt();
						System.out.println("Enter pincode : ");
                        int pn = in.nextInt();
						System.out.println("Enter Your Aadhar Number");
						int oj=in.nextInt();
						System.out.println("How You Know About Your University");
						char m=in.next().charAt(0);
						System.out.println("You Have Successfully Registred for This Course");
						System.out.println();
						System.out.println("Your total cost of order is : "+FEE);
						System.out.println();
						System.out.println("Thanks! For Choosing Our University ");
						System.out.println();
						System.out.println("For more details of  your Registration call toll free No 1800 656 6522");

						break;
					}
					case 2 :
						System.out.println("U selected SRM-AP University ");
						System.out.println();

						while(ch!='n')
						{
							System.out.println("1.Animation and Design");
							System.out.println("2.Commerce ");
							System.out.println("3.Computer Applications and IT");
							System.out.println("4.Engineering and Architecture");
							System.out.println("5.Hospitality and Tourism");
							System.out.println("6.Management and Business Administration");
							System.out.println("7.Medicine and Allied Sciences");
							System.out.println("8.Languages");
							System.out.println("Enter the serial no of Course you want : ");
							sn=in.nextInt();
							n=sn-1;
							cost=price[n];
							FEE=FEE+cost;

						System.out.println("Enter Your First Name:");
						firstname = in.next().charAt(0);
						System.out.println("Enter Your Last Name:");
						lastname = in.next().charAt(0);
						System.out.println("Enter Your E-mail ID:");
						email = in.next().charAt(0);
						System.out.println("Enter Your Date Of Birth");
						char dob = in.next().charAt(0);
						System.out.println("Enter Your Father Name:");
						char fathername=in.next().charAt(0);
						System.out.println("Enter Your Mother Name:");
						char mothername=in.next().charAt(0);
						System.out.println("Enter Your  Mobile Number:");
						long phone = in.nextLong();
						System.out.println("Please enter your Parent Phone number : ");
                        long ph = in.nextLong();
						System.out.println("Enter Your Address:");
						System.out.println();
						System.out.println("Enter Your City/Town Name");
						char c=in.next().charAt(0);
						System.out.println("Enter Area Name : ");
						area=in.next().charAt(0);
						System.out.println("Enter street number : ");
						st=in.nextInt();
						System.out.println("Enter house number : ");
						hn=in.nextInt();
						System.out.println("Enter pincode : ");
                        int pn = in.nextInt();
						System.out.println("Enter Your Aadhar Number");
						int oj=in.nextInt();
						System.out.println("How You Know About Your University");
						char m=in.next().charAt(0);
						System.out.println("You Have Successfully Registred for This Course");
						System.out.println();
						System.out.println("Your total cost of order is : "+FEE);
						System.out.println();
						System.out.println("Thanks! For Choosing Our University ");
						System.out.println();
						System.out.println("For more details of your Registration call toll free No 1800 656 6522");

						break;
					}


					case 3 :
						System.out.println("U selected KL University ");
						System.out.println();

						while(ch!='n')
						{
							System.out.println("1.Animation and Design");
							System.out.println("2.Commerce ");
							System.out.println("3.Computer Applications and IT");
							System.out.println("4.Engineering and Architecture");
							System.out.println("5.Hospitality and Tourism");
							System.out.println("6.Management and Business Administration");
							System.out.println("7.Medicine and Allied Sciences");
							System.out.println("8.Languages");
							System.out.println("Enter the serial no of Course you want : ");
							sn=in.nextInt();
							n=sn-1;
							cost=price[n];
							FEE=FEE+cost;

						System.out.println("Enter Your First Name:");
						firstname = in.next().charAt(0);
						System.out.println("Enter Your Last Name:");
						lastname = in.next().charAt(0);
						System.out.println("Enter Your E-mail ID:");
						email = in.next().charAt(0);
						System.out.println("Enter Your Date Of Birth");
						char dob = in.next().charAt(0);
						System.out.println("Enter Your Father Name:");
						char fathername=in.next().charAt(0);
						System.out.println("Enter Your Mother Name:");
						char mothername=in.next().charAt(0);
						System.out.println("Enter Your  Mobile Number:");
						long phone = in.nextLong();
						System.out.println("Please enter your Parent Phone number : ");
                        long ph = in.nextLong();
						System.out.println("Enter Your Address:");
						System.out.println();
						System.out.println("Enter Your City/Town Name");
						char c=in.next().charAt(0);
						System.out.println("Enter Area Name : ");
						area=in.next().charAt(0);
						System.out.println("Enter street number : ");
						st=in.nextInt();
						System.out.println("Enter house number : ");
						hn=in.nextInt();
						System.out.println("Enter pincode : ");
                        int pn = in.nextInt();
						System.out.println("Enter Your Aadhar Number");
						int oj=in.nextInt();
						System.out.println("How You Know About Your University");
						char m=in.next().charAt(0);
						System.out.println("You Have Successfully Registred for This Course");
						System.out.println();
						System.out.println("Your total cost of order is : "+FEE);
						System.out.println();
						System.out.println("Thanks! For Choosing Our University ");
						System.out.println();
						System.out.println("For more details of Your Registration call toll free No 1800 656 6522");

						break;
					}
					case 4 :
						System.out.println("U selected Vignan University ");
						System.out.println();

						while(ch!='n')
						{
							System.out.println("1.Animation and Design");
							System.out.println("2.Commerce ");
							System.out.println("3.Computer Applications and IT");
							System.out.println("4.Engineering and Architecture");
							System.out.println("5.Hospitality and Tourism");
							System.out.println("6.Management and Business Administration");
							System.out.println("7.Medicine and Allied Sciences");
							System.out.println("8.Languages");
							System.out.println("Enter the serial no of Course you want : ");
							sn=in.nextInt();
							n=sn-1;
							cost=price[n];
							FEE=FEE+cost;

						System.out.println("Enter Your First Name:");
						firstname = in.next().charAt(0);
						System.out.println("Enter Your Last Name:");
						lastname = in.next().charAt(0);
						System.out.println("Enter Your E-mail ID:");
						email = in.next().charAt(0);
						System.out.println("Enter Your Date Of Birth");
						char dob = in.next().charAt(0);
						System.out.println("Enter Your Father Name:");
						char fathername=in.next().charAt(0);
						System.out.println("Enter Your Mother Name:");
						char mothername=in.next().charAt(0);
						System.out.println("Enter Your  Mobile Number:");
						long phone = in.nextLong();
						System.out.println("Please enter your Parent Phone number : ");
                        long ph = in.nextLong();
						System.out.println("Enter Your Address:");
						System.out.println();
						System.out.println("Enter Your City/Town Name");
						char c=in.next().charAt(0);
						System.out.println("Enter Area Name : ");
						area=in.next().charAt(0);
						System.out.println("Enter street number : ");
						st=in.nextInt();
						System.out.println("Enter house number : ");
						hn=in.nextInt();
						System.out.println("Enter pincode : ");
                        int pn = in.nextInt();
						System.out.println("Enter Your Aadhar Number");
						int oj=in.nextInt();
						System.out.println("How You Know About Your University");
						char m=in.next().charAt(0);
						System.out.println("You Have Successfully Registred for This Course");
						System.out.println();
						System.out.println("Your total cost of order is : "+FEE);
						System.out.println();
						System.out.println("Thanks! For Choosing Our University ");
						System.out.println();
						System.out.println("For more details of  your Registration call toll free No 1800 656 6522");

						break;
					}

					case 5 :
						System.out.println("U selected BITS-Pilani ");
						System.out.println();

						while(ch!='n')
						{
							System.out.println("1.Animation and Design");
							System.out.println("2.Commerce ");
							System.out.println("3.Computer Applications and IT");
							System.out.println("4.Engineering and Architecture");
							System.out.println("5.Hospitality and Tourism");
							System.out.println("6.Management and Business Administration");
							System.out.println("7.Medicine and Allied Sciences");
							System.out.println("8.Languages");
							System.out.println("Enter the serial no of Course you want : ");
							sn=in.nextInt();
							n=sn-1;
							cost=price[n];
							FEE=FEE+cost;

						System.out.println("Enter Your First Name:");
						firstname = in.next().charAt(0);
						System.out.println("Enter Your Last Name:");
						lastname = in.next().charAt(0);
						System.out.println("Enter Your E-mail ID:");
						email = in.next().charAt(0);
						System.out.println("Enter Your Date Of Birth");
						char dob = in.next().charAt(0);
						System.out.println("Enter Your Father Name:");
						char fathername=in.next().charAt(0);
						System.out.println("Enter Your Mother Name:");
						char mothername=in.next().charAt(0);
						System.out.println("Enter Your  Mobile Number:");
						long phone = in.nextLong();
						System.out.println("Please enter your Parent Phone number : ");
                        long ph = in.nextLong();
						System.out.println("Enter Your Address:");
						System.out.println();
						System.out.println("Enter Your City/Town Name");
						char c=in.next().charAt(0);
						System.out.println("Enter Area Name : ");
						area=in.next().charAt(0);
						System.out.println("Enter street number : ");
						st=in.nextInt();
						System.out.println("Enter house number : ");
						hn=in.nextInt();
						System.out.println("Enter pincode : ");
                        int pn = in.nextInt();
						System.out.println("Enter Your Aadhar Number");
						int oj=in.nextInt();
						System.out.println("How You Know About Your University");
						char m=in.next().charAt(0);
						System.out.println("You Have Successfully Registred for This Course");
						System.out.println();
						System.out.println("Your total cost of order is : "+FEE);
						System.out.println();
						System.out.println("Thanks! For Choosing Our University ");
						System.out.println();
						System.out.println("For more details of your Registration call toll free No 1800 656 6522");

						break;
					}

					case 6 :
						System.out.println("U selected  Amrita University");
						System.out.println();

						while(ch!='n')
						{
							System.out.println("1.Animation and Design");
							System.out.println("2.Commerce ");
							System.out.println("3.Computer Applications and IT");
							System.out.println("4.Engineering and Architecture");
							System.out.println("5.Hospitality and Tourism");
							System.out.println("6.Management and Business Administration");
							System.out.println("7.Medicine and Allied Sciences");
							System.out.println("8.Languages");
							System.out.println("Enter the serial no of Course you want : ");
							sn=in.nextInt();
							n=sn-1;
							cost=price[n];
							FEE=FEE+cost;

						System.out.println("Enter Your First Name:");
						firstname = in.next().charAt(0);
						System.out.println("Enter Your Last Name:");
						lastname = in.next().charAt(0);
						System.out.println("Enter Your E-mail ID:");
						email = in.next().charAt(0);
						System.out.println("Enter Your Date Of Birth");
						char dob = in.next().charAt(0);
						System.out.println("Enter Your Father Name:");
						char fathername=in.next().charAt(0);
						System.out.println("Enter Your Mother Name:");
						char mothername=in.next().charAt(0);
						System.out.println("Enter Your  Mobile Number:");
						long phone = in.nextLong();
						System.out.println("Please enter your Parent Phone number : ");
                        long ph = in.nextLong();
						System.out.println("Enter Your Address:");
						System.out.println();
						System.out.println("Enter Your City/Town Name");
						char c=in.next().charAt(0);
						System.out.println("Enter Area Name : ");
						area=in.next().charAt(0);
						System.out.println("Enter street number : ");
						st=in.nextInt();
						System.out.println("Enter house number : ");
						hn=in.nextInt();
						System.out.println("Enter pincode : ");
                        int pn = in.nextInt();
						System.out.println("Enter Your Aadhar Number");
						int oj=in.nextInt();
						System.out.println("How You Know About Your University");
						char m=in.next().charAt(0);
						System.out.println("You Have Successfully Registred for This Course");
						System.out.println();
						System.out.println("Your total cost of order is : "+FEE);
						System.out.println();
						System.out.println("Thanks! For Choosing Our University ");
						System.out.println();
						System.out.println("For more details of Your Registration call toll free No 1800 656 6522");

						break;
					}



				}
				break;
			case 2 :
				System.out.println("Previous Registrations");
				System.out.println();
				System.out.print(" NO REGISTRATIONS FOUND ");
				System.out.println("Please Register  Now");
				break;
			default:
				System.out.println("invalid please select option 1 / 2  ");
			}
	}
}
