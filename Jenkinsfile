pipeline {
    agent any

    parameters{
        string(name:'YAML_PARAM',description:'Enter the YAML paramter')
    }

    stages {
        stage('Initialisation') {
            steps {
                script {
                echo 'Initialisation...'
                }
            }
        }
        stage('Parse YAML'){
            steps{
                echo '${params.YAML_PARAM}'
            }
        }
        stage('Build') {
            steps {
                echo 'Building...'
                echo "DEBUG: parameter OS is ${env.OS}"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
}
