package br.com.delogic.asd.repository.sql;

public class Order {

    private final String key;
    private final String value;

    public Order(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

}
