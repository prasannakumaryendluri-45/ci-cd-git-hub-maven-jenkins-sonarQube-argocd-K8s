package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "🚀 package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "🚀 Professional Summary 
Motivated IT graduate graduating in April 2026 with hands-on experience in building and deploying cloud-native applications. 
Skilled in implementing CI/CD pipelines using GitHub, Jenkins, Docker, and Kubernetes. Experienced in AWS EC2 deployment and 
Linux server management. Seeking an entry-level DevOps Engineer role to contribute to automation and cloud infrastructure 
projects. 
Technical Skills 
Languages: Java, Shell Scripting 
Cloud: AWS (EC2, S3, IAM) 
DevOps Tools: Git, GitHub, Jenkins, Docker, SonarQube, Kubernetes, Argo CD 
Infrastructure as Code: Terraform, Ansible 
Operating System: Linux 
Projects 
Capstone Project – Smart Alert & Location Coordination System 
• Developed a secure real-time event alert system using React, Node.js, and Firebase. 
July 2025 – Apr 2026 
• Implemented role-based communication, panic alerts, and live location sharing with AES-GCM encryption. 
• Achieved 95% alert delivery accuracy. 
Cloud-Native CI/CD Pipeline with GitOps Deployment                                                                            
Nov 2025 – Jan 2026  
• Designed and implemented an end-to-end CI/CD pipeline for a Java application using GitHub, Jenkins, and Maven. 
• Integrated SonarQube for automated static code analysis and quality gate enforcement. 
• Containerized the application using Docker and pushed images to a container registry. 
• Automated Kubernetes deployments using Argo CD following GitOps principles. 
• Hosted application on AWS EC2 and configured secure SSH-based server access. 
• Reduced deployment time by automating build and release processes. 
Certificates 
Continuous Integration and Delivery (DevOps) – Infosys 
Java Programming – Cisco Networking Academy 
Web Development – Prodigy Info Tech 
Soft Skills 
Dec 2024 
Jun 2025 
Dec 2024 
• Problem-solving and analytical thinking 
• Effective communication and collaboration 
• Adaptability to new tools and technologies 
• Time management 
Education 
B.Tech – Information Technology 
MLR Institute of Technology, Hyderabad 
CGPA: 7.5 
Intermediate – MPC 
Narayana Jr. College, Guntur 
Percentage: 83% 
SSC                    
Holy Faith (E.M) High School, Addanki 
CGPA: 10";
    }
}";
    }
}
