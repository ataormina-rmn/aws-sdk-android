/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * A receipt IP address filter enables you to specify whether to accept
 * or reject mail originating from an IP address or range of IP
 * addresses.
 * </p>
 * <p>
 * For information about setting up IP address filters, see the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html"> Amazon SES Developer Guide </a>
 * .
 * </p>
 */
public class ReceiptFilter implements Serializable {

    /**
     * The name of the IP address filter. The name must: <ul> <li>Contain
     * only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores
     * (_), or dashes (-).</li> <li>Start and end with a letter or
     * number.</li> <li>Contain less than 64 characters.</li> </ul>
     */
    private String name;

    /**
     * A structure that provides the IP addresses to block or allow, and
     * whether to block or allow incoming mail from them.
     */
    private ReceiptIpFilter ipFilter;

    /**
     * The name of the IP address filter. The name must: <ul> <li>Contain
     * only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores
     * (_), or dashes (-).</li> <li>Start and end with a letter or
     * number.</li> <li>Contain less than 64 characters.</li> </ul>
     *
     * @return The name of the IP address filter. The name must: <ul> <li>Contain
     *         only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores
     *         (_), or dashes (-).</li> <li>Start and end with a letter or
     *         number.</li> <li>Contain less than 64 characters.</li> </ul>
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the IP address filter. The name must: <ul> <li>Contain
     * only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores
     * (_), or dashes (-).</li> <li>Start and end with a letter or
     * number.</li> <li>Contain less than 64 characters.</li> </ul>
     *
     * @param name The name of the IP address filter. The name must: <ul> <li>Contain
     *         only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores
     *         (_), or dashes (-).</li> <li>Start and end with a letter or
     *         number.</li> <li>Contain less than 64 characters.</li> </ul>
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the IP address filter. The name must: <ul> <li>Contain
     * only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores
     * (_), or dashes (-).</li> <li>Start and end with a letter or
     * number.</li> <li>Contain less than 64 characters.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the IP address filter. The name must: <ul> <li>Contain
     *         only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores
     *         (_), or dashes (-).</li> <li>Start and end with a letter or
     *         number.</li> <li>Contain less than 64 characters.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReceiptFilter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A structure that provides the IP addresses to block or allow, and
     * whether to block or allow incoming mail from them.
     *
     * @return A structure that provides the IP addresses to block or allow, and
     *         whether to block or allow incoming mail from them.
     */
    public ReceiptIpFilter getIpFilter() {
        return ipFilter;
    }
    
    /**
     * A structure that provides the IP addresses to block or allow, and
     * whether to block or allow incoming mail from them.
     *
     * @param ipFilter A structure that provides the IP addresses to block or allow, and
     *         whether to block or allow incoming mail from them.
     */
    public void setIpFilter(ReceiptIpFilter ipFilter) {
        this.ipFilter = ipFilter;
    }
    
    /**
     * A structure that provides the IP addresses to block or allow, and
     * whether to block or allow incoming mail from them.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipFilter A structure that provides the IP addresses to block or allow, and
     *         whether to block or allow incoming mail from them.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReceiptFilter withIpFilter(ReceiptIpFilter ipFilter) {
        this.ipFilter = ipFilter;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getIpFilter() != null) sb.append("IpFilter: " + getIpFilter() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getIpFilter() == null) ? 0 : getIpFilter().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReceiptFilter == false) return false;
        ReceiptFilter other = (ReceiptFilter)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getIpFilter() == null ^ this.getIpFilter() == null) return false;
        if (other.getIpFilter() != null && other.getIpFilter().equals(this.getIpFilter()) == false) return false; 
        return true;
    }
    
}
    