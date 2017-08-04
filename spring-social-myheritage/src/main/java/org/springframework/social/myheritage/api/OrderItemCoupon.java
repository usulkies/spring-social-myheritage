package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.util.List;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class OrderItemCoupon extends MyHeritageObject {

    public enum DiscountType {
        PERCENT,
        AMOUNT,
        DURATION,
        RAW_PRICE,
        FREE_ADDON,
        GIFT_CARD,
        CREDITS
    }
    private final String id;
    private String code;
    private final DiscountType discountType;
    private String discount;
    private List<KeyVal> params;



    public OrderItemCoupon(String className, String id, String code, DiscountType discountType, String discount, List<KeyVal> params) {
        super(className);
        this.id = id;
        this.code = code;
        this.discountType = discountType;
        this.discount = discount;
        this.params = params;
    }

    public String getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DiscountType getDiscountType() {
        return discountType;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public List<KeyVal> getParams() {
        return params;
    }

    public void setParams(List<KeyVal> params) {
        this.params = params;
    }

    private class KeyVal extends MyHeritageObject{
        private String key;
        private String value;

        public KeyVal(String className, String key, String value) {
            super(className);
            this.key = key;
            this.value = value;
        }
    }
}
