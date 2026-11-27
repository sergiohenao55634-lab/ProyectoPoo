public class Sale {
    String saleID;
    String timestamp;
    double totalAmount;

    public Sale(String saleID, String timestamp, double totalAmount) {
        this.saleID = saleID;
        this.timestamp = timestamp;
        this.totalAmount = totalAmount;
    }

    public String getSaleID() {
        return saleID;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
