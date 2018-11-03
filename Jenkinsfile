pipeline {
    agent any
 
    stages {
        stage ('Install Tools') {
            tools {
                maven 'Maven_3_5_2' 
             }
        }
        
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
