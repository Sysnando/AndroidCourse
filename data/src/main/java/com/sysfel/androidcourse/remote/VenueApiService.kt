package com.sysfel.androidcourse.remote

import com.sysfel.androidcourse.model.VenueConfigurationResponse
import retrofit2.http.GET

interface VenueApiService {

    @GET
    suspend fun getVenueConfiguration(): VenueConfigurationResponse

}