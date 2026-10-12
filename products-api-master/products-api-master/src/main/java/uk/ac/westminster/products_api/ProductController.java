package uk.ac.westminster.products_api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
public class ProductController {
    // Spring creates the ProductService and hands it over.
    @Autowired
    private ProductService productService;
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id).orElse(null);
    }
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}