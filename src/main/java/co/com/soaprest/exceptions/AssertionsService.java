package co.com.soaprest.exceptions;

public class AssertionsService extends AssertionError {
    private static final long serialVersionUID = 1L;

    public static final String THE_STATUS_CODE_SERVICE_IS_NOT_EXPECTED = "The Status Code Service Response Is Not Expected";
    public static final String QUANTITY_SERVICE_RESPONSE_IS_NOT_EXPECTED = "Quantity Service Response Is Not Expected";
    public static final String THE_SCHEMA_SERVICE_RESPONSE_IS_NOT_EXPECTED = "The Schema Service Response Is Not Expected";
    public static final String FIELDS_SERVICE_RESPONSE_IS_NOT_EXPECTED = "The Fields Service Response Is Not Expected";
    public static final String CONTENT_DATA_SERVICE_RESPONSE_IS_NOT_EXPECTED = "The Content Data Service Response Is Not Expected";
    public static final String THE_FIELDS_SERVICE_IS_NOT_EXPECTED = "The fields services response is not expected";
    public static final String SCHEMA_SERVICE_IS_NOT_EXPECTED = "Schema service response is not expected";
    public static final String QUANTITY_FIELDS_SERVICE_IS_NOT_EXPECTED = "Quantity fields services is not expected";
    public static final String THE_FIELDS_AND_VALUES_POST_SERVICE_IS_NOT_EXPECTED = "The fields and values post services response is not expected";

    public AssertionsService(String message, Throwable cause) {
        super(message, cause);
    }

    public AssertionsService(String message) {
        super(message);
    }
}
