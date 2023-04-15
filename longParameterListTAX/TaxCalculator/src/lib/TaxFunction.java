package lib;

public class TaxFunction {

    private static final int MAX_CHILDREN = 3;
    private static final int BASE_DEDUCTIBLE = 54000000;
    private static final int MARRIED_DEDUCTIBLE = 4500000;

    public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
        validateInput(numberOfMonthWorking, numberOfChildren);
        int taxableIncome = calculateTaxableIncome(monthlySalary, otherMonthlyIncome, numberOfMonthWorking, deductible, isMarried, numberOfChildren);
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

    private static int calculateTaxableIncome(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
        int totalIncome = (monthlySalary + otherMonthlyIncome) * numberOfMonthWorking;
        int totalDeductible = deductible + calculateNonTaxableIncome(monthlySalary, otherMonthlyIncome, numberOfMonthWorking, isMarried, numberOfChildren);
        return totalIncome - totalDeductible;
    }

    private static int calculateNonTaxableIncome(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, boolean isMarried, int numberOfChildren) {
        int nonTaxableIncome = BASE_DEDUCTIBLE;
        if (isMarried) {
            nonTaxableIncome += MARRIED_DEDUCTIBLE;
        }
        if (numberOfChildren > 0) {
            nonTaxableIncome += numberOfChildren * MARRIED_DEDUCTIBLE;
        }
        return nonTaxableIncome;
    }

    private static int calculateTaxAmount(int taxableIncome, boolean isMarried, int numberOfChildren) {
        double taxRate = 0.05;
        int nonTaxableIncome = calculateNonTaxableIncome(0, 0, 0, isMarried, numberOfChildren);
        int taxableAmount = taxableIncome - nonTaxableIncome;
        return (int) Math.round(taxableAmount * taxRate);
    }
}
