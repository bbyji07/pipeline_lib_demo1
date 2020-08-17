final mysharedlibrary1 = library('mysharedlibrary1')

def execute(String zCmakeListsPath){
  stage('some kind of stage 2') {
    echo "Hello from stage 1 with " + zCmakeListsPath
    echo "var attempt ${env.mySrcDir}"

  }
  stage('second stage'){
    echo "and one from stage 2"
    echo "param was " + zCmakeListsPath
    echo "var attempt ${env.myBuildDir}"
    //call function from global lib
    mysharedlibrary1.deleteFile 'for 3rd party global library now'
  }
}

return this
