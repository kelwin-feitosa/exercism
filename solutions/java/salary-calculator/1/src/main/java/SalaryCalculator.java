public class SalaryCalculator {
    private static final double BASE_SALARY = 1000;
    private static final double MAX_SALARY = 2000;
    public double salaryMultiplier(int daysSkipped) {
        double penalty = daysSkipped >= 5 ? 0.85 : 1.0;

        return penalty;
    }

    public int bonusMultiplier(int productsSold) {
        if (productsSold == 0) return 0;
        int bonus = productsSold >= 20 ? 13 : 10;

        return bonus;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = BASE_SALARY * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);

        return salary > MAX_SALARY ? MAX_SALARY : salary;
    } 
}
