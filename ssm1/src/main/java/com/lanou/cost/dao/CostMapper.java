package com.lanou.cost.dao;

import com.lanou.base.dao.BaseMapper;
import com.lanou.cost.domain.Cost;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CostMapper extends BaseMapper<Cost> {

    List<Cost> findAllByBaseDuration(int pageCode,int pageSide);
}