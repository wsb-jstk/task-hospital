package com.external.vendor.sms;

public interface SmsGateway {

    void send(String phoneNumber, String text);

}
