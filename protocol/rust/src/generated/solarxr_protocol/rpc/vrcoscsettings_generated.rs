// automatically generated by the FlatBuffers compiler, do not modify
// @generated
extern crate alloc;
extern crate flatbuffers;
use alloc::boxed::Box;
use alloc::string::{String, ToString};
use alloc::vec::Vec;
use core::mem;
use core::cmp::Ordering;
use self::flatbuffers::{EndianScalar, Follow};
use super::*;
pub enum VRCOSCSettingsOffset {}
#[derive(Copy, Clone, PartialEq)]

pub struct VRCOSCSettings<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for VRCOSCSettings<'a> {
  type Inner = VRCOSCSettings<'a>;
  #[inline]
  unsafe fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table::new(buf, loc) }
  }
}

impl<'a> VRCOSCSettings<'a> {
  pub const VT_ENABLED: flatbuffers::VOffsetT = 4;
  pub const VT_PORTIN: flatbuffers::VOffsetT = 6;
  pub const VT_PORTOUT: flatbuffers::VOffsetT = 8;
  pub const VT_ADDRESS: flatbuffers::VOffsetT = 10;
  pub const VT_TRACKERS: flatbuffers::VOffsetT = 12;

  #[inline]
  pub unsafe fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    VRCOSCSettings { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    args: &'args VRCOSCSettingsArgs<'args>
  ) -> flatbuffers::WIPOffset<VRCOSCSettings<'bldr>> {
    let mut builder = VRCOSCSettingsBuilder::new(_fbb);
    if let Some(x) = args.trackers { builder.add_trackers(x); }
    if let Some(x) = args.address { builder.add_address(x); }
    builder.add_portOut(args.portOut);
    builder.add_portIn(args.portIn);
    builder.add_enabled(args.enabled);
    builder.finish()
  }


  #[inline]
  pub fn enabled(&self) -> bool {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<bool>(VRCOSCSettings::VT_ENABLED, Some(false)).unwrap()}
  }
  #[inline]
  pub fn portIn(&self) -> u16 {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<u16>(VRCOSCSettings::VT_PORTIN, Some(0)).unwrap()}
  }
  #[inline]
  pub fn portOut(&self) -> u16 {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<u16>(VRCOSCSettings::VT_PORTOUT, Some(0)).unwrap()}
  }
  #[inline]
  pub fn address(&self) -> Option<&'a super::datatypes::Ipv4Address> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<super::datatypes::Ipv4Address>(VRCOSCSettings::VT_ADDRESS, None)}
  }
  #[inline]
  pub fn trackers(&self) -> Option<OSCTrackersSetting<'a>> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<flatbuffers::ForwardsUOffset<OSCTrackersSetting>>(VRCOSCSettings::VT_TRACKERS, None)}
  }
}

impl flatbuffers::Verifiable for VRCOSCSettings<'_> {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.visit_table(pos)?
     .visit_field::<bool>("enabled", Self::VT_ENABLED, false)?
     .visit_field::<u16>("portIn", Self::VT_PORTIN, false)?
     .visit_field::<u16>("portOut", Self::VT_PORTOUT, false)?
     .visit_field::<super::datatypes::Ipv4Address>("address", Self::VT_ADDRESS, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<OSCTrackersSetting>>("trackers", Self::VT_TRACKERS, false)?
     .finish();
    Ok(())
  }
}
pub struct VRCOSCSettingsArgs<'a> {
    pub enabled: bool,
    pub portIn: u16,
    pub portOut: u16,
    pub address: Option<&'a super::datatypes::Ipv4Address>,
    pub trackers: Option<flatbuffers::WIPOffset<OSCTrackersSetting<'a>>>,
}
impl<'a> Default for VRCOSCSettingsArgs<'a> {
  #[inline]
  fn default() -> Self {
    VRCOSCSettingsArgs {
      enabled: false,
      portIn: 0,
      portOut: 0,
      address: None,
      trackers: None,
    }
  }
}

pub struct VRCOSCSettingsBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> VRCOSCSettingsBuilder<'a, 'b> {
  #[inline]
  pub fn add_enabled(&mut self, enabled: bool) {
    self.fbb_.push_slot::<bool>(VRCOSCSettings::VT_ENABLED, enabled, false);
  }
  #[inline]
  pub fn add_portIn(&mut self, portIn: u16) {
    self.fbb_.push_slot::<u16>(VRCOSCSettings::VT_PORTIN, portIn, 0);
  }
  #[inline]
  pub fn add_portOut(&mut self, portOut: u16) {
    self.fbb_.push_slot::<u16>(VRCOSCSettings::VT_PORTOUT, portOut, 0);
  }
  #[inline]
  pub fn add_address(&mut self, address: &super::datatypes::Ipv4Address) {
    self.fbb_.push_slot_always::<&super::datatypes::Ipv4Address>(VRCOSCSettings::VT_ADDRESS, address);
  }
  #[inline]
  pub fn add_trackers(&mut self, trackers: flatbuffers::WIPOffset<OSCTrackersSetting<'b >>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<OSCTrackersSetting>>(VRCOSCSettings::VT_TRACKERS, trackers);
  }
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> VRCOSCSettingsBuilder<'a, 'b> {
    let start = _fbb.start_table();
    VRCOSCSettingsBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<VRCOSCSettings<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl core::fmt::Debug for VRCOSCSettings<'_> {
  fn fmt(&self, f: &mut core::fmt::Formatter<'_>) -> core::fmt::Result {
    let mut ds = f.debug_struct("VRCOSCSettings");
      ds.field("enabled", &self.enabled());
      ds.field("portIn", &self.portIn());
      ds.field("portOut", &self.portOut());
      ds.field("address", &self.address());
      ds.field("trackers", &self.trackers());
      ds.finish()
  }
}