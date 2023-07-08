// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.TriggerTypesRoot;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Trigger Types Root Request.
 */
public class TriggerTypesRootRequest extends BaseRequest<TriggerTypesRoot> {
	
    /**
     * The request for the TriggerTypesRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TriggerTypesRootRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TriggerTypesRoot.class);
    }

    /**
     * Gets the TriggerTypesRoot from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TriggerTypesRoot> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TriggerTypesRoot from the service
     *
     * @return the TriggerTypesRoot from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TriggerTypesRoot get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TriggerTypesRoot> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TriggerTypesRoot delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TriggerTypesRoot with a source
     *
     * @param sourceTriggerTypesRoot the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TriggerTypesRoot> patchAsync(@Nonnull final TriggerTypesRoot sourceTriggerTypesRoot) {
        return sendAsync(HttpMethod.PATCH, sourceTriggerTypesRoot);
    }

    /**
     * Patches this TriggerTypesRoot with a source
     *
     * @param sourceTriggerTypesRoot the source object with updates
     * @return the updated TriggerTypesRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TriggerTypesRoot patch(@Nonnull final TriggerTypesRoot sourceTriggerTypesRoot) throws ClientException {
        return send(HttpMethod.PATCH, sourceTriggerTypesRoot);
    }

    /**
     * Creates a TriggerTypesRoot with a new object
     *
     * @param newTriggerTypesRoot the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TriggerTypesRoot> postAsync(@Nonnull final TriggerTypesRoot newTriggerTypesRoot) {
        return sendAsync(HttpMethod.POST, newTriggerTypesRoot);
    }

    /**
     * Creates a TriggerTypesRoot with a new object
     *
     * @param newTriggerTypesRoot the new object to create
     * @return the created TriggerTypesRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TriggerTypesRoot post(@Nonnull final TriggerTypesRoot newTriggerTypesRoot) throws ClientException {
        return send(HttpMethod.POST, newTriggerTypesRoot);
    }

    /**
     * Creates a TriggerTypesRoot with a new object
     *
     * @param newTriggerTypesRoot the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TriggerTypesRoot> putAsync(@Nonnull final TriggerTypesRoot newTriggerTypesRoot) {
        return sendAsync(HttpMethod.PUT, newTriggerTypesRoot);
    }

    /**
     * Creates a TriggerTypesRoot with a new object
     *
     * @param newTriggerTypesRoot the object to create/update
     * @return the created TriggerTypesRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TriggerTypesRoot put(@Nonnull final TriggerTypesRoot newTriggerTypesRoot) throws ClientException {
        return send(HttpMethod.PUT, newTriggerTypesRoot);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TriggerTypesRootRequest select(@Nonnull final String value) {
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
     public TriggerTypesRootRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
