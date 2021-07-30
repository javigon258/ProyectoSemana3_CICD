pipeline {
    agent any
    tools {
        maven "maven3.8.1"
        jdk "jdk16"
    }
    stages {
        stage("Env Variables") {
            steps {
                sh "printenv"
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
        stage('Sonar') {
           steps {
               sh 'mvn verify sonar:sonar -Dsonar.projectKey=javigon258_ProyectoSemana3_CICD -Dsonar.organization=javigon258 -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=7234e2b7d5b8d5e9525e781418656a0ee339b573 -Dsonar.branch.name=master'
           }
        }
    }
}