# DiagnosticSystem
A REST web service based application to diagnose the symptoms
                                                    **********************************                
System Requirements
Requirement	Minimum	Recommended
Java version	1.4.0	5.0 or greater
Memory	512 MB	1 GB or more
Free disk space	300 MB	1 GB or more
Processor speed	800 MHz	1.5 GHz or faster

Software Requirements 
Java JRE and JDK
http://download.oracle.com/otn-pub/java/jdk/8u111-b14/jdk-8u111-windows-x64.exe
Eclipse Mars 
http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/mars2
Apache Tomcat
https://archive.apache.org/dist/tomcat/tomcat-7/v7.0.68/bin/apache-tomcat-7.0.68.exe
MySQL Workbench 
http://dev.mysql.com/downloads/workbench/

                                                    **********************************              
How To Run
•	Install the required software
•	Run Eclipse , click File -> Import -> Maven -> Existing Maven Project
•	Select the downloaded folder to import the project
•	Right click on the imported project and click -> Maven Build
•	Add a Tomcat Server to project by selecting Server tab and following the instructions
•	Right click on the project, and select Run As -> Run on Server
•	Open a browser, and go to http://localhost:8080/diagnosticsystem/webapi/info
•	If you see "A REST API for Diagnostic System!" as output, everything's fine
•	The Data needs to be present in your database for getting symptoms
•	For example, I've created 3 tables in database namely, chestsymptom , stomachsymptom and  headsymptom.
•	Each table should have at least 2 columns i.e., Symptom and Area
•	Once the table is populated, visit http://localhost:8080/diagnosticsystem/webapi/symptoms/chest  this displays a list of possible symptoms as
•	[{"areas":"Lungs","name":"Cough"},
{"areas":"Chest, Abdomen","name":"Acute Pain"},{"areas":"Chest","name":"Rashes"},{"areas":"Chest","name":"Breathless"},{"areas":"Chest","name":"Allergy"},{"areas":"Chest","name":"Mild Pain"}]
