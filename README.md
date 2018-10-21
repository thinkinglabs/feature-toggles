# feature-toggles
A Java implementation of the [implementation techniques for feature toggles](https://martinfowler.com/articles/feature-toggles.html#ImplementationTechniquesa) by [Pete Hodgson](https://twitter.com/ph1).

The 3 different techniques are each on their branch:
* naive implementation: using `if-else` in the business logic => toggle point and toggle router at the same place
* inversion of decision: move the toggle router to a feature decision class
* avoiding conditions: using a feature aware factory and the strategy pattern

