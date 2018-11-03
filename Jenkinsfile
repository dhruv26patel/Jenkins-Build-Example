pipeline {
    agent any
    tools {
        maven 'Maven_3_5_2' 
    }
    
    stages {
        stage ('Compile Stage') {

            steps {
                sh 'mvn clean compile'
            }
        }

        stage ('Testing Stage') {

            steps {
                sh 'mvn test'
            }
        }

        stage ('Deploy') {

               steps {
                sh 'mvn deploy'
              }

         }
    }
}
