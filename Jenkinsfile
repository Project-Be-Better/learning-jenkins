pipeline {
    agent any

    parameters {
        text(name: 'YAML_PARAM', description: 'Enter the YAML parameter', defaultValue: '''
        Please Enter the Input
        ''', trim: true)
    }

    environment {
        OS = checkOS()
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
                echo "${env.OS}"
                script {
                    if (env.OS == 'unix') {
                        sh 'echo "running my python file here"'
                    }
                }
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

def checkOS() {
    if (isUnix()) {
        sh 'echo "Running on unix based system"'
        return 'unix'
    }
    else {
        bat 'echo "Running on unix based system"'
        return 'windows'
    }
}
