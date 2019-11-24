package com.cognizant.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.pringframework.beans.factory.annotation.Autowired;
import org.pringframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import statis org.junit.Assert.*;
import static org.pringframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.pringframework.test.web.servlet.result.MockMvcRequestMatchers.content;
import static org.pringframework.test.web.servlet.result.MockMvcRequestMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {
  @Autowired
  private MockMvc mvc;
  
  @Test
  public void shouldAlwaysPass() {
     assertTrue(true);
  }

	@Test
	public void shouldGetHello() throws Exception {
		this.mvc.perform(get("/")).andExpect(status().isOk)).andExpect(content().string("hello"));
	}

}
