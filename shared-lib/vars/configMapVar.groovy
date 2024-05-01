def call(Map config) {
    node {
        sh 'echo "Hi ${config.fn} ${config.ln}, welcome to shared libraries!"'
    }
}