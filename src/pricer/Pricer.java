package pricer;

import java.text.DecimalFormat;

public class Pricer {

    private final DecimalFormat format = new DecimalFormat("0.##");

    public String calculate(int numberOfArticles, double articlePrice, int taxesPercent) {
        double articlesRawPrice = articlePrice * numberOfArticles;
        double priceWithTaxes = calcPriceWithTaxes(taxesPercent, articlesRawPrice);

        if (articlesRawPrice > 5000) return formatPrice(calcPriceWithDiscount(priceWithTaxes, 5));

        if (articlesRawPrice > 1000) return formatPrice(calcPriceWithDiscount(priceWithTaxes, 3));

        return formatPrice(priceWithTaxes);
    }

    private double calcPriceWithDiscount(double priceWithTaxes, int discountPercent) {
        return round(priceWithTaxes - calcPriceBasedOnPercent(priceWithTaxes, discountPercent));
    }

    private String formatPrice(double price) {
        return format.format(price) + " €";
    }

    private double calcPriceWithTaxes(int taxesPercent, double articlesRawPrice) {
        return articlesRawPrice + calcPriceBasedOnPercent(articlesRawPrice, taxesPercent);
    }

    private double calcPriceBasedOnPercent(double articlesPrice, int taxesPercent) {
        return articlesPrice * taxesPercent / 100;
    }

    private double round(double price) {
        return ((int) ((price * 100.0 + 0.5))) / 100.0;
    }


}
