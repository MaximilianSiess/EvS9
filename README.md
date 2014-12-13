#Continuous Integration
A way of development meant for **development teams using version control systems like git**. The basic premise is: The changes of every member need to be integrated into the codebase early and often.

##What does it do?
By using a _CI-Server_ every member checks into, the server can automatically perform checks regularly and on every commit.

A _CI-Server_ can do:
* Test if the project builds
* Unit tests
* Integration tests
* Releases deplayable artefacts for testing
* Labels versions

If everything checks out, the chances are commited to the repository.
Otherwise, the server alerts the development team.

##Advantages
Compiling, testing, sanity checks and deployment are automated. The actual repository will contain more stable code because bugs are found faster.

##Disadvantages
For one-man teams not very useful.

By still relying on unit tests, _CI_ still has the problem of possibly incorrect tests, giving wrong results back.
