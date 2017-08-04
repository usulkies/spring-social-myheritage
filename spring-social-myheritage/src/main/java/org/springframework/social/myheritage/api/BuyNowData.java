package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class BuyNowData extends MyHeritageObject{

    private String transactionGuid;
    private Integer productTypeID;
    private String last4Digits;
    private String creditCardType;


    public BuyNowData(String className, String transactionGuid, Integer productTypeID, String last4Digits, String creditCardType) {
        super(className);
        this.transactionGuid = transactionGuid;
        this.productTypeID = productTypeID;
        this.last4Digits = last4Digits;
        this.creditCardType = creditCardType;
    }

    public String getTransactionGuid() {
        return transactionGuid;
    }

    public void setTransactionGuid(String transactionGuid) {
        this.transactionGuid = transactionGuid;
    }

    public Integer getProductTypeID() {
        return productTypeID;
    }

    public void setProductTypeID(Integer productTypeID) {
        this.productTypeID = productTypeID;
    }

    public String getLast4Digits() {
        return last4Digits;
    }

    public void setLast4Digits(String last4Digits) {
        this.last4Digits = last4Digits;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }
}
