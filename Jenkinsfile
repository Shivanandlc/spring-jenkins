pipeline {
    agent any
    tools {
        maven 'Maven_3.6.0'
        jdk "Java8"
    }
    stages {
        stage("Cloning Repo") {
            steps {
                git credentialsId: 'git_credentials', url: 'https://github.com/Shivanandlc/spring-jenkins.git'
            }
        }
        stage("Build Stage") {
            steps {
                bat "mvn clean compile"
            }
        }
        stage("Test Stage") {
            steps {
                bat "mvn package"
            }
        }
  }
}