package org.omg.PortableInterceptor;

/**
* org/omg/PortableInterceptor/ObjectReferenceFactoryHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u20/1074/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Wednesday, July 30, 2014 1:14:28 PM PDT
*/


/** The object reference factory.  This provides the capability of
  * creating an object reference.
  */
public final class ObjectReferenceFactoryHolder implements org.omg.CORBA.portable.Streamable
{
  public ObjectReferenceFactory value = null;

  public ObjectReferenceFactoryHolder ()
  {
  }

  public ObjectReferenceFactoryHolder (ObjectReferenceFactory initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ObjectReferenceFactoryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ObjectReferenceFactoryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ObjectReferenceFactoryHelper.type ();
  }

}
