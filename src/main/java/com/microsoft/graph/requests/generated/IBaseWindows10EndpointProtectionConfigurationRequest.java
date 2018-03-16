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
 * The interface for the Base Windows10Endpoint Protection Configuration Request.
 */
public interface IBaseWindows10EndpointProtectionConfigurationRequest extends IHttpRequest {

    /**
     * Gets the Windows10EndpointProtectionConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Windows10EndpointProtectionConfiguration> callback);

    /**
     * Gets the Windows10EndpointProtectionConfiguration from the service
     *
     * @return the Windows10EndpointProtectionConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10EndpointProtectionConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Windows10EndpointProtectionConfiguration with a source
     *
     * @param sourceWindows10EndpointProtectionConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Windows10EndpointProtectionConfiguration sourceWindows10EndpointProtectionConfiguration, final ICallback<Windows10EndpointProtectionConfiguration> callback);

    /**
     * Patches this Windows10EndpointProtectionConfiguration with a source
     *
     * @param sourceWindows10EndpointProtectionConfiguration the source object with updates
     * @return the updated Windows10EndpointProtectionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10EndpointProtectionConfiguration patch(final Windows10EndpointProtectionConfiguration sourceWindows10EndpointProtectionConfiguration) throws ClientException;

    /**
     * Posts a Windows10EndpointProtectionConfiguration with a new object
     *
     * @param newWindows10EndpointProtectionConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Windows10EndpointProtectionConfiguration newWindows10EndpointProtectionConfiguration, final ICallback<Windows10EndpointProtectionConfiguration> callback);

    /**
     * Posts a Windows10EndpointProtectionConfiguration with a new object
     *
     * @param newWindows10EndpointProtectionConfiguration the new object to create
     * @return the created Windows10EndpointProtectionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10EndpointProtectionConfiguration post(final Windows10EndpointProtectionConfiguration newWindows10EndpointProtectionConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseWindows10EndpointProtectionConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseWindows10EndpointProtectionConfigurationRequest expand(final String value);

}

