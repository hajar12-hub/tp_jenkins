pipeline {
    agent any

    stages {

        stage('Cloner le projet') {
            steps {
                git 'https://github.com/TON_REPO/mini-java-project.git'
            }
        }

        stage('Compilation') {
            steps {
                sh 'javac src/Main.java test/TestCalc.java'
            }
        }

        stage('Tests') {
            steps {
                sh 'java -cp src:test TestCalc'
            }
        }

        stage('Execution') {
            steps {
                sh 'java -cp src Main'
            }
        }
    }
}
