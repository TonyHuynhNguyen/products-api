package uk.ac.westminster.productsapi;
/**
 * 5COSC019W Tutorial 2 - model solution.
 *
 * The encapsulated form of the Product class first seen in Lecture 1.
 *
 * - every field is private, so no code outside this class can read or
 * write the data directly;
 * - a public getter exposes each field deliberately, which is also what
 * Spring's JSON serialiser (Jackson) looks for;
 * - there is no setter, because nothing in this application needs to
 * change a product after it has been created.
 */
public class Product {
    private Long id;
    private String name;
    private double price;
    /**
     * No-argument constructor. Not needed for reading data, but Jackson uses
     * it to create an empty object when JSON arrives in a request body.
     */
    public Product() {
    }
    /** Full constructor - the one your own code calls. */
    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}