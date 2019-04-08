package com.leyou.common.enums;

import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @version : 1.0
 * @ClassName: ExceptionEnums
 * @Description :
 * @auther: hejia
 * @date: 2019/3/28
 */
//@AllArgsConstructor
//@NoArgsConstructor
public enum  ExceptionEnums {
    PRICE_CANNOT_BE_NULL(400,"价格不能为空"),

    ;
    private int code;
    private String msg;

    ExceptionEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    /**
     * @param code code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
