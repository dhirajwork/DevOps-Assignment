pipeline {
    agent any
    tools {
        maven 'Maven 3.6.3'
        jdk 'jdk8'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
            }
        }

        stage ('Deploy') {
                    steps {
                        pushToCloudFoundry cloudSpace: 'dev', credentialsId: 'cftest', organization: 'dc0b90f5trial', target: 'https://api.cf.eu10.hana.ondemand.com'
                    }
                    post {
                        success {
                            echo "Deployed ..."
                        }
                    }
                }

    }
}