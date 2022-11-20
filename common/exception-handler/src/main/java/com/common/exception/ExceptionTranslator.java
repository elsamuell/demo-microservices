package com.common.exception;

import com.common.aware.ErrorAware;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@Slf4j
@RestControllerAdvice
@RequiredArgsConstructor
public class ExceptionTranslator {


    @SneakyThrows
    @ExceptionHandler(FeignException.class)
    public ErrorAware<String> handleFeignStatusException(FeignException e, HttpServletResponse response) {
            response.setStatus(e.status());
            ObjectMapper mapper = new ObjectMapper();
            HashMap<String, Object> map;
            map = mapper.readValue(e.contentUTF8(), HashMap.class);
            String message = map.get("message").toString();
            return ErrorAware.of(message);

    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorAware<String[]> processArgumentNotValidException(MethodArgumentNotValidException e, HttpServletRequest request) {

        String[] errMsg = e.getBindingResult().getFieldErrors()
                .stream()
                .map(t-> t.getField() + " : " + t.getDefaultMessage())
                .toArray(String[]::new);
        return ErrorAware.of(errMsg);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorAware<String> processUserException(IllegalArgumentException e, HttpServletRequest request) {
        return ErrorAware.of(e.getMessage());
    }

    @ExceptionHandler(value = {Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorAware<String> processGenericException(Exception e, HttpServletRequest request) {
        log.info(e.getMessage());
        return ErrorAware.of(e.getMessage());
    }

}
