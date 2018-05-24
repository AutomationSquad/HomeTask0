##### DESCRIPTION #####

This set of modules is a JUnit 5.0 based framework for  common/simple Calculator functions testing

###### To be able to run tests you have to: ######
* install java:
http://www.oracle.com/technetwork/java/javase/downloads/index.html
* setUp in build.gradle file of the main root of your project the repository source and dependencies:
https://mvnrepository.com/repos/central

###### repositories ######
{

    mavenCentral()
}
    
###### dependencies ######
{

    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-api', version: '5.1.0'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-params', version: '5.1.0'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-engine', version: '5.1.0'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-migrationsupport', version: '5.1.0'

    testCompile group: 'org.junit.platform', name: 'junit-platform-runner', version: '1.1.0'
    testCompile group: 'org.junit.platform', name: 'junit-platform-engine', version: '1.1.0'
    testCompile group: 'org.junit.platform', name: 'junit-platform-launcher', version: '1.1.0'
    testCompile group: 'org.junit.platform', name: 'junit-platform-suite-api', version: '1.1.0'
    testCompile group: 'org.junit.platform', name: 'junit-platform-gradle-plugin', version: '1.1.0'
    
}

###### _Note: **build.gradle** file(in the main root) - Includes all repository and dependency settings_ ######

##### OVERVIEW #####

######Project structure: ######

├──**src** package

├──├──**main** package

├──├──├──**java** package

├──├──├──├──**Calculator** class

├──├──**test** package

├──├──├──**java** package

├──├──├──├──**CalculatorTest** class

* **Calculator class** within the **main** folder - Includes a set of simple Calculator functions put 
under a test
* **CalculatorTest class** within the **test** folder- Includes a set of test methods to ensure that
simple/common Calculator functions work as expected



