# feature-toggles
A Java implementation of the [implementation techniques for feature toggles](https://martinfowler.com/articles/feature-toggles.html#ImplementationTechniquesa) by [Pete Hodgson](https://twitter.com/ph1).

## Inversion of Decision
This uses a feature decision class for the toggle router. But the business logic still contains an `if-else` condition.



