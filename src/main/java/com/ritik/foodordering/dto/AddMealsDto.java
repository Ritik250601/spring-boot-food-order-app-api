package com.ritik.foodordering.dto;



import org.springframework.web.multipart.MultipartFile;

public class AddMealsDto {
	private String name;
	private String shortDescription;
	private String description;
	private double price;
	private MultipartFile pic;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescrioption(String shortDescrioption) {
		this.shortDescription = shortDescrioption;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public MultipartFile getPic() {
		return pic;
	}
	public void setPic(MultipartFile pic) {
		this.pic = pic;
	}
	
	

	public AddMealsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AddMealsDto [name=" + name + ", shortDescrioption=" + shortDescription + ", description=" + description
				+ ", price=" + price + ", pic=" + pic + "]";
	}
	
	
	
	

}
