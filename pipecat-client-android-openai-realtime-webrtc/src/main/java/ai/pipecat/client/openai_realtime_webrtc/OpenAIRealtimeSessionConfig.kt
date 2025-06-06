package ai.pipecat.client.openai_realtime_webrtc

import ai.pipecat.client.types.Value
import android.annotation.SuppressLint
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@SuppressLint("UnsafeOptInUsageError")
@Serializable
data class OpenAIRealtimeSessionConfig(
    val modalities: List<String>? = null,
    val instructions: String? = null,
    val model: String? = null,
    val voice: String? = null,
    @SerialName("turn_detection")
    val turnDetection: Value? = null,
    @SerialName("input_audio_noise_reduction")
    val inputAudioNoiseReduction: Value? = null,
    val tools: Value? = null,
    @SerialName("tool_choice")
    val toolChoice: String? = null,
    val temperature: Float? = null,
    @SerialName("input_audio_transcription")
    val inputAudioTranscription: Value? = null,
    // Tracing configuration - can be "auto" string, object, or null
    val tracing: Value? = null
)
