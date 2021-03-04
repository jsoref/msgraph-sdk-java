// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrintService;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Print Service Request.
 */
public interface IPrintServiceRequest extends IHttpRequest {

    /**
     * Gets the PrintService from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super PrintService> callback);

    /**
     * Gets the PrintService from the service
     *
     * @return the PrintService from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintService get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super PrintService> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PrintService with a source
     *
     * @param sourcePrintService the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PrintService sourcePrintService, final ICallback<? super PrintService> callback);

    /**
     * Patches this PrintService with a source
     *
     * @param sourcePrintService the source object with updates
     * @return the updated PrintService
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintService patch(final PrintService sourcePrintService) throws ClientException;

    /**
     * Posts a PrintService with a new object
     *
     * @param newPrintService the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PrintService newPrintService, final ICallback<? super PrintService> callback);

    /**
     * Posts a PrintService with a new object
     *
     * @param newPrintService the new object to create
     * @return the created PrintService
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintService post(final PrintService newPrintService) throws ClientException;

    /**
     * Posts a PrintService with a new object
     *
     * @param newPrintService the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PrintService newPrintService, final ICallback<? super PrintService> callback);

    /**
     * Posts a PrintService with a new object
     *
     * @param newPrintService the object to create/update
     * @return the created PrintService
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintService put(final PrintService newPrintService) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPrintServiceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPrintServiceRequest expand(final String value);

}
