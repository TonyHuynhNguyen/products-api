package uk.ac.westminster.productsapi;
/**
 * 5COSC019W Tutorial 2 - model solution.
 *
 * Demonstrates an association: a Customer has-an Address. The fourth field
 * has type Address rather than String, so one object holds another. In the
 * JSON response this appears as an object nested inside an object.
 */
public class Customer {
    private Long id;
    private String name;
    private String email;
    private Address address;
    public Customer() {
    }
    public Customer(Long id, String name, String email, Address address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    /**
     * Remove this getter and the whole address block disappears from the
     * JSON - all three of its fields at once.
     */
    public Address getAddress() {
        return address;
    }
}