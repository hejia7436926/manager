package com.leyou.common.vo;

import com.leyou.common.enums.ExceptionEnums;
import lombok.Data;

/**
 * @version : 1.0
 * @ClassName: ExceptionResult
 * @Description :
 * @auther: hejia
 * @date: 2019/3/28
 */
@Data
public class ExceptionResult {

    private int status;

    private String message;

    private Long timestamp;

    public ExceptionResult(ExceptionEnums em) {
        this.status = em.getCode();
        this.message = em.getMsg();
        this.timestamp = System.currentTimeMillis();
    }
}
