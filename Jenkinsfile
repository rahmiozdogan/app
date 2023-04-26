pipeline {
  agent none
  stages {
    stage('clean') {
      steps {
        bat 'mvn clean'
      }
    }

    stage('build') {
      steps {
        bat 'mvn compile'
      }
    }

  }
  environment {
    deneme = ''
  }
}