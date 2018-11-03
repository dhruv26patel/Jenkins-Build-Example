# Jenkins Build Example

This is an example maven project that consist of a Jenkinsfile that uses the pom.xml file to build the project. 
The mavn project is an implementation of an implementation of **Selection Sort** with couple of junit test to verify the sort implementation. 

The important file in this project is the Jenkinsfile which will be used by the Jenkins CI/CD tool to run the stages specified in the file and provide reults showing a progress bar for each Build. 

# Jenkinsfile Explaination
The below is the implemenatation of the **Jenkinsfile** explained step-by-step.

```
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

        stage ('Deploy Stage') {

               steps {
                sh 'mvn deploy'
              }

         }
    }
}

```
1. **pipleline**: Declaring the pipeline
2. **agent**: This is a start point of the pipleline (similar to main function in java) 
3. **Stages**: It is consiste of multiple build stage which can be comined together
4. **Stage**: Thie stage can consist of steps that contains command for execution
5. **Steps**: Contains more than one steps to execute.

# NOTE
Since this is a maven project and to run the 'mvn' command I first had to specify in the MAVEN_HOME in Global Tool Configuration which is refrenced by 'Maven_3_5_2'. Simar to maven you will also need to add 'JDK' is installed using 'JAVA_HOME'. If you are on Windows insted of 'sh' you will have o run the batch command to work will be 'bat' 
