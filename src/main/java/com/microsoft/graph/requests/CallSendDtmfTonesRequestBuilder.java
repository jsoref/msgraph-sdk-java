// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.CallSendDtmfTonesRequest;
import com.microsoft.graph.models.Call;
import com.microsoft.graph.models.Tone;
import com.microsoft.graph.models.SendDtmfTonesOperation;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.CallSendDtmfTonesParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Send Dtmf Tones Request Builder.
 */
public class CallSendDtmfTonesRequestBuilder extends BaseActionRequestBuilder<SendDtmfTonesOperation> {

    /**
     * The request builder for this CallSendDtmfTones
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallSendDtmfTonesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private CallSendDtmfTonesParameterSet body;
    /**
     * The request builder for this CallSendDtmfTones
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public CallSendDtmfTonesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final CallSendDtmfTonesParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the CallSendDtmfTonesRequest
     *
     * @param requestOptions the options for the request
     * @return the CallSendDtmfTonesRequest instance
     */
    @Nonnull
    public CallSendDtmfTonesRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the CallSendDtmfTonesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the CallSendDtmfTonesRequest instance
     */
    @Nonnull
    public CallSendDtmfTonesRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final CallSendDtmfTonesRequest request = new CallSendDtmfTonesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
