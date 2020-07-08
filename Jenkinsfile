pipeline {
    agent any
    tools {
        maven 'Maven_3.6.0'
        jdk "Java8"
    }
    stages {
        stage("Git clone") {
            steps {
                git credentialsId: 'git_credentials', url: 'https://github.com/Shivanandlc/spring-jenkins.git'
            }
        }
        stage("Build code") {
            steps {
                bat "mvn clean compile"
            }
        }
        stage("Test code") {
            steps {
                bat "mvn package"
            }
        }
  }
}