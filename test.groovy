def map = ['sonar.projectKey':'my-key','sonar.projectName':'abc']
def updates = ['sonar.projectName':'def','sonar.projectVersion':'1.0']

map = map << updates

println map

sonarArgs = map.collect{k,v-> "\"-D$k=$v\""}.join(' ')

println sonarArgs