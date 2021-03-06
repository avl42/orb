/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package pi.serverinterceptor;

import org.omg.CORBA.*;

import java.io.*;
import java.rmi.*;
import javax.rmi.*;
import javax.naming.*;
import org.omg.PortableInterceptor.*;

import ServerRequestInterceptor.*; // hello interface

/**
 * RMI/IIOP implementation.  
 */
public class helloRMIIIOP 
    extends PortableRemoteObject 
    implements helloIF
{
    // Contains the actual implementation of the hello interface.
    private helloDelegate delegate = null;
    
    public helloRMIIIOP( PrintStream out, String symbol ) 
        throws RemoteException 
    {
        super();
        this.delegate = new helloDelegate( out, symbol );
    }

    public String sayHello() {
        return delegate.sayHello();
    }

    public void sayOneway() {
        delegate.sayOneway();
    }
    
    public void saySystemException() {
        delegate.saySystemException();
    }

    public void sayUserException() 
        throws ForwardRequest
    {
        delegate.sayUserException();
    }
    
    public String syncWithServer( boolean exceptionRaised ) {
        return delegate.syncWithServer( exceptionRaised );
    }

}
