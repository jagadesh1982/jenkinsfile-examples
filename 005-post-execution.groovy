pipeline {
  agent any
  stages {

    stage('Stage 1') {
      steps {
        script {
          echo 'Stage 1'
        }
      }
   
    }

  }

  post {
    always {
      script {
        echo 'post.always'
      }
    }
    success {
      script {
        echo 'post.success'
      }
    }
    changed {
      script {
        echo 'post.changed'
      }
    }
    aborted {
      script {
        echo 'post.aborted'
      }
    }
    failure {
      script {
        echo 'post.failure'
      }
    }
  }

}
