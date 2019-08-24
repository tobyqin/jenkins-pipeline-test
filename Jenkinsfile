#!groovy

def initSonarRunner() {
    sonarRunnerUrl = "http://admin:admin@localhost:8080/userContent/sonar-runner-dist-2.4.zip"
    sonarRunnerLocation = "/tmp/sonar-runner-2.4/bin/sonar-runner"
    sh """
    if [ ! -f "$sonarRunnerLocation" ]; then
        cd /tmp
        curl "$sonarRunnerUrl" > sonar.zip
        unzip sonar.zip
        chmod +x "$sonarRunnerLocation"
    fi
    """
    return sonarRunnerLocation

}

node() {
    stage('sonar') {
        sh 'env'
        runner = initSonarRunner()
        echo runner
        sh "$runner"
    }
}