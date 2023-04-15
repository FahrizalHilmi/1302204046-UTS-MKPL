package lib;

public class Salary {
    private MonthlySalary monthlySalary;
    private OtherMonthlyIncome otherMonthlyIncome;
    private AnnualDeductible annualDeductible;

    public Salary(int monthlySalaryAmount, int otherMonthlyIncomeAmount, int annualDeductibleAmount) {
        this.monthlySalary = new MonthlySalary(monthlySalaryAmount);
        this.otherMonthlyIncome = new OtherMonthlyIncome(otherMonthlyIncomeAmount);
        this.annualDeductible = new AnnualDeductible(annualDeductibleAmount);
    }

    public int getMonthlySalary() {
        return monthlySalary.getAmount();
    }

    public void setMonthlySalary(int monthlySalaryAmount) {
        this.monthlySalary = new MonthlySalary(monthlySalaryAmount);
    }

    public int getOtherMonthlyIncome() {
        return otherMonthlyIncome.getAmount();
    }

    public void setOtherMonthlyIncome(int otherMonthlyIncomeAmount) {
        this.otherMonthlyIncome = new OtherMonthlyIncome(otherMonthlyIncomeAmount);
    }

    public int getAnnualDeductible() {
        return annualDeductible.getAmount();
    }

    public void setAnnualDeductible(int annualDeductibleAmount) {
        this.annualDeductible = new AnnualDeductible(annualDeductibleAmount);
    }

    public int getAnnualIncomeTax(int monthlySalaryAmount, int otherMonthlyIncomeAmount, int annualDeductibleAmount) {
        int annualIncome = monthlySalaryAmount * 12 + otherMonthlyIncomeAmount - annualDeductibleAmount;
        // implement your tax calculation function here
        return 0;
    }

    private static class MonthlySalary {
        private int amount;

        public MonthlySalary(int amount) {
            this.amount = amount;
        }

        public int getAmount() {
            return amount;
        }
    }

    private static class OtherMonthlyIncome {
        private int amount;

        public OtherMonthlyIncome(int amount) {
            this.amount = amount;
        }

        public int getAmount() {
            return amount;
        }
    }

    private static class AnnualDeductible {
        private int amount;

        public AnnualDeductible(int amount) {
            this.amount = amount;
        }

        public int getAmount() {
            return amount;
        }
    }
}
