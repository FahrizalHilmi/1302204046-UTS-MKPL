package lib;

public class Employee {
    private EmployeeId employeeId;
    private MonthlySalary monthlySalary;
    private IsForeigner isForeigner;
    private AnnualDeductible annualDeductible;
    private OtherMonthlyIncome otherMonthlyIncome;

    public Employee(String employeeId, int monthlySalary, boolean isForeigner, int annualDeductible, int otherMonthlyIncome) {
        this.employeeId = new EmployeeId(employeeId);
        this.monthlySalary = new MonthlySalary(monthlySalary);
        this.isForeigner = new IsForeigner(isForeigner);
        this.annualDeductible = new AnnualDeductible(annualDeductible);
        this.otherMonthlyIncome = new OtherMonthlyIncome(otherMonthlyIncome);
    }

    public String getEmployeeId() {
        return employeeId.getValue();
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = new EmployeeId(employeeId);
    }

    public int getMonthlySalary() {
        return monthlySalary.getValue();
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = new MonthlySalary(monthlySalary);
    }

    public boolean isForeigner() {
        return isForeigner.getValue();
    }

    public void setForeigner(boolean foreigner) {
        this.isForeigner = new IsForeigner(foreigner);
    }

    public int getAnnualDeductible() {
        return annualDeductible.getValue();
    }

    public void setAnnualDeductible(int annualDeductible) {
        this.annualDeductible = new AnnualDeductible(annualDeductible);
    }

    public int getOtherMonthlyIncome() {
        return otherMonthlyIncome.getValue();
    }

    public void setOtherMonthlyIncome(int otherMonthlyIncome) {
        this.otherMonthlyIncome = new OtherMonthlyIncome(otherMonthlyIncome);
    }

    public int getAnnualIncomeTax() {
        // implement your tax calculation function here
        return 0;
    }
}

class EmployeeId {
    private String value;

    public EmployeeId(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

class MonthlySalary {
    private int value;

    public MonthlySalary(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class IsForeigner {
    private boolean value;

    public IsForeigner(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }
}

class AnnualDeductible {
    private int value;

    public AnnualDeductible(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class OtherMonthlyIncome {
    private int value;

    public OtherMonthlyIncome(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
