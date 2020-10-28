class Empwage {
   public static void main(String[] args){
   System.out.println("Employee Wage Computation Problem");
		int fullTime = 1;
		int partTime=2;
		int wagePerHour=20;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		int empHrs=0;
		int salaryPerDay=0;
        if (empCheck == fullTime) {
        	System.out.println("Full time Employee");
			empHrs=8;
			}
        else if (empCheck == partTime){
        	System.out.println("Part time Employee");
			empHrs=4;
			}
			else  {
			System.out.println("Employee is Absent");
         empHrs=0;
			}
			salaryPerDay = (empHrs*wagePerHour);
         System.out.println(salaryPerDay);

		}
}
