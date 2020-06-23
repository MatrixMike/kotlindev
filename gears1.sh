#!/bin/bash
## ~/kotlinc/bin/
kotlinc gearRatioCollection.kt -include-runtime -d gearRatioCollection.jar -verbose
java -jar gearRatioCollection.jar  4 5 6

