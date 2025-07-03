pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
	sh 'echo "1:buildando o código..."'
        sh 'docker build -f Dockerfile.build -t jogo-build .'
      }
    }
    stage('Test') {
      steps {
	sh 'echo "2:testando o código..."'
        sh 'docker build -f Dockerfile.test -t jogo-teste .'
        sh 'docker run jogo-teste'
      }
    }
  }
}
