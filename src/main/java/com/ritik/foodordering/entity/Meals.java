package com.ritik.foodordering.entity;


import javax.persistence.*;

@Entity
@Table(name = "meals")
public class Meals {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

     @Column(name = "name")
    private String name;

     @Column(name = "short_description")
    private String shortDescriptpion;

     @Column(name = "descriptpion")
    private String description;

     @Column(name = "price")
    private double price;

     @Column(name = "image")
    private String image;


    // no arg constructor
    public Meals() {
    }

     
    //all argument consructor except id
    
    public Meals(int id, String name, String shortDescriptpion, String description, double price, String image) {
		super();
		this.id = id;
		this.name = name;
		this.shortDescriptpion = shortDescriptpion;
		this.description = description;
		this.price = price;
		this.image = image;
	}
    
    
    public Meals(String name, String shortDescriptpion, String description, double price, String image) {
        this.name = name;
        this.shortDescriptpion = shortDescriptpion;
        this.description = description;
        this.price = price;
        this.image = image;
    }


    // getters and setters


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

    public String getShortDescriptpion() {
        return shortDescriptpion;
    }

    public void setShortDescriptpion(String shortDescriptpion) {
        this.shortDescriptpion = shortDescriptpion;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    //toString() method


    @Override
    public String toString() {
        return "Meals{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shortDescriptpion='" + shortDescriptpion + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                '}';
    }
}
