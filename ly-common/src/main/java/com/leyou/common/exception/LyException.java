package com.leyou.common.exception;

import com.leyou.common.enums.ExceptionEnums;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @version : 1.0
 * @ClassName: LyException
 * @Description :
 * @auther: hejia
 * @date: 2019/3/28
 */
@NoArgsConstructor
@AllArgsConstructor
public class LyException extends RuntimeException {

    private ExceptionEnums exceptionEnums;

    public void setExceptionEnums(ExceptionEnums exceptionEnums) {
        this.exceptionEnums = exceptionEnums;
    }

    public ExceptionEnums getExceptionEnums() {
        return exceptionEnums;
    }
}
