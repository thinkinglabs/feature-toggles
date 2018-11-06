# feature-toggles
A Java implementation of the [implementation techniques for feature toggles](https://martinfowler.com/articles/feature-toggles.html#ImplementationTechniquesa) by [Pete Hodgson](https://twitter.com/ph1).

For each of the 3 different implementation techniques a separate branch was created:
* `1-naive-implementation`: using `if-else` in the business logic => toggle point and toggle router at the same place
* `2-inversion-of-decision`: move the toggle router to a feature decision class
* `3-avoiding-conditions`: using a feature aware factory and the strategy pattern

The `master` branch contains the *Avoid Conditions* implementation.

