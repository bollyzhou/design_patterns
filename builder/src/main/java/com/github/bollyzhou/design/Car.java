package com.github.bollyzhou.design;

/**
 * 产品，产品是由多个部分组成的
 * 如，车，是由车身，车座，和轮胎组成。可以将这几个不服单独构造
 */
//需要生产的产品-车；
public class Car {
    private String body;
    private String seat;
    private String tire;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }
}
