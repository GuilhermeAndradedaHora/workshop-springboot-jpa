package br.com.guilhermetech.trainnerspring.repositories;

import br.com.guilhermetech.trainnerspring.entities.Category;
import br.com.guilhermetech.trainnerspring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
