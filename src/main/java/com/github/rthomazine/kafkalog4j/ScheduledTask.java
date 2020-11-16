package com.github.rthomazine.kafkalog4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ScheduledTask {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTask.class);

    @Scheduled(cron = "0/10 * * * * *")
    public void scheduledTask() {
        log.info("unique log message: " + UUID.randomUUID().toString());
    }


}
