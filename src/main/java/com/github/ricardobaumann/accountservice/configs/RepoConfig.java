package com.github.ricardobaumann.accountservice.configs;

import com.github.ricardobaumann.accountservice.services.AuthenticationService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.security.Principal;
import java.util.Optional;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class RepoConfig {

    @Bean
    AuditorAware<String> auditorAware(AuthenticationService authenticationService) {
        return () -> Optional.ofNullable(authenticationService.getCurrentUser())
                .map(Principal::getName);
    }

}
