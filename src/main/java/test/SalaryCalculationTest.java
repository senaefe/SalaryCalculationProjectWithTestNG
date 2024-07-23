package test;
import com.rd.SalaryCalculation.SalaryCalculation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SalaryCalculationTest {

    @Test
    public void testSalaryCalculation() {
        SalaryCalculation salaryCalculation = new SalaryCalculation();
        salaryCalculation.personnel = "Sena Efe";
        salaryCalculation.extraPremium = 1000;
        salaryCalculation.dailySalary = 525.60;

        int workedDay = 20;
        salaryCalculation.calculateSalary(workedDay);
        double expectedSalary = salaryCalculation.dailySalary * workedDay;
        Assert.assertEquals(salaryCalculation.totalSalary, expectedSalary, "Salary calculation is incorrect.");
    }

    @Test
    public void testExtraPremiumCalculation() {
        SalaryCalculation salaryCalculation = new SalaryCalculation();
        salaryCalculation.personnel = "Sena Efe";
        salaryCalculation.extraPremium = 1000;
        salaryCalculation.dailySalary = 525.60;

        int workedDay = 30;
        salaryCalculation.calculateSalary(workedDay);
        double expectedSalary = (25 * salaryCalculation.dailySalary) + (5 * salaryCalculation.dailySalary) + (5 * salaryCalculation.extraPremium);
        Assert.assertEquals(salaryCalculation.totalSalary, expectedSalary, "Bonus calculation is incorrect.");
    }
}