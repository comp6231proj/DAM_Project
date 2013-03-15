package DAM;


/**
* DAM/_DAMCORBAInterfaceStub.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从F:/JavaWorksPlace/DAM_Project/DAM.idl
* 2013年3月15日 星期五 下午06时01分34秒 EDT
*/

public class _DAMCORBAInterfaceStub extends org.omg.CORBA.portable.ObjectImpl implements DAM.DAMCORBAInterface
{

  public String reserve (String medicareID, String timeSlot)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("reserve", true);
                $out.write_string (medicareID);
                $out.write_string (timeSlot);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return reserve (medicareID, timeSlot        );
            } finally {
                _releaseReply ($in);
            }
  } // reserve

  public String cancel (String medicareID, String timeSlot)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("cancel", true);
                $out.write_string (medicareID);
                $out.write_string (timeSlot);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return cancel (medicareID, timeSlot        );
            } finally {
                _releaseReply ($in);
            }
  } // cancel

  public String checkTimeSlot (String timeSlot)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("checkTimeSlot", true);
                $out.write_string (timeSlot);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return checkTimeSlot (timeSlot        );
            } finally {
                _releaseReply ($in);
            }
  } // checkTimeSlot

  public String changeAppt (String medicareID, String timeSlot, String desiredTimeSlot, String desiredClinicID)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("changeAppt", true);
                $out.write_string (medicareID);
                $out.write_string (timeSlot);
                $out.write_string (desiredTimeSlot);
                $out.write_string (desiredClinicID);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return changeAppt (medicareID, timeSlot, desiredTimeSlot, desiredClinicID        );
            } finally {
                _releaseReply ($in);
            }
  } // changeAppt

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:DAM/DAMCORBAInterface:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _DAMCORBAInterfaceStub
