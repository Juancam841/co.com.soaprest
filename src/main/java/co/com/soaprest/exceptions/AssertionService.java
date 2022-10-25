package co.com.soaprest.exceptions;

public class AssertionService extends AssertionError {

    private static final long serialVersionUID=1L;

    public static final String THE_STATUS_CODE_SERVICE_IS_NOT_EXPECTED = "The Status Code Service Response Is Not Expected";
    public static final String QUANTITY_SERVICE_RESPONSE_IS_NOT_EXPECTED = "Quantity Service Response Is Not Expected";
    public static final String THE_SCHEMA_SERVICE_RESPONSE_IS_NOT_EXPECTED = "The Schema Service Response Is Not Expected";
    public static final String FIELDS_SERVICE_RESPONSE_IS_NOT_EXPECTED = "The Fields Service Response Is Not Expected";
    public static final String CONTENT_DATA_SERVICE_RESPONSE_IS_NOT_EXPECTED = "The Content Data Service Response Is Not Expected";

    public AssertionService(String message, Throwable cause) {
        super(message, cause);
    }

    public AssertionService(String message) {
        super(message);
    }
}
