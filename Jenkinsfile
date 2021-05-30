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
                        sh '''
                            cf push Blue -n hotelreservation
                            cf push Green -n hotelreservation-temp
                            cf map-route Green cfapps.eu10.hana.ondemand.com -n hotelreservation
                            cf unmap-route Blue cfapps.eu10.hana.ondemand.com -n hotelreservation
                        '''
                    }
                }
    }
}