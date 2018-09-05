/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 1998-1999 IBM Corp. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package javax.rmi.CORBA.serialization;

/**
* gen/examples/stock/StockHelper.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from examples/stock/Stock.idl
* 02 June 1999 21:47:31 o'clock GMT+00:00
*/

abstract public class StockHelper
{
  private static String  _id = "RMI:javax.rmi.CORBA.serialization.Stock:B60458ECD6E4794E:CCA70DAA84257A80";

  public static void insert (org.omg.CORBA.Any a, Stock that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Stock extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.ValueMember[] _members0 = new org.omg.CORBA.ValueMember[2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          // ValueMember instance for current
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_float);
          _members0[0] = new org.omg.CORBA.ValueMember ("current", 
              "", 
              _id, 
              "", 
              _tcOf_members0, 
              null, 
              org.omg.CORBA.PRIVATE_MEMBER.value);
          // ValueMember instance for symbol
          _tcOf_members0 = org.omg.CORBA.WStringValueHelper.type ();
          _members0[1] = new org.omg.CORBA.ValueMember ("symbol", 
              org.omg.CORBA.WStringValueHelper.id (), 
              _id, 
              "", 
              _tcOf_members0, 
              null, 
              org.omg.CORBA.PRIVATE_MEMBER.value);
          __typeCode = org.omg.CORBA.ORB.init ().create_value_tc (_id, "Stock", org.omg.CORBA.VM_NONE.value, null, _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Stock read (org.omg.CORBA.portable.InputStream istream)
  {
    return (Stock)((org.omg.CORBA_2_3.portable.InputStream) istream).read_value (id ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Stock value)
  {
    ((org.omg.CORBA_2_3.portable.OutputStream) ostream).write_value (value, id ());
  }


  public static Stock create (org.omg.CORBA.ORB _orb, String name)
  {
    try {
      StockValueFactory _factory = (StockValueFactory)
          ((org.omg.CORBA_2_3.ORB) _orb).lookup_value_factory(id());
      return _factory.create (name);
    } catch (ClassCastException _ex) {
      throw new org.omg.CORBA.BAD_PARAM ();
    }
  }

}