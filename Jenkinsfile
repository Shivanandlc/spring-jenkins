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
        stage("Build Code") {
            steps {
                bat "mvn clean compile"
            }
        }
        stage("Test Code") {
            steps {
                bat "mvn package"
            }
        }
  }
}