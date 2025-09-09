package br.com.guilhermetech.trainnerspring.repositories;

import br.com.guilhermetech.trainnerspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
