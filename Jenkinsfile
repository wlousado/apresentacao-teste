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
        sh './gradlew :app:sonarqube -Dsonar.projectKey=test_project -Dsonar.host.url=http://sonar:9000 -Dsonar.login=c6b28c3d417a10ce2a5a066d060c73c6d1032b8d'
      }
    }
  }
}
