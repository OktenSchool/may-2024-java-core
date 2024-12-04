package org.okten;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum VehicleType {

    BUS("автобус"),
    CAR("автомобіль"),
    TRUCK("вантажівка");

    private final String translation;
}
