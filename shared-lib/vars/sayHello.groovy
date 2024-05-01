// @groovy.transform.Field //enable prohibited stateful global variable defintion
// def yourField = "YourConstantValue"

def call(String name = 'human') {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    echo "Hello, ${name}."
}