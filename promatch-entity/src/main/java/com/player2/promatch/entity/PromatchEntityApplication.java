
package com.player2.promatch.entity;


import com.player2.promatch.entity.repository.TraitsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"com.player2.*"}, repositoryBaseClass = TraitsRepository.class)
@EntityScan(basePackages = {"com.player2.*"})

@SpringBootApplication
public class PromatchEntityApplication {

    public static void main(String[] args) {
        SpringApplication.run(PromatchEntityApplication.class, args);
    }

}
