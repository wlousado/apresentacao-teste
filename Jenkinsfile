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
        sh './gradlew :app:sonarqube -Dsonar.projectKey=test_project -Dsonar.host.url=http://sonar:9000 -Dsonar.login=805e233ba7654fa3af13758a9233b42b678cfdaf'
      }
    }
    stage('Check app'){
      steps{
        sh './gradlew check'
      }
    }
  }
}
