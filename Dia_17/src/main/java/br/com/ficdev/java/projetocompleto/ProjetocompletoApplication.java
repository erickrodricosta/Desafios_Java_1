package br.com.ficdev.java.projetocompleto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan("br.com.ficdev.java.projetocompleto")
public class ProjetocompletoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetocompletoApplication.class, args);
	}

}
