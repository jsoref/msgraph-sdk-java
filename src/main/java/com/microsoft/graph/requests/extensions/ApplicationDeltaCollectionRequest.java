// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Application;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IApplicationDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationDeltaCollectionPage;
import com.microsoft.graph.requests.extensions.ApplicationDeltaCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Delta Collection Request.
 */
public class ApplicationDeltaCollectionRequest extends BaseCollectionRequest<ApplicationDeltaCollectionResponse, IApplicationDeltaCollectionPage> implements IApplicationDeltaCollectionRequest {


    /**
     * The request for this ApplicationDelta
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplicationDeltaCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ApplicationDeltaCollectionResponse.class, IApplicationDeltaCollectionPage.class);
    }


    public void get(final ICallback<IApplicationDeltaCollectionPage> callback) {
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

    public IApplicationDeltaCollectionPage get() throws ClientException {
        final ApplicationDeltaCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IApplicationDeltaCollectionPage buildFromResponse(final ApplicationDeltaCollectionResponse response) {
        final IApplicationDeltaCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ApplicationDeltaCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IApplicationDeltaCollectionPage page = new ApplicationDeltaCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IApplicationDeltaCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IApplicationDeltaCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IApplicationDeltaCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IApplicationDeltaCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IApplicationDeltaCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IApplicationDeltaCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IApplicationDeltaCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IApplicationDeltaCollectionRequest)this;
    }

}
