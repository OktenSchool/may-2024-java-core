package org.okten;

import lombok.Builder;

// immutable class
@Builder(toBuilder = true)
public record License(Integer number, String code, String issuedBy) {

}
