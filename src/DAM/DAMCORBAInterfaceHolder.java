package DAM;

/**
* DAM/DAMCORBAInterfaceHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从F:/JavaWorksPlace/DAM_Project/DAM.idl
* 2013年3月15日 星期五 下午06时01分34秒 EDT
*/

public final class DAMCORBAInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public DAM.DAMCORBAInterface value = null;

  public DAMCORBAInterfaceHolder ()
  {
  }

  public DAMCORBAInterfaceHolder (DAM.DAMCORBAInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DAM.DAMCORBAInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DAM.DAMCORBAInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DAM.DAMCORBAInterfaceHelper.type ();
  }

}
