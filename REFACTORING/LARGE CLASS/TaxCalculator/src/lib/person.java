package lib;
public class person {
    private String firstName;
    private String lastName;
    private String idNumber;
    private String address;
    private boolean gender; // true = Laki-laki, false = Perempuan

    public person(String firstName, String lastName, String idNumber, String address, boolean gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.address = address;
        this.gender = gender;
    }

    // Getter dan setter untuk atribut firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter dan setter untuk atribut lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter dan setter untuk atribut idNumber
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    // Getter dan setter untuk atribut address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter dan setter untuk atribut gender
    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}