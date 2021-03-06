package spring.mvc.recipeapp.services;

import spring.mvc.recipeapp.commands.RecipeCommand;
import spring.mvc.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
