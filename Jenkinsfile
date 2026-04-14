pipeline {
  
  agent  any
  
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/hajar12-hub/tp_jenkins.git'
            }
        }

        stage('Build') {
            steps {
                sh 'docker run --rm -v $PWD:/app -w /app maven:3.9-eclipse-temurin-17 mvn clean package -DskipTests'
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
