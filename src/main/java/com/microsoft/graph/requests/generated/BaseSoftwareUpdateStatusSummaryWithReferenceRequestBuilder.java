// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Software Update Status Summary With Reference Request Builder.
 */
public class BaseSoftwareUpdateStatusSummaryWithReferenceRequestBuilder extends BaseRequestBuilder implements IBaseSoftwareUpdateStatusSummaryWithReferenceRequestBuilder {

    /**
     * The request builder for the SoftwareUpdateStatusSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseSoftwareUpdateStatusSummaryWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ISoftwareUpdateStatusSummaryWithReferenceRequest instance
     */
    public ISoftwareUpdateStatusSummaryWithReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the ISoftwareUpdateStatusSummaryWithReferenceRequest instance
     */
    public ISoftwareUpdateStatusSummaryWithReferenceRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new SoftwareUpdateStatusSummaryWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ISoftwareUpdateStatusSummaryReferenceRequestBuilder reference(){
        return new SoftwareUpdateStatusSummaryReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
