package com.wipcamp.masterdata.services;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PersonServiceTest {
	@Test
	void testPersonService() {
		PersonService service = new PersonService();
		Assert.assertThat(true, CoreMatchers.equalTo(true));
	}
}