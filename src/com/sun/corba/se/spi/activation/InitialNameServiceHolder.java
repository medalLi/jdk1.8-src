package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/InitialNameServiceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u20/1074/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Wednesday, July 30, 2014 1:14:27 PM PDT
*/

public final class InitialNameServiceHolder implements org.omg.CORBA.portable.Streamable
{
  public InitialNameService value = null;

  public InitialNameServiceHolder ()
  {
  }

  public InitialNameServiceHolder (InitialNameService initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = InitialNameServiceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    InitialNameServiceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return InitialNameServiceHelper.type ();
  }

}
