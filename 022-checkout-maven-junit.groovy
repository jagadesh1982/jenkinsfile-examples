// Pipeline code to build a maven project , run tests and use Junit Plugin to display the results

pipeline {
     agent any
     tools {
         maven 'Default'
     }
     
     
     stages {
         
         stage("initialize"){
            steps {
              sh '''
                echo "PATH = ${PATH}"
                echo "M2_HOME = ${M2_HOME}"
             '''
            }
         }
         
         stage("checkout"){
             steps {
             git credentialsId: 'github-org', url: 'https://github.com/jagadish12/junitmavenexample.git'
             }
         }
         
         stage("Maven Build"){
             steps {
                 sh 'mvn -Dmaven.test.failure.ignore=true clean verify '
             }
         }      
             
         }
         
         post {
           always {
              archive "target/**/*"
              junit '**/target/surefire-reports/TEST-*.xml'
          }
        }
         
     }
