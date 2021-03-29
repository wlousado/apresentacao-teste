pipeline {
  agent any
  stages {
    stage('Build App') {
      steps {
        sh chmod +x gradlew
        sh './gradlew build'
      }
    }
  }
}
