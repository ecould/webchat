package xyz.energycloud.webchat.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import xyz.energycloud.webchat.domain.CarInfo;

public class CarInfoServiceTest extends TestServiceBase{
	@Autowired
	private CarInfoService carInfoService;
	@Test
	public void test() {
		CarInfo carInfo = carInfoService.getCarInfoById(1l);
		if(carInfo != null){
			System.out.println("cg");
		}
	}

}
