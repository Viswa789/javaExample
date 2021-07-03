package javaExampletest;

public class Patient {
	
	private String name ;
	private int Id ;
	 private String address ;
	
	
	public Patient() {
	}
	
	public Patient(String name, int id, String address) {
		this.name = name;
		Id = id;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", Id=" + Id + ", address=" + address + "]";
	}
	
	

}
