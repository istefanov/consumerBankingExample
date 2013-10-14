consumerBankingExample
======================

This is a little example for using maven for setting up project structure, testing, getting dependencies from another maven repository and creating executable jar files.

##### Project generation
To generate a project sceleton one can use:
mvn archetype:generate -DgroupId=com.companyname.bank -DartifactId=consumerBanking -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false 

##### Some maven commands

* to generate a jar with running the tests

mvn clean package
* compilation

mvn clean compile

* test

mvn test

* to generate a runnable jar

After editing the pom.xml one needs to run 

mvn clean compile assembly:single

[Here](http://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html) is good information on Maven lifecycle.

[Here](http://www.tutorialspoint.com/maven/maven_creating_project.htm) is the tutorial used for creating this example.
