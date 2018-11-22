package com.xuecheng.manage_cms.controller;

import com.xuecheng.api.dictionary.SysDictionaryControllerApi;
import com.xuecheng.framework.domain.system.SysDictionary;
import com.xuecheng.manage_cms.service.SysDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/21
 */
@RestController
@RequestMapping("/sys/dictionary")
public class SysDictionaryController implements SysDictionaryControllerApi {
    @Autowired
    SysDictionaryService sysDictionaryService;

    /**
     * 根据字典分类id查询字典信息
     * @param dType
     * @return
     */
    @Override
    @GetMapping("/get/{dType}")
    public SysDictionary getByType(@PathVariable("dType") String dType) {
        return sysDictionaryService.findDictionaryByType(dType);
    }
}
