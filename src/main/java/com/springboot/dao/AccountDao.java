package com.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.pojo.Account;

public interface AccountDao extends CrudRepository<Account, Long>{

}
