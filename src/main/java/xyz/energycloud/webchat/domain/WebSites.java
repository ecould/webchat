package xyz.energycloud.webchat.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebSites {
	private long id;
	private String name;
	private int alexa;
	private String url;
	private String country;
}
