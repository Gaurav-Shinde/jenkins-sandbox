// @Library('shared-lib') _

void call(){
    stage("SayMessage: greet"){
        steps{
            script{
                sayMessage 'greet from greetingsV2'
            }
        }
    }
}