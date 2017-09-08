# Semester3Week1
StudyPoint-Exercise-1

Object Relational Mapping with JPA
General part

1. Describe how you have handled persistence in the last three semesters. The considerations should include all relevant layers. File IO, Relational Databases, local storage and cookies in browsers. 
- Originally we were told to create and implement our own simple mappers for rational databases which could handle all entities by id forexample. In the 2nd semester howeever we as a group(Farkas, Rares, Adam and myself) decided to use EbeanORM which is a JPA implementation to generate the mappers for us, for the final semester project(CarPort project). 

In addition, pdf generating library was also used for creating PDFs for the CarPort project. Those were stored on the server but also available to download for local storage and kept track of them using our database, again using EbeanORM.

As for cookies and sessions I used Java Servlet API

2. Explain the rationale behind the topic Object Relational Mapping and the Pros and Cons in using a ORM
ORM is simply put a method of mapping data to incompatible type systems using Object Oriented Programming. 

Pros: 
Less code to keep track track of since the ORM pulls the data for you. 
You don't have to know SQL to manage the database. 
Adding data is just like modifying data.

Cons: 
Performance can be slow cause of the translation layer. 
Automated systems doesn't allow you to have direct control. 
In some cases you might have to type raw SQL cause occuring ORM layer restrictments when it comes to querrying. 

3. Explain the JPA strategy for handling Object Relational Mapping and important classes/annotations involved.
Each table that you want generated are handled by the "@Entity" annotations, this is an identifyer that tells the JPA to map the corresponding Entity class to a table in the database, and carry data to one row in the table. 

4.Outline some of the fundamental differences in Database handling using plain JDBC versus JPA
Mainly the fundamental differences between JDBC and JPA are that JDBC is used as a standard for database access and JPA is used for ORM. Using JDBC you can connect to a DB directly and run SQL against it, e.g SELECT * FROM USERS or similar. 
With JPA in the other hand this SQL is "hidden" from the user which leaves them with only dealing with familiar classes and code, such as Java. 


