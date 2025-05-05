package ai.pipecat.client.openai_realtime_webrtc

import android.annotation.SuppressLint
import kotlinx.serialization.Serializable

@SuppressLint("UnsafeOptInUsageError")
@Serializable
internal data class ClearOutputAudioBuffer private constructor(
    val type: String,
) {
    companion object {
        fun new() = ClearOutputAudioBuffer(
            type = "output_audio_buffer.clear",
        )
    }
}
