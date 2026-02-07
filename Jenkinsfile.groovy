pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                bat 'echo Checkout Stage'
            }
        }
        stage('Build') {
            steps {
                bat 'echo Build Stage'
            }
        }
        stage('Test') {
            steps {
                bat 'echo Test Stage'
            }
        }
    }
}