package cn.honchy.job_schedule_ui.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jinyan.cao on 2017/10/29.
 */
@RestController("/")
public class HomeController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
