package spring.mvc.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.mvc.recipeapp.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}