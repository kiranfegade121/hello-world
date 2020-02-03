def customImage;

pipeline {    
	
	tools {
	
		maven "MAVEN"
	}
	
	stages {
		
		stage('build') {
			steps {
				bat label: '', script: 'mvn clean package'
			}
		}
		
		stage('build image') {
			steps {
					customImage = docker.build("amitfegade121/hello-world:v2")
			}
		}		
		
		stage('push an image') {
			steps {
				docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-cred') {
					customImage.push()
				}
			}
		}
	}
}	