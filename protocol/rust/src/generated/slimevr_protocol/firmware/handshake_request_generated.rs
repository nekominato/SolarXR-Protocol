// automatically generated by the FlatBuffers compiler, do not modify
extern crate flatbuffers;
use std::mem;
use std::cmp::Ordering;
use self::flatbuffers::{EndianScalar, Follow};
use super::*;
pub enum HandshakeRequestOffset {}
#[derive(Copy, Clone, PartialEq)]

pub struct HandshakeRequest<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for HandshakeRequest<'a> {
  type Inner = HandshakeRequest<'a>;
  #[inline]
  fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table { buf, loc } }
  }
}

impl<'a> HandshakeRequest<'a> {
  pub const VT_DEVICE_INFO: flatbuffers::VOffsetT = 4;

  #[inline]
  pub fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    HandshakeRequest { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    args: &'args HandshakeRequestArgs<'args>
  ) -> flatbuffers::WIPOffset<HandshakeRequest<'bldr>> {
    let mut builder = HandshakeRequestBuilder::new(_fbb);
    if let Some(x) = args.device_info { builder.add_device_info(x); }
    builder.finish()
  }


  #[inline]
  pub fn device_info(&self) -> Option<super::hardware_info::DeviceInfo<'a>> {
    self._tab.get::<flatbuffers::ForwardsUOffset<super::hardware_info::DeviceInfo>>(HandshakeRequest::VT_DEVICE_INFO, None)
  }
}

impl flatbuffers::Verifiable for HandshakeRequest<'_> {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.visit_table(pos)?
     .visit_field::<flatbuffers::ForwardsUOffset<super::hardware_info::DeviceInfo>>("device_info", Self::VT_DEVICE_INFO, false)?
     .finish();
    Ok(())
  }
}
pub struct HandshakeRequestArgs<'a> {
    pub device_info: Option<flatbuffers::WIPOffset<super::hardware_info::DeviceInfo<'a>>>,
}
impl<'a> Default for HandshakeRequestArgs<'a> {
  #[inline]
  fn default() -> Self {
    HandshakeRequestArgs {
      device_info: None,
    }
  }
}

pub struct HandshakeRequestBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> HandshakeRequestBuilder<'a, 'b> {
  #[inline]
  pub fn add_device_info(&mut self, device_info: flatbuffers::WIPOffset<super::hardware_info::DeviceInfo<'b >>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<super::hardware_info::DeviceInfo>>(HandshakeRequest::VT_DEVICE_INFO, device_info);
  }
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> HandshakeRequestBuilder<'a, 'b> {
    let start = _fbb.start_table();
    HandshakeRequestBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<HandshakeRequest<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl std::fmt::Debug for HandshakeRequest<'_> {
  fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
    let mut ds = f.debug_struct("HandshakeRequest");
      ds.field("device_info", &self.device_info());
      ds.finish()
  }
}