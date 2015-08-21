package kr.pe.ihoney.rocking.makerestapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Profile("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RockingMakeRestApiApplication.class)
@WebAppConfiguration
public class RockingMakeRestApiApplicationTests {

	@Test
	public void contextLoads() {
	}

}
