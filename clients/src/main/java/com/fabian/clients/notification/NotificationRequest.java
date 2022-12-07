package com.fabian.clients.notification;

public class NotificationRequest {
    private int toCustomerId;
    private String toCustomerName;
    private String message;

    public NotificationRequest() {
    }

    public NotificationRequest(int toCustomerId, String toCustomerName, String message) {
        this.toCustomerId = toCustomerId;
        this.toCustomerName = toCustomerName;
        this.message = message;
    }

    public int getToCustomerId() {
        return toCustomerId;
    }

    public String getToCustomerName() {
        return toCustomerName;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Notification {" +
                "toCustomerId=" + toCustomerId +
                ", toCustomerName='" + toCustomerName + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
