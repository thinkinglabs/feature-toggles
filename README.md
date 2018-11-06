# feature-toggles
A Java implementation of the [implementation techniques for feature toggles](https://martinfowler.com/articles/feature-toggles.html#ImplementationTechniquesa) by [Pete Hodgson](https://twitter.com/ph1).

## Inversion of Decision
This implementation uses a feature decision class for the toggle router. But the business logic still contains an `if-else` condition.

As a result toggle routing is moved away from the business logic, but the toggle point is still inside the business logic.

