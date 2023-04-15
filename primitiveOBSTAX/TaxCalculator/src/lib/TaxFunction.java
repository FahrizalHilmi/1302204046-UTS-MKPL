package lib;

public class TaxFunction {

    private static final int MAX_CHILDREN = 3;
    private static final int BASE_DEDUCTIBLE = 54000000;
    private static final int MARRIED_DEDUCTIBLE = 4500000;

    public static int calculateTax(MonthlyIncome monthlyIncome, int numberOfMonthWorking, Deductible deductible, boolean isMarried, int numberOfChildren) {
        validateInput(numberOfMonthWorking, numberOfChildren);
        int taxableIncome = calculateTaxableIncome(monthlyIncome, numberOfMonthWorking, deductible, isMarried, numberOfChildren);
        int tax = calculateTaxAmount(taxableIncome, isMarried, numberOfChildren);
        return tax >= 0 ? tax : 0;
    }

    private static void validateInput(int numberOfMonthWorking, int numberOfChildren) {
        if (numberOfMonthWorking > 12) {
            throw new IllegalArgumentException("More than 12 month working per year");
        }
        if (numberOfChildren > MAX_CHILDREN) {
            numberOfChildren = MAX_CHILDREN;
        }
    }

    private static int calculateTaxableIncome(MonthlyIncome monthlyIncome, int numberOfMonthWorking, Deductible deductible, boolean isMarried, int numberOfChildren) {
        int totalIncome = monthlyIncome.getTotalIncome(numberOfMonthWorking);
        int totalDeductible = deductible.getTotalDeductible(isMarried, numberOfChildren);
        return totalIncome - totalDeductible;
    }

    private static int calculateTaxAmount(int taxableIncome, boolean isMarried, int numberOfChildren) {
        double taxRate = 0.05;
        int nonTaxableIncome = Deductible.getNonTaxableIncome(isMarried, numberOfChildren);
        int taxableAmount = taxableIncome - nonTaxableIncome;
        return (int) Math.round(taxableAmount * taxRate);
    }

    public static class MonthlyIncome {
        private final int monthlySalary;
        private final int otherMonthlyIncome;

        public MonthlyIncome(int monthlySalary, int otherMonthlyIncome) {
            this.monthlySalary = monthlySalary;
            this.otherMonthlyIncome = otherMonthlyIncome;
        }

        public int getTotalIncome(int numberOfMonthWorking) {
            return (monthlySalary + otherMonthlyIncome) * numberOfMonthWorking;
        }
    }

    public static class Deductible {
        private final int deductible;

        public Deductible(int deductible) {
            this.deductible = deductible;
        }

        public int getTotalDeductible(boolean isMarried, int numberOfChildren) {
            int totalDeductible = deductible + getNonTaxableIncome(isMarried, numberOfChildren);
            return totalDeductible;
        }

        public static int getNonTaxableIncome(boolean isMarried, int numberOfChildren) {
            int nonTaxableIncome = BASE_DEDUCTIBLE;
            if (isMarried) {
                nonTaxableIncome += MARRIED_DEDUCTIBLE;
            }
            if (numberOfChildren > 0) {
                nonTaxableIncome += numberOfChildren * MARRIED_DEDUCTIBLE;
            }
            return nonTaxableIncome;
        }
    }
}
