
pipeline {
    agent any

    def CONFIG_YAML = params.YAML_FILE
    def BOOL_SIMULATION = params.SIMULATION
    def OS = params.OS

    stages {

        stage('Initialisation') {
            steps {
                script {
                    // def CONFIG = readYaml text: params.UPLOAD_FILE
                    echo 'Initialisation'
                    echo "Config YAML:"
                    echo(CONFIG_YAML)
                    echo(BOOL_SIMULATION)
                    echo(OS)
                }
            }
        }
        stage('Build') {
            steps {
                echo 'Building...'

                print 'DEBUG: parameter OS is  ' + OS
                echo(CONFIG)
                
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
