package com.lanou.service.dao;

import com.lanou.account.domain.Account;
import com.lanou.base.dao.BaseMapper;
import com.lanou.cost.domain.Cost;
import com.lanou.service.domain.ExtendService;
import com.lanou.service.domain.Service;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceMapper extends BaseMapper<ExtendService> {
    Account findByIdcardNo(String idcardNo);

    void updateStatus(Service service);

    List<Cost> findAllCost();
}