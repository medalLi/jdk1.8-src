package org.omg.IOP;

/**
* org/omg/IOP/IORHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u20/1074/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Wednesday, July 30, 2014 1:14:27 PM PDT
*/

public final class IORHolder implements org.omg.CORBA.portable.Streamable
{
  public IOR value = null;

  public IORHolder ()
  {
  }

  public IORHolder (IOR initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IORHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IORHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IORHelper.type ();
  }

}
