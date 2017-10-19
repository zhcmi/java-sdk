package com.zhcmi.java.sdk.tool;

/**
 * Created by xhw on 2017/09/06.
 */
public class Code {

    private Integer code;
    private String message;

    public Code(){
    }

    public Code(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
