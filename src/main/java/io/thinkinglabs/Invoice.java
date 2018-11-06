package io.thinkinglabs;

/**
 * @author @tdpauw
 */
public class Invoice
{
    private final String invoiceNr;

    public Invoice(final String invoiceNr)
    {
        this.invoiceNr = invoiceNr;
    }

    public String getInvoiceNr()
    {
        return invoiceNr;
    }
}
