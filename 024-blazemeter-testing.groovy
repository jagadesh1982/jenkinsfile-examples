// This code helps you in running blazemeter tests as a part of pipeline code

pipeline {
     agent any
     
     stages {
       stage ('BlazeMeter test') {
            steps {
                blazeMeterTest credentialsId: 'blazemter-id', testId: '6831215.taurus', workspaceId: '155057'
            }
       }
  }
 }
