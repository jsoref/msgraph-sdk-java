// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceConfigurationUserOverview;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration User Overview Request.
 */
public class DeviceConfigurationUserOverviewRequest extends BaseRequest implements IDeviceConfigurationUserOverviewRequest {
	
    /**
     * The request for the DeviceConfigurationUserOverview
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationUserOverviewRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationUserOverview.class);
    }

    /**
     * Gets the DeviceConfigurationUserOverview from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceConfigurationUserOverview> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceConfigurationUserOverview from the service
     *
     * @return the DeviceConfigurationUserOverview from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationUserOverview get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceConfigurationUserOverview> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceConfigurationUserOverview with a source
     *
     * @param sourceDeviceConfigurationUserOverview the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceConfigurationUserOverview sourceDeviceConfigurationUserOverview, final ICallback<DeviceConfigurationUserOverview> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceConfigurationUserOverview);
    }

    /**
     * Patches this DeviceConfigurationUserOverview with a source
     *
     * @param sourceDeviceConfigurationUserOverview the source object with updates
     * @return the updated DeviceConfigurationUserOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationUserOverview patch(final DeviceConfigurationUserOverview sourceDeviceConfigurationUserOverview) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceConfigurationUserOverview);
    }

    /**
     * Creates a DeviceConfigurationUserOverview with a new object
     *
     * @param newDeviceConfigurationUserOverview the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceConfigurationUserOverview newDeviceConfigurationUserOverview, final ICallback<DeviceConfigurationUserOverview> callback) {
        send(HttpMethod.POST, callback, newDeviceConfigurationUserOverview);
    }

    /**
     * Creates a DeviceConfigurationUserOverview with a new object
     *
     * @param newDeviceConfigurationUserOverview the new object to create
     * @return the created DeviceConfigurationUserOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationUserOverview post(final DeviceConfigurationUserOverview newDeviceConfigurationUserOverview) throws ClientException {
        return send(HttpMethod.POST, newDeviceConfigurationUserOverview);
    }

    /**
     * Creates a DeviceConfigurationUserOverview with a new object
     *
     * @param newDeviceConfigurationUserOverview the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceConfigurationUserOverview newDeviceConfigurationUserOverview, final ICallback<DeviceConfigurationUserOverview> callback) {
        send(HttpMethod.PUT, callback, newDeviceConfigurationUserOverview);
    }

    /**
     * Creates a DeviceConfigurationUserOverview with a new object
     *
     * @param newDeviceConfigurationUserOverview the object to create/update
     * @return the created DeviceConfigurationUserOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationUserOverview put(final DeviceConfigurationUserOverview newDeviceConfigurationUserOverview) throws ClientException {
        return send(HttpMethod.PUT, newDeviceConfigurationUserOverview);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceConfigurationUserOverviewRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceConfigurationUserOverviewRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceConfigurationUserOverviewRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceConfigurationUserOverviewRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IDeviceConfigurationUserOverviewRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (DeviceConfigurationUserOverviewRequest)this;
     }

}

