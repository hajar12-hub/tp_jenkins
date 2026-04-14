pipeline {
    agent any

  agent {
        docker {
            image 'maven:3.9.9-eclipse-temurin-17'
        }
    }
    
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/hajar12-hub/tp_jenkins.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
