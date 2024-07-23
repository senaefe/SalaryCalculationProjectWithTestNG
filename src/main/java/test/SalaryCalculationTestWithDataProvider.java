package test;

import com.rd.SalaryCalculation.SalaryCalculationWithDataProvider;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalaryCalculationTestWithDataProvider {

    @DataProvider(name = "salaryData")
    public Object[][] salaryData() {
        return new Object[][] {
                { 20, 20 * 525.60 }, // Worked 20 days, salary = 20 * 525.60 TL
                { 25, 25 * 525.60 }, // Worked 25 days, salary = 25 * 525.60 TL
                { 30, (30 * 525.60) + (5 * 1000) }  // Worked 30 days, salary = 30 * 525.60 + 5 * 1000 TL
        };
    }

    @Test(dataProvider = "salaryData")
    public void testSalaryCalculationWithDataProvider(int workedDay, double expectedSalary) {
        SalaryCalculationWithDataProvider salaryCalculation = new SalaryCalculationWithDataProvider();
        salaryCalculation.personnel = "Sena Efe";
        salaryCalculation.extraPremium = 1000;
        salaryCalculation.dailySalary = 525.60;
        salaryCalculation.calculateSalary(workedDay);
        Assert.assertEquals(salaryCalculation.totalSalary, expectedSalary, "Salary calculation is incorrect.");
    }
}
