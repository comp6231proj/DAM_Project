package DAM;


/**
* DAM/DAMCORBAInterfaceHelper.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��F:/JavaWorksPlace/DAM_Project/DAM.idl
* 2013��3��15�� ������ ����06ʱ01��34�� EDT
*/

abstract public class DAMCORBAInterfaceHelper
{
  private static String  _id = "IDL:DAM/DAMCORBAInterface:1.0";

  public static void insert (org.omg.CORBA.Any a, DAM.DAMCORBAInterface that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static DAM.DAMCORBAInterface extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (DAM.DAMCORBAInterfaceHelper.id (), "DAMCORBAInterface");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static DAM.DAMCORBAInterface read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_DAMCORBAInterfaceStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, DAM.DAMCORBAInterface value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static DAM.DAMCORBAInterface narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DAM.DAMCORBAInterface)
      return (DAM.DAMCORBAInterface)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      DAM._DAMCORBAInterfaceStub stub = new DAM._DAMCORBAInterfaceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static DAM.DAMCORBAInterface unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DAM.DAMCORBAInterface)
      return (DAM.DAMCORBAInterface)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      DAM._DAMCORBAInterfaceStub stub = new DAM._DAMCORBAInterfaceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
