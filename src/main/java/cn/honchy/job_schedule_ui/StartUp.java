package cn.honchy.job_schedule_ui;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartUp {
    private static Logger log = LoggerFactory.getLogger(StartUp.class);
    public static void main(String[] args) {
        log.info(">>>>>>:)  job-schedule-ui startup ...");
        SpringApplication.run(StartUp.class);
    }
}
