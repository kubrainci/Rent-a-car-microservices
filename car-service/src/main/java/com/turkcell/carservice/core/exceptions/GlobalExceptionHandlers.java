package com.turkcell.carservice.core.exceptions;

import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandlers {

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public List<String> handleValidationException(MethodArgumentNotValidException exception) {

        List<String> errors = new ArrayList<>();
        // Bize gelen exception içindeki resultu aldık
        // İçindeki errorları aldık. Çünkü birden fazla validasyon hatası olabilir
        // Bu errorları tek tek gez ve bu errordaki field'ın ismini al,hangi alan için bu error fırlamış
        // Bu alan için fırlayan error'un mesajı ne?
        // Field ve error mesajı birleştir.
        List<ObjectError> exceptions = exception.getBindingResult().getAllErrors();
        for (ObjectError error : exceptions) {
            // Errorun tipini FieldError a cast ettik.
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            String message = fieldName + " : " + errorMessage;
            errors.add(message);
        }
        return errors;
    }

}
