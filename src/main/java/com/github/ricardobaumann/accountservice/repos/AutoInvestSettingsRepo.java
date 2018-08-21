package com.github.ricardobaumann.accountservice.repos;

import com.github.ricardobaumann.accountservice.models.AutoInvestSetting;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

@RepositoryRestResource
@PreAuthorize("hasRole('ROLE_USER')")
public interface AutoInvestSettingsRepo extends CrudRepository<AutoInvestSetting,Long> {
}
