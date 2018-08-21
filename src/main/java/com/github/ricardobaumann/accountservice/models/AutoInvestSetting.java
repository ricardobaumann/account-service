package com.github.ricardobaumann.accountservice.models;

import org.springframework.data.rest.core.annotation.RestResource;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "auto_invest_settings")
public class AutoInvestSetting {

    @Id
    private Long id;

    @NotNull
    @ManyToOne
    @RestResource
    private Account account;

    private BigDecimal maximumAmount;

    private BigDecimal minimumInterest;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public BigDecimal getMaximumAmount() {
        return maximumAmount;
    }

    public void setMaximumAmount(BigDecimal maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public BigDecimal getMinimumInterest() {
        return minimumInterest;
    }

    public void setMinimumInterest(BigDecimal minimumInterest) {
        this.minimumInterest = minimumInterest;
    }
}
