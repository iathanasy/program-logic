package org.cd.cls.c6.d1;

/**
 * @description: 自定义异常
 * @author: Mr.Wang
 * @create: 2019-09-02 22:43
 **/
public class AddException extends Exception {

    public AddException() {
    }

    public AddException(String message) {
        super(message);
    }

    public AddException(String message, Throwable cause) {
        super(message, cause);
    }

    public AddException(Throwable cause) {
        super(cause);
    }
}
