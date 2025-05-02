package ai.pipecat.client.openai_realtime_webrtc

import kotlinx.serialization.Serializable

@Serializable
internal data class CommitInputAudioBuffer private constructor(
    val type: String,
) {
    companion object {
        fun new() = CommitInputAudioBuffer(
            type = "input_audio_buffer.commit",
        )
    }
}
