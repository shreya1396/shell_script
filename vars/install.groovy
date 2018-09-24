def call(body) {

        def config = [:]
        body.resolveStrategy = Closure.DELEGATE_FIRST
        body.delegate = config
        body()

        node {
            // Clean workspace before doing anything
            deleteDir()

            try {
stage('Build') {
      steps {
        sh '''
echo 'build stage executing'
'''
      }
     }
    } catch (err) {
                currentBuild.result = 'FAILED'
                throw err
            }
