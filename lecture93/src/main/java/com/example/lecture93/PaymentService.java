package com.example.lecture93;

import org.springframework.stereotype.Component;

@Component


public class PaymentService {
    private OrderzService orderzService;
    public PaymentService(OrderzService orderzService) {
        this.orderzService = orderzService;
    }
    public void pay() {
        orderzService.getOrderz();
        System.out.println("Orderz from PaymentService");
    }


}
