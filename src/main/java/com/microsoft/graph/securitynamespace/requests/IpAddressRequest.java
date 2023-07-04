// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.IpAddress;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ip Address Request.
 */
public class IpAddressRequest extends BaseRequest<IpAddress> {
	
    /**
     * The request for the IpAddress
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IpAddressRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IpAddress.class);
    }

    /**
     * Gets the IpAddress from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IpAddress> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the IpAddress from the service
     *
     * @return the IpAddress from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IpAddress get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IpAddress> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public IpAddress delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this IpAddress with a source
     *
     * @param sourceIpAddress the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IpAddress> patchAsync(@Nonnull final IpAddress sourceIpAddress) {
        return sendAsync(HttpMethod.PATCH, sourceIpAddress);
    }

    /**
     * Patches this IpAddress with a source
     *
     * @param sourceIpAddress the source object with updates
     * @return the updated IpAddress
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IpAddress patch(@Nonnull final IpAddress sourceIpAddress) throws ClientException {
        return send(HttpMethod.PATCH, sourceIpAddress);
    }

    /**
     * Creates a IpAddress with a new object
     *
     * @param newIpAddress the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IpAddress> postAsync(@Nonnull final IpAddress newIpAddress) {
        return sendAsync(HttpMethod.POST, newIpAddress);
    }

    /**
     * Creates a IpAddress with a new object
     *
     * @param newIpAddress the new object to create
     * @return the created IpAddress
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IpAddress post(@Nonnull final IpAddress newIpAddress) throws ClientException {
        return send(HttpMethod.POST, newIpAddress);
    }

    /**
     * Creates a IpAddress with a new object
     *
     * @param newIpAddress the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IpAddress> putAsync(@Nonnull final IpAddress newIpAddress) {
        return sendAsync(HttpMethod.PUT, newIpAddress);
    }

    /**
     * Creates a IpAddress with a new object
     *
     * @param newIpAddress the object to create/update
     * @return the created IpAddress
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IpAddress put(@Nonnull final IpAddress newIpAddress) throws ClientException {
        return send(HttpMethod.PUT, newIpAddress);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public IpAddressRequest select(@Nonnull final String value) {
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
     public IpAddressRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

