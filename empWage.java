public class empWage {
   public static void main(String[] args) {
      saveTotalWage google = new saveTotalWage("Google" , 100 , 20 , 100);
      saveTotalWage microsoft = new saveTotalWage("MicroSoft" , 100 , 20 , 100);
      System.out.println(google.calculateTotalEmpWage());
      System.out.println(microsoft.calculateTotalEmpWage());
}
}

class saveTotalWage{
	final int fullTime = 1;
   final int partTime=0;
	final String companyName;
	final int empRatePerHour;
	final int workingDays;
	final int maxHoursPerMonth;
	int totalEmpWge;

	public saveTotalWage(String companyName,int empRatePerHour,int workingDays,int maxHoursPerMonth) {
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
		totalEmpWge=totalHours * empRatePerHour;
		return totalEmpWge;
		}
           public String toString(){
		return "Total Empwage for company " +companyName+":"+totalEmpWge;
	}
}

