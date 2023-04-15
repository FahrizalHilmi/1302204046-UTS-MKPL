package lib;

public class person {
    private Name name;
    private IdNumber idNumber;
    private Address address;
    private Gender gender;

    public person(String firstName, String lastName, String idNumber, String address, Gender gender) {
        this.name = new Name(firstName, lastName);
        this.idNumber = new IdNumber(idNumber);
        this.address = new Address(address);
        this.gender = gender;
    }

    // Getter dan setter untuk atribut name
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    // Getter dan setter untuk atribut idNumber
    public IdNumber getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(IdNumber idNumber) {
        this.idNumber = idNumber;
    }

    // Getter dan setter untuk atribut address
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // Getter dan setter untuk atribut gender
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
}

class IdNumber {
    private String idNumber;

    public IdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    // Getter dan setter untuk atribut idNumber
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}

class Address {
    private String address;

    public Address(String address) {
        this.address = address;
    }

    // Getter dan setter untuk atribut address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

enum Gender {
    MALE, FEMALE
}
