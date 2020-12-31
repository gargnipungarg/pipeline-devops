library 'nipun-shared'

def execute() {
  node {
    stage('Clone Source') {
      cloneSource()
    }
  }
}
