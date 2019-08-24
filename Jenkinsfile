#!groovy

def initSonarRunner() {
    sonarRunnerUrl = "http://admin:admin@localhost:8080/userContent/sonar-runner-dist-2.4.zip"
    sonarRunnerLocation = "/tmp/sonar-runner-2.4/bin/sonar-runner"
    sh """
    if [ ! -f "$sonarRunnerLocation"]; then
        curl $sonarRunnerUrl > /tmp/sonar.zip
        unzip /tmp/sonar.zip
        chmod +x $sonarRunnerLocation
    fi
    """
    return sonarRunnerLocation

}

node() {
    stage('sonar') {
        sh 'env'
        initSonarRunner()
    }
}