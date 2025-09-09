package br.com.guilhermetech.trainnerspring.repositories;

import br.com.guilhermetech.trainnerspring.entities.Category;
import br.com.guilhermetech.trainnerspring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
