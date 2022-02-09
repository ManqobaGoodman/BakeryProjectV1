package za.co.bigone.service;

import java.util.List;
import za.co.bigone.model.Card;
import za.co.bigone.model.OrderLineItem;
import za.co.bigone.model.Person;

public interface PaymentService {

    public boolean confirmPayment(Card card, int amount);

    public boolean createOrder(Person person, List<OrderLineItem> lineitems);
}
