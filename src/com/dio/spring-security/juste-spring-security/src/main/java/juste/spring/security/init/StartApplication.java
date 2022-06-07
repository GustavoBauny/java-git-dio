package juste.spring.security.init;

import juste.spring.security.model.User;
import juste.spring.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class StartApplication implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Transactional
    @Override
    public void run(String... args) throws Exception {

        User user = repository.findByUsername("admin");
        if(user == null){
            user = new User();
            user.setName("ADMIN");
            user.setUsernam3000
        user = repository.findByUsername("users");
        if(user == null){
            user = new User();
            user.setName("USER");
            user.setUsername("user");
            user.setPassword("user123");
            user.getRoles().add("USERS");
            repository.save(user);
        }

    }

}
