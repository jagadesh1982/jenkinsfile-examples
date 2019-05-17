pipeline {
  agent any

  stages {

    stage('Stage 2') {
      steps {
        timeout(time: 1, unit: 'MINUTES') {
          waitUntil {
            script {
              echo 'This stage should succeed immediately if google.com is up, otherwise jenkins will retry until 1min runs out.'
              def status = sh script: 'wget -q https://google.com -O /dev/null', returnStatus: true
              return (status == 0)
            }
          }
        }
      }
    }

  }
}
