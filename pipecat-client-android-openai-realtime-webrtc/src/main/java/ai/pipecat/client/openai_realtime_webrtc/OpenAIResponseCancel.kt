package ai.pipecat.client.openai_realtime_webrtc

import kotlinx.serialization.Serializable

@Serializable
internal data class OpenAIResponseCancel private constructor(
    val type: String,
) {
    companion object {
        fun new() = OpenAIResponseCancel(
            type = "response.cancel",
        )
    }
}
