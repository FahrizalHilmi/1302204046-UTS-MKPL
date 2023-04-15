package lib;
public class Employee {
    private String employeeId;
    private int monthlySalary;
    private boolean isForeigner;
    private int annualDeductible;
    private int otherMonthlyIncome;

    public Employee(String employeeId, int monthlySalary, boolean isForeigner, int annualDeductible, int otherMonthlyIncome) {
        this.employeeId = employeeId;
        this.monthlySalary = monthlySalary;
        this.isForeigner = isForeigner;
        this.annualDeductible = annualDeductible;
        this.otherMonthlyIncome = otherMonthlyIncome;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public boolean isForeigner() {
        return isForeigner;
    }

    public void setForeigner(boolean foreigner) {
        isForeigner = foreigner;
    }

    public int getAnnualDeductible() {
        return annualDeductible;
    }

    public void setAnnualDeductible(int annualDeductible) {
        this.annualDeductible = annualDeductible;
    }

    public int getOtherMonthlyIncome() {
        return otherMonthlyIncome;
    }

    public void setOtherMonthlyIncome(int otherMonthlyIncome) {
        this.otherMonthlyIncome = otherMonthlyIncome;
    }

    public int getAnnualIncomeTax() {
        // implement your tax calculation function here
        return 0;
    }
}
