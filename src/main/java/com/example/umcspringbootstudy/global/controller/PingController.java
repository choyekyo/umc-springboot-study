package com.example.umcspringbootstudy.global.controller;

import com.example.umcspringbootstudy.global.apiPayload.ApiResponse;
import com.example.umcspringbootstudy.global.apiPayload.code.GeneralSuccessCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    @GetMapping("/api/ping")
    public ApiResponse<String> ping() throws Exception {
        return ApiResponse.onSuccess(GeneralSuccessCode.OK, "pong");
    }
}
