package pl.nullpointerexception.shop.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.nullpointerexception.shop.product.model.Product;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts() {
        return List.of(
                new Product("Produkt 1", "Kategora 1", "Opis 1", new BigDecimal("6.99")),
                new Product("Produkt 2", "Kategora 2", "Opis 2", new BigDecimal("7.99")),
                new Product("Produkt 3", "Kategora 3", "Opis 3", new BigDecimal("8.99"))

        );
    }

}
