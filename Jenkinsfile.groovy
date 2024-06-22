pipeline {
    agent any

    parameters {
        text(name: 'UPLOAD_FILE', defaultValue: 'config.yml', description: 'Path to YAML configuration file')
        booleanParam(name: 'SIMULATION', defaultValue: false, description: 'Simulation mode')
        string(name: 'OS', defaultValue: '', description: 'Operating System')
    }

    stages {
        stage('Initialisation') {
            steps {
                script {
                    // Check if the file exists
                    if (fileExists(params.UPLOAD_FILE)) {
                        // Read YAML content from file
                        def yamlContent = readFile(params.UPLOAD_FILE)
                        echo 'Initialisation'
                        echo "Config YAML:"
                        echo yamlContent.trim()
                        echo "Simulation mode: ${params.SIMULATION}"
                        echo "Operating System: ${params.OS}"
                    } else {
                        error "File ${params.UPLOAD_FILE} not found."
                    }
                }
            }
        }
        stage('Build') {
            steps {
                echo 'Building...'
                echo "DEBUG: parameter OS is ${params.OS}"
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
