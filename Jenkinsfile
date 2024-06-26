pipeline {
    agent any

    parameters {
        string(name: 'YAML_PARAM', description: 'Enter the YAML parameter', defaultValue: '', trim: true)
    }

    stages {
        stage('Initialisation') {
            steps {
                script {
                    echo 'Initialisation...'

                    if (isUnix()) {
                        sh(echo('Running on unix based system'))
                    }
                    else {
                        bat(echo('Running windows system'))
                    }
                }
            }
        }
        stage('Parse YAML') {
            steps {
                echo "${params.YAML_PARAM}"
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
