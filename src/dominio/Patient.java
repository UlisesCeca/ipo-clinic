package dominio;

public class Patient extends Person{
	
	private String age;
	private String genre;
	private String mobilePhone;
	private String email;
	private Appointment appointment;
	private boolean defaul;
	private String antecedentes;
	private String tratamiento;
	private ImagenMedica image1;
	private ImagenMedica image2;
	
	public Patient(String name, String surname, String phoneNumber, String zipCode, String town, String province,
			String street, String houseNumber, String pic, String mobilePhone, String email, String age, String genre, 
			Appointment appointment, boolean defaul, String antecedentes,  String tratamiento,
			ImagenMedica image1, ImagenMedica image2) {
		super(name, surname, phoneNumber, zipCode, town, province, street, houseNumber, pic);
		
		this.age = age;
		this.genre = genre;
		this.mobilePhone = mobilePhone;
		this.email = email;
		this.appointment = appointment;
		this.defaul = defaul;
		this.antecedentes = antecedentes;
		this.tratamiento = tratamiento;
		this.image1 = image1;
		this.image2 = image2;
	}

	public ImagenMedica getImage1() {
		return image1;
	}

	public void setImage1(ImagenMedica image1) {
		this.image1 = image1;
	}

	public ImagenMedica getImage2() {
		return image2;
	}

	public void setImage2(ImagenMedica image2) {
		this.image2 = image2;
	}

	public String getAntecedentes() {
		return antecedentes;
	}

	public void setAntecedentes(String antecedentes) {
		this.antecedentes = antecedentes;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public String getAge() {
		return age;
	}
	
	public boolean getDefault(){
		return this.defaul;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getMobilePhone() {
		return mobilePhone;
	}


	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public Appointment getAppointment() {
		return this.appointment;
	}
	

}
