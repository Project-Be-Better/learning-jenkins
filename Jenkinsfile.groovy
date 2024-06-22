
pipeline {
    agent any

    def OS = params.OS
    def config = readYaml text: params.CONFIG_YAML

    stages {

        stage('Initialisation'){
            steps{
                echo('Initialisation')
                echo config
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
