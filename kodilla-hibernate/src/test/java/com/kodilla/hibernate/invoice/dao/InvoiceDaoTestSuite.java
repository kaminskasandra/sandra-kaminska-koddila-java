package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Product");
        productDao.save(product);

        Item item1 = new Item(product, new BigDecimal(35), 5);
        Item item2 = new Item(product, new BigDecimal(25), 10);
        Item item3 = new Item(product, new BigDecimal(15), 20);

        Invoice invoice = new Invoice("111");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        // When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        // Then
        assertNotEquals(0, invoiceId);

        // Clean-up
        invoiceDao.deleteById(invoiceId);
    }
}
