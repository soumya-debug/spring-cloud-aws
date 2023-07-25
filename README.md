# spring-cloud-aws
Deployed my Spring Boot application on Cloud.
1. Create a spring application in eclipse.
2. Run MAVEN COMMAND - mvn compile
                     - mvn clean install
3. The jar file will be created inside target file
4. Login to your amazon aws console.
5. Create a s3 bucket.
6. Upload the Jar file of your application inside the bucket.
7. Tap on the uploaded Jar file
8. Key, S3 URI, ARN, Etag, Object URL will be found there.
9. Create a new EC2 instance by clicking launch instance.
10. Configure the necessary key pairs, security groups etc.
11. After successfull configuration check the status running.
12. Then tap on connect to open the EC2 instance connect (Amazon Linux 2023)
13. Type command - aws s3 ls;
14. Type command - ls;
15. Configure the IAM by modifyinh it.
16. Check java version - java -v
17. Download java 8 - sudo yum install java-1.8.0
18. Change the java version - sudo alternatives --config java
19. Type command - ls;
20. Type command - java -jar <copy the jar file shown in the previous command>
21. Spring initialization will happen on your Amazon Linux 2023 terminal.
22. Then type the <Address Public IPv4 DNS>:8080 to open your application.
