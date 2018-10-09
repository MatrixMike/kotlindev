if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'binom'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'binom'.");
}
if (typeof this['sample-library'] === 'undefined') {
  throw new Error("Error loading module 'binom'. Its dependency 'sample-library' was not found. Please, check whether 'sample-library' is loaded prior to 'binom'.");
}
var binom = function (_, Kotlin, $module$sample_library) {
  'use strict';
  var $$importsForInline$$ = _.$$importsForInline$$ || (_.$$importsForInline$$ = {});
  var factorial = $module$sample_library.org.sample.factorial_za3lpa$;
  var IntRange = Kotlin.kotlin.ranges.IntRange;
  function binom(m, n) {
    return m < n ? factorial(n).div(factorial(m)).div(factorial(n - m | 0)) : Kotlin.Long.ONE;
  }
  function oddFactorial(n) {
    var result = {v: Kotlin.Long.ONE};
    var tmp$;
    tmp$ = (new IntRange(1, n)).iterator();
    while (tmp$.hasNext()) {
      var element = tmp$.next();
      if (element % 2 === 1) {
        result.v = result.v.multiply(Kotlin.Long.fromInt(element));
      }
    }
    return result.v;
  }
  _.binom_vux9f0$ = binom;
  $$importsForInline$$['sample-library'] = $module$sample_library;
  _.oddFactorial_za3lpa$ = oddFactorial;
  Kotlin.defineModule('binom', _);
  return _;
}(typeof binom === 'undefined' ? {} : binom, kotlin, this['sample-library']);
