package io.thinkinglabs;

import org.junit.Test;

import java.util.Collections;
import java.util.Map;

import static org.junit.Assert.*;

public class InvoiceEmailerTest
{
    @Test
    public void confirmationMail() {
        InvoiceEmailer sut = new InvoiceEmailer(new FeatureDecisions(new Features(Collections.emptyMap())));
        assertEquals(new Email("12345: bla bla bla"), sut.generateInvoiceEmail(new Invoice("12345")));
    }

    @Test
    public void confirmationMailWithOrderCancellation() {
        InvoiceEmailer sut = new InvoiceEmailer(new FeatureDecisions(new Features(Map.of("next-gen-ecomm", Boolean.TRUE))));
        assertEquals(new Email("12345: bla bla bla\nCancel order"), sut.generateInvoiceEmail(new Invoice("12345")));
    }
}
