package org.springframework.social.myheritage.api;

/**
 * Created by Uziel Sulkies on 04/08/2017.
 */
public enum OrderStatus {
    ORDER_PENDING(100),
    ORDER_PAID(200),
    ORDER_SENT_TO_FULFILMENT(1000),
    ORDER_FULFILMENT_CANCELED(2000),
    FULFILMENT_CREATE_ORDER_ERROR(3000),
    ORDER_SHIPPED_TO_RECIPIENT(4000),
    PROVIDED_WITHOUT_SHIPPING(7000),
    LAB_NOT_RECEIVED(20000),
    LAB_RECEIVED(20100),
    LAB_ISOLATION(20200),
    LAB_ANALYSIS(20300),
    LAB_QC(20500),
    LAB_UPDATED(20600),
    LAB_ERROR(21000);
    private int statusCode;

    OrderStatus(int statusCode) {
        this.statusCode = statusCode;
    }

}
