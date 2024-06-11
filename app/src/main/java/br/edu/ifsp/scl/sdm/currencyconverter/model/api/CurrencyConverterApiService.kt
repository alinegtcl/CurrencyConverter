package br.edu.ifsp.scl.sdm.currencyconverter.model.api

import br.edu.ifsp.scl.sdm.currencyconverter.model.domain.ConversionResult
import br.edu.ifsp.scl.sdm.currencyconverter.model.domain.CurrencyList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface CurrencyConverterApiService {
    @Headers(
        "x-rapidapi-host: currency-converter5.p.rapidapi.com",
        "x-rapidapi-key: 8e09ec6314msh076d605022ca7b1p174728jsn082b6a5a38d8"
    )
    @GET("list")
    fun getCurrencies(): Call<CurrencyList>

    @Headers(
        "x-rapidapi-host: currency-converter5.p.rapidapi.com",
        "x-rapidapi-key: 8e09ec6314msh076d605022ca7b1p174728jsn082b6a5a38d8"
    )
    @GET("convert")
    fun convert(
        @Query("from") from: String, @Query("to") to: String, @Query("amount") amount: String
    ): Call<ConversionResult>
}