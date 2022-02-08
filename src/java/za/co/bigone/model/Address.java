/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.model;

/**
 *
 * @author Student24
 */
public class Address {

    private int addressId;
    private String address1;
//private String address2;
    private String town;
    private int postalCode;
//private String province;

    public Address() {
    }

    public Address(String address1, String address2, String town, int postalCode, String province) {
        this.address1 = address1;
        //this.address2 = address2;
        this.town = town;
        this.postalCode = postalCode;
        //this.province = province;
    }

    /**
     * @return the addressId
     */
    public int getAddressId() {
        return addressId;
    }

    /**
     * @param addressId the addressId to set
     */
    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    /**
     * @return the address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * @param address1 the address1 to set
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * @return the town
     */
    public String getTown() {
        return town;
    }

    /**
     * @param town the town to set
     */
    public void setTown(String town) {
        this.town = town;
    }

    /**
     * @return the postalCode
     */
    public int getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * @return the province
     */
//    public String getProvince() {
//        return province;
//    }
//
//    /**
//     * @param province the province to set
//     */
//    public void setProvince(String province) {
//        this.province = province;
//    }
}
