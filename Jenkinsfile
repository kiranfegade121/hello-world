
pipeline {

    agent any    
	
	tools {
	
		maven "MAVEN"
	}
	
	stages {
		
		stage('build') {
			steps {
				bat label: '', script: 'mvn clean package'
			}
		}
		
		stage('build image and push an image') {
			steps {
			
			    script {
						// This step should not normally be used in your script. Consult the inline help for details.
					withDockerRegistry(credentialsId: 'docker-hub-cred', url: 'https://registry.hub.docker.com') {
						def customImage = docker.build("amitfegade121/hello-world:2.0")
						customImage.push();
					}
				}
				
			}
		}		
		
		
	}
}	