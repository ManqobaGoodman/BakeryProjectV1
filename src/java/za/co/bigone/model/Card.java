package za.co.bigone.model;

public class Card {

    private String cardHolder;
    private String cvv;
    private String cardNum;
    private int paymentid;
    
    
     public Card() {
    }
   

    /**
     * @return the cardHolder
     */
    public String getCardHolder() {
        return cardHolder;
    }

    /**
     * @param cardHolder the cardHolder to set
     */
    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    /**
     * @return the cvv
     */
    public String getCvv() {
        return cvv;
    }

    /**
     * @param cvv the cvv to set
     */
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    /**
     * @return the cardNum
     */
    public String getCardNum() {
        return cardNum;
    }

    /**
     * @param cardNum the cardNum to set
     */
    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }
        /**
     * @return the paymentid
     */
    public int getPaymentid() {
        return paymentid;
    }

    /**
     * @param paymentid the paymentid to set
     */
    public void setPaymentid(int paymentid) {
        this.paymentid = paymentid;
    }

    public Card(String cardHolder, String cvv, String cardNum) {
        this.cardHolder = cardHolder;
        this.cvv = cvv;
        this.cardNum = cardNum;
    }


    public String toString() {
        return "Card{" + "cardHolder=" + cardHolder + ", cvv=" + cvv + ", cardNum=" + cardNum + '}';
    }



}
