# feature-toggles
A Java implementation of the [implementation techniques for feature toggles](https://martinfowler.com/articles/feature-toggles.html#ImplementationTechniquesa) by [Pete Hodgson](https://twitter.com/ph1).

## Avoiding Conditions
This implementation uses a feature aware factory and the strategy pattern. The `if-else` condition is moved outside the business logic to the factory.
We have a clear seperation between toggle point and toggle routing. The toggle routing is handled by a feature decision class. The toggle point is handled by the factory.

