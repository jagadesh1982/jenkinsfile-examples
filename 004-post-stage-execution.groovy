pipeline {
  agent any
  stages {

    stage('Stage 1') {
      steps {
        script {
          echo 'Stage 1'
        }
      }
      post {
        always {
          script {
            echo 'stage1.always'
          }
        }
        success {
          script {
            echo 'stage1.success'
          }
        }
        changed {
          script {
            echo 'stage1.changed'
          }
        }
        aborted {
          script {
            echo 'stage1.aborted'
          }
        }
        failure {
          script {
            echo 'stage1.failure'
          }
        }
      }
    }

  }

}
