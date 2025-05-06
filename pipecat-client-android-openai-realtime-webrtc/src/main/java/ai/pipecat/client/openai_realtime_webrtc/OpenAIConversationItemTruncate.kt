package ai.pipecat.client.openai_realtime_webrtc

import android.annotation.SuppressLint
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@SuppressLint("UnsafeOptInUsageError")
@Serializable
internal data class OpenAIConversationItemTruncate private constructor(
    val type: String,
    @SerialName("item_id") val itemId: String,
    @SerialName("audio_end_ms") val audioEndMs: Int,
    @SerialName("content_index") val contentIndex: Int = 0
) {
    companion object {
        fun new(itemId: String, audioEndMs: Int, contentIndex: Int = 0) = OpenAIConversationItemTruncate(
            type = "conversation.item.truncate",
            itemId = itemId,
            audioEndMs = audioEndMs,
            contentIndex = contentIndex
        )
    }
}