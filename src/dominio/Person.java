package dominio;

public class Person {
	
	private String name;
	private String surname;
	private String phoneNumber;
	private String zipCode;
	private String town;
	private String province;
	private String street;
	private String houseNumber;
	private String picturePath;
	
	public Person(String name, String surname, String phoneNumber, String zipCode, String town, String province, String street, String houseNumber, String picturePath){
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.zipCode = zipCode;
		this.town = town;
		this.province = province;
		this.street = street;
		this.houseNumber = houseNumber;
		this.picturePath = picturePath;
	}

	public String getName() {
		return name;
	}
	
	public String getPicturePath(){
		return this.picturePath;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	public String toString(){
		return this.name + " " + this.surname;
	}

	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}
	
	

}
