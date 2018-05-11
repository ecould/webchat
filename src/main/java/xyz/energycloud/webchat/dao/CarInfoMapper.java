package xyz.energycloud.webchat.dao;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import xyz.energycloud.webchat.domain.CarInfo;
public interface CarInfoMapper{

	@Select("select * from car_info where id=#{0} ")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "type", property = "type"),
            @Result(column = "acc_zone", property = "accZone"),
            @Result(column = "uid", property = "uid"),
            @Result(column = "mobile", property = "mobile"),
            @Result(column = "oilMax", property = "oilMax"),
            @Result(column = "tagList", property = "tagList")
    })
	CarInfo selectByPrimaryKey(Long id);
}
