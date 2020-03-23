job('Seed All') {
  scm {
    git ('https://github.com/Bhaskarganesh/gameoflife.git')
  }
  steps {
    dsl {
      external('*.groovy')  
      // default behavior
      // removeAction('IGNORE')      
      removeAction('DELETE')
    }
  }
}
