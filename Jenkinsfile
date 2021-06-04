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
                sh 'mvn clean install'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
            }
        }
      stage("SonarQube analysis") {
        steps {
          withSonarQubeEnv('sonar') {
            sh 'mvn sonar:sonar'
          }
        }
      }
      stage("Quality Gate") {
        steps {
          timeout(time: 1, unit: 'HOURS') {
            waitForQualityGate abortPipeline: true
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