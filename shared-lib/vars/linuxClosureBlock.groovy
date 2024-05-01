// vars/linuxClosureBlock.groovy
def call(Closure body) {
    node('linux') {
        body()
    }
}