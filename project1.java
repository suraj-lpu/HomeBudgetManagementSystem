/*
I HAVE USED HERE:- 
   ABSTRACT CLASS
   INHERITANCE
   NESTED CLASS
*/



import java.util.Scanner;
import java.lang.*;
abstract class Myclass{
    abstract void initial();
    abstract void budgetExpected();
}
class Myclass2 extends Myclass{
	static double number,salary,priorsavings,other,totaltouse,savings;
	int entry;
	String name;
	double rent,fees,insurance,loan,groceries,bills,travel;
	double rent1,fees1,insurance1,loan1,groceries1,bills1,travel1;
	void initial(){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your name:");
        name=obj.nextLine();
        System.out.println("Enter amount of salary you get from your company after tax deduction:");
        salary=obj.nextDouble();
        System.out.println("Enter amount of savings you are already having:");
        priorsavings=obj.nextDouble();
        System.out.println("Enter amount of money you earn from other source:");
        other=obj.nextDouble();
        System.out.println("Enter amount of moeny you want to save this time:");
        savings=obj.nextDouble();
        System.out.println("Enter 1 if you want to use your prior savings:");
        System.out.println("Enter any number rather than 1 if you dont want to use your prior savings");
        entry=obj.nextInt();
        if(entry==1)
        {
        	salary=salary-savings;
        	totaltouse=salary+other+priorsavings;
        }
        else
        {
        	salary=salary-savings;
        	totaltouse=salary+other;
        }
        System.out.println("Total amount of money which u can use is:"+totaltouse);
	}
	void budgetExpected(){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter amount of money you wish to spend on room rent");
		rent=obj.nextDouble();
		System.out.println("Enter amount of money you wish to spend on your child fees if u have ANY");
		fees=obj.nextDouble();
		System.out.println("Enter amount of money u want to spend on your groceries");
		groceries=obj.nextDouble();
		System.out.println("Enter amount of money u have to spend on insurance if u have any:");
		insurance=obj.nextDouble();
		System.out.println("Enter amount of money u have to spend on loan taken if u have taken any loan");
		loan=obj.nextDouble();
		System.out.println("Enter amount of money u wish to spend on the bills.");
		System.out.println("These bills include electricity bills,phone recharge and others...");
		bills=obj.nextDouble();
		System.out.println("Enter amount of money u wish to spend on fuel and travel and other small needs:");
		travel=obj.nextDouble();
	}
	void budgetobtained(){
       		System.out.println("Budget comparison after one month.....");
       		System.out.println("Please enter the amount which u have spent during one month...");
	     	
	        Scanner obj=new Scanner(System.in);
		    System.out.println("Enter amount of money you have spent on room rent");
		    rent1=obj.nextDouble();
		    System.out.println("Enter amount of money you have spent on your child fees if u have ANY");
		    fees1=obj.nextDouble();
		    System.out.println("Enter amount of money you have spent on your groceries");
		    groceries1=obj.nextDouble();
		    System.out.println("Enter amount of money you have spent on insurance if u have any:");
		    insurance1=obj.nextDouble();
	 	    System.out.println("Enter amount of money you have spent on loan taken if u have taken any loan");
		    loan1=obj.nextDouble();
		    System.out.println("Enter amount of money you have spent on the bills.");
		    System.out.println("These bills include electricity bills,phone recharge and others...");
		    bills1=obj.nextDouble();
		    System.out.println("Enter amount of money you have spent on fuel and travel and other small needs:");
		    travel1=obj.nextDouble();
       	}
}
class Myclass5 extends Myclass3{
	static int flag1;
	class inner{

	    void option(){
		
		    System.out.println("WELCOME");
	        Scanner obj=new Scanner(System.in);
	        System.out.println("We are having 2 OPTIONS for YOU");
	        System.out.println("Kindly Enter 1 if you just want to make ASSUMED BUDGET");
            System.out.println("Kindly Enter 2 if YOU want to make ASSUMED as well as ACTUAL BUDGET");
            flag1=obj.nextInt();
        }
	}
}


