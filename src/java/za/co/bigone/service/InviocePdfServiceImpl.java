/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bigone.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import za.co.bigone.DAO.AddressDAO;
import za.co.bigone.DAO.AddressDAOImpl;
import za.co.bigone.DAO.InvoiceDAO;
import za.co.bigone.DAO.InvoiceDAOImpl;
import za.co.bigone.DAO.OrderDAO;
import za.co.bigone.DAO.OrderDAOImpl;
import za.co.bigone.DAO.OrderLineItemDAO;
import za.co.bigone.DAO.OrderLineItemDaoImpl;
import za.co.bigone.DAO.PersonDAO;
import za.co.bigone.DAO.PersonDAOImpl;
import za.co.bigone.manager.DBPoolManagerBasic;
import za.co.bigone.model.Address;
import za.co.bigone.model.Invoice;
import za.co.bigone.model.Order;
import za.co.bigone.model.OrderLineItem;
import za.co.bigone.model.Person;

/**
 *
 * @author Student24
 */
public class InviocePdfServiceImpl implements InvoicePDFService {

    PDDocument invc;
    DBPoolManagerBasic dbm;
    OrderDAO orderDAO;
    AddressDAO addressDAO;
    PersonDAO personDAO;
    OrderLineItemDAO orderLineItemDAO;
    InvoiceDAO invoiceDAO;

    public InviocePdfServiceImpl(DBPoolManagerBasic dbm) {
        this.dbm = dbm;
        this.orderDAO = new OrderDAOImpl(dbm);
        this.addressDAO = new AddressDAOImpl(dbm);
        this.orderLineItemDAO = new OrderLineItemDaoImpl(dbm);
        this.personDAO = new PersonDAOImpl(dbm);
        this.invoiceDAO = new InvoiceDAOImpl(dbm);
    }

