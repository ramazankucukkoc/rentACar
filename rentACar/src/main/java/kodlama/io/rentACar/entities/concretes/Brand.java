package kodlama.io.rentACar.entities.concretes;

public class Brand {

	private int id;//Markaları unique hale getirme
	private String name;
	
	//Paremetresiz Constructor oluşturma.
	public Brand() {

	}

	public Brand(int id, String name) {

		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}
