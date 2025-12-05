
pipeline {
  agent any
  
  environment {
    JAVA_HOME = tool name: 'jdk21', type: 'jdk'
    MAVEN_HOME = tool name: 'maven-3.9', type: 'maven'
    PATH = "${JAVA_HOME}/bin:${MAVEN_HOME}/bin:${env.PATH}"
  }
  
  stages {
    stage('Checkout') {
      steps {
        git branch: 'main', url: 'https://github.com/ashwinikumar2003/demo.git'
      }
    }
    
    stage('Build & Test') {
      steps {
        sh 'mvn -B -Dmaven.repo.local=.m2_repository clean package -DskipTests -Dmaven.test.skip=true'
      }
      post {
        always {
          archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
      }
    }
  }
}
