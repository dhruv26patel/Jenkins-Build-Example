pipeline {
    agent any
    tools {
        maven 'Maven_3_5_2' 
    }
    
    stages {
        stage ('Compile Stage') {

            steps {
                bat 'mvn clean compile'
            }
        }

        stage ('Testing Stage') {

            steps {
                bat 'mvn test'
            }
        }

        stage ('Deploy') {

               steps {
                bat 'mvn deploy'
              }

         }
    }
}
