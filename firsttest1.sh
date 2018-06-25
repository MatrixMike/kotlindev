#!/bin/bash
~/kotlinc/bin/kotlinc hello.kt -include-runtime -d hello.jar
java -jar hello.jar  4 5 6

