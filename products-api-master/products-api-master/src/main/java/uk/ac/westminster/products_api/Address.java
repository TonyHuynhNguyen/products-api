package uk.ac.westminster.productsapi;
/**
 * 5COSC019W Tutorial 2 - model solution.
 *
 * A small value class held inside Customer. It follows exactly the same
 * pattern as Product: private fields, two constructors, public getters.
 */
public class Address {
    private String street;
    private String city;
    private String postcode;
    public Address() {
    }
    public Address(String street, String city, String postcode) {
        this.street = street;
        this.city = city;
        this.postcode = postcode;
    }
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getPostcode() {
        return postcode;
    }
}