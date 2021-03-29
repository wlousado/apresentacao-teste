pipeline {
  agent any
  stages {
    stage('Clone Repository') {
      steps {
        sh 'git clone https://github.com/wlousado/apresentacao-teste.git'
      }
    }
    stage('Build App') {
      steps {
         './gradlew build'
      }
    }
  }
}