class Myclass3 extends Myclass2{
	static double a,b;
	static int flag=0;
	
	void display(){
		Scanner obj2=new Scanner(System.in);
		System.out.println("your name is:"+name);
		
        a=rent+fees+groceries+insurance+loan+bills+travel;
        b=rent1+fees1+groceries1+insurance1+loan1+bills1+travel1;
        
        if(a<= totaltouse)
        {   b=totaltouse-a;
        	System.out.println("Total money u planned for budget is"+a);
        	System.out.println("Money still left"+b);
        }
        else
        {
        	b=a-totaltouse;
        	System.out.println("U have surpassed your total money");
        	System.out.println("yours additional calculated amount of money is"+b);
        	flag=1;
        }
	}

	void result(){
		System.out.println("So here is your ASSUMED BUDGET........");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t"+"ASSUMED BUDGET");
		System.out.println("");
		System.out.println("");
		System.out.println("SECTOR"+"\t\t\t"+"AMOUNT");
	    //double rent,fees,insurance,loan,groceries,bills,travel;
	    System.out.println("RENT"+"\t\t\t"+rent);
	    System.out.println("FEES"+"\t\t\t"+fees);
	    System.out.println("INSURANCE"+"\t\t"+insurance);
	    System.out.println("LOAN"+"\t\t\t"+loan);
	    System.out.println("GROCERIES"+"\t\t"+groceries);
	    System.out.println("BILLS"+"\t\t\t"+bills);
	    System.out.println("TRAVEL"+"\t\t\t"+travel);
        System.out.println("");
	    System.out.println("TOTAL"+"\t\t\t"+a);
	}

	void result2()
	{
		System.out.println("So here is your  BUDGET........");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t"+"ASSUMED V/S ACTUAL BUDGET");
		System.out.println("");
		System.out.println("");
		System.out.println("SECTOR"+"\t\t\t"+"ASSUMED"+"\t\t\t"+"ACTUAL"+"\t\t\t"+"DIFFERENCE");
	    //double rent,fees,insurance,loan,groceries,bills,travel;
	    System.out.println("RENT"+"\t\t\t"+rent+"\t\t\t"+rent1+"\t\t\t"+(rent1-rent));
	    System.out.println("FEES"+"\t\t\t"+fees+"\t\t\t"+fees1+"\t\t\t"+(fees1-fees));
	    System.out.println("INSURANCE"+"\t\t"+insurance+"\t\t\t"+insurance1+"\t\t\t"+(insurance1-insurance));
	    System.out.println("LOAN"+"\t\t\t"+loan+"\t\t\t"+loan1+"\t\t\t"+(loan1-loan));
	    System.out.println("GROCERIES"+"\t\t"+groceries+"\t\t\t"+groceries1+"\t\t\t"+(groceries1-groceries));
	    System.out.println("BILLS"+"\t\t\t"+bills+"\t\t\t"+bills1+"\t\t\t"+(bills1-bills));
	    System.out.println("TRAVEL"+"\t\t\t"+travel+"\t\t\t"+travel1+"\t\t\t"+(travel1-travel));
	    System.out.println("");
	    System.out.println("TOTAL ASSUMED"+"\t\t"+a);
	    System.out.println("ACTUAL TOTAL"+"\t\t"+b);
	    System.out.println("DIFFERENCE"+"\t\t"+(a-b));
	}
    

	
}

class Final extends Myclass5{
	public static void main(String[] args) {
	Final obj1=new Final();
	obj1.initial();
    obj1.budgetExpected();
    obj1.display();
    if(flag==1){
    	System.out.println("You have exceeded the amount of money which u can use");
    	System.out.println("You decide to use salary amount:"+totaltouse);
    	System.out.println("But you made budget of amount:"+a);
    	System.exit(0);
    }
    Myclass5 obj3=new Myclass5();
    Myclass5.inner obj4=obj3.new inner();
    obj4.option();
    {

        if(flag1==1){
    	    obj1.result();
        }
        else if(flag1==2){
    	    obj1.budgetobtained();
    	    obj1.result2();
    }
    }
    }
}