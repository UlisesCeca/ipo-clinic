package dominio;

public class ImagenMedica {
	
	private String imagePath;
	private String name;
	private String info;
	
	public ImagenMedica(String imagePath, String name, String info) {
		super();
		this.imagePath = imagePath;
		this.name = name;
		this.info = info;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
