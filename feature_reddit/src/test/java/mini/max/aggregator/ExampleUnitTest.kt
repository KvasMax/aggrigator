package mini.max.aggregator

import com.squareup.moshi.Moshi
import mini.max.reddit.data.network.model.Media
import org.junit.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val moshi = Moshi.Builder().build()
        val adapter = moshi.adapter<Media>(Media::class.java)
        val media = adapter.fromJson(
            "{\n" +
                    "            \"reddit_video\": {\n" +
                    "              \"fallback_url\": \"https://v.redd.it/txpdbv910mj21/DASH_1080?source=fallback\",\n" +
                    "              \"height\": 1080,\n" +
                    "              \"width\": 608,\n" +
                    "              \"scrubber_media_url\": \"https://v.redd.it/txpdbv910mj21/DASH_240\",\n" +
                    "              \"dash_url\": \"https://v.redd.it/txpdbv910mj21/DASHPlaylist.mpd\",\n" +
                    "              \"duration\": 233,\n" +
                    "              \"hls_url\": \"https://v.redd.it/txpdbv910mj21/HLSPlaylist.m3u8\",\n" +
                    "              \"is_gif\": false,\n" +
                    "              \"transcoding_status\": \"completed\"\n" +
                    "            }\n" +
                    "          }"
        )
        print(media)
    }
}
