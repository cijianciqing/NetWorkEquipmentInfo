package jsjzx.wlyw.sb004.controller;

import jsjzx.wlyw.sb004.exception.UserNotexistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {

    @ResponseBody
    @RequestMapping("/exceptionHandlerTest")
    public String testExceptionHandler(@RequestParam("name") String name) {
        if (name.equals("wqn")) {
            throw new UserNotexistException();
        }
        return "jsjzx.wlyw.sb004.controller.Test.testExceptionHandle...hello sb004!";
    }
}