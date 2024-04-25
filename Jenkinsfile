pipeline{
	agent { docker { image 'node:16-alpine' } }
	stages {
		stage('node version output'){
			steps {
				sh 'node --version'
			}
		}
	}
}
