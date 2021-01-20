#!/usr/bin/env groovy
library 'nipun-shared'

def execute(body) {
  node {
    stage('Clone Source') {
      cloneSource(body.SOURCE, body.BRANCH)
    }
    stage('Maven Build') {
      mvnBuild()
    }
    stage('Containerize') {
      containerize(body.ARTIFACT_ID)
    }
  }
}
