package DAM;

/**
* DAM/DAMCORBAInterfaceHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��F:/JavaWorksPlace/DAM_Project/DAM.idl
* 2013��3��15�� ������ ����06ʱ01��34�� EDT
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
