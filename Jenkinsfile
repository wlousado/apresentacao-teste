pipeline {
  agent any
  stages {
    stage('Build App') {
      steps {
        sh 'chmod +x gradlew'
        sh './gradlew build'
      }
    }
    stage('Scan with Sonarqube'){
      steps{
        sh './gradlew sonarqube -Dsonar.projectKey=test_project -Dsonar.host.url=http://localhost:9000 -Dsonar.login=b34f47ad3f5919e4aea8b6c3eb96b19d857dbf12'
      }
    }
  }
}
