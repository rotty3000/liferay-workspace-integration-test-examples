## Examples of integration test approaches for Liferay Portal/DXP

##### modules/bnd-junit4-tests/bnd.bnd

Uses:

- bnd OSGiTest gradle plugin

  - `classpath group: "biz.aQute.bnd", name: "biz.aQute.bnd.gradle", version: "5.3.0-SNAPSHOT"`

- bnd remote agent

  - `testModules group: "biz.aQute.bnd", name: "biz.aQute.remote.agent", version: "5.3.0-SNAPSHOT", transitive: false`

- bnd remote launcher

  - `-runpath: biz.aQute.remote.launcher;version=latest`

- bnd junit4 tester

  - default value of `-tester` instruction when not specified

- osgi-test junit4 support library

  - ```groovy
    	testIntegrationCompile group: "org.osgi", name: "org.osgi.test.assertj.framework", version: "0.10.0"
    testIntegrationCompile group: "org.osgi", name: "org.osgi.test.junit4", version: "0.10.0"`
  	```

##### modules/bnd-junit5-tests/bnd.bnd

Uses:

- bnd OSGiTest gradle plugin
  
  - `classpath group: "biz.aQute.bnd", name: "biz.aQute.bnd.gradle", version: "5.3.0-SNAPSHOT"`
  
- bnd remote agent
  
  - `testModules group: "biz.aQute.bnd", name: "biz.aQute.remote.agent", version: "5.3.0-SNAPSHOT", transitive: false`
  
- bnd remote launcher
  
  - `-runpath: biz.aQute.remote.launcher;version=latest`
  
- bnd junit5 tester
  
  - `-tester: biz.aQute.tester.junit-platform`
  
- osgi-test junit5 support library

  - ```groovy
    	testIntegrationCompile group: "org.junit.jupiter", name: "junit-jupiter-api", version: "5.7.0"
    testIntegrationCompile group: "org.osgi", name: "org.osgi.test.assertj.framework", version: "0.10.0"
    testIntegrationCompile group: "org.osgi", name: "org.osgi.test.junit5", version: "0.10.0"
      
    testIntegrationRuntime group: "org.junit.jupiter", name: "junit-jupiter-params", version: "5.7.0"
    testIntegrationRuntime group: "org.junit.jupiter", name: "junit-jupiter-engine", version: "5.7.0"
    testIntegrationRuntime group: "org.junit.platform", name: "junit-platform-engine", version: "1.7.0"
    testIntegrationRuntime group: "org.junit.platform", name: "junit-platform-launcher", version: "1.7.0"
    testIntegrationRuntime group: "org.junit.platform", name: "junit-platform-commons", version: "1.7.0"
    ```


### Building

First, setup the Liferay CE product deployment

```bash
./gradlew initBundle
```

Next, run the integration tests

```bash
./gradlew testIntegration
```

