// this pipeline code lets to define environment varaibles in the environment section and using them in the rest of the pipeline

pipeline {
  environment {
    // environment variables and credential retrieval can be interspersed
    SOME_VAR = "SOME VALUE"
    INBETWEEN = "Something in between"
    // Env variables can refer to other variables as well
    OTHER_VAR = "${SOME_VAR}"
  }

  agent any

  stages {
    stage("foo") {
      steps {
        // environment variables are not masked
        sh 'echo "SOME_VAR is $SOME_VAR"'
        sh 'echo "INBETWEEN is $INBETWEEN"'
        sh 'echo "OTHER_VAR is $OTHER_VAR"'

      }
    }
  }
}
