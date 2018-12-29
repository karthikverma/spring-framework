package spring.mvc.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.mvc.recipeapp.domain.Category;

import java.util.Locale;
import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}