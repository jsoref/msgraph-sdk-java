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
 * The class for the Base Device Compliance Policy Request.
 */
public class BaseDeviceCompliancePolicyRequest extends BaseRequest implements IBaseDeviceCompliancePolicyRequest {

    /**
     * The request for the DeviceCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseDeviceCompliancePolicyRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<? extends DeviceCompliancePolicy> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the DeviceCompliancePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceCompliancePolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceCompliancePolicy from the service
     *
     * @return the DeviceCompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicy get() throws ClientException {
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
     * Patches this DeviceCompliancePolicy with a source
     *
     * @param sourceDeviceCompliancePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceCompliancePolicy sourceDeviceCompliancePolicy, final ICallback<DeviceCompliancePolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceCompliancePolicy);
    }

    /**
     * Patches this DeviceCompliancePolicy with a source
     *
     * @param sourceDeviceCompliancePolicy the source object with updates
     * @return the updated DeviceCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicy patch(final DeviceCompliancePolicy sourceDeviceCompliancePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceCompliancePolicy);
    }

    /**
     * Creates a DeviceCompliancePolicy with a new object
     *
     * @param newDeviceCompliancePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceCompliancePolicy newDeviceCompliancePolicy, final ICallback<DeviceCompliancePolicy> callback) {
        send(HttpMethod.POST, callback, newDeviceCompliancePolicy);
    }

    /**
     * Creates a DeviceCompliancePolicy with a new object
     *
     * @param newDeviceCompliancePolicy the new object to create
     * @return the created DeviceCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicy post(final DeviceCompliancePolicy newDeviceCompliancePolicy) throws ClientException {
        return send(HttpMethod.POST, newDeviceCompliancePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceCompliancePolicyRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DeviceCompliancePolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceCompliancePolicyRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DeviceCompliancePolicyRequest)this;
     }

}

