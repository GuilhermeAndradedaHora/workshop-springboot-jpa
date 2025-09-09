package br.com.guilhermetech.trainnerspring.config;

import br.com.guilhermetech.trainnerspring.entities.Category;
import br.com.guilhermetech.trainnerspring.entities.Order;
import br.com.guilhermetech.trainnerspring.entities.User;
import br.com.guilhermetech.trainnerspring.entities.enums.OrderStatus;
import br.com.guilhermetech.trainnerspring.repositories.CategoryRepository;
import br.com.guilhermetech.trainnerspring.repositories.OrderRepository;
import br.com.guilhermetech.trainnerspring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
//O CommandLineRunner serve para executar os comandos da config quando iniciar o programa
public class TesteConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        User u1 = new User(null, "Guilherme Hora", "gui@test.com", "71986118649", "5988");
        User u2 = new User(null, "Isadora Hora", "isa@test.com", "71992809728", "7073");

        userRepository.saveAll(Arrays.asList(u1, u2));

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

    }
}
