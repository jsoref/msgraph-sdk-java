// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Targeted Managed App Configuration Request.
 */
public class BaseTargetedManagedAppConfigurationRequest extends BaseRequest implements IBaseTargetedManagedAppConfigurationRequest {

    /**
     * The request for the TargetedManagedAppConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseTargetedManagedAppConfigurationRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<TargetedManagedAppConfiguration> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the TargetedManagedAppConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<TargetedManagedAppConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TargetedManagedAppConfiguration from the service
     *
     * @return the TargetedManagedAppConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TargetedManagedAppConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this TargetedManagedAppConfiguration with a source
     *
     * @param sourceTargetedManagedAppConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TargetedManagedAppConfiguration sourceTargetedManagedAppConfiguration, final ICallback<TargetedManagedAppConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceTargetedManagedAppConfiguration);
    }

    /**
     * Patches this TargetedManagedAppConfiguration with a source
     *
     * @param sourceTargetedManagedAppConfiguration the source object with updates
     * @return the updated TargetedManagedAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TargetedManagedAppConfiguration patch(final TargetedManagedAppConfiguration sourceTargetedManagedAppConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceTargetedManagedAppConfiguration);
    }

    /**
     * Creates a TargetedManagedAppConfiguration with a new object
     *
     * @param newTargetedManagedAppConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TargetedManagedAppConfiguration newTargetedManagedAppConfiguration, final ICallback<TargetedManagedAppConfiguration> callback) {
        send(HttpMethod.POST, callback, newTargetedManagedAppConfiguration);
    }

    /**
     * Creates a TargetedManagedAppConfiguration with a new object
     *
     * @param newTargetedManagedAppConfiguration the new object to create
     * @return the created TargetedManagedAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TargetedManagedAppConfiguration post(final TargetedManagedAppConfiguration newTargetedManagedAppConfiguration) throws ClientException {
        return send(HttpMethod.POST, newTargetedManagedAppConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITargetedManagedAppConfigurationRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (TargetedManagedAppConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITargetedManagedAppConfigurationRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (TargetedManagedAppConfigurationRequest)this;
     }

}

