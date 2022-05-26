package `in`.blogspot.naufal.githubapiprofile

import retrofit2.http.GET
import retrofit2.Call

public interface PlaceHolder {
    @GET("users")
    fun getUsers() : Call<List<UserData>>
}