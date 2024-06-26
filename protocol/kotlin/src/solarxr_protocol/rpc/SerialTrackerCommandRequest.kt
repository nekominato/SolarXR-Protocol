// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

/**
 * Sends arbitrary command to the current tracker on the serial monitor
 */
@Suppress("unused")
class SerialTrackerCommandRequest : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : SerialTrackerCommandRequest {
        __init(_i, _bb)
        return this
    }
    val command : String?
        get() {
            val o = __offset(4)
            return if (o != 0) __string(o + bb_pos) else null
        }
    val commandAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(4, 1)
    fun commandInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 4, 1)
    companion object {
        @JvmStatic
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        @JvmStatic
        fun getRootAsSerialTrackerCommandRequest(_bb: ByteBuffer): SerialTrackerCommandRequest = getRootAsSerialTrackerCommandRequest(_bb, SerialTrackerCommandRequest())
        @JvmStatic
        fun getRootAsSerialTrackerCommandRequest(_bb: ByteBuffer, obj: SerialTrackerCommandRequest): SerialTrackerCommandRequest {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        @JvmStatic
        fun createSerialTrackerCommandRequest(builder: FlatBufferBuilder, commandOffset: Int) : Int {
            builder.startTable(1)
            addCommand(builder, commandOffset)
            return endSerialTrackerCommandRequest(builder)
        }
        @JvmStatic
        fun startSerialTrackerCommandRequest(builder: FlatBufferBuilder) = builder.startTable(1)
        @JvmStatic
        fun addCommand(builder: FlatBufferBuilder, command: Int) = builder.addOffset(0, command, 0)
        @JvmStatic
        fun endSerialTrackerCommandRequest(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
