package com.github.ricardobaumann.accountservice.repos;

import com.github.ricardobaumann.accountservice.models.Account;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

@RepositoryRestResource
@PreAuthorize("hasRole('ROLE_ADMIN')")
public interface AccountRepo extends CrudRepository<Account, String> {
}
