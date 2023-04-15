package lib;

public class Salary {
    private MonthlySalary monthlySalary;
    private OtherMonthlyIncome otherMonthlyIncome;
    private AnnualDeductible annualDeductible;

    public Salary(int monthlySalary, int otherMonthlyIncome, int annualDeductible) {
        this.monthlySalary = new MonthlySalary(monthlySalary);
        this.otherMonthlyIncome = new OtherMonthlyIncome(otherMonthlyIncome);
        this.annualDeductible = new AnnualDeductible(annualDeductible);
    }

    public int getMonthlySalary() {
        return monthlySalary.getAmount();
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = new MonthlySalary(monthlySalary);
    }

    public int getOtherMonthlyIncome() {
        return otherMonthlyIncome.getAmount();
    }

    public void setOtherMonthlyIncome(int otherMonthlyIncome) {
        this.otherMonthlyIncome = new OtherMonthlyIncome(otherMonthlyIncome);
    }

    public int getAnnualDeductible() {
        return annualDeductible.getAmount();
    }

    public void setAnnualDeductible(int annualDeductible) {
        this.annualDeductible = new AnnualDeductible(annualDeductible);
    }

    public int getAnnualIncomeTax() {
        int annualIncome = monthlySalary.getAmount() * 12 + otherMonthlyIncome.getAmount() - annualDeductible.getAmount();
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
