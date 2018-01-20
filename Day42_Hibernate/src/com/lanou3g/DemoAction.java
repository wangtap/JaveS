package com.lanou3g;

public class DemoAction {
    private BaseDao<DemoAction> baseDao=new BaseDaoImpl();

    public String demo(){
        //假装我是一个Strust2的action
        //毕竟POJP类也可作为action使用
        baseDao.add(new DemoAction());
        return "success";
    }
}
