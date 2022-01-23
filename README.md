# UI-automation of Service NSW

This UI automation project are created using Java language and Eclipse as IDE. We will do automate UI of the Australia NSW Service website. The link is https://www.service.nsw.gov.au/. Below is the dashboard of NSW Service Website :


We should to do the test of some action on this website. So, below is the test case:
1. Navigate to https://www.service.nsw.gov.au/ and the page is should be like this:

![image](https://user-images.githubusercontent.com/63556820/150692557-60c83eb9-1f11-4713-a276-3afe3bf517f8.png)

2. Type "Apply for a number plate" in the search box, and the page is should to show the results of "apply for a number plate" like this:
![image](https://user-images.githubusercontent.com/63556820/150692703-bc3de6db-c190-4990-89ca-236524efbd13.png)

3. Click Search button
4. Click on Find location button
5. Type "Sydney 2000". Then, the page is should to show the location of "Sydney 2000"

![image](https://user-images.githubusercontent.com/63556820/150692754-67fd3c96-c555-4c43-8c9b-931807200ebd.png)

6. Click Search button
7. Click the "Marrickville Service Centre" link. When we fill the search box by "Sydney 2000" we can found Marrickville Service Centre location

![image](https://user-images.githubusercontent.com/63556820/150692771-5cc61382-3457-4853-975c-79a4772eca42.png)



## Libraries

- JDK 1.8

- Selenium 3.17.2

- Chrome Driver

  

## How To Run

1. Download the text editor. In this test case, i used Eclipse IDE

2. Install Java Development Kit (JDK) (Don't forget to add path of JDK on environment variable)

3. Install Selenium IDE

4. Create project on selenium, add the website on the selenium, and then start recording according to the test case

5. Run the test case on selenium. If the test case run well, export that project to Java unit, then save it

6. Create the java project on Eclipse IDE, insert the web driver, add selenium standalone & selenium server to configure build path, and so the folder structure would be like this :

![image](https://user-images.githubusercontent.com/63556820/150694271-3e149203-3054-47cb-be19-def1efc61313.png)
   
7. Create a new package, i named it with the link of nsw services

8. Create a new java file on src folder, i named it with searchingtest.java and i created a class file of it then named it with searchingtest too. Then the folder structure would be like this :

![image](https://user-images.githubusercontent.com/63556820/150694517-8dbcffc8-9cc6-4a48-9f62-87e8a9a3d8aa.png)

9. Copy the script of the exported java file from Selenium to searchingtest.java file

10. Commit project and push to github
