class Empwage {
   public static void main(String[] args){
   System.out.println("Employee Wage Computation Problem");
		int present = 1;
		int absent = 0;
		int wagePerHour=20;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		int empHrs=0;
		int salaryPerDay=0;
        if (empCheck == present) {
        	System.out.println("Employee is Present");
			empHrs=8;
        	salaryPerDay = (empHrs*wagePerHour);
        	System.out.println(salaryPerDay);
			}
        else {
        	System.out.println("Employee is Absent");
			empHrs=0;
         salaryPerDay = (empHrs*wagePerHour);
         System.out.println(salaryPerDay);
			}

		}
}
