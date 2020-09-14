// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Application;
import com.microsoft.graph.models.extensions.ExtensionProperty;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IExtensionPropertyCollectionPage;
import com.microsoft.graph.requests.extensions.ExtensionPropertyCollectionResponse;
import com.microsoft.graph.requests.extensions.IExtensionPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionPropertyCollectionRequest;
import com.microsoft.graph.requests.extensions.ExtensionPropertyCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Extension Property Collection Request.
 */
public class ExtensionPropertyCollectionRequest extends BaseCollectionRequest<ExtensionPropertyCollectionResponse, IExtensionPropertyCollectionPage> implements IExtensionPropertyCollectionRequest {

    /**
     * The request builder for this collection of ExtensionProperty
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExtensionPropertyCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ExtensionPropertyCollectionResponse.class, IExtensionPropertyCollectionPage.class);
    }

    public void get(final ICallback<IExtensionPropertyCollectionPage> callback) {
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

    public IExtensionPropertyCollectionPage get() throws ClientException {
        final ExtensionPropertyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ExtensionProperty newExtensionProperty, final ICallback<ExtensionProperty> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ExtensionPropertyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newExtensionProperty, callback);
    }

    public ExtensionProperty post(final ExtensionProperty newExtensionProperty) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ExtensionPropertyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newExtensionProperty);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IExtensionPropertyCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ExtensionPropertyCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IExtensionPropertyCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ExtensionPropertyCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IExtensionPropertyCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ExtensionPropertyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IExtensionPropertyCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ExtensionPropertyCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IExtensionPropertyCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (ExtensionPropertyCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IExtensionPropertyCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IExtensionPropertyCollectionRequest)this;
    }
    public IExtensionPropertyCollectionPage buildFromResponse(final ExtensionPropertyCollectionResponse response) {
        final IExtensionPropertyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ExtensionPropertyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ExtensionPropertyCollectionPage page = new ExtensionPropertyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
