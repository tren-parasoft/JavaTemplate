pipeline {
    agent any
    environment {
        //Java17 = "c:/Progra~1/Java/jdk-17/bin/java.exe"
        //JenkinsFile = "c:/Progra~2/Jenkins/jenkins.war --version"
        _CONFIG = "builtin://Unit Tests"
    }
    stages {
        stage('Check tools') {
            steps {
                bat "mvn -version"
            }
        }
	    stage('Unit Tests') {
            steps {
                bat "mvn clean test-compile jtest:agent test jtest:jtest -Djtest.config=\"${_CONFIG}\""
            }
        }
        stage('Parasoft coverage') {
            steps {
                //recordParasoftCoverage pattern: 'target/jtest/coverage.xml', referenceBuild: '20', referenceJob: 'Demo', sourceCodeEncoding: 'UTF-8'
                recordParasoftCoverage coverageQualityGates: [[criticality: 'UNSTABLE', threshold: 5.0, type: 'PROJECT']], pattern: 'target/jtest/coverage.xml'
            }
        }
    }
}