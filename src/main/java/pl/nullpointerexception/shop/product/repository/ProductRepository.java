package pl.nullpointerexception.shop.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.nullpointerexception.shop.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
//    Optional<Product> findBySlug(String slug);
//
//    Page<Product> findByCategoryId(Long id, Pageable pageable);
//
//    List<Product> findTop10BySalePriceIsNotNull();

}
