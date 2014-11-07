package com.github.nachomezzadra.sample.conf;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.github.nachomezzadra.sample.BaseSpringTest;

public class SpringConfigurationTest extends BaseSpringTest  {

	@Autowired
	ApplicationContext context;

	
	@Test
	public void shouldProperlyLoadSpringContext() throws Exception {
		assertNotNull(this.context);
	}
}
