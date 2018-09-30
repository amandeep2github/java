package learn.java.entity;

import java.util.Date;

public class Person {
	private String personId;
	private String firstName;
	private String middleName;
	private String lastName;
	private Date dateOfBirth;
	private Date dateOfJoining;
	private Date dateOfTermination;
	private String ntLogin;
	private String email;
	private String personalContactNumber;
	private String officialContactNumber;
	private String emergencyContactNumber1;
	private String emergencyContactNumber2;
	private Address primaryAddress;
	private Address secondaryAddress;
	private Gender gender;

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPersonId() {
		return personId;
	}

	public String getFirstName() {
		return firstName;
	}

    public void setPrimaryAddress(Address primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public Address getPrimaryAddress() {
        return primaryAddress;
    }
}
