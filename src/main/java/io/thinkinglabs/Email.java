package io.thinkinglabs;

/**
 * @author @tdpauw
 */
public class Email
{
    public boolean equals(final Object that) {
        if (that instanceof Email)
            return true;
        else
            return false;
    }

    public int hashCode() {
        return 1;
    }
}
