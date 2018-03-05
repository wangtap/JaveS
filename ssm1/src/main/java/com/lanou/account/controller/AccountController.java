package com.lanou.account.controller;

import com.lanou.account.dao.AccountMapper;
import com.lanou.account.domain.Account;
import com.lanou.account.domain.AccountPageBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    private int pageSide=5;
    @Resource
    private AccountMapper accountMapper;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        int totalData = accountMapper.findTotalData();
        AccountPageBean accountPageBean = new AccountPageBean(1,totalData,pageSide);
        List<Account> accounts = accountMapper.findAll(accountPageBean);
        accountPageBean.setData(accounts);
        model.addAttribute("accountPageBean",accountPageBean);
        return "/account/account_list";
    }

    @RequestMapping("/findAllByPage")
    public String findAllByPage(Model model ,AccountPageBean pageBean){
        System.out.println(pageBean.toString());
        int totalData = accountMapper.findTotalData();
        if (pageBean.getPageCode()==0){
            pageBean.setPageCode(1);
        }
        AccountPageBean accountPageBean = new AccountPageBean(pageBean.getPageCode(),totalData,pageSide);
        accountPageBean.setIdcardNo(pageBean.getIdcardNo());
        accountPageBean.setLoginName(pageBean.getLoginName());
        accountPageBean.setRealName(pageBean.getRealName());
        accountPageBean.setStatus(pageBean.getStatus());
        List<Account> accounts = accountMapper.findAllByPage(accountPageBean);
        accountPageBean.setData(accounts);
        model.addAttribute("accountPageBean",accountPageBean);
        return "/account/account_list";
    }

    //开启
    @RequestMapping("/startAccount")
    public String updateStart(@RequestParam("accountId") int id) {
//暂停账务账号
        Account a = new Account();
        a.setAccountId(id);
        a.setStatus("0");
        accountMapper.updateStatus(a);
        return "redirect:findAll";
    }
    //暂停
    @RequestMapping("/pauseAccount")
    public String updatePause(@RequestParam("accountId") int id) {
//暂停账务账号
        Account a = new Account();
        a.setAccountId(id);
        a.setStatus("1");
        accountMapper.updateStatus(a);
        return "redirect:findAll";
    }

    @RequestMapping("/toInsert")
    public String toInsert(){
        return "/account/account_add";
    }

    @RequestMapping("/insert")
    public String insert(Account account){
        account.setStatus("1");
        account.setCreateDate(new Timestamp(System.currentTimeMillis()).toString());
        account.setCloseDate(new Timestamp(System.currentTimeMillis()));
        account.setPauseDate(new Timestamp(System.currentTimeMillis()));
        account.setLastLoginTime(new Timestamp(System.currentTimeMillis()).toString());
        accountMapper.insertSelective(account);
        return "redirect:findAll";
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(int accountId,Model model){
        System.out.println(accountId);
        Account account = accountMapper.selectByPrimaryKey(accountId);
        model.addAttribute("account",account);
        return "/account/account_update";
    }

    @RequestMapping("/update")
    public String Update(Account account){
        System.out.println(account.toString());
        accountMapper.updateByPrimaryKeySelective(account);
        return "redirect:findAll";
    }
    @RequestMapping("/delete")
    public String delete(int accountId){
        accountMapper.deleteByPrimaryKey(accountId);
        return "redirect:findAll";
    }
}
