package ch.fhnw.securitytest.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

public class SecurityConfig {
    @Configuration
    @EnableWebSecurity
    @EnableMethodSecurity

}

}
