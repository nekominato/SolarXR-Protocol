// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.datatypes.hardware_info;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * A mask of the data in `FirmwareStatus`
 */
@SuppressWarnings("unused")
public final class FirmwareStatusMask extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static FirmwareStatusMask getRootAsFirmwareStatusMask(ByteBuffer _bb) { return getRootAsFirmwareStatusMask(_bb, new FirmwareStatusMask()); }
  public static FirmwareStatusMask getRootAsFirmwareStatusMask(ByteBuffer _bb, FirmwareStatusMask obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public FirmwareStatusMask __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public boolean errorStatus() { int o = __offset(4); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean tps() { int o = __offset(6); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean ping() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean rssi() { int o = __offset(10); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mcuTemp() { int o = __offset(12); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean batteryVoltage() { int o = __offset(14); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean batteryPctEstimate() { int o = __offset(16); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createFirmwareStatusMask(FlatBufferBuilder builder,
      boolean errorStatus,
      boolean tps,
      boolean ping,
      boolean rssi,
      boolean mcuTemp,
      boolean batteryVoltage,
      boolean batteryPctEstimate) {
    builder.startTable(7);
    FirmwareStatusMask.addBatteryPctEstimate(builder, batteryPctEstimate);
    FirmwareStatusMask.addBatteryVoltage(builder, batteryVoltage);
    FirmwareStatusMask.addMcuTemp(builder, mcuTemp);
    FirmwareStatusMask.addRssi(builder, rssi);
    FirmwareStatusMask.addPing(builder, ping);
    FirmwareStatusMask.addTps(builder, tps);
    FirmwareStatusMask.addErrorStatus(builder, errorStatus);
    return FirmwareStatusMask.endFirmwareStatusMask(builder);
  }

  public static void startFirmwareStatusMask(FlatBufferBuilder builder) { builder.startTable(7); }
  public static void addErrorStatus(FlatBufferBuilder builder, boolean errorStatus) { builder.addBoolean(0, errorStatus, false); }
  public static void addTps(FlatBufferBuilder builder, boolean tps) { builder.addBoolean(1, tps, false); }
  public static void addPing(FlatBufferBuilder builder, boolean ping) { builder.addBoolean(2, ping, false); }
  public static void addRssi(FlatBufferBuilder builder, boolean rssi) { builder.addBoolean(3, rssi, false); }
  public static void addMcuTemp(FlatBufferBuilder builder, boolean mcuTemp) { builder.addBoolean(4, mcuTemp, false); }
  public static void addBatteryVoltage(FlatBufferBuilder builder, boolean batteryVoltage) { builder.addBoolean(5, batteryVoltage, false); }
  public static void addBatteryPctEstimate(FlatBufferBuilder builder, boolean batteryPctEstimate) { builder.addBoolean(6, batteryPctEstimate, false); }
  public static int endFirmwareStatusMask(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public FirmwareStatusMask get(int j) { return get(new FirmwareStatusMask(), j); }
    public FirmwareStatusMask get(FirmwareStatusMask obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public FirmwareStatusMaskT unpack() {
    FirmwareStatusMaskT _o = new FirmwareStatusMaskT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(FirmwareStatusMaskT _o) {
    boolean _oErrorStatus = errorStatus();
    _o.setErrorStatus(_oErrorStatus);
    boolean _oTps = tps();
    _o.setTps(_oTps);
    boolean _oPing = ping();
    _o.setPing(_oPing);
    boolean _oRssi = rssi();
    _o.setRssi(_oRssi);
    boolean _oMcuTemp = mcuTemp();
    _o.setMcuTemp(_oMcuTemp);
    boolean _oBatteryVoltage = batteryVoltage();
    _o.setBatteryVoltage(_oBatteryVoltage);
    boolean _oBatteryPctEstimate = batteryPctEstimate();
    _o.setBatteryPctEstimate(_oBatteryPctEstimate);
  }
  public static int pack(FlatBufferBuilder builder, FirmwareStatusMaskT _o) {
    if (_o == null) return 0;
    return createFirmwareStatusMask(
      builder,
      _o.getErrorStatus(),
      _o.getTps(),
      _o.getPing(),
      _o.getRssi(),
      _o.getMcuTemp(),
      _o.getBatteryVoltage(),
      _o.getBatteryPctEstimate());
  }
}

