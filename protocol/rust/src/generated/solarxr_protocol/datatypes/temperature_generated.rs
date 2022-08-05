// automatically generated by the FlatBuffers compiler, do not modify
extern crate alloc;
extern crate flatbuffers;
use alloc::boxed::Box;
use alloc::string::{String, ToString};
use alloc::vec::Vec;
use core::mem;
use core::cmp::Ordering;
use self::flatbuffers::{EndianScalar, Follow};
use super::*;
/// Temperature in degrees celsius
// struct Temperature, aligned to 4
#[repr(transparent)]
#[derive(Clone, Copy, PartialEq)]
pub struct Temperature(pub [u8; 4]);
impl Default for Temperature { 
  fn default() -> Self { 
    Self([0; 4])
  }
}
impl core::fmt::Debug for Temperature {
  fn fmt(&self, f: &mut core::fmt::Formatter) -> core::fmt::Result {
    f.debug_struct("Temperature")
      .field("temp", &self.temp())
      .finish()
  }
}

impl flatbuffers::SimpleToVerifyInSlice for Temperature {}
impl flatbuffers::SafeSliceAccess for Temperature {}
impl<'a> flatbuffers::Follow<'a> for Temperature {
  type Inner = &'a Temperature;
  #[inline]
  fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    <&'a Temperature>::follow(buf, loc)
  }
}
impl<'a> flatbuffers::Follow<'a> for &'a Temperature {
  type Inner = &'a Temperature;
  #[inline]
  fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    flatbuffers::follow_cast_ref::<Temperature>(buf, loc)
  }
}
impl<'b> flatbuffers::Push for Temperature {
    type Output = Temperature;
    #[inline]
    fn push(&self, dst: &mut [u8], _rest: &[u8]) {
        let src = unsafe {
            ::core::slice::from_raw_parts(self as *const Temperature as *const u8, Self::size())
        };
        dst.copy_from_slice(src);
    }
}
impl<'b> flatbuffers::Push for &'b Temperature {
    type Output = Temperature;

    #[inline]
    fn push(&self, dst: &mut [u8], _rest: &[u8]) {
        let src = unsafe {
            ::core::slice::from_raw_parts(*self as *const Temperature as *const u8, Self::size())
        };
        dst.copy_from_slice(src);
    }
}

impl<'a> flatbuffers::Verifiable for Temperature {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.in_buffer::<Self>(pos)
  }
}

impl<'a> Temperature {
  #[allow(clippy::too_many_arguments)]
  pub fn new(
    temp: f32,
  ) -> Self {
    let mut s = Self([0; 4]);
    s.set_temp(temp);
    s
  }

  pub fn temp(&self) -> f32 {
    let mut mem = core::mem::MaybeUninit::<f32>::uninit();
    unsafe {
      core::ptr::copy_nonoverlapping(
        self.0[0..].as_ptr(),
        mem.as_mut_ptr() as *mut u8,
        core::mem::size_of::<f32>(),
      );
      mem.assume_init()
    }.from_little_endian()
  }

  pub fn set_temp(&mut self, x: f32) {
    let x_le = x.to_little_endian();
    unsafe {
      core::ptr::copy_nonoverlapping(
        &x_le as *const f32 as *const u8,
        self.0[0..].as_mut_ptr(),
        core::mem::size_of::<f32>(),
      );
    }
  }

}

