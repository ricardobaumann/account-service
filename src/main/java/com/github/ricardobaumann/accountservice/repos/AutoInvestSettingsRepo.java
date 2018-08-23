package com.github.ricardobaumann.accountservice.repos;

import com.github.ricardobaumann.accountservice.models.AutoInvestSetting;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

@RepositoryRestResource
@PreAuthorize("hasRole('ROLE_USER')")
public interface AutoInvestSettingsRepo extends CrudRepository<AutoInvestSetting,Long> {
    /*
    possibilities

    1. publish account and auto invest changes into a kafka topic
    2. listens for those events on loan-service to create investments
     */
}
