package jsjzx.wlyw.sb004.controller;

import jsjzx.wlyw.sb004.exception.UserNotexistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String handlerAll(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        map.put("code","administrator's Msg");
        map.put("message","there is something wrong during your working");

        request.setAttribute("ext",map);
        request.setAttribute("javax.servlet.error.status_code",555);

        return "forward:/error";
    }

    @ExceptionHandler(UserNotexistException.class)
    public String handleUsernotexistException(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        map.put("code","user.not exist");
        map.put("message","user is not exist in ExceptionHandler");

        request.setAttribute("ext",map);
        request.setAttribute("javax.servlet.error.status_code",555);

        return "forward:/error";
    }
}
