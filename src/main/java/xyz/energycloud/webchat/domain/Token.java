package xyz.energycloud.webchat.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Token {
	private long id;
	private String accessToken;
	private String expriresIn;
	private String refreshToken;
	private String open_id;
	private String scope;
	private Date createAt;
	
}
