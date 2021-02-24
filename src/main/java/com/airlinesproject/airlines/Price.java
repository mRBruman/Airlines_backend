package com.airlinesproject.airlines;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Price {

    @Id
    private String value;
    private String currency;

    public Price(){

    }
    public Price(String value, String currency){
        this.value = value;
        this.currency = currency;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
