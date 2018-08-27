package com.tianff.springbootwebdemo.json.alias.web;

import com.tianff.springbootwebdemo.json.alias.vo.TestReqParam;
import com.tianff.springbootwebdemo.json.alias.vo.UserVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/param/test")
    public Object test4ParamObj(TestReqParam reqParam) {
        UserVo userVo = new UserVo();
        userVo.setName(reqParam.getName());
        userVo.setId(reqParam.getId());
        return userVo;
    }

    @GetMapping("/json/field")
    public Object test4JacksonFiledName() {
        UserVo userVo = new UserVo();
        userVo.setId(10);
        userVo.setName("Alice");
        return userVo;
    }
}
