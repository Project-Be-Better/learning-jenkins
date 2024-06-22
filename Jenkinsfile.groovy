
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'

                print 'DEBUG: parameter isFoo = ' + params.OS
            // Add your build commands here
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
            // Add your test commands here
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            // Add your deploy commands here
            }
        }
    }
}
