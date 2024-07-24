package com.pawfectly.vetcardtracker.functions.test;

import com.pawfectly.common.dto.ApiResultModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    /**
     * Handles GET requests to "/hello-world" and returns an {@link ApiResultModel} representing the result.
     *
     * @return An {@link ApiResultModel} object with a success status, a message, and result data.
     */
    @GetMapping("hello-world")
    @ResponseStatus(HttpStatus.OK)
    public ApiResultModel helloWorld() {
        return ApiResultModel.builder()
                .isSuccess(true)
                .message("Test Vet Tracker Controller")
                .resultData("result data test")
                .build();
    }
}
