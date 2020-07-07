pipeline {
    agent any
    stages {
        tools {
            maven 'Maven_3.6.3'
        }
        stage('Compile Stage') {
            steps {
                withMaven(maven : 'Maven_3.6.3') {
                    sh 'mvn clean install'
                }
            }
        }
    }
}