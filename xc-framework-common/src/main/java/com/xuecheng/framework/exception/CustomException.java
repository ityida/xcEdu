package com.xuecheng.framework.exception;

import com.xuecheng.framework.model.response.ResultCode;

/**
 * @Describle:自定义异常类型
 * @Author:zhangyifei
 * @Date:2018/11/7
 */
public class CustomException extends RuntimeException{
    /**
     * 错误代码
     */
    ResultCode resultCode;

    public CustomException(ResultCode resultCode){
        this.resultCode = resultCode;
    }
    public ResultCode getResultCode(){
        return resultCode;
    }
}
