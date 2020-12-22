## Examples of integration test approaches for Liferay Portal/DXP

##### modules/bnd-junit4-tests/bnd.bnd

Uses

- bnd OSGiTest gradle plugin
- bnd remote agent
- bnd remote launcher
- bnd tester

### Building

First, setup the Liferay CE product deployment

```bash
./gradlew initBundle
```

Next deploy and run the integration tests

```bash
./gradlew testIntegration
```

