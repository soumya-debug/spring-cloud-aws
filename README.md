# Spring Cloud AWS - Deploying a Spring Boot Application on AWS

## Prerequisites

- [Eclipse IDE](https://www.eclipse.org/ide/) installed.
- Run the following Maven commands to compile and package your application:
  ```bash
  mvn compile
  mvn clean install
- The jar file will be created inside target file
- Login to your amazon aws console.
- Create a s3 bucket.
- Upload the Jar file of your application inside the bucket.
- Tap on the uploaded Jar file
- Key, S3 URI, ARN, Etag, Object URL will be found there.
- Create a new EC2 instance by clicking launch instance.
- Configure the necessary key pairs, security groups etc.
- After successfull configuration check the status running.
- Then tap on connect to open the EC2 instance connect (Amazon Linux 2023)
```bash
aws s3 ls
ls
```
- Configure the IAM by modifyinh it.
```
java -v
sudo yum install java-1.8.0
sudo alternatives --config java
aws ls cp <copy the jar file>
ls
java -jar <copy the jar file shown in the previous command>
```
- Spring initialization will happen on your Amazon Linux 2023 terminal.
- Then type the Public-IPv4-DNS:8080 to open your application.
