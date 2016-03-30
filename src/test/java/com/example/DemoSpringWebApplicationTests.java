package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.demo.DemoSpringWebApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoSpringWebApplication.class)
@WebAppConfiguration
public class DemoSpringWebApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testApp()
	{
		 assertTrue (1 < 3);
	}

}
