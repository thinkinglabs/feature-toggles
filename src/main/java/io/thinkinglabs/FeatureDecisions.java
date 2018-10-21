package io.thinkinglabs;

/**
 * @author @tdpauw
 */
public class FeatureDecisions
{
    private final Features features;

    public FeatureDecisions(final Features features)
    {
        this.features = features;
    }

    public boolean includeOrderCancellationInEmail()
    {
        return features.isEnabled("next-gen-ecomm");
    }
}
