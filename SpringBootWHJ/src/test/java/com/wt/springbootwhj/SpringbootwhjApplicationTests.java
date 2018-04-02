package com.wt.springbootwhj;

import com.wt.springbootwhj.domain.Article;
import com.wt.springbootwhj.service.WYJService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootwhjApplicationTests {

	@Autowired
	@Qualifier("wyjService")
	private WYJService wyjService;
	@Test
	public void contextLoads() {
		List<Article> articles = wyjService.selectAll();
		System.out.println(articles.toString());
	}

}
