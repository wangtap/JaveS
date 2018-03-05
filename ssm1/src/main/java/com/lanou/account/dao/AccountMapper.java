package com.lanou.account.dao;

import com.lanou.account.domain.Account;
import com.lanou.account.domain.AccountPageBean;
import com.lanou.base.dao.BaseMapper;
import com.lanou.page.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountMapper extends BaseMapper<Account> {
//List<Account> findAll(AccountPageBean accountPageBean);

    void updateStatus(Account account);
}