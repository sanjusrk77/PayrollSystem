import java.util.*;


public class EmployeeDetails {
		int Emp_Number;
	    String Emp_Name;
	    String Emp_Status;
	    int Emp_Salary;
	    int Emp_ads;
	    String Street;
        public static void main(String[] args){
			
			
        	new EmployeeDetails().GetEmployeeDetails();
			      
		}
        public void GetEmployeeDetails()
		{
			
		
	        Scanner Empscanner=new Scanner(System.in);
	        System.out.println("Employee number:");
	        Emp_Number=Empscanner.nextInt();
	        System.out.println("Employee name:");
	        Emp_Name=Empscanner.next();
	        System.out.println("Status of employee(P/T or F/T)?:");
	        Emp_Status=Empscanner.next();
	        System.out.println("salary of employee:");
	        Emp_Salary=Empscanner.nextInt();
	        Empscanner.close();
	        
	        System.out.println("Employee Number:" + Emp_Number);
	        System.out.println("Employee Name:" + Emp_Name);
	        System.out.println("Employe status:" + Emp_Status);
	        System.out.println("Employee Salary:" + Emp_Salary);
		}
	       
	        
	    
}
