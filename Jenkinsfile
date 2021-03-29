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
        sh './gradlew sonarqube -Dsonar.projectKey=test_project -Dsonar.host.url=http://localhost:9000 -Dsonar.login=a3520f5b5302675f70a3e140e046e85c513e2f8b'
      }
    }
  }
}
