pipeline {
    agent any

    parameters {
        text(name: 'YAML_PARAM', description: 'Enter the YAML parameter', defaultValue: '''
        Please Enter the Input
        ''', trim: true)
    }

    environment {
        OS = ''
    }

    stages {
        stage('Initialisation') {
            steps {
                script {
                    echo 'Initialisation...'
                    def currentJobName = env.JOB_NAME
                    def currentBuildId = env.BUILD_ID
                    def currentBuildNumber = env.BUILD_NUMBER

                    echo "Current Job Name: ${currentJobName}"
                    echo "Current Build ID: ${currentBuildId}"
                    echo "Current Build Number: ${currentBuildNumber}"

                    if (isUnix()) {
                        env.OS = 'unix'
                        sh 'echo "Running on unix based system"'
                    }
                else {
                        env.OS = 'windows'
                        bat 'echo "Running on unix based system"'
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
                echo "${env}"
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
