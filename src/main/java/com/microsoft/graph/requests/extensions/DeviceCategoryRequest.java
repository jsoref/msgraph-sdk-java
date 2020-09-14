// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCategory;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Category Request.
 */
public class DeviceCategoryRequest extends BaseRequest implements IDeviceCategoryRequest {
	
    /**
     * The request for the DeviceCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCategoryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCategory.class);
    }

    /**
     * Gets the DeviceCategory from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceCategory> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceCategory from the service
     *
     * @return the DeviceCategory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCategory get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceCategory> callback) {
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
     * Patches this DeviceCategory with a source
     *
     * @param sourceDeviceCategory the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceCategory sourceDeviceCategory, final ICallback<DeviceCategory> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceCategory);
    }

    /**
     * Patches this DeviceCategory with a source
     *
     * @param sourceDeviceCategory the source object with updates
     * @return the updated DeviceCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCategory patch(final DeviceCategory sourceDeviceCategory) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceCategory);
    }

    /**
     * Creates a DeviceCategory with a new object
     *
     * @param newDeviceCategory the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceCategory newDeviceCategory, final ICallback<DeviceCategory> callback) {
        send(HttpMethod.POST, callback, newDeviceCategory);
    }

    /**
     * Creates a DeviceCategory with a new object
     *
     * @param newDeviceCategory the new object to create
     * @return the created DeviceCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCategory post(final DeviceCategory newDeviceCategory) throws ClientException {
        return send(HttpMethod.POST, newDeviceCategory);
    }

    /**
     * Creates a DeviceCategory with a new object
     *
     * @param newDeviceCategory the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceCategory newDeviceCategory, final ICallback<DeviceCategory> callback) {
        send(HttpMethod.PUT, callback, newDeviceCategory);
    }

    /**
     * Creates a DeviceCategory with a new object
     *
     * @param newDeviceCategory the object to create/update
     * @return the created DeviceCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCategory put(final DeviceCategory newDeviceCategory) throws ClientException {
        return send(HttpMethod.PUT, newDeviceCategory);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceCategoryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceCategoryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceCategoryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceCategoryRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IDeviceCategoryRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (DeviceCategoryRequest)this;
     }

}

