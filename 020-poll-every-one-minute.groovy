// This will let this job run for every 1 minute

pipeline {
agent any
triggers {
	//Run this job every 1 minutes
    pollSCM('* * * * *')
}

stages {
     stage ("testing"){
       steps {
         echo "hello world for every 1 minute"
       }
     }
 }

}
