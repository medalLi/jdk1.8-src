package org.omg.CORBA;


/**
* org/omg/CORBA/ParameterMode.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u20/1074/corba/src/share/classes/org/omg/PortableInterceptor/CORBAX.idl
* Wednesday, July 30, 2014 1:14:27 PM PDT
*/


/**
   * Enumeration of parameter modes for Parameter.  Possible vaues:
   * <ul>
   *   <li>PARAM_IN - Represents an "in" parameter.</li>
   *   <li>PARAM_OUT - Represents an "out" parameter.</li>
   *   <li>PARAM_INOUT - Represents an "inout" parameter.</li>
   * </ul>
   */
public class ParameterMode implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static ParameterMode[] __array = new ParameterMode [__size];

  public static final int _PARAM_IN = 0;
  public static final ParameterMode PARAM_IN = new ParameterMode(_PARAM_IN);
  public static final int _PARAM_OUT = 1;
  public static final ParameterMode PARAM_OUT = new ParameterMode(_PARAM_OUT);
  public static final int _PARAM_INOUT = 2;
  public static final ParameterMode PARAM_INOUT = new ParameterMode(_PARAM_INOUT);

  public int value ()
  {
    return __value;
  }

  public static ParameterMode from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new BAD_PARAM ();
  }

  protected ParameterMode (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ParameterMode
