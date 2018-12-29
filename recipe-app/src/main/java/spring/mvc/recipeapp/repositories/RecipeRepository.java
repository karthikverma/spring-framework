package spring.mvc.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.mvc.recipeapp.domain.Recipe;

public interface  RecipeRepository extends CrudRepository<Recipe, Long> {
}
