job('petclinic') {
    scm {
        git('git://github.com/Bhaskarganesh/spring-petclinic.git')
    }
    steps {
        maven('-e clean test')
    }
}
