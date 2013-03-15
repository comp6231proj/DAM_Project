package DAM;


/**
* DAM/DAMCORBAInterfacePOA.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从F:/JavaWorksPlace/DAM_Project/DAM.idl
* 2013年3月15日 星期五 下午06时01分34秒 EDT
*/

public abstract class DAMCORBAInterfacePOA extends org.omg.PortableServer.Servant
 implements DAM.DAMCORBAInterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("reserve", new java.lang.Integer (0));
    _methods.put ("cancel", new java.lang.Integer (1));
    _methods.put ("checkTimeSlot", new java.lang.Integer (2));
    _methods.put ("changeAppt", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // DAM/DAMCORBAInterface/reserve
       {
         String medicareID = in.read_string ();
         String timeSlot = in.read_string ();
         String $result = null;
         $result = this.reserve (medicareID, timeSlot);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // DAM/DAMCORBAInterface/cancel
       {
         String medicareID = in.read_string ();
         String timeSlot = in.read_string ();
         String $result = null;
         $result = this.cancel (medicareID, timeSlot);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 2:  // DAM/DAMCORBAInterface/checkTimeSlot
       {
         String timeSlot = in.read_string ();
         String $result = null;
         $result = this.checkTimeSlot (timeSlot);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // DAM/DAMCORBAInterface/changeAppt
       {
         String medicareID = in.read_string ();
         String timeSlot = in.read_string ();
         String desiredTimeSlot = in.read_string ();
         String desiredClinicID = in.read_string ();
         String $result = null;
         $result = this.changeAppt (medicareID, timeSlot, desiredTimeSlot, desiredClinicID);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:DAM/DAMCORBAInterface:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public DAMCORBAInterface _this() 
  {
    return DAMCORBAInterfaceHelper.narrow(
    super._this_object());
  }

  public DAMCORBAInterface _this(org.omg.CORBA.ORB orb) 
  {
    return DAMCORBAInterfaceHelper.narrow(
    super._this_object(orb));
  }


} // class DAMCORBAInterfacePOA
