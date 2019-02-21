package com.bouygtel.swad.springcloudconfigissue421;

import java.util.List;

//import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties("example")
@RefreshScope
@Validated
public class MyApplicationConfigurationProperties {

	List<String> myList;

	public List<String> getMyList() {
		return myList;
	}

	public void setMyList(List<String> myList) {
		this.myList = myList;
	}
}
