
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kamen
 */
public class CSVRecord {
    
    String action;
    String date;
    String ticker;
    String name;
    Double numberOfShares;
    Double pricePerShare;
    String currency;
    Double exchangeRate;
    Double result;
    Double totalCost;
	Double withholdingTax;
	String withholdingTaxCurrency;
	Double chargeAmount;
	Double depositFee;
    Double currencyConverstionFee;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(Double numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public Double getPricePerShare() {
        return pricePerShare;
    }

    public void setPricePerShare(Double pricePerShare) {
        this.pricePerShare = pricePerShare;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }
	
	public Double getWithholdingTax() {
		return withholdingTax;
	}

	public void setWithholdingTax(Double withholdingTax) {
		this.withholdingTax = withholdingTax;
	}

	public String getWithholdingTaxCurrency() {
		return withholdingTaxCurrency;
	}

	public void setWithholdingTaxCurrency(String withholdingTaxCurrency) {
		this.withholdingTaxCurrency = withholdingTaxCurrency;
	}

	public Double getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(Double chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public Double getDepositFee() {
		return depositFee;
	}

	public void setDepositFee(Double depositFee) {
		this.depositFee = depositFee;
	}

    public Double getCurrencyConverstionFee() {
        return currencyConverstionFee;
    }

    public void setCurrencyConverstionFee(Double currencyConverstionFee) {
        this.currencyConverstionFee = currencyConverstionFee;
    }
    
    
}
