// This pipeline lets your to choose either proceed or abort. once proceed is selected, this moves to  next level

pipeline {
    agent any

    stages {
        stage('Input') {
            steps {
                input('Do you want to proceed?')
            }
        }

        stage('If Proceed is clicked') {
            steps {
                print('hello')
            }
        }
    }
}
