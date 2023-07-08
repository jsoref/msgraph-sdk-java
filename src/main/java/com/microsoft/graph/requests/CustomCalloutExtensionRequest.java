// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.CustomCalloutExtension;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Custom Callout Extension Request.
 */
public class CustomCalloutExtensionRequest extends BaseRequest<CustomCalloutExtension> {
	
    /**
     * The request for the CustomCalloutExtension
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public CustomCalloutExtensionRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends CustomCalloutExtension> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the CustomCalloutExtension
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CustomCalloutExtensionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CustomCalloutExtension.class);
    }

    /**
     * Gets the CustomCalloutExtension from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CustomCalloutExtension> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the CustomCalloutExtension from the service
     *
     * @return the CustomCalloutExtension from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CustomCalloutExtension get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CustomCalloutExtension> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public CustomCalloutExtension delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this CustomCalloutExtension with a source
     *
     * @param sourceCustomCalloutExtension the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CustomCalloutExtension> patchAsync(@Nonnull final CustomCalloutExtension sourceCustomCalloutExtension) {
        return sendAsync(HttpMethod.PATCH, sourceCustomCalloutExtension);
    }

    /**
     * Patches this CustomCalloutExtension with a source
     *
     * @param sourceCustomCalloutExtension the source object with updates
     * @return the updated CustomCalloutExtension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CustomCalloutExtension patch(@Nonnull final CustomCalloutExtension sourceCustomCalloutExtension) throws ClientException {
        return send(HttpMethod.PATCH, sourceCustomCalloutExtension);
    }

    /**
     * Creates a CustomCalloutExtension with a new object
     *
     * @param newCustomCalloutExtension the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CustomCalloutExtension> postAsync(@Nonnull final CustomCalloutExtension newCustomCalloutExtension) {
        return sendAsync(HttpMethod.POST, newCustomCalloutExtension);
    }

    /**
     * Creates a CustomCalloutExtension with a new object
     *
     * @param newCustomCalloutExtension the new object to create
     * @return the created CustomCalloutExtension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CustomCalloutExtension post(@Nonnull final CustomCalloutExtension newCustomCalloutExtension) throws ClientException {
        return send(HttpMethod.POST, newCustomCalloutExtension);
    }

    /**
     * Creates a CustomCalloutExtension with a new object
     *
     * @param newCustomCalloutExtension the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CustomCalloutExtension> putAsync(@Nonnull final CustomCalloutExtension newCustomCalloutExtension) {
        return sendAsync(HttpMethod.PUT, newCustomCalloutExtension);
    }

    /**
     * Creates a CustomCalloutExtension with a new object
     *
     * @param newCustomCalloutExtension the object to create/update
     * @return the created CustomCalloutExtension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CustomCalloutExtension put(@Nonnull final CustomCalloutExtension newCustomCalloutExtension) throws ClientException {
        return send(HttpMethod.PUT, newCustomCalloutExtension);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public CustomCalloutExtensionRequest select(@Nonnull final String value) {
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
     public CustomCalloutExtensionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
