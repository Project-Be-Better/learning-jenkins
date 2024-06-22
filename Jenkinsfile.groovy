
pipeline {
    agent any

    stages {



        stage('Initialisation'){
            steps{
                echo('Initialisation')
            }
        }
        stage('Build') {
            steps {
                    echo 'Building...'

                    echo "Simulation mode: ${params.SIMULATION}"
                    echo "Operating System: ${params.OS}"
                    echo "Operating System: ${params.YAML_FILE}"
                
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
