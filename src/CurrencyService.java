import java.util.LinkedHashMap;
import java.util.Map;

public class CurrencyService {

    // Stores exchange rates relative to EUR (Base currency = 1.0)
    private final Map<String, Double> exchangeRates;

    public CurrencyService() {
        // Using LinkedHashMap to keep the exact order of currencies in the dropdown
        exchangeRates = new LinkedHashMap<>();
        exchangeRates.put("EUR - Euro", 1.0);
        exchangeRates.put("USD - US Dollar", 1.08);
        exchangeRates.put("GBP - British Pound", 0.85);
        exchangeRates.put("JPY - Japanese Yen", 162.50);
        exchangeRates.put("CHF - Swiss Franc", 0.96);
    }

    // Returns the list of available currencies for the UI dropdowns
    public String[] getAvailableCurrencies() {
        return exchangeRates.keySet().toArray(new String[0]);
    }

    // Converts the amount from one currency to another
    public double convert(double amount, String fromCurrency, String toCurrency) {
        double rateFrom = exchangeRates.get(fromCurrency);
        double rateTo = exchangeRates.get(toCurrency);

        // First convert to base currency (EUR), then to target currency
        return (amount / rateFrom) * rateTo;
    }
}