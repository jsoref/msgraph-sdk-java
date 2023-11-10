// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceLocalCredentialInfo;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Local Credential Info Request.
 */
public class DeviceLocalCredentialInfoRequest extends BaseRequest<DeviceLocalCredentialInfo> {
	
    /**
     * The request for the DeviceLocalCredentialInfo
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceLocalCredentialInfoRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceLocalCredentialInfo.class);
    }

    /**
     * Gets the DeviceLocalCredentialInfo from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceLocalCredentialInfo> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceLocalCredentialInfo from the service
     *
     * @return the DeviceLocalCredentialInfo from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceLocalCredentialInfo get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceLocalCredentialInfo> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceLocalCredentialInfo delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceLocalCredentialInfo with a source
     *
     * @param sourceDeviceLocalCredentialInfo the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceLocalCredentialInfo> patchAsync(@Nonnull final DeviceLocalCredentialInfo sourceDeviceLocalCredentialInfo) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceLocalCredentialInfo);
    }

    /**
     * Patches this DeviceLocalCredentialInfo with a source
     *
     * @param sourceDeviceLocalCredentialInfo the source object with updates
     * @return the updated DeviceLocalCredentialInfo
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceLocalCredentialInfo patch(@Nonnull final DeviceLocalCredentialInfo sourceDeviceLocalCredentialInfo) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceLocalCredentialInfo);
    }

    /**
     * Creates a DeviceLocalCredentialInfo with a new object
     *
     * @param newDeviceLocalCredentialInfo the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceLocalCredentialInfo> postAsync(@Nonnull final DeviceLocalCredentialInfo newDeviceLocalCredentialInfo) {
        return sendAsync(HttpMethod.POST, newDeviceLocalCredentialInfo);
    }

    /**
     * Creates a DeviceLocalCredentialInfo with a new object
     *
     * @param newDeviceLocalCredentialInfo the new object to create
     * @return the created DeviceLocalCredentialInfo
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceLocalCredentialInfo post(@Nonnull final DeviceLocalCredentialInfo newDeviceLocalCredentialInfo) throws ClientException {
        return send(HttpMethod.POST, newDeviceLocalCredentialInfo);
    }

    /**
     * Creates a DeviceLocalCredentialInfo with a new object
     *
     * @param newDeviceLocalCredentialInfo the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceLocalCredentialInfo> putAsync(@Nonnull final DeviceLocalCredentialInfo newDeviceLocalCredentialInfo) {
        return sendAsync(HttpMethod.PUT, newDeviceLocalCredentialInfo);
    }

    /**
     * Creates a DeviceLocalCredentialInfo with a new object
     *
     * @param newDeviceLocalCredentialInfo the object to create/update
     * @return the created DeviceLocalCredentialInfo
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceLocalCredentialInfo put(@Nonnull final DeviceLocalCredentialInfo newDeviceLocalCredentialInfo) throws ClientException {
        return send(HttpMethod.PUT, newDeviceLocalCredentialInfo);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceLocalCredentialInfoRequest select(@Nonnull final String value) {
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
     public DeviceLocalCredentialInfoRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