    @Override
    public boolean createpdf(int oderId) {
        boolean isCreate = false;
        Order order = orderDAO.getOrder(oderId);
        //Create Document
        invc = new PDDocument();
        //Create Blank Page
        PDPage newpage = new PDPage();
        //Add the blank page
        invc.addPage(newpage);
        String SubTitle = new String("Invoice");
        double total = 0;
        double price = 0;
        
        List<OrderLineItem> orderLineList = orderLineItemDAO.viewOrderLineItems(order.getOrderid());
        Address address = addressDAO.viewAddress1(order.getAddressid());

        //get the page
        PDPage mypage = invc.getPage(0);

        if (order.getOrderid() != 0) {
            try {
                PDImageXObject image = PDImageXObject.createFromFile("./img/brl_logo.jpg", invc);
                //Prepare Content Stream
                PDPageContentStream cs = new PDPageContentStream(invc, mypage);
                cs.beginText();
                cs.setFont(PDType1Font.TIMES_ROMAN, 18);
                cs.newLineAtOffset(60, 690);
                cs.showText(SubTitle);
                cs.endText();

                //Writing Multiple Lines
                //writing the business details ------------------------------------------------------------------------
                cs.beginText();
                cs.setFont(PDType1Font.TIMES_ROMAN, 14);
                cs.setLeading(20f);
                cs.newLineAtOffset(60, 610);
                cs.showText("From");
                cs.endText();

                cs.drawXObject(image, 480,600,70,50);

                cs.beginText();
                cs.setFont(PDType1Font.TIMES_ROMAN, 16);
                cs.setLeading(20f);
                cs.newLineAtOffset(60, 590);
                cs.showText("Mrs Pats Cake");
                cs.endText();

                cs.beginText();
                cs.setFont(PDType1Font.TIMES_ROMAN, 14);
                cs.setLeading(20f);
                cs.newLineAtOffset(60, 570);
                cs.showText("Pats@gmail.com");
                cs.newLine();
                cs.showText("322 15th Road");
                cs.newLine();
                cs.showText("Randjespark");
                cs.newLine();
                cs.showText("Midrand");
                cs.newLine();
                cs.showText("South Africa");
                cs.newLine();
                cs.showText("1685");
                cs.endText();

                //Client details ------------------------------------------------------------------------
                cs.beginText();
                cs.setFont(PDType1Font.TIMES_ROMAN, 14);
                cs.setLeading(20f);
                cs.newLineAtOffset(350, 610);
                cs.showText("To");
                cs.endText();

                cs.beginText();
                cs.setFont(PDType1Font.TIMES_ROMAN, 16);
                cs.setLeading(20f);
                cs.newLineAtOffset(350, 590);
                cs.showText("Mr Manqoba Lubisi");
                cs.endText();
                cs.beginText();
                cs.setFont(PDType1Font.TIMES_ROMAN, 14);
                cs.setLeading(20f);
                cs.newLineAtOffset(350, 570);
                cs.showText("manqoba@gmail.com");
                cs.newLine();
                cs.showText("07777777");
                cs.newLine();
                cs.showText(address.getAddress1());
                cs.newLine();
                cs.showText(address.getTown());
                cs.newLine();
                cs.showText(""+address.getPostalCode());
                cs.endText();

                //break line ------------------------------------------------------------------------
                cs.beginText();
                cs.setFont(PDType1Font.TIMES_ROMAN, 14);
                cs.newLineAtOffset(40, 450);
                cs.showText("-------------------------------------------------------------------------------------------------------------");
                cs.endText();

                //invoice details ------------------------------------------------------------------------
                cs.beginText();
                cs.setFont(PDType1Font.TIMES_ROMAN, 14);
                cs.setLeading(20f);
                cs.newLineAtOffset(60, 430);
                cs.showText("Invoice No.");
                cs.newLine();
                cs.showText("Date");
                cs.endText();

                cs.beginText();
                cs.setFont(PDType1Font.TIMES_ROMAN, 14);
                cs.setLeading(20f);
                cs.newLineAtOffset(150, 430);
                cs.showText(": 0001");
                cs.newLine();
                cs.showText(": 04-02-2022");
                cs.endText();

                //break line ------------------------------------------------------------------------
                cs.beginText();
                cs.setFont(PDType1Font.TIMES_ROMAN, 14);
                cs.newLineAtOffset(40, 400);
                cs.showText("-------------------------------------------------------------------------------------------------------------");
                cs.endText();

                cs.beginText();
                cs.setFont(PDType1Font.TIMES_ROMAN, 14);
                cs.newLineAtOffset(80, 380);
                cs.showText("Product Name");
                cs.endText();

                cs.beginText();
                cs.setFont(PDType1Font.TIMES_ROMAN, 14);
                cs.newLineAtOffset(200, 380);
                cs.showText("Unit Price");
                cs.endText();

                cs.beginText();
                cs.setFont(PDType1Font.TIMES_ROMAN, 14);
                cs.newLineAtOffset(310, 380);
                cs.showText("Quantity");
                cs.endText();

                cs.beginText();
                cs.setFont(PDType1Font.TIMES_ROMAN, 14);
                cs.newLineAtOffset(410, 380);
                cs.showText("Price");
                cs.endText();

                cs.beginText();
                cs.setFont(PDType1Font.TIMES_ROMAN, 12);
                cs.setLeading(20f);
                cs.newLineAtOffset(80, 340);
                
                for (OrderLineItem orderLineItem : orderLineList) {
                    cs.showText(orderLineItem.getProduct().getNameOfProduct());
                    cs.newLine();
                }
                cs.endText();

                cs.beginText();
                cs.setFont(PDType1Font.TIMES_ROMAN, 12);
                cs.setLeading(20f);
                cs.newLineAtOffset(200, 340);
                
                for (OrderLineItem orderLineItem : orderLineList) {
                    cs.showText(""+orderLineItem.getProduct().getProductId());
                    cs.newLine();
                }
                
                cs.endText();

                cs.beginText();
                cs.setFont(PDType1Font.TIMES_ROMAN, 12);
                cs.setLeading(20f);
                cs.newLineAtOffset(310, 340);
                
                for (OrderLineItem orderLineItem : orderLineList) {
                    cs.showText(""+orderLineItem.getQuantity());
                    cs.newLine();
                }
                
                cs.endText();

                cs.beginText();
                cs.setFont(PDType1Font.TIMES_ROMAN, 12);
                cs.setLeading(20f);
                cs.newLineAtOffset(410, 340);
                for (OrderLineItem orderLineItem : orderLineList) {
                    price =  orderLineItem.getProduct().getProductPrice() * orderLineItem.getQuantity();
                    cs.showText(""+orderLineItem.getProduct().getProductId());
                    cs.newLine();
                }
                
                cs.endText();

                cs.beginText();
                cs.setFont(PDType1Font.TIMES_ROMAN, 14);
                cs.newLineAtOffset(310, (340 - (20 * orderLineList.size())));
                cs.showText("Total : ");
                cs.endText();

                cs.beginText();
                cs.setFont(PDType1Font.TIMES_ROMAN, 14);
                //Calculating where total is to be written using number of products
                cs.newLineAtOffset(410, (340 - (20 * orderLineList.size())));
                cs.showText("R" + total);
                cs.endText();

                //Close the content stream
                cs.close();
                
                //create a path
                String folder = LocalDate.now().toString();
                Path path = Paths.get("C:\\Users\\Student24\\Desktop\\BakeryProjectV1\\invoicePdf\\"+folder+"\\");
                Files.createDirectories(path);
                String location = path.toString();
                
                //Save the PDF
                
                invc.save(location+"test.pdf");
                isCreate = true;
                invc.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return isCreate;

    }

}
