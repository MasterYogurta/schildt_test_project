#!/bin/sh
# Compile all classes

# Clean old classes
clean(){
    rm *.class
}

# Compile classes
compile(){
    javac *.java
}

# Main function
main(){
    clear
    clean
    compile
}
