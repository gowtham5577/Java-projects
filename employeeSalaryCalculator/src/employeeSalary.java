import java.util.Scanner;

public class employeeSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter employee hourlyWage:");
        double hourlyWage=sc.nextDouble();
        System.out.println("enter employee hoursWorked:");
        double hoursWorked=sc.nextDouble();
        double weeklySalary=0;
        if(hoursWorked>40){
          weeklySalary=  calculateweekly(hourlyWage,hoursWorked,1.5);
        }
        else{
            weeklySalary=calculateweekly(hourlyWage,hoursWorked);
        }
        double annual=caluclateAnual(weeklySalary);

        System.out.printf("weekly salary:%2f\n",weeklySalary);

        System.out.printf("annual salary:%2f\n",annual);

    }

    public static double calculateweekly(double hourlyWage,double hoursWorked){
        return hourlyWage*hoursWorked;

    }
    public static  double calculateweekly(double hourlyWage,double hoursWorked,double overtimeRate){
        double regularHours = Math.min(hoursWorked, 40);
        double overtimeHours = Math.max(hoursWorked - 40, 0);
        return (regularHours * hourlyWage) + (overtimeHours * hourlyWage * overtimeRate);
    }
    public static double caluclateAnual(double weeklySalary){
        return weeklySalary*52;
    }
}
