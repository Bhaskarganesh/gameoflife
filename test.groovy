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
