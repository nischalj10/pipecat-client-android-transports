package ai.pipecat.client.openai_realtime_webrtc

import kotlinx.serialization.Serializable

@Serializable
internal data class OpenAIResponseCancel private constructor(
    val type: String,
    @SerialName("response_id") val responseId: String? = null
) {
    companion object {
        fun new() = OpenAIResponseCancel(
            type = "response.cancel"
        )

        fun withResponseId(responseId: String) = OpenAIResponseCancel(
            type = "response.cancel",
            responseId = responseId
        )
    }
}
