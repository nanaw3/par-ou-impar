pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
	bat 'echo "1:buildando o código..."'
        bat 'docker build -f Dockerfile.build -t jogo-build .'
      }
    }
    stage('Test') {
      steps {
	bat 'echo "2:testando o código..."'
        bat 'docker build -f Dockerfile.test -t jogo-teste .'
        bat 'docker run jogo-teste'
      }
    }
  }
}
