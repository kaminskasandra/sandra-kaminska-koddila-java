package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){
    //Given
        Product product1= new Product("Ream of paper");
        Product product2 = new Product("Paint set");
        Product product3 = new Product("School Crayons");

        Item item1 = new Item(product1, new BigDecimal(35), 5);
        Item item2 = new Item(product2, new BigDecimal(25), 10);
        Item item3 = new Item(product3, new BigDecimal(15), 20);

        Invoice invoice = new Invoice("111");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        // When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        // Then
        assertEquals(1, invoiceId);

        // Clean-up
        invoiceDao.deleteById(invoiceId);
    }
}
