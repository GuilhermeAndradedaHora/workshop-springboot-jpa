package br.com.guilhermetech.trainnerspring.repositories;

import br.com.guilhermetech.trainnerspring.entities.OrderItem;
import br.com.guilhermetech.trainnerspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
