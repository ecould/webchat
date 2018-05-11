package xyz.energycloud.webchat.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.energycloud.webchat.dao.CarInfoMapper;
import xyz.energycloud.webchat.domain.CarInfo;

@Service
public class CarInfoService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CarInfoMapper userMapper;

	public CarInfo getCarInfoById(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}

}
