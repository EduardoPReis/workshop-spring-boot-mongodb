package com.meuaprendizado.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.meuaprendizado.workshopmongo.domain.User;
import com.meuaprendizado.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		userRepository.deleteAll();

		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		User flavia = new User(null, " Flávia Rocha", "flaviarocha@gmail.com");
		User eduardo = new User(null, "Eduardo Reis", "eduardoreis@gmail.com");

		
		userRepository.save(maria);
		userRepository.save(alex);
		userRepository.save(bob);
		userRepository.save(flavia);
		userRepository.save(eduardo);
		
	}

}
