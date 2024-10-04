package com.samin.mbox.admin.controller;

import com.samin.mbox.common.vo.BaseResponse;
import com.samin.mbox.common.vo.PageRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class MessageUserController {

    @PostMapping("/page")
    public BaseResponse<Void> page(PageRequest request) {
        return BaseResponse.success();
    }
}