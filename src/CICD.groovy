#!/usr/bin/env groovy
library 'nipun-shared'

def execute() {
  node {
    stage('Clone Source') {
      cloneSource()
    }
  }
}
