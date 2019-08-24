#!groovy

def initSonarRunner() {
    sonarRunnerUrl = "http://admin:admin@localhost:8080/userContent/sonar-runner-dist-2.4.zip"
    sonarRunnerLocation = "/temp/sonar-runner-2.4/bin/sonar-runner"
    sh """curl $sonarRunnerUrl > /temp/sonar.zip
        unzip /temp/sonar.zip
        chmod +x $sonarRunnerLocation
    """
    return sonarRunnerLocation

}

node() {
    stage('sonar') {
        sh 'env'
        initSonarRunner()
    }
}