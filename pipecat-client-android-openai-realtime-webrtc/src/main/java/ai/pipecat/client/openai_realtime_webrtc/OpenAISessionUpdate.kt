package ai.pipecat.client.openai_realtime_webrtc

import ai.pipecat.client.types.Value
import android.annotation.SuppressLint
import kotlinx.serialization.Serializable

@SuppressLint("UnsafeOptInUsageError")
@Serializable
internal data class OpenAISessionUpdate private constructor(
    val type: String,
    val session: Value
) {
    companion object {
        fun of(session: Value) = OpenAISessionUpdate(
            type = "session.update",
            session = when (session) {
                is Value.Object -> {
                    // Ensure turnDetection is explicitly included as Value.Null if it's meant to be null
                    if ("turn_detection" !in session.value) {
                        Value.Object(session.value + ("turn_detection" to Value.Null))
                    } else {
                        session
                    }
                }
                else -> session
            }
        )
    }
}


