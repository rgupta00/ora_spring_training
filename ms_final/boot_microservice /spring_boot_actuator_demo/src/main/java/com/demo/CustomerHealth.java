package com.demo;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
@Component
public class CustomerHealth implements HealthIndicator{

	@Override
	public Health health() {

		return Health.down().withDetail("service", "unreachable").build();
	}

}
