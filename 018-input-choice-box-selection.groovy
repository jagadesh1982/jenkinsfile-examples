// This pipeline lets user to choose from choice box with an input. once user chooses one choice from list box it moved to next level

pipeline {
    agent any

    stages {
        
        stage('Wait for user to input text?') {
           steps {
             script {
                 def userInput = input(id: 'userInput', message: 'Merge to?',
                      parameters: [[$class: 'ChoiceParameterDefinition', defaultValue: 'strDef', 
                         description:'describing choices', name:'nameChoice', choices: "QA\nUAT\nProduction\nDevelop\nMaster"]
                    ])
            println(userInput); //Use this value to branch to different logic if needed
              }
             }

           }
    }
}
