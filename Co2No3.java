import java.util.Scanner;
class Employee
{
	 int eno;
	 String ename;
	 float esalary;
	 Employee(int no,String n,float s)
	 {
		this.eno=no;
		this.ename=n;
		this.esalary=s; 
	 }
	 void eprint()
	 {
	  System.out.println("ENO:"+this.eno+"NAME:"+this.ename+"SALARY:"+this.esalary);
	 } 
}	 
class Co2No3
{
	 public static void main(String args[])
	 {
	 	Scanner s=new Scanner(System.in);
	 	int n=s.nextInt();
	 	Employee e[]=new Employee[n];
	 	int i;
	 	for(i=0;i<n;i++)
	 	 {	
	 	 	System.out.println("ENTER ENO,NAME,SALARY:");
	 	  	int no=s.nextInt();
	 	  	String na=s.next();
	 	  	float sa=s.nextFloat();
	 	  	e[i]=new Employee(no,na,sa); 
	 	 }
		 System.out.println("ENTER ENO to search");
		 int se=s.nextInt();
		 for(i=0;i<n;i++)
		  {
			   if(e[i].eno==se)
			   {
				e[i].eprint();	   
			   }
			   else
			   {
			   	System.out.println("NOT FOUND");
			   }	
		  }
	 }   
}	  
	 
