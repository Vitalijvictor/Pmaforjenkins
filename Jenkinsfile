pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Build Demo Application'
        sh 'h run_build_script.sh'
      }
    }

    stage('Linux Tests') {
      parallel {
        stage('Shell Script') {
          steps {
            echo 'Run Linux tests '
            sh 'sh run_linux_tests.sh'
          }
        }

        stage('Windows Tests') {
          steps {
            echo 'Run Windows tests'
          }
        }

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