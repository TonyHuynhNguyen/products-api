package uk.ac.westminster.productsapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 5COSC019W Tutorial 2 - model solution.
 *
 * The first controller on this module whose method returns an object rather
 * than a String. Spring turns the returned Product into JSON automatically.
 *
 * @RequestMapping("/products") every path in this class starts with /products
 * @GetMapping("/{id}") handles GET /products/<something>
 * @PathVariable copies that <something> into the id parameter
 */
@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return new Product(id, "Laptop", 999.99);
    }
}