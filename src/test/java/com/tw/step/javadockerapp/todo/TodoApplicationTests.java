package com.tw.step.javadockerapp.todo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {DbConfig.class})
public class TodoApplicationTests {

	@Test
	public void contextLoads() {

	}

}

