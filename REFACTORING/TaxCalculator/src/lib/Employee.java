package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {

    private String employeeId;
    private PersonalInformation personalInfo;
    private JoinDate joinDate;
    private EmploymentDetails employmentDetails;
    private Salary salary;
    private Family family;
    private List<String> childNames;
    private List<String> childIdNumbers;

    public Employee(String employeeId, String firstName, String lastName, String idNumber, String address,
                    int yearJoined, int monthJoined, int dayJoined, boolean isForeigner, boolean gender) {
        this.employeeId = employeeId;
        this.personalInfo = new PersonalInformation(firstName, lastName, idNumber, address, isForeigner, gender);
        this.joinDate = new JoinDate(yearJoined, monthJoined, dayJoined);
        this.employmentDetails = new EmploymentDetails();
        this.salary = new Salary();
        this.family = new Family();
        this.childNames = new LinkedList<String>();
        this.childIdNumbers = new LinkedList<String>();
    }

    // Personal Information
    private class PersonalInformation {
        private String firstName;
        private String lastName;
        private String idNumber;
        private String address;
        private boolean isForeigner;
        private boolean gender;

        public PersonalInformation(String firstName, String lastName, String idNumber, String address,
                                   boolean isForeigner, boolean gender) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = idNumber;
            this.address = address;
            this.isForeigner = isForeigner;
            this.gender = gender;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getIdNumber() {
            return idNumber;
        }

        public String getAddress() {
            return address;
        }

        public boolean getIsForeigner() {
            return isForeigner;
        }

        public boolean getGender() {
            return gender;
        }
    }

    // Join Date
    private class JoinDate {
        private int yearJoined;
        private int monthJoined;
        private int dayJoined;
        private int monthWorkingInYear;

        public JoinDate(int yearJoined, int monthJoined, int dayJoined) {
            this.yearJoined = yearJoined;
            this.monthJoined = monthJoined;
            this.dayJoined = dayJoined;
            this.monthWorkingInYear = 0;
        }

        public int getYearJoined() {
            return yearJoined;
        }

        public int getMonthJoined() {
            return monthJoined;
        }

        public int getDayJoined() {
            return dayJoined;
        }

        public int getMonthWorkingInYear() {
            return monthWorkingInYear;
        }

        public void setMonthWorkingInYear(int monthWorkingInYear) {
            this.monthWorkingInYear = monthWorkingInYear;
        }
    }

    // Employment Details
    private class EmploymentDetails {
        private boolean isMarried;
        private int numChildren;

        public boolean getIsMarried() {
            return isMarried;
        }

        public void setIsMarried(boolean isMarried) {
            this.isMarried = isMarried;
        }

        public int getNumChildren() {
            return numChildren;
        }

        public void setNumChildren(int numChildren) {
            this.numChildren = numChildren;
        }
    }

    // Salary
    private class Salary {
        private int monthlySalary;
        private int otherMonthlyIncome;
        private int annualDeductible;

        public int getMonthlySalary() {
            return monthlySalary;
        }

        public
