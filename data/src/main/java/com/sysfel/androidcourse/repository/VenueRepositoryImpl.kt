package com.sysfel.androidcourse.repository

import com.sysfel.androidcourse.mapper.DataMapper
import com.sysfel.androidcourse.model.VenueConfigurationResponse
import com.sysfel.androidcourse.remote.VenueApiService

abstract class VenueRepositoryImpl (
    private val venueApiService: VenueApiService,
    private val venueConfigurationMapper: DataMapper<VenueConfigurationResponse, VenueConfiguration>
): VenueRepository {

    override suspend fun getVenueConfiguration(): VenueConfiguration {
        val response = this.venueApiService.getVenueConfiguration();
        return venueConfigurationMapper.map(response);
    }
}