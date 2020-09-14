// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookTable;
import com.microsoft.graph.models.extensions.WorkbookTableRow;
import com.microsoft.graph.models.extensions.WorkbookRange;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookTableRowCollectionResponse;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowCollectionRequest;
import com.microsoft.graph.requests.extensions.WorkbookTableRowCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Row Collection Request.
 */
public class WorkbookTableRowCollectionRequest extends BaseCollectionRequest<WorkbookTableRowCollectionResponse, IWorkbookTableRowCollectionPage> implements IWorkbookTableRowCollectionRequest {

    /**
     * The request builder for this collection of WorkbookTableRow
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableRowCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookTableRowCollectionResponse.class, IWorkbookTableRowCollectionPage.class);
    }

    public void get(final ICallback<IWorkbookTableRowCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IWorkbookTableRowCollectionPage get() throws ClientException {
        final WorkbookTableRowCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WorkbookTableRow newWorkbookTableRow, final ICallback<WorkbookTableRow> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WorkbookTableRowRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWorkbookTableRow, callback);
    }

    public WorkbookTableRow post(final WorkbookTableRow newWorkbookTableRow) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WorkbookTableRowRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWorkbookTableRow);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookTableRowCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WorkbookTableRowCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IWorkbookTableRowCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (WorkbookTableRowCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookTableRowCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WorkbookTableRowCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWorkbookTableRowCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (WorkbookTableRowCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IWorkbookTableRowCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (WorkbookTableRowCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IWorkbookTableRowCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IWorkbookTableRowCollectionRequest)this;
    }
    public IWorkbookTableRowCollectionPage buildFromResponse(final WorkbookTableRowCollectionResponse response) {
        final IWorkbookTableRowCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WorkbookTableRowCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WorkbookTableRowCollectionPage page = new WorkbookTableRowCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
