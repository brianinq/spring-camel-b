package com.example.cameldemob.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class CurrencyConverter {
    private String id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
}
