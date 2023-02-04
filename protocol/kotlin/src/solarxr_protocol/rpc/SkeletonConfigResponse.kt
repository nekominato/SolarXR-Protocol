// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
class SkeletonConfigResponse : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : SkeletonConfigResponse {
        __init(_i, _bb)
        return this
    }
    fun skeletonParts(j: Int) : solarxr_protocol.rpc.SkeletonPart? = skeletonParts(solarxr_protocol.rpc.SkeletonPart(), j)
    fun skeletonParts(obj: solarxr_protocol.rpc.SkeletonPart, j: Int) : solarxr_protocol.rpc.SkeletonPart? {
        val o = __offset(4)
        return if (o != 0) {
            obj.__assign(__indirect(__vector(o) + j * 4), bb)
        } else {
            null
        }
    }
    val skeletonPartsLength : Int
        get() {
            val o = __offset(4); return if (o != 0) __vector_len(o) else 0
        }
    companion object {
        @JvmStatic
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        @JvmStatic
        fun getRootAsSkeletonConfigResponse(_bb: ByteBuffer): SkeletonConfigResponse = getRootAsSkeletonConfigResponse(_bb, SkeletonConfigResponse())
        @JvmStatic
        fun getRootAsSkeletonConfigResponse(_bb: ByteBuffer, obj: SkeletonConfigResponse): SkeletonConfigResponse {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        @JvmStatic
        fun createSkeletonConfigResponse(builder: FlatBufferBuilder, skeletonPartsOffset: Int) : Int {
            builder.startTable(1)
            addSkeletonParts(builder, skeletonPartsOffset)
            return endSkeletonConfigResponse(builder)
        }
        @JvmStatic
        fun startSkeletonConfigResponse(builder: FlatBufferBuilder) = builder.startTable(1)
        @JvmStatic
        fun addSkeletonParts(builder: FlatBufferBuilder, skeletonParts: Int) = builder.addOffset(0, skeletonParts, 0)
        @JvmStatic
        fun createSkeletonPartsVector(builder: FlatBufferBuilder, data: IntArray) : Int {
            builder.startVector(4, data.size, 4)
            for (i in data.size - 1 downTo 0) {
                builder.addOffset(data[i])
            }
            return builder.endVector()
        }
        @JvmStatic
        fun startSkeletonPartsVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 4)
        @JvmStatic
        fun endSkeletonConfigResponse(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}