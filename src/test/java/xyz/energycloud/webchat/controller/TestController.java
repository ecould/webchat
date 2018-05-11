package xyz.energycloud.webchat.controller;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.util.AopTestUtils;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import xyz.energycloud.webchat.controller.CarInfoController;

/**
 * 测试点:
 * <p>
 * 1.spring mvc mock and rest test
 * <p>
 * 2.cache test
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = "classpath:spring/applicationContext-*.xml")
public class TestController {
	private MockMvc mockMvc;

	@Autowired
	CarInfoController carInfoController;

	@Autowired
	CacheManager cacheManager;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);

		this.mockMvc = MockMvcBuilders.standaloneSetup(AopTestUtils.getTargetObject(carInfoController)).build();
	}

}
