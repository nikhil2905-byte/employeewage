public class empWage {
   public static void main(String[] args) {
      empWageFormMultipleCompanies google = new empWageFormMultipleCompanies("Google" , 100 , 20 , 100);
      empWageFormMultipleCompanies microsoft = new empWageFormMultipleCompanies("MicroSoft" , 100 , 20 , 100);
      System.out.println("Total Empwage for " + google.companyName + ":" + google.calculateTotalEmpWage());
      System.out.println("Total Empwage for " + microsoft.companyName + ":" + microsoft.calculateTotalEmpWage());
   }
}

class empWageFormMultipleCompanies {
	final int fullTime = 1;
   final int partTime=0;
	final String companyName;
	final int empRatePerHour;
	final int workingDays;
	final int maxHoursPerMonth;

	public empWageFormMultipleCompanies(String companyName,int empRatePerHour,int workingDays,int maxHoursPerMonth) {
		this.companyName=companyName;
		this.empRatePerHour=empRatePerHour;
		this.workingDays=workingDays;
		this.maxHoursPerMonth=maxHoursPerMonth;
		}
	public int calculateTotalEmpWage() {
		int empHrs=0;
		int totalDays=0;
		int totalHours=0;
			while(totalDays<workingDays && totalHours<maxHoursPerMonth) {
			totalDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck)
			{
        case fullTime:
          	System.out.println("Full time Employee");
          	empHrs=8;
        break;
        case partTime:
          	System.out.println("Part time Employee");
          	empHrs=4;
        break;
        default:
          System.out.println("Employee is absent");
          empHrs=0;
         }
         	totalHours += empHrs;
			System.out.println("Day :" +totalDays+ " " +"Emphours:" +empHrs);
		}
		return totalHours * empRatePerHour;
		}
}

