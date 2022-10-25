package co.com.soaprest.exceptions;

public class ErrorServiceException extends RuntimeException{

    public ErrorServiceException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
