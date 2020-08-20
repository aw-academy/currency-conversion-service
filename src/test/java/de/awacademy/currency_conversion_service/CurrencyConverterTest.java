package de.awacademy.currency_conversion_service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CurrencyConverterTest {

	@Test
	public void convertToEuro_USD() {
		CurrencyConverter currencyConverter = new CurrencyConverter();
		String convertToEuro = currencyConverter.convertToEuro(Currency.USD, "1");
		assertEquals("0", convertToEuro);
	}
	
	@Test
	public void convertToEuro_GBP() {
		CurrencyConverter currencyConverter = new CurrencyConverter();
		String convertToEuro = currencyConverter.convertToEuro(Currency.GBP, "1");
		assertEquals("1", convertToEuro);
	}
	
}
