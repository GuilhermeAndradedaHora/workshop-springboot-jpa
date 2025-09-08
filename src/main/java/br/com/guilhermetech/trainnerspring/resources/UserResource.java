package br.com.guilhermetech.trainnerspring.resources;

import br.com.guilhermetech.trainnerspring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Isadora", "isadora@test.com", "71986118649", "598831");
        return ResponseEntity.ok().body(u);
    }
}
