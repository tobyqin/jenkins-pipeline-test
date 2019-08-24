#!groovy

def initSonarRunner() {
    sonarRunnerUrl = "http://admin:admin@localhost:8080/userContent/sonar-runner-dist-2.4.zip"
    sonarRunnerLocation = "/tmp/sonar-runner-2.4/bin/sonar-runner"
    echo "Initialize Sonar-Runner..."
    sh """
    if [ ! -f "$sonarRunnerLocation" ]; then
        cd /tmp
        curl "$sonarRunnerUrl" > sonar.zip
        unzip sonar.zip && rm sonar.zip
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
        sh "$runner \
          -Dsonar.projectKey=pipeline-test \
          -Dsonar.projectName=pipeline-test \
          -Dsonar.projectVersion=1.0 \
          -Dsonar.java.binaries=./target/classes \
          -Dsonar.sources=. \
          -Dsonar.host.url=http://172.17.0.3:9001"

    }
}