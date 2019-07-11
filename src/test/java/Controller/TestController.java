package Controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import com.alibaba.fastjson.JSON;
import com.springboot.pojo.Account;
import com.springboot.pojo.Teacher;

import service.BaseTest;

@AutoConfigureMockMvc
public class TestController extends BaseTest {
	@Autowired
	private MockMvc mvc;

	@Test
	public void GetTest() throws Exception {
		this.mvc.perform(get("/getAccount")).andExpect(status().isOk())
				.andExpect(content().string("Welcome to springboot2 world ~")).andDo(MockMvcResultHandlers.print());
	}

	@Test
	public void PostTest() throws Exception {
		Account account = new Account();
		account.setAccount_num("t123");
		account.setName("mockmvc");
		account.setPassword("2151");
		Teacher teacher = new Teacher();
		teacher.setTeacher_name("李四");
		account.setTeacher(teacher);
		

		MvcResult mvcResult = this.mvc
				.perform(post("/addAccount")
				.contentType(MediaType.APPLICATION_JSON)
				.content(JSON.toJSONString(account)))
				.andReturn();

		System.out.println(mvcResult.getResponse().getContentAsString());
	}

}
