/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.model;

/**
 *
 * @author student02
 */
public class EmailInvoice {
    private int personid;
    private String emailmessage;

    public EmailInvoice() {
    }
    
    

    public EmailInvoice(int personid, String emailmessage) {
        this.personid = personid;
        this.emailmessage = emailmessage;
    }

    /**
     * @return the personid
     */
    public int getPersonid() {
        return personid;
    }

    /**
     * @param personid the personid to set
     */
    public void setPersonid(int personid) {
        this.personid = personid;
    }

    /**
     * @return the emailmessage
     */
    public String getEmailmessage() {
        return emailmessage;
    }

    /**
     * @param emailmessage the emailmessage to set
     */
    public void setEmailmessage(String emailmessage) {
        this.emailmessage = emailmessage;
    }
}
