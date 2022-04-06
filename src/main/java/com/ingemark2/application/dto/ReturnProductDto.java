package com.ingemark2.application.dto;

import java.math.BigDecimal;

public interface ReturnProductDto {

    String getCode();
    String getName();
    BigDecimal getPriceHrk();
    String getDescription();
    boolean getAvailable();
}
