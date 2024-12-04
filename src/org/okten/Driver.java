package org.okten;

import lombok.*;

@Data
@Builder
public class Driver {

    private final String name;

    private License license;
}
