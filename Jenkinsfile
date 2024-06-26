pipeline {
    agent any

    parameters {
        text(name: 'YAML_PARAM', description: 'Enter the YAML parameter', defaultValue: '''
version: '3.7'

services:
jenkins:
    image: jenkins/jenkins:lts
    container_name: jenkins-master
    restart: always
    ports:
    - "50000:50000"
    volumes:
    - jenkins_home:/var/jenkins_home

nginx:
    image: nginx:latest
    container_name: nginx
    restart: always
    ports:
    - "80:80"
    depends_on:
    - jenkins
    volumes:
    - ./nginx.conf:/etc/nginx/conf.d/default.conf

volumes:
jenkins_home:

        ''', trim: true)
    }

    environment {
        // OS = isUnix() ? 'unix' : 'windows'
        OS = ''
    }

    stages {
        stage('Initialisation') {
            steps {
                script {
                    echo 'Initialisation...'

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
