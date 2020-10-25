package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.task.Invoice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){
        //Given
        Product jablko = new Product("reneta");
        Product gruszkaKonferencja = new Product("konferencja");
        Product gruszkaFaworytka = new Product("faworytka");

        Item jablka = new Item(jablko, new BigDecimal(10), 50, new BigDecimal(500));
        Item konferencje = new Item(gruszkaKonferencja, new BigDecimal(5), 30, new BigDecimal(150));
        Item faworyty = new Item(gruszkaFaworytka, new BigDecimal(8), 100, new BigDecimal(800));

        Invoice invoice = new Invoice("2020/10/25/13");
        invoice.getItems().add(jablka);
        invoice.getItems().add(konferencje);
        invoice.getItems().add(faworyty);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertNotEquals(0, invoiceId);

        try {
            invoiceDao.deleteById(invoiceId);
        } catch (Exception e) {
            //do nothing
        }
    }
}
