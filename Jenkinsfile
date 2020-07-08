pipeline {
    agent any
    tools {
        maven 'Maven_3.6.2'
        jdk "Java8"
    }
    environment {
        registry = "shivalc/docker-test"
        registryCredential = "dockerhub"
        dockerImage = ''
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
        stage('Building image') {
              steps{
                script {
                  dockerImage = docker.build registry + ":$BUILD_NUMBER"
                }
              }
        }
  }
}