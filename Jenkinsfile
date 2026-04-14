pipeline {
    agent any

tools {
    maven 'Maven3'}

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
