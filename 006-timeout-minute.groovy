pipeline {
  agent any

  stages {

    stage('Stage 1') {
      steps {
        timeout(time: 1, unit: 'MINUTES') {
          waitUntil {
            script {
              echo 'This stage will succeed immediately without waiting for a minute.'
              return true
            }
          }
        }
      }
    }
  
  }
}
