package xyz.energycloud.webchat.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(value = "Rest result", description = "请求结果")
@Getter
@Setter
public class Result<T> implements Serializable {
    private static final long serialVersionUID = -4696898674758059398L;
    @ApiModelProperty(value = "结果代码")
    private int statusCode;
    @ApiModelProperty(value = "结果对象")
    private T data;


  
}
