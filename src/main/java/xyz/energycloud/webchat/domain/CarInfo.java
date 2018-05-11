package xyz.energycloud.webchat.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarInfo {
	private long id;
	private String type;
	private String accZone;
	private String num;
	private String uid;
	private String mobile;
	private int oilMax;
	private int tagList;
	
}
