#!/bin/bash
~/kotlinc/bin/kotlinc-js -output sample-library.js -meta-info                        library.kt
~/kotlinc/bin/kotlinc-js -output binom.js          -libraries sample-library.meta.js binom.kt
ls -lctrh
cat binom.js

