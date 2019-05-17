// this pipeline helps you to send email to a recipent

pipeline {
     agent any
     
   stage('mail'){
     steps{
       emailext attachLog: true, body: 'Jenkins Build - Status Report', subject: 'Build Report', to: 'jagadesh.manchala@gmail.com'
        }
    }
  }
