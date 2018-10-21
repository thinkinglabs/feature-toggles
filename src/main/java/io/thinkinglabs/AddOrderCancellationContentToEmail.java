package io.thinkinglabs;

/**
 * @author @tdpauw
 */
public class AddOrderCancellationContentToEmail implements AddContentToEmail
{
    @Override
    public Email addContent(final Email email)
    {
        return email.append("Cancel order");
    }
}
