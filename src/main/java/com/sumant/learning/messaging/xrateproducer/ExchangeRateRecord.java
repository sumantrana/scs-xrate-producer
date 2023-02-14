package com.sumant.learning.messaging.xrateproducer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExchangeRateRecord {

    String fromCurrency;
    String toCurrency;
    Double rate;
}
