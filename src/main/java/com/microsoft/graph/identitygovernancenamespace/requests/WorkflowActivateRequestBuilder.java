// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.identitygovernance.requests;
import com.microsoft.graph.identitygovernance.requests.WorkflowActivateRequest;
import com.microsoft.graph.identitygovernance.models.Workflow;
import com.microsoft.graph.models.User;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.identitygovernance.models.WorkflowActivateParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workflow Activate Request Builder.
 */
public class WorkflowActivateRequestBuilder extends BaseActionRequestBuilder<Workflow> {

    /**
     * The request builder for this WorkflowActivate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkflowActivateRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private WorkflowActivateParameterSet body;
    /**
     * The request builder for this WorkflowActivate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public WorkflowActivateRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final WorkflowActivateParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the WorkflowActivateRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkflowActivateRequest instance
     */
    @Nonnull
    public WorkflowActivateRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkflowActivateRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkflowActivateRequest instance
     */
    @Nonnull
    public WorkflowActivateRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final WorkflowActivateRequest request = new WorkflowActivateRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
