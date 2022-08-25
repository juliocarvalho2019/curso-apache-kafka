package com.julio.paymentservice.service;

import com.julio.paymentservice.model.Payment;

public interface PaymentService {
    void sendPayment(Payment payment);
}
