def call(body) {

        def config = [:]
        body.resolveStrategy = Closure.DELEGATE_FIRST
        body.delegate = config
        body()

        node {
            // Clean workspace before doing anything
            deleteDir()

            try {
stage('Install') {
      steps {
        sh '''ls
pwd
sudo apt-get update
sudo apt-get install vim
'''
      }
     }
    } catch (err) {
                currentBuild.result = 'FAILED'
                throw err
            }
