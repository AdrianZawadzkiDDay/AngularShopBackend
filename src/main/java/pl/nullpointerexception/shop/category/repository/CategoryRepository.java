package pl.nullpointerexception.shop.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.nullpointerexception.shop.common.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findBySlug(String slug);
}
