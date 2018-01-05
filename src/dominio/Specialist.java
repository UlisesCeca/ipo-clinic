package dominio;

public class Specialist extends Person{
	
	private String field;
	private String officeFloor;
	private String officeNumber;
	private String phoneExtension;


	public Specialist(String name, String surname, String phoneNumber, String zipCode, String town, String province,
			String street, String houseNumber, String pic, String field, String officeFloor, String officeNumber,
			String phoneExtension) {
		super(name, surname, phoneNumber, zipCode, town, province, street, houseNumber, pic);
		this.field = field;
		this.officeFloor = officeFloor;
		this.officeNumber = officeNumber;
		this.phoneExtension = phoneExtension;
	}
	
	public String getField() {
		return field;
	}

	public String getOfficeFloor() {
		return officeFloor;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public String getPhoneAndExtension() {
		return this.getPhoneNumber() + " +" + this.phoneExtension;
	}
	
	public String toString(){
		return this.field + " - " + super.getName() + " " + super.getSurname();
	}

}
