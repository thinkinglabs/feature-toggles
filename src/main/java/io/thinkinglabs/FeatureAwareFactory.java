package io.thinkinglabs;

/**
 * @author @tdpauw
 */
public class FeatureAwareFactory
{
    private final FeatureDecisions featureDecisions;

    public FeatureAwareFactory(final FeatureDecisions featureDecisions)
    {
        this.featureDecisions = featureDecisions;
    }

    public InvoiceEmailer invoiceEmailer() {
        if (featureDecisions.includeOrderCancellationInEmail()) {
            return new InvoiceEmailer(new AddOrderCancellationContentToEmail());
        } else {
            return new InvoiceEmailer(new IndentityAddContentToEmail());
        }
    }
}
