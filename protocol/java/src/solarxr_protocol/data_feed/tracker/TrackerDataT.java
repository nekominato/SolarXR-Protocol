// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.data_feed.tracker;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public class TrackerDataT {
  private solarxr_protocol.datatypes.TrackerIdT trackerId;
  private solarxr_protocol.data_feed.tracker.TrackerInfoT info;
  private int status;
  private solarxr_protocol.datatypes.math.QuatT rotation;
  private solarxr_protocol.datatypes.math.Vec3fT position;
  private solarxr_protocol.datatypes.math.Vec3fT rawRotVel;
  private solarxr_protocol.datatypes.math.Vec3fT rawTransAccel;
  private solarxr_protocol.datatypes.TemperatureT temp;

  public solarxr_protocol.datatypes.TrackerIdT getTrackerId() { return trackerId; }

  public void setTrackerId(solarxr_protocol.datatypes.TrackerIdT trackerId) { this.trackerId = trackerId; }

  public solarxr_protocol.data_feed.tracker.TrackerInfoT getInfo() { return info; }

  public void setInfo(solarxr_protocol.data_feed.tracker.TrackerInfoT info) { this.info = info; }

  public int getStatus() { return status; }

  public void setStatus(int status) { this.status = status; }

  public solarxr_protocol.datatypes.math.QuatT getRotation() { return rotation; }

  public void setRotation(solarxr_protocol.datatypes.math.QuatT rotation) { this.rotation = rotation; }

  public solarxr_protocol.datatypes.math.Vec3fT getPosition() { return position; }

  public void setPosition(solarxr_protocol.datatypes.math.Vec3fT position) { this.position = position; }

  public solarxr_protocol.datatypes.math.Vec3fT getRawRotVel() { return rawRotVel; }

  public void setRawRotVel(solarxr_protocol.datatypes.math.Vec3fT rawRotVel) { this.rawRotVel = rawRotVel; }

  public solarxr_protocol.datatypes.math.Vec3fT getRawTransAccel() { return rawTransAccel; }

  public void setRawTransAccel(solarxr_protocol.datatypes.math.Vec3fT rawTransAccel) { this.rawTransAccel = rawTransAccel; }

  public solarxr_protocol.datatypes.TemperatureT getTemp() { return temp; }

  public void setTemp(solarxr_protocol.datatypes.TemperatureT temp) { this.temp = temp; }


  public TrackerDataT() {
    this.trackerId = null;
    this.info = null;
    this.status = 0;
    this.rotation = new solarxr_protocol.datatypes.math.QuatT();
    this.position = new solarxr_protocol.datatypes.math.Vec3fT();
    this.rawRotVel = new solarxr_protocol.datatypes.math.Vec3fT();
    this.rawTransAccel = new solarxr_protocol.datatypes.math.Vec3fT();
    this.temp = new solarxr_protocol.datatypes.TemperatureT();
  }
}

