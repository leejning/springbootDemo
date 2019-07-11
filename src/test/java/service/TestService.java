package service;

import javax.transaction.Transactional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.springboot.dao.AccountDao;
import com.springboot.pojo.Account;


public class TestService extends BaseTest{
	@Autowired
	private AccountDao adao;
	
	@Test
	@Rollback(value=false)
//	@Transactional
	public void demo1() {
		Account account = new Account();
		
		account.setAccount_num("123456");
		account.setName("张三");
		account.setPassword("123456");
		adao.save(account);
	}
	
}
