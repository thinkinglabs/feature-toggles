# feature-toggles
A Java implementation of the [implementation techniques for feature toggles](https://martinfowler.com/articles/feature-toggles.html#ImplementationTechniquesa) by [Pete Hodgson](https://twitter.com/ph1).

For each of the 3 different implementation techniques a separate branch was created:
* `1-naive-implementation`: using `if-else` in the business logic => toggle point and toggle router at the same place
* `2-inversion-of-decision`: move the toggle router to a feature decision class
* `3-avoiding-conditions`: using a feature aware factory and the strategy pattern

The `master` branch contains the *Avoid Conditions* implementation.

## Naive Implementaiton
This uses if-else conditions in the business logic. As a result toggle point and toggle router are at the same place.

## Inversion of Decision
This implementation uses a feature decision class for the toggle router. But the business logic still contains an if-else condition.

As a result toggle routing is moved away from the business logic, but the toggle point is still inside the business logic.

## Avoiding Conditions
This implementation uses a feature aware factory and the strategy pattern. The if-else condition is moved outside the business logic to the factory.

We have a clear seperation between toggle point and toggle routing. The toggle routing is handled by a feature decision class. The toggle point is handled by the factory.
