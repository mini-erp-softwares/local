package com.ent.mini.erp.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.stereotype.Component;
import org.springframework.boot.actuate.health.Health.Builder;

@Component
public class CustomHealthIndicator extends AbstractHealthIndicator {

  @Override
  protected void doHealthCheck(Builder builder) throws Exception {

    // .. do some processing to check the health of your custom dependency

    builder
        .up()
        .withDetail("details", "My custom health indicator");

    // if you throw an exception, the status will be 'DOWN' with exception message.
  }
}
