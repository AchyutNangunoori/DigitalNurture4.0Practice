package com.cognizant.spring_learn.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.cognizant.spring_learn.controller.AuthenticationController;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	private static final Logger LOGGER=LoggerFactory.getLogger(AuthenticationController.class);

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{
		 LOGGER.info("started security filter chain...");
		 http
         .csrf(csrf -> csrf.disable())
         .httpBasic(Customizer.withDefaults())
         .authorizeHttpRequests(authz -> authz
             .requestMatchers("/countries").hasRole("USER")
             .requestMatchers("/authenticate").hasAnyRole("USER", "ADMIN")
             .anyRequest().authenticated()
         );
		
		return http.build();
	}
    
    @Bean
    UserDetailsService userDetailService(BCryptPasswordEncoder passwordEncoder)
    {
    	InMemoryUserDetailsManager manager=new InMemoryUserDetailsManager();
    	manager.createUser(
    		    User.withUsername("admin")
    		        .password(passwordEncoder.encode("pwd"))
    		        .roles("ADMIN")
    		        .build()
    		);
    	manager.createUser(
    		    User.withUsername("user")
    		        .password(passwordEncoder.encode("pwd"))
    		        .roles("USER")
    		        .build()
    		);
    	return manager;
    }
    
    @Bean
    BCryptPasswordEncoder passwordEncoder()
    {
    	return new BCryptPasswordEncoder();
    }


}
