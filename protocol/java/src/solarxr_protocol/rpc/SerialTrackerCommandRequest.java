// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * Sends arbitrary command to the current tracker on the serial monitor
 */
@SuppressWarnings("unused")
public final class SerialTrackerCommandRequest extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static SerialTrackerCommandRequest getRootAsSerialTrackerCommandRequest(ByteBuffer _bb) { return getRootAsSerialTrackerCommandRequest(_bb, new SerialTrackerCommandRequest()); }
  public static SerialTrackerCommandRequest getRootAsSerialTrackerCommandRequest(ByteBuffer _bb, SerialTrackerCommandRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public SerialTrackerCommandRequest __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String command() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer commandAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer commandInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }

  public static int createSerialTrackerCommandRequest(FlatBufferBuilder builder,
      int commandOffset) {
    builder.startTable(1);
    SerialTrackerCommandRequest.addCommand(builder, commandOffset);
    return SerialTrackerCommandRequest.endSerialTrackerCommandRequest(builder);
  }

  public static void startSerialTrackerCommandRequest(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addCommand(FlatBufferBuilder builder, int commandOffset) { builder.addOffset(0, commandOffset, 0); }
  public static int endSerialTrackerCommandRequest(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public SerialTrackerCommandRequest get(int j) { return get(new SerialTrackerCommandRequest(), j); }
    public SerialTrackerCommandRequest get(SerialTrackerCommandRequest obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public SerialTrackerCommandRequestT unpack() {
    SerialTrackerCommandRequestT _o = new SerialTrackerCommandRequestT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(SerialTrackerCommandRequestT _o) {
    String _oCommand = command();
    _o.setCommand(_oCommand);
  }
  public static int pack(FlatBufferBuilder builder, SerialTrackerCommandRequestT _o) {
    if (_o == null) return 0;
    int _command = _o.getCommand() == null ? 0 : builder.createString(_o.getCommand());
    return createSerialTrackerCommandRequest(
      builder,
      _command);
  }
}
