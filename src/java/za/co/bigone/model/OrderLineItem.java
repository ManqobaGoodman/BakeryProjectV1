package za.co.bigone.model;

import java.util.Objects;

public class OrderLineItem {
    private int orderlineid;
    private Product product;
    private int quantity;

    public OrderLineItem() {
      
    }

    public OrderLineItem(int orderlineid, Product product, int quantity) {
        this.orderlineid = orderlineid;
        this.product = product;
        this.quantity = quantity;
    }

   public OrderLineItem(Product product, int quantity) {
       this(0,product, quantity);
   }
    
    
    /**
     * @return the orderlineid
     */
    public int getOrderlineid() {
        return orderlineid;
    }

    /**
     * @param orderlineid the orderlineid to set
     */
    public void setOrderlineid(int orderlineid) {
        this.orderlineid = orderlineid;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderLineItem{" + "orderlineid=" + orderlineid + ", product=" + product + ", quantity=" + quantity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.product);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrderLineItem other = (OrderLineItem) obj;
        return !Objects.equals(this.product, other.product);    }

}
