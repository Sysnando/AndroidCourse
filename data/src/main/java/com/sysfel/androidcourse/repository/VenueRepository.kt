package com.sysfel.androidcourse.repository

import com.sysfel.androidcourse.mapper.DataMapper
import com.sysfel.androidcourse.model.VenueConfigurationResponse

interface VenueRepository: DataMapper<VenueConfigurationResponse, VenueConfiguration> {

    suspend fun getVenueConfiguration(): VenueConfiguration

}

data class VenueConfiguration(
    val name: String
){}