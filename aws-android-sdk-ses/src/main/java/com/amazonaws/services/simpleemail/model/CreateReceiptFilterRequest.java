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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#createReceiptFilter(CreateReceiptFilterRequest) CreateReceiptFilter operation}.
 * <p>
 * Creates a new IP address filter.
 * </p>
 * <p>
 * For information about setting up IP address filters, see the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html"> Amazon SES Developer Guide </a>
 * .
 * </p>
 * <p>
 * This action is throttled at one request per second.
 * </p>
 *
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#createReceiptFilter(CreateReceiptFilterRequest)
 */
public class CreateReceiptFilterRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A data structure that describes the IP address filter to create, which
     * consists of a name, an IP address range, and whether to allow or block
     * mail from it.
     */
    private ReceiptFilter filter;

    /**
     * A data structure that describes the IP address filter to create, which
     * consists of a name, an IP address range, and whether to allow or block
     * mail from it.
     *
     * @return A data structure that describes the IP address filter to create, which
     *         consists of a name, an IP address range, and whether to allow or block
     *         mail from it.
     */
    public ReceiptFilter getFilter() {
        return filter;
    }
    
    /**
     * A data structure that describes the IP address filter to create, which
     * consists of a name, an IP address range, and whether to allow or block
     * mail from it.
     *
     * @param filter A data structure that describes the IP address filter to create, which
     *         consists of a name, an IP address range, and whether to allow or block
     *         mail from it.
     */
    public void setFilter(ReceiptFilter filter) {
        this.filter = filter;
    }
    
    /**
     * A data structure that describes the IP address filter to create, which
     * consists of a name, an IP address range, and whether to allow or block
     * mail from it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filter A data structure that describes the IP address filter to create, which
     *         consists of a name, an IP address range, and whether to allow or block
     *         mail from it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateReceiptFilterRequest withFilter(ReceiptFilter filter) {
        this.filter = filter;
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
        if (getFilter() != null) sb.append("Filter: " + getFilter() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateReceiptFilterRequest == false) return false;
        CreateReceiptFilterRequest other = (CreateReceiptFilterRequest)obj;
        
        if (other.getFilter() == null ^ this.getFilter() == null) return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false) return false; 
        return true;
    }
    
}
    