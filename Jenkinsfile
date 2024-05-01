// only needed if src classes will be imported and utilized at script compile time
@Library('shared-libraries') _
// or
// library('shared-libraries').com....
// library 'shared-lib' //only global vars imported at runtime

// non-predefined library in jenkins system
// library identifier: 'shared-lib@develop', retriever: modernSCM(
//   [$class: 'GitSCMSource',
//    remote: 'https://github.com/Gaurav-Shinde/jenkins-sandbox.git',
//    ])

pipeline{
	agent { docker { image 'node:16-alpine' } }
	stages {
		stage('node version output'){
			steps {
				sh 'node --version'
			}
		}
        stage('testing log global var'){
            steps{
                script{
                    log.info 'this is some info'
                    log.warning 'this is some warning'
                }
            }
        }
        stage('testing sayHello global var'){
            steps{
                script{
                    sayHello 'Joe'
                }
            }
        }
        stage('testing linuxClosureBlock global var'){
            steps{
                script{
                    linuxClosureBlock{
                        sh 'whoami'
                    }
                }
            }
        }
        stage('testing configMapVar global var'){
            steps{
                script{
                    configMapVar(fn:'Joe',ln:'Biden')
                }
            }
        }
	}
}
