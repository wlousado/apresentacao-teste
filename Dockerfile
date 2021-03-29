FROM jenkins/jenkins
EXPOSE 8080 50000
VOLUME [ "jenkins-data:/var/jenkins_home" ]