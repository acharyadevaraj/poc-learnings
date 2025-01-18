package com.learning.twilionotificationservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "twilio.notification")
public class TwilioConfig {
	private String accountSid;
	private String authToken;
	private String phoneNo;
}
