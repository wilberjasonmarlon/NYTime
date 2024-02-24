package com.wilb3r.nytimes

import org.junit.Assert.*
import org.junit.Test
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.time.temporal.Temporal
import java.time.temporal.TemporalField
import java.util.Calendar
import java.util.Date
import kotlin.time.DurationUnit
import kotlin.time.toDuration

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


    @Test
    fun differ_between_tow_offset_type() {
        val initial = OffsetDateTime.parse("2024-02-18T18:29:34-05:00", DateTimeFormatter.ISO_DATE_TIME)
        val final = OffsetDateTime.now()
        val ZDT = initial.toZonedDateTime()
        val diff = ChronoUnit.SECONDS.between(initial, final)
        val dd = diff.toDuration(DurationUnit.SECONDS)
        println("diff >> $dd")
        println("ss >> $ZDT")
    }

    @Test
    fun differ_between_tow_variables_date_type() {
        val initial = OffsetDateTime.parse("2024-02-18T18:29:34-05:00", DateTimeFormatter.ISO_DATE_TIME)
        val initialDate = Date.from(initial.toInstant())
        val finalDate = Date.from(OffsetDateTime.now().toInstant())
        val diff = ChronoUnit.SECONDS.between(initialDate.toInstant(), finalDate.toInstant())
        val dd = diff.toDuration(DurationUnit.SECONDS)
        println("diff >> $dd")
    }

    @Test
    fun sdf() {
        val sdf = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX")

            val initialDate = sdf.parse("2024-02-18T18:29:34-05:00".toString())

        if (initialDate != null)
                println("diff >> $initialDate")





    }

    //"yyyy-MM-d'T'HH:mm:ssZZZZZ"
}