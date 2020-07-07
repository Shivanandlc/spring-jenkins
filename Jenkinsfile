pipeline {

    agent any
    tools {
        maven 'Maven_3.6.0'
        jdk "Java8"
    }
    stages {
        stage('Compile stage') {
            steps {
                bat "mvn clean compile"
        }
    }

         stage('testing stage') {
             steps {
                bat "mvn package"
        }
    }

  }

}