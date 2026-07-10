package com.project.edusync.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // 1. Disable CSRF to allow state-changing requests (PUT, POST) via Postman
                .csrf(csrf -> csrf.disable())

                // 2. Permit all HTTP requests unconditionally across the entire application
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll())

                // 3. Disable the default HTTP Basic authentication prompt
                .httpBasic(basic -> basic.disable())

                // 4. Disable the default Form Login page redirection
                .formLogin(form -> form.disable());

        return http.build();

    }

}
