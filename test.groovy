def String thisRepositoryDir = System.getProperty('user.dir')
def String projectDir = 'projects/vending-machine-kata-solution'

job('gameoflife') {
    scm {
        git("file://${thisRepositoryDir}/")
    }
    jdk('jdk-1.8')
    steps {
        maven {
            mavenInstallation('maven3')
            rootPOM("${projectDir}/pom.xml")
            goals('test')
        }
    }
    publishers {
        archiveJunit("${projectDir}/**/surefire-reports/*.xml")
    }
}
