package com.horoscope.restful_api_server.exceptionHandle;

import com.horoscope.restful_api_server.dto.ExceptionDto;
import com.horoscope.restful_api_server.exception.NoDataException;
import com.horoscope.restful_api_server.exception.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ExceptionDto> notFoundException(NotFoundException notFoundException) {
        ExceptionDto exceptionDto = new ExceptionDto();
        exceptionDto.setMsg(notFoundException.getMessage());
        return ResponseEntity.status(404).body(exceptionDto);
    }

    @ExceptionHandler(NoDataException.class)
    public ResponseEntity<ExceptionDto> noDataException(NoDataException noDataException) {
        ExceptionDto exceptionDto = new ExceptionDto();
        exceptionDto.setMsg(noDataException.getMessage());
        return ResponseEntity.status(404).body(exceptionDto);
    }
}
