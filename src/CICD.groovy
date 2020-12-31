#!/usr/bin/env groovy
library 'nipun-shared'

def execute(body) {
  print(body.SOURCE)
  def src = body.SOURCE
  def branch = body.BRANCH
  node {
    stage('Clone Source') {
      cloneSource(src, branch)
    }// end stage clone source
  }
}
