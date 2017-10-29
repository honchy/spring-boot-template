package cn.honchy.job_schedule_ui.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinyan.cao on 2017/10/29.
 */
@RestController("/")
public class HomeController {
    private static Logger log = LoggerFactory.getLogger(HomeController.class);
    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/index")
    public ModelAndView indexPage() {
        log.info("access page index");
        return new ModelAndView("index");
    }
}
