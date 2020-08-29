
import java.time.LocalTime; 
import java.time.LocalDate;  // Import the LocalDateTime class
import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class
import java.time.ZonedDateTime;
// https://www.ict.social/kotlin/oop/date-and-time-in-kotlin-parsing-and-comparing

fun main(args: Array<String>) {
// println(gearsOut())
val dateTime = LocalDateTime.parse("2016-12-08T10:20:30")
val date = LocalDate.parse("2016-12-08")
val time = LocalTime.parse("10:20:30")

println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)))
println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)))
println(time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)))
}
