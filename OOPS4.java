package oops;

class Employee {
	public int empID;
	public String empName;
	public String empOrg;
	public String designation;
	public double experience;
	public double salary;
	private double weeklySalary;
	public int noOfHrs;
	
	Employee(
			int empID, 
			String empName, 
			String empOrg, 
			String designation, 
			double experience,
			int noOfHrs
	){
		this.empID = empID;
		this.empName = empName;
		this.empOrg = empOrg;
		this.designation = designation;
		this.experience = experience;
		this.noOfHrs = noOfHrs;
		this.weeklyGrossSalaryCalculation();
	}
	
	public Employee(String name, int age, String phoneNumber, String address, double salary2) {
		// TODO Auto-generated constructor stub
	}

	double getWeeklySalary() {
		return this.weeklySalary;
	}
	
	void setWeeklySalary(double salary) {
		this.weeklySalary = salary;
	}
	
	void weeklyGrossSalaryCalculation() {
			this.weeklySalary = noOfHrs * 120 * 7;
	}
	
	double getMonthlySalary() {
		return this.weeklySalary * 4.5;
	}
}

public class OOPS4 {
	static int getHighPaidEmployee(Employee[] list) {
		int count = 0;
		for(int i = 0; i < list.length; i++) {
			if((int)list[i].getMonthlySalary() > 20000) {
				count++;
			}
		}
		return count;
	}
	public static void main(String args[]) {
		Employee[] employeeList = new Employee[3];
		Employee e1 = new Employee(1,"R", "Atos", "Fresher",0,9);
		Employee e2 = new Employee(2,"R", "Atos", "Fresher",0,12);
		Employee e3 = new Employee(3,"R", "Atos", "Fresher",0,12);
		employeeList[0] = e1;
		employeeList[1] = e1;
		employeeList[2] = e1;
		System.out.println(getHighPaidEmployee(employeeList));
	}
}
