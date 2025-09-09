package br.com.guilhermetech.trainnerspring.repositories;

import br.com.guilhermetech.trainnerspring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
