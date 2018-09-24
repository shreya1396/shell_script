@Library("shell-library") _
    install {
        projectName = "Project1"
        serverDomain = "Project1 Server Domain"
    }
pipeline {
  agent any
  stages {
    stage('Install') {
      steps {
        sh '''ls
pwd
sudo apt-get update
sudo apt-get install vim
'''
      }
    }
  }
}
