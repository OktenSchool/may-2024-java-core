package org.okten;

import lombok.Data;

@Data
public class Vehicle implements Movable {

    private String content;

    @Override
    public void move() {
        System.out.println("Vehicle is moving...");
    }
}
