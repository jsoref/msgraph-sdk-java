// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UserExperienceAnalyticsAppHealthDevicePerformanceDetails;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics App Health Device Performance Details Request.
 */
public class UserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequest extends BaseRequest<UserExperienceAnalyticsAppHealthDevicePerformanceDetails> {
	
    /**
     * The request for the UserExperienceAnalyticsAppHealthDevicePerformanceDetails
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsAppHealthDevicePerformanceDetails.class);
    }

    /**
     * Gets the UserExperienceAnalyticsAppHealthDevicePerformanceDetails from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsAppHealthDevicePerformanceDetails> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UserExperienceAnalyticsAppHealthDevicePerformanceDetails from the service
     *
     * @return the UserExperienceAnalyticsAppHealthDevicePerformanceDetails from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsAppHealthDevicePerformanceDetails get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsAppHealthDevicePerformanceDetails> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UserExperienceAnalyticsAppHealthDevicePerformanceDetails delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UserExperienceAnalyticsAppHealthDevicePerformanceDetails with a source
     *
     * @param sourceUserExperienceAnalyticsAppHealthDevicePerformanceDetails the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsAppHealthDevicePerformanceDetails> patchAsync(@Nonnull final UserExperienceAnalyticsAppHealthDevicePerformanceDetails sourceUserExperienceAnalyticsAppHealthDevicePerformanceDetails) {
        return sendAsync(HttpMethod.PATCH, sourceUserExperienceAnalyticsAppHealthDevicePerformanceDetails);
    }

    /**
     * Patches this UserExperienceAnalyticsAppHealthDevicePerformanceDetails with a source
     *
     * @param sourceUserExperienceAnalyticsAppHealthDevicePerformanceDetails the source object with updates
     * @return the updated UserExperienceAnalyticsAppHealthDevicePerformanceDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsAppHealthDevicePerformanceDetails patch(@Nonnull final UserExperienceAnalyticsAppHealthDevicePerformanceDetails sourceUserExperienceAnalyticsAppHealthDevicePerformanceDetails) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserExperienceAnalyticsAppHealthDevicePerformanceDetails);
    }

    /**
     * Creates a UserExperienceAnalyticsAppHealthDevicePerformanceDetails with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDevicePerformanceDetails the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsAppHealthDevicePerformanceDetails> postAsync(@Nonnull final UserExperienceAnalyticsAppHealthDevicePerformanceDetails newUserExperienceAnalyticsAppHealthDevicePerformanceDetails) {
        return sendAsync(HttpMethod.POST, newUserExperienceAnalyticsAppHealthDevicePerformanceDetails);
    }

    /**
     * Creates a UserExperienceAnalyticsAppHealthDevicePerformanceDetails with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDevicePerformanceDetails the new object to create
     * @return the created UserExperienceAnalyticsAppHealthDevicePerformanceDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsAppHealthDevicePerformanceDetails post(@Nonnull final UserExperienceAnalyticsAppHealthDevicePerformanceDetails newUserExperienceAnalyticsAppHealthDevicePerformanceDetails) throws ClientException {
        return send(HttpMethod.POST, newUserExperienceAnalyticsAppHealthDevicePerformanceDetails);
    }

    /**
     * Creates a UserExperienceAnalyticsAppHealthDevicePerformanceDetails with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDevicePerformanceDetails the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsAppHealthDevicePerformanceDetails> putAsync(@Nonnull final UserExperienceAnalyticsAppHealthDevicePerformanceDetails newUserExperienceAnalyticsAppHealthDevicePerformanceDetails) {
        return sendAsync(HttpMethod.PUT, newUserExperienceAnalyticsAppHealthDevicePerformanceDetails);
    }

    /**
     * Creates a UserExperienceAnalyticsAppHealthDevicePerformanceDetails with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDevicePerformanceDetails the object to create/update
     * @return the created UserExperienceAnalyticsAppHealthDevicePerformanceDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsAppHealthDevicePerformanceDetails put(@Nonnull final UserExperienceAnalyticsAppHealthDevicePerformanceDetails newUserExperienceAnalyticsAppHealthDevicePerformanceDetails) throws ClientException {
        return send(HttpMethod.PUT, newUserExperienceAnalyticsAppHealthDevicePerformanceDetails);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequest select(@Nonnull final String value) {
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
     public UserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

