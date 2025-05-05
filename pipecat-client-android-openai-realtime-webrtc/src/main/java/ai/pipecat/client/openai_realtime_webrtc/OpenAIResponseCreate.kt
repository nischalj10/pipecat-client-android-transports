package ai.pipecat.client.openai_realtime_webrtc

import android.annotation.SuppressLint
import kotlinx.serialization.Serializable

@SuppressLint("UnsafeOptInUsageError")
@Serializable
internal data class OpenAIResponseCreate private constructor(
    val type: String,
) {
    companion object {
        fun new() = OpenAIResponseCreate(
            type = "response.create",
        )
    }
}
