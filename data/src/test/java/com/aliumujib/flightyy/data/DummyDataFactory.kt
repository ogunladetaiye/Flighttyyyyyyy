package com.aliumujib.flightyy.data

import com.aliumujib.flightyy.data.model.AirlineEntity
import com.aliumujib.flightyy.data.model.AirportEntity
import com.aliumujib.flightyy.data.model.schedule.ArrivalDepartureEntity
import com.aliumujib.flightyy.data.model.schedule.FlightEntity
import com.aliumujib.flightyy.data.model.schedule.ScheduleEntity
import com.aliumujib.flightyy.domain.models.Airline
import com.aliumujib.flightyy.domain.models.Airport
import konveyor.base.randomBuild

object DummyDataFactory {

    fun makeRandomFlightEntity(): FlightEntity {
        return randomBuild()
    }

    fun makeRandomArrivalDepartureEntity(): ArrivalDepartureEntity {
        return randomBuild()
    }

    fun makeRandomAirlineEntity(): AirlineEntity {
        return randomBuild()
    }

    fun makeRandomAirline(): Airline {
        return randomBuild()
    }

    fun makeRandomAirportEntity(): AirportEntity {
        return randomBuild()
    }


    fun makeRandomAirport(): Airport {
        return randomBuild()
    }

    fun makeScheduleEntity(): ScheduleEntity {
        return randomBuild()
    }

    fun makeAirportEntities(count: Int): List<AirportEntity> {
        val articles = mutableListOf<AirportEntity>()
        repeat(count) {
            articles.add(makeRandomAirportEntity())
        }
        return articles
    }


}