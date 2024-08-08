package com.Project_Z.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityClass {
	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder en) {
		UserDetails admin= User.withUsername("vamsi")
				              .password(en.encode("1234")).roles("ADMIN").build();
		UserDetails user= User.withUsername("USER")
	              .password(en.encode("1234")).roles("STUDENT").build();
		return new InMemoryUserDetailsManager(admin,user);
		
	}
	@Bean
	public PasswordEncoder passwordencoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity htt) throws Exception {
		return htt.csrf().disable().authorizeHttpRequests()
                .requestMatchers("/subjects/login").permitAll()
                .and().authorizeHttpRequests()
                .requestMatchers("/student/**").hasRole("STUDENT").requestMatchers("/subjects/**").hasRole("ADMIN")
                .anyRequest().authenticated().and().formLogin().and().build();
                
            
               
	}


}
