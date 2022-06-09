pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Build Demo Application'
        sh '''sh run_build_script.sh
'''
      }
    }

    stage('Windows Tests') {
      steps {
        echo 'Run Windows tests'
      }
    }

    stage('Deploy Staging') {
      steps {
        input 'Ok to deploy to product'
      }
    }

    stage('Deploy Production') {
      steps {
        echo 'Deploy to Prod'
      }
    }

  }
}