// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UserExperienceAnalyticsMetric;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Metric Request.
 */
public class UserExperienceAnalyticsMetricRequest extends BaseRequest<UserExperienceAnalyticsMetric> {
	
    /**
     * The request for the UserExperienceAnalyticsMetric
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsMetricRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsMetric.class);
    }

    /**
     * Gets the UserExperienceAnalyticsMetric from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsMetric> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UserExperienceAnalyticsMetric from the service
     *
     * @return the UserExperienceAnalyticsMetric from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsMetric get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsMetric> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UserExperienceAnalyticsMetric delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UserExperienceAnalyticsMetric with a source
     *
     * @param sourceUserExperienceAnalyticsMetric the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsMetric> patchAsync(@Nonnull final UserExperienceAnalyticsMetric sourceUserExperienceAnalyticsMetric) {
        return sendAsync(HttpMethod.PATCH, sourceUserExperienceAnalyticsMetric);
    }

    /**
     * Patches this UserExperienceAnalyticsMetric with a source
     *
     * @param sourceUserExperienceAnalyticsMetric the source object with updates
     * @return the updated UserExperienceAnalyticsMetric
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsMetric patch(@Nonnull final UserExperienceAnalyticsMetric sourceUserExperienceAnalyticsMetric) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserExperienceAnalyticsMetric);
    }

    /**
     * Creates a UserExperienceAnalyticsMetric with a new object
     *
     * @param newUserExperienceAnalyticsMetric the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsMetric> postAsync(@Nonnull final UserExperienceAnalyticsMetric newUserExperienceAnalyticsMetric) {
        return sendAsync(HttpMethod.POST, newUserExperienceAnalyticsMetric);
    }

    /**
     * Creates a UserExperienceAnalyticsMetric with a new object
     *
     * @param newUserExperienceAnalyticsMetric the new object to create
     * @return the created UserExperienceAnalyticsMetric
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsMetric post(@Nonnull final UserExperienceAnalyticsMetric newUserExperienceAnalyticsMetric) throws ClientException {
        return send(HttpMethod.POST, newUserExperienceAnalyticsMetric);
    }

    /**
     * Creates a UserExperienceAnalyticsMetric with a new object
     *
     * @param newUserExperienceAnalyticsMetric the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsMetric> putAsync(@Nonnull final UserExperienceAnalyticsMetric newUserExperienceAnalyticsMetric) {
        return sendAsync(HttpMethod.PUT, newUserExperienceAnalyticsMetric);
    }

    /**
     * Creates a UserExperienceAnalyticsMetric with a new object
     *
     * @param newUserExperienceAnalyticsMetric the object to create/update
     * @return the created UserExperienceAnalyticsMetric
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsMetric put(@Nonnull final UserExperienceAnalyticsMetric newUserExperienceAnalyticsMetric) throws ClientException {
        return send(HttpMethod.PUT, newUserExperienceAnalyticsMetric);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UserExperienceAnalyticsMetricRequest select(@Nonnull final String value) {
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
     public UserExperienceAnalyticsMetricRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

