public class SaleItem {
    int quantitySold;
    double unitPrice;
    
    public SaleItem(int quantitySold, double unitPrice) {
        this.quantitySold = quantitySold;
        this.unitPrice = unitPrice;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getTotalPrice() {
        return quantitySold * unitPrice;
    }
}

