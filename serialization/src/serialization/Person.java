package serialization;

import java.io.Serializable;

public class Person implements Serializable {
	String name;
	String phonenumber;
	String dateofbirth;
	String emailaddress;
	
	public Person(String name, String phonenumber, String dateofbirth, String emailaddress) {
		super();
		this.name = name;
		this.phonenumber = phonenumber;
		this.dateofbirth = dateofbirth;
		this.emailaddress = emailaddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phonenumber=" + phonenumber + ", dateofbirth=" + dateofbirth
				+ ", emailaddress=" + emailaddress + "]";
	}
	}
	


