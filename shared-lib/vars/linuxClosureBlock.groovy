// vars/linuxClosureBlock.groovy
def call(Closure body) {
    node { // can be node('agent-label-of-platform')
        body()
    }
}