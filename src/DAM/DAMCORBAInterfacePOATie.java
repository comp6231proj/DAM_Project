package DAM;


/**
* DAM/DAMCORBAInterfacePOATie.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从F:/JavaWorksPlace/DAM_Project/DAM.idl
* 2013年3月15日 星期五 下午06时01分34秒 EDT
*/

public class DAMCORBAInterfacePOATie extends DAMCORBAInterfacePOA
{

  // Constructors

  public DAMCORBAInterfacePOATie ( DAM.DAMCORBAInterfaceOperations delegate ) {
      this._impl = delegate;
  }
  public DAMCORBAInterfacePOATie ( DAM.DAMCORBAInterfaceOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public DAM.DAMCORBAInterfaceOperations _delegate() {
      return this._impl;
  }
  public void _delegate (DAM.DAMCORBAInterfaceOperations delegate ) {
      this._impl = delegate;
  }
  public org.omg.PortableServer.POA _default_POA() {
      if(_poa != null) {
          return _poa;
      }
      else {
          return super._default_POA();
      }
  }
  public String reserve (String medicareID, String timeSlot)
  {
    return _impl.reserve(medicareID, timeSlot);
  } // reserve

  public String cancel (String medicareID, String timeSlot)
  {
    return _impl.cancel(medicareID, timeSlot);
  } // cancel

  public String checkTimeSlot (String timeSlot)
  {
    return _impl.checkTimeSlot(timeSlot);
  } // checkTimeSlot

  public String changeAppt (String medicareID, String timeSlot, String desiredTimeSlot, String desiredClinicID)
  {
    return _impl.changeAppt(medicareID, timeSlot, desiredTimeSlot, desiredClinicID);
  } // changeAppt

  private DAM.DAMCORBAInterfaceOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class DAMCORBAInterfacePOATie
