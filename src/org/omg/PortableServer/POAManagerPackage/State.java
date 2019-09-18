package org.omg.PortableServer.POAManagerPackage;


/**
* org/omg/PortableServer/POAManagerPackage/State.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u20/1074/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Wednesday, July 30, 2014 1:14:28 PM PDT
*/


/**
	 * Specifies the states for the POAManager
	 */
public class State implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 4;
  private static State[] __array = new State [__size];

  public static final int _HOLDING = 0;
  public static final State HOLDING = new State(_HOLDING);
  public static final int _ACTIVE = 1;
  public static final State ACTIVE = new State(_ACTIVE);
  public static final int _DISCARDING = 2;
  public static final State DISCARDING = new State(_DISCARDING);
  public static final int _INACTIVE = 3;
  public static final State INACTIVE = new State(_INACTIVE);

  public int value ()
  {
    return __value;
  }

  public static State from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected State (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class State
