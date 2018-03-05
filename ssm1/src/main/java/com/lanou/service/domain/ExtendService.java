package com.lanou.service.domain;

import com.lanou.account.domain.Account;
import com.lanou.cost.domain.Cost;

public class ExtendService extends Service {
    public ExtendService() {
    }

    private Account account;

    private Cost cost;

    public Cost getCost() {
        return cost;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }






}
