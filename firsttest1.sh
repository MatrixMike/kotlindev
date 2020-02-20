#!/bin/bash
~/kotlinc/bin/kotlinc hello.kt -include-runtime -d hello.jar -verbose
java -jar hello.jar  4 5 6

