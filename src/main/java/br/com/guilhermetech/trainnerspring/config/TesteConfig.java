package br.com.guilhermetech.trainnerspring.config;

import br.com.guilhermetech.trainnerspring.entities.User;
import br.com.guilhermetech.trainnerspring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
//O CommandLineRunner serve para executar os comandos da config quando iniciar o programa
public class TesteConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Guilherme Hora", "gui@test.com", "71986118649", "5988");
        User u2 = new User(null, "Isadora Hora", "isa@test.com", "71992809728", "7073");

        userRepository.saveAll(Arrays.asList(u1, u2));

    }
}
