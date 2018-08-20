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
 * The interface for the Base Enrollment Troubleshooting Event Request.
 */
public interface IBaseEnrollmentTroubleshootingEventRequest extends IHttpRequest {

    /**
     * Gets the EnrollmentTroubleshootingEvent from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<EnrollmentTroubleshootingEvent> callback);

    /**
     * Gets the EnrollmentTroubleshootingEvent from the service
     *
     * @return the EnrollmentTroubleshootingEvent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EnrollmentTroubleshootingEvent get() throws ClientException;

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
     * Patches this EnrollmentTroubleshootingEvent with a source
     *
     * @param sourceEnrollmentTroubleshootingEvent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EnrollmentTroubleshootingEvent sourceEnrollmentTroubleshootingEvent, final ICallback<EnrollmentTroubleshootingEvent> callback);

    /**
     * Patches this EnrollmentTroubleshootingEvent with a source
     *
     * @param sourceEnrollmentTroubleshootingEvent the source object with updates
     * @return the updated EnrollmentTroubleshootingEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EnrollmentTroubleshootingEvent patch(final EnrollmentTroubleshootingEvent sourceEnrollmentTroubleshootingEvent) throws ClientException;

    /**
     * Posts a EnrollmentTroubleshootingEvent with a new object
     *
     * @param newEnrollmentTroubleshootingEvent the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EnrollmentTroubleshootingEvent newEnrollmentTroubleshootingEvent, final ICallback<EnrollmentTroubleshootingEvent> callback);

    /**
     * Posts a EnrollmentTroubleshootingEvent with a new object
     *
     * @param newEnrollmentTroubleshootingEvent the new object to create
     * @return the created EnrollmentTroubleshootingEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EnrollmentTroubleshootingEvent post(final EnrollmentTroubleshootingEvent newEnrollmentTroubleshootingEvent) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseEnrollmentTroubleshootingEventRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseEnrollmentTroubleshootingEventRequest expand(final String value);

}
