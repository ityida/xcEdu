package com.xuecheng.framework.domain.course.response;

import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/2
 */
@Data
@NoArgsConstructor
@ToString
public class CoursePublishResult extends ResponseResult {
    /**
     * 页面预览的url，必须得到页面id才可以拼装
     */
    String previewUrl;
    public CoursePublishResult(ResultCode resultCode, String previewUrl) {
        super(resultCode);
        this.previewUrl = previewUrl;
    }
}
