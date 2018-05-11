package xyz.energycloud.webchat.controller;

import java.util.concurrent.TimeUnit;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import xyz.energycloud.webchat.domain.CarInfo;
import xyz.energycloud.webchat.service.CarInfoService;
import xyz.energycloud.webchat.vo.Result;
import xyz.energycloud.webchat.vo.ResultCode;

/**
 * 用户Controller
 */
@RestController
@RequestMapping(value = "/ecloud")
@Api(value = "/", description = "车辆信息相关的接口")
public class CarInfoController {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CarInfoService carInfoService;

	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	@ApiResponses(value = { @ApiResponse(code = 2000000, message = "操作成功"),
			@ApiResponse(code = 2010005, message = "未知异常"), @ApiResponse(code = 2010001, message = "请求参数格式错误") })
	@ApiOperation(value = "获得车辆信息", notes = "获得车辆信息")
	@RequestMapping(value = "/carInfo/{id}", method = { RequestMethod.GET })
	public Result<CarInfo> register(
			@ApiParam(name = "id", value = "用户ID", required = true) @PathVariable @Valid Long id) throws Exception {
		Result<CarInfo> result = new Result<>();
		try {
			String key = "TEST:" + id;
			redisTemplate.boundValueOps(key).set(String.valueOf(id), 100l, TimeUnit.SECONDS);
			String value = redisTemplate.boundValueOps(key).get();
			logger.info("carinfo  主键" + value);
			CarInfo carInfo = carInfoService.getCarInfoById(id);
			result.setStatusCode(ResultCode.C200.getCode());
			result.setData(carInfo);
		} catch (Exception e) {
			logger.error("获得车辆信息异常");
			throw new Exception("获得车辆信息异常");
		}
		return result;
	}
}
