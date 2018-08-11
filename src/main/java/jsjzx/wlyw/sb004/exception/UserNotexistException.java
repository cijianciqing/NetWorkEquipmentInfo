package jsjzx.wlyw.sb004.exception;

public class UserNotexistException extends RuntimeException {
    public UserNotexistException(){
        super("user not exit in UserNotexistException");
    }
}
