package io.thinkinglabs;

/**
 * @author @tdpauw
 */
public class IndentityAddContentToEmail implements AddContentToEmail
{
    @Override
    public Email addContent(final Email email)
    {
        return email;
    }
}
