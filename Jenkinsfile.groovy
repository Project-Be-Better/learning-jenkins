
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
                    def yamlContent = readFile(params.UPLOAD_FILE)
                    echo "Simulation mode: ${params.SIMULATION}"
                    echo "Operating System: ${params.OS}"
                    echo(yamlContent.trim())
                
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
