package de.awacademy.currency_conversion_service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
	
	private final Map<Currency, BigDecimal> euroRateMap = new HashMap<Currency, BigDecimal>();
	
	public CurrencyConverter() {
		euroRateMap.put(Currency.USD, new BigDecimal("0.84")); // 1 USD would be 0.84 Euro
		euroRateMap.put(Currency.GBP, new BigDecimal("1.11")); // 1 GBP would be 1.11 Euro
	}
	
	
	public String convertToEuro(Currency sourceCurrency, String sourceValue) {
		BigDecimal value = new BigDecimal(sourceValue);
		BigDecimal rate = euroRateMap.get(sourceCurrency);
		
		BigDecimal result = value.multiply(rate).setScale(0, RoundingMode.FLOOR);
		
		return result.toString();
	}
	
}
