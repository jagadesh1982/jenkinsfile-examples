pipeline {
  agent any

  stages {

   stage('Stage 3') {
      steps {
        timeout(time: 10, unit: 'SECONDS') {
          waitUntil {
            script {
              echo 'This stage will be executed again and again until 10sec is reached and then the stage will be marked as failure.'
              return false
            }
          }
        }
      }
    }

  }
}
