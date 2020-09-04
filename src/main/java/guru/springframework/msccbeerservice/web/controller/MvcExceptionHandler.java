package guru.springframework.msccbeerservice.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class MvcExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List> validateData(ConstraintViolationException cve) {

        List<String> listErrors = new ArrayList<>();

        cve.getConstraintViolations().forEach(e -> {
            listErrors.add(e.toString());
        });

        return new ResponseEntity<>(listErrors, HttpStatus.BAD_REQUEST);

    }

}
