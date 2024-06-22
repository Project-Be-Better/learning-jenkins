
pipeline {
    agent any

    def OS = params.OS
    def CONFIG = readYaml text: params.UPLOAD_FILE
    def SIMULATION = params.SIMULATION

    stages {

        stage('Initialisation'){
            steps{
                echo('Initialisation')
                echo(CONFIG)
                echo(SIMULATION)
            }
        }
        stage('Build') {
            steps {
                echo 'Building...'

                print 'DEBUG: parameter OS is  ' + OS
                
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
