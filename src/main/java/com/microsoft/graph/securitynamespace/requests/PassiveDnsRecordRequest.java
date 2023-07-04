// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.PassiveDnsRecord;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Passive Dns Record Request.
 */
public class PassiveDnsRecordRequest extends BaseRequest<PassiveDnsRecord> {
	
    /**
     * The request for the PassiveDnsRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PassiveDnsRecordRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PassiveDnsRecord.class);
    }

    /**
     * Gets the PassiveDnsRecord from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PassiveDnsRecord> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the PassiveDnsRecord from the service
     *
     * @return the PassiveDnsRecord from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PassiveDnsRecord get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PassiveDnsRecord> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public PassiveDnsRecord delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PassiveDnsRecord with a source
     *
     * @param sourcePassiveDnsRecord the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PassiveDnsRecord> patchAsync(@Nonnull final PassiveDnsRecord sourcePassiveDnsRecord) {
        return sendAsync(HttpMethod.PATCH, sourcePassiveDnsRecord);
    }

    /**
     * Patches this PassiveDnsRecord with a source
     *
     * @param sourcePassiveDnsRecord the source object with updates
     * @return the updated PassiveDnsRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PassiveDnsRecord patch(@Nonnull final PassiveDnsRecord sourcePassiveDnsRecord) throws ClientException {
        return send(HttpMethod.PATCH, sourcePassiveDnsRecord);
    }

    /**
     * Creates a PassiveDnsRecord with a new object
     *
     * @param newPassiveDnsRecord the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PassiveDnsRecord> postAsync(@Nonnull final PassiveDnsRecord newPassiveDnsRecord) {
        return sendAsync(HttpMethod.POST, newPassiveDnsRecord);
    }

    /**
     * Creates a PassiveDnsRecord with a new object
     *
     * @param newPassiveDnsRecord the new object to create
     * @return the created PassiveDnsRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PassiveDnsRecord post(@Nonnull final PassiveDnsRecord newPassiveDnsRecord) throws ClientException {
        return send(HttpMethod.POST, newPassiveDnsRecord);
    }

    /**
     * Creates a PassiveDnsRecord with a new object
     *
     * @param newPassiveDnsRecord the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PassiveDnsRecord> putAsync(@Nonnull final PassiveDnsRecord newPassiveDnsRecord) {
        return sendAsync(HttpMethod.PUT, newPassiveDnsRecord);
    }

    /**
     * Creates a PassiveDnsRecord with a new object
     *
     * @param newPassiveDnsRecord the object to create/update
     * @return the created PassiveDnsRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PassiveDnsRecord put(@Nonnull final PassiveDnsRecord newPassiveDnsRecord) throws ClientException {
        return send(HttpMethod.PUT, newPassiveDnsRecord);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PassiveDnsRecordRequest select(@Nonnull final String value) {
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
     public PassiveDnsRecordRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

