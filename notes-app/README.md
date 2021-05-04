# WebServices

prerequisites:
-Maven
-Docker
-Java 8
-Postman

instructions:
- run the following commands in console in the current directory:
1. _mvm clean install_
2. _docker build -f Dockerfile -t notes-app ._
3. _docker images_ (to check the IMAGE_ID)
4. _docker run -p_ 8080:8080 IMAGE_ID
- open postman and import _webservices1.postman_collection.json_

