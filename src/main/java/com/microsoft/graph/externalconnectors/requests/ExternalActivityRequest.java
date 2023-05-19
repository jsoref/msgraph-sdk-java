// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.externalconnectors.models.ExternalActivity;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the External Activity Request.
 */
public class ExternalActivityRequest extends BaseRequest<ExternalActivity> {
	
    /**
     * The request for the ExternalActivity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ExternalActivityRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends ExternalActivity> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ExternalActivity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExternalActivityRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ExternalActivity.class);
    }

    /**
     * Gets the ExternalActivity from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExternalActivity> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ExternalActivity from the service
     *
     * @return the ExternalActivity from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExternalActivity get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExternalActivity> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ExternalActivity delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ExternalActivity with a source
     *
     * @param sourceExternalActivity the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExternalActivity> patchAsync(@Nonnull final ExternalActivity sourceExternalActivity) {
        return sendAsync(HttpMethod.PATCH, sourceExternalActivity);
    }

    /**
     * Patches this ExternalActivity with a source
     *
     * @param sourceExternalActivity the source object with updates
     * @return the updated ExternalActivity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExternalActivity patch(@Nonnull final ExternalActivity sourceExternalActivity) throws ClientException {
        return send(HttpMethod.PATCH, sourceExternalActivity);
    }

    /**
     * Creates a ExternalActivity with a new object
     *
     * @param newExternalActivity the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExternalActivity> postAsync(@Nonnull final ExternalActivity newExternalActivity) {
        return sendAsync(HttpMethod.POST, newExternalActivity);
    }

    /**
     * Creates a ExternalActivity with a new object
     *
     * @param newExternalActivity the new object to create
     * @return the created ExternalActivity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExternalActivity post(@Nonnull final ExternalActivity newExternalActivity) throws ClientException {
        return send(HttpMethod.POST, newExternalActivity);
    }

    /**
     * Creates a ExternalActivity with a new object
     *
     * @param newExternalActivity the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExternalActivity> putAsync(@Nonnull final ExternalActivity newExternalActivity) {
        return sendAsync(HttpMethod.PUT, newExternalActivity);
    }

    /**
     * Creates a ExternalActivity with a new object
     *
     * @param newExternalActivity the object to create/update
     * @return the created ExternalActivity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExternalActivity put(@Nonnull final ExternalActivity newExternalActivity) throws ClientException {
        return send(HttpMethod.PUT, newExternalActivity);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ExternalActivityRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public ExternalActivityRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

