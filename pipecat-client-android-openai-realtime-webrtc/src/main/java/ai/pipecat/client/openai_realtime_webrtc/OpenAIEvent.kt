package ai.pipecat.client.openai_realtime_webrtc

import ai.pipecat.client.types.Value
import android.annotation.SuppressLint
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@SuppressLint("UnsafeOptInUsageError")
@Serializable
internal data class OpenAIEvent(
    val type: String,
    val delta: String? = null,
    val error: Error? = null,
    val transcript: String? = null,
    val name: String? = null,
    @SerialName("call_id")
    val callId: String? = null,
    @SerialName("response_id")
    val responseId: String? = null,
    val arguments: Value? = null,
    // For conversation.item.created events
    val item: Item? = null,
    // For truncation events
    @SerialName("item_id")
    val itemId: String? = null,
) {
    @Serializable
    internal data class Error(
        val type: String? = null,
        val code: String? = null,
        val message: String? = null
    ) {
        fun describe() = message ?: code ?: type
    }

    @Serializable
    internal data class Item(
        val id: String,
        val role: String? = null
    )
}