
// https://dev.to/cjbrooks12/kotlin-reified-generics-explained-3mie
// https://kotlinexpertise.com/kotlin-reified-types/
import java.util.*

val floatValue: Float = Resources.dpToPx(64)
val floatValue: Int   = Resources.dpToPx(64)

inline fun <reified T>
 Resources.dpToPx(value: Int): T {
 val result = TypedValue.applyDimension(
 TypedValue.COMPLEX_UNIT_DIP,
 value.toFloat(),
 displayMetrics)
 
 return when (T::class) {
	Float::class -> result as T
	Int::class -> result.toInt() as T 
	else -> throw illegalAccessException("")
 }
 }
 
