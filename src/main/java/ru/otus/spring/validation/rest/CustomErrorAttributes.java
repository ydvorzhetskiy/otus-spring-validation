package ru.otus.spring.validation.rest;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Component
public class CustomErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(
        WebRequest webRequest, ErrorAttributeOptions options) {
        var defaultResponse = super.getErrorAttributes(webRequest, options);
        var exception = this.getError(webRequest);
        if (exception instanceof MethodArgumentNotValidException) {
            var mex = (MethodArgumentNotValidException) exception;
            defaultResponse.put("erorrs", mex.getBindingResult().getAllErrors());
        }
        return defaultResponse;
    }
}
