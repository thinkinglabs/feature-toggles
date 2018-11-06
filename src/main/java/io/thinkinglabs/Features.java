package io.thinkinglabs;

import java.util.Map;

/**
 * @author @tdpauw
 */
public class Features
{
    private final Map<String, Boolean> flags;

    public Features(final Map<String, Boolean> flags) {
        this.flags = flags;
    }

    public boolean isEnabled(String featureFlag) {
        return flags.getOrDefault(featureFlag, false);
    }
}
