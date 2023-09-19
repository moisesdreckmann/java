package orgMoises._SpringRestNuvem.exception;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptions {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handlerBusinessException(IllegalArgumentException businessException) {
        return new ResponseEntity<>(businessException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handlerNotFound(NoSuchElementException notFoundException) {
        return new ResponseEntity<>("not found", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> unexpectedException(Throwable unexpectedException) {
        return new ResponseEntity<>("unexpected Exception", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
