package com.aliumujib.flightyy.data.repositories

import com.aliumujib.flightyy.data.cache.AirlineCache
import com.aliumujib.flightyy.data.contracts.ICache
import com.aliumujib.flightyy.data.mapper.AirlineEntityMapper
import com.aliumujib.flightyy.data.model.AirlineEntity
import com.aliumujib.flightyy.domain.models.Airline
import com.aliumujib.flightyy.domain.repositories.airlines.IAirlinesRepository
import io.reactivex.Observable
import javax.inject.Inject

class AirlinesRepositoryImpl @Inject constructor(
    var iCache: AirlineCache,
    var airlineEntityMapper: AirlineEntityMapper
) : IAirlinesRepository {


    override fun getAirlineWithId(id: String): Observable<Airline> {
        return Observable.just(airlineEntityMapper.mapFromEntity(iCache.get(id)))
    }


}