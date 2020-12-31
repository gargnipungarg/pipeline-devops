#!/usr/bin/env groovy
library 'nipun-shared'

def execute(body) {
  node {
    stage('Clone Source') {
      cloneSource(body.SOURCE, body.BRANCH)
    }
    stage('Clone Source') {
      mvnBuild()
    }
  }
}
