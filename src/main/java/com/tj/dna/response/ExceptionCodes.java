package com.tj.dna.response;

public enum ExceptionCodes {

    MERCHANT_NOT_EXIST("001", "Merchant not exist", "Something went wrong. Please contact to the administration"),
    INVALID_FROM_AND_TO_DATE("002", "From date should be less than To Date", "Invalid input parameters"),
    INVALID_CPR_STATUS("003", "Invalid CPR status", "Something went wrong. Please contact to the administration"),
    CPR_NOT_EXIST("004", "CPR not exist", "Something went wrong. Please contact to the administration"),
    INVALID_OPERATION("005", "Invalid operation", "Something went wrong. Please contact to the administration"),
    DISPUTE_ALREADY_EXIST("006", "Dispute already raised on this transaction", "Dispute already raised"),
    DISPUTE_NOT_EXIST("007", "Dispute not exist", "Something went wrong. Please contact to the administration"),
    TRANSACTIONS_NOT_EXIST("008", "Transactions not exist", "Something went wrong. Please contact to the administration"),
    LOADSHEET_NOT_EXIST("009", "Load Sheet not exist", "Something went wrong. Please contact to the administration"),
    SUB_MERCHANT_NOT_CREATED("010", "Sub Merchant not created", "Something went wrong. Please contact to the administration"),
    SUB_MERCHANT_EMAIL_ALREADY_EXIST("011", "Sub Merchant already exist with this email address", "Email already exist"),
    SUB_MERCHANT_NOT_EXIST("012", "Sub Merchant not exist", "Something went wrong. Please contact to the administration"),
    TRANSACTION_NOT_EXIST("013", "Transaction not exist", "Something went wrong. Please contact to the administration"),
    INVALID_MERCHANT_STAFF("014", "Invalid merchant staff", "Something went wrong. Please contact to the administration"),
    INVALID_REQUEST_PARAMETERS("015", "Invalid request parameters", "Something went wrong. Please contact to the administration"),
    PACKAGE_NOT_EXIST("016", "Package with new status not exist", "Something went wrong. Please contact to the administration"),
    SERVICE_NOT_EXIST("017", "Service not exist", "Something went wrong. Please contact to the administration"),
    R2P_NOT_EXIST("018", "R2P not exist", "Something went wrong. Please contact to the administration"),
    R2P_STATUS_NOT_NEW("019", "R2P status is not new", "Something went wrong. Please contact to the administration"),
    REMARK_NOT_EXIST("020", "Remark not exist", "Something went wrong. Please contact to the administration"),
    USER_CAN_NOT_UPDATE_REMARK("021", "User can not update this remark", "Something went wrong. Please contact to the administration"),
    TRANSACTION_STATUS_MESSAGE_NOT_EXIST("022", "Transaction status message not exist", "Something went wrong. Please contact to the administration"),
    MERCHANT_INACTIVE("023", "Merchant inactive", "Merchant inactive"),
    INVALID_CREDENTIALS("024", "Invalid user credentials", "Invalid credential"),
    USER_NOT_EXIST("025", "User not exist", "Something went wrong. Please contact to the administration"),
    INVALID_PASSWORD("026", "Invalid Password", "Invalid password"),
    INVALID_OTP("027", "Invalid OTP", "Invalid OTP"),
    INVALID_AUTH_TOKEN("028", "Invalid auth token", "Something went wrong. Please contact to the administration"),
    SIGNUP_REQUEST_EXIST("029", "Signup request already exist", "Signup request already exist"),
    MERCHANT_STATUS_PENDING("030", "Merchant status pending", "Something went wrong. Please contact to the administration"),
    MERCHANT_STATUS_SUSPENDED("031", "Merchant status suspended", "Something went wrong. Please contact to the administration"),
    MERCHANT_STATUS_CHANGE_NOT_FOUND("032", "Same merchant status", "Something went wrong. Please contact to the administration"),
    MERCHANT_ADDRESS_ALREADY_EXIST("033", "Merchant address already exist", "Address already exist"),
    MERCHANT_ADDRESS_NOT_EXIST("034", "Merchant address not exist", "Address not exist"),
    SPECIAL_REQUEST_EXIST("035", "Special request already raised on this transaction", "Special request already raised"),
    INVALID_PAYMENT_VALUE("036", "Received amount cannot be less than zero or greater than order amount", "Something went wrong, please contact to the administration"),
    RIDER_NOT_SPECIFIED("037", "Rider is not specified", "Something went wrong, please contact to the administration"),
    RIDER_CITY_NOT_SPECIFIED("038", "Rider city is not specified", "Something went wrong, please contact to the administration"),
    MERCHANT_PICKUP_NOT_EXIST("039", "Merchant pickup not exist", "Something went wrong, please contact to the administration"),
    CPR_NOT_SETTLED("040", "Last Cash Payment Receipt is not settled", "Something went wrong, please contact to the administration"),
    MERCHANT_HOLD_SETTLEMENT("041", "Cannot generate Cpr, merchant settlements is on hold", "Something went wrong, please contact to the administration"),
    USER_EMAIL_ALREADY_EXIST("042", "User email already exists for creating user", "User email already exists"),
    CONNECTOR_CODE_ALREADY_EXIST("043", "External connector code already exists for creating external connector", "External connector code already exists"),
    EXTERNAL_CONNECTOR_NOT_EXIST("044", "External connector not exists", "Something went wrong, please contact to the administration"),
    MERCHANT_NAME_ALREADY_EXIST("045", "Merchant name already exists for creating merchant", "Merchant name already exists"),
    JASPER_SESSION_ID_NOT_FOUND("046", "Jasper session id not found from jasper server", "Something went wrong. Please contact to the administration"),
    MU_STATUS_NOT_NEW("047", "Master unit status is not new", "Something went wrong. Please contact to the administration"),
    MU_STATUS_NOT_RECEIVED("048", "Master unit status is not received", "Something went wrong. Please contact to the administration"),
    TRANSACTION_ORIGIN_CITY_NOT_SPECIFIED("049", "Transaction origin city is not specified", "Something went wrong, please contact to the administration"),
    TRANSACTION_DESTINATION_CITY_NOT_SPECIFIED("050", "Transaction destination city is not specified", "Something went wrong, please contact to the administration"),
    SHEET_NOT_EXISTS("051", "Sheet does not exists", "Something went wrong, please contact to the administration"),
    TRANSACTION_WAREHOUSE_NOT_SPECIFIED("052", "Transaction warehouse is not specified", "Something went wrong, please contact to the administration"),

    VALIDATION_FAILED("400", "Validation Fail", "Request validation fail. Please contact to the administration"),
    UNAUTHORIZED("401", "Unauthorized", "Unauthorized"),
    NOT_FOUND("404", "Not Found", "Something went wrong. Please contact to the administration"),
    SUCCESS("200", "Request Success", "Success"),
    CREATED("201", "Created", "Created"),
    FORBIDDEN("403", "Forbidden", "Something went wrong. Please contact to the administration"),
    INTERNAL_SERVER_ERROR("500", "Internal Server Error", "Something went wrong. Please contact to the administration");

    private final String statusMessage;
    private final String statusCode;
    private final String detail;

    ExceptionCodes(String statusCode, String detail, String statusMessage) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
        this.detail = detail;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public String getDetail() {
        return detail;
    }
}
