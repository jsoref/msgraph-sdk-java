// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.identitygovernance.requests;
import com.microsoft.graph.identitygovernance.requests.UserProcessingResultSummaryRequest;
import com.microsoft.graph.identitygovernance.models.UserProcessingResult;
import com.microsoft.graph.identitygovernance.models.UserSummary;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.identitygovernance.models.UserProcessingResultSummaryParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Processing Result Summary Request Builder.
 */
public class UserProcessingResultSummaryRequestBuilder extends BaseFunctionRequestBuilder<UserSummary> {

    /**
     * The request builder for this UserProcessingResultSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserProcessingResultSummaryRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this UserProcessingResultSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public UserProcessingResultSummaryRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final UserProcessingResultSummaryParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }

    /**
     * Creates the UserProcessingResultSummaryRequest
     *
     * @param requestOptions the options for the request
     * @return the UserProcessingResultSummaryRequest instance
     */
    @Nonnull
    public UserProcessingResultSummaryRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the UserProcessingResultSummaryRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the UserProcessingResultSummaryRequest instance
     */
    @Nonnull
    public UserProcessingResultSummaryRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final UserProcessingResultSummaryRequest request = new UserProcessingResultSummaryRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
        }
        return request;
    }
}