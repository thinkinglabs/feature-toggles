package io.thinkinglabs;

import java.util.Objects;

/**
 * @author @tdpauw
 */
public class Email
{
    private final String body;

    public Email(final String body)
    {
        this.body = body;
    }

    public Email(final Invoice invoice)
    {
        body = invoice.getInvoiceNr() + ": bla bla bla";
    }

    public Email append(String line) {
        return new Email(new StringBuilder(body).append("\n").append(line).toString());
    }

    @Override
    public boolean equals(final Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        final Email email = (Email) o;
        return Objects.equals(body, email.body);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(body);
    }

    @Override
    public String toString()
    {
        return "Email{" +
                "body='" + body + '\'' +
                '}';
    }
}
