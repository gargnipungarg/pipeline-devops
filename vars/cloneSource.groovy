#!/usr/bin/env groovy

def call(String source, String branch) {
  git url: source, branch: branch, credentialsId: globalVars.credsId
}
