package org.omg.CORBA;

/**
* org/omg/CORBA/UnionMemberHolder.java .
* IGNORE Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlj/src/main/java/com/sun/tools/corba/ee/idl/ir.idl
* IGNORE Sunday, January 21, 2018 1:54:22 PM EST
*/

public final class UnionMemberHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CORBA.UnionMember value = null;

  public UnionMemberHolder ()
  {
  }

  public UnionMemberHolder (org.omg.CORBA.UnionMember initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CORBA.UnionMemberHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CORBA.UnionMemberHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CORBA.UnionMemberHelper.type ();
  }

}