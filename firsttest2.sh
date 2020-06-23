#!/bin/bash
## ~/kotlinc/bin/
kotlinc bezier1.kt -include-runtime -d bezier1.jar
java -jar bezier1.jar  4 5 6
xviewer quadratic_bezier.jpg &

