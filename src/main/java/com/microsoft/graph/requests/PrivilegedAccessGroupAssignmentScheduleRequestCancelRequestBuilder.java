// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.PrivilegedAccessGroupAssignmentScheduleRequestCancelRequest;
import com.microsoft.graph.models.PrivilegedAccessGroupAssignmentScheduleRequest;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Access Group Assignment Schedule Request Cancel Request Builder.
 */
public class PrivilegedAccessGroupAssignmentScheduleRequestCancelRequestBuilder extends BaseActionRequestBuilder<PrivilegedAccessGroupAssignmentScheduleRequest> {

    /**
     * The request builder for this PrivilegedAccessGroupAssignmentScheduleRequestCancel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedAccessGroupAssignmentScheduleRequestCancelRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the PrivilegedAccessGroupAssignmentScheduleRequestCancelRequest
     *
     * @param requestOptions the options for the request
     * @return the PrivilegedAccessGroupAssignmentScheduleRequestCancelRequest instance
     */
    @Nonnull
    public PrivilegedAccessGroupAssignmentScheduleRequestCancelRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the PrivilegedAccessGroupAssignmentScheduleRequestCancelRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the PrivilegedAccessGroupAssignmentScheduleRequestCancelRequest instance
     */
    @Nonnull
    public PrivilegedAccessGroupAssignmentScheduleRequestCancelRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final PrivilegedAccessGroupAssignmentScheduleRequestCancelRequest request = new PrivilegedAccessGroupAssignmentScheduleRequestCancelRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}