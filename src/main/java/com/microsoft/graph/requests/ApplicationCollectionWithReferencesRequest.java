// Template Source: BaseEntityCollectionWithReferencesRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.identitygovernance.models.CustomTaskExtensionCallbackConfiguration;
import com.microsoft.graph.models.Application;
import com.microsoft.graph.models.KeyCredential;
import com.microsoft.graph.models.PasswordCredential;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.ExtensionProperty;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.models.Application;
import com.microsoft.graph.requests.ApplicationWithReferenceRequest;
import com.microsoft.graph.requests.ApplicationReferenceRequestBuilder;
import com.microsoft.graph.requests.ApplicationWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ApplicationCollectionWithReferencesRequest;
import com.microsoft.graph.requests.ApplicationCollectionWithReferencesRequest;
import com.microsoft.graph.requests.ApplicationCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Collection With References Request.
 */
public class ApplicationCollectionWithReferencesRequest extends BaseCollectionWithReferencesRequest<Application, ApplicationWithReferenceRequest, ApplicationReferenceRequestBuilder, ApplicationWithReferenceRequestBuilder, ApplicationCollectionResponse, ApplicationCollectionWithReferencesPage, ApplicationCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of Application
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplicationCollectionWithReferencesRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ApplicationCollectionResponse.class, ApplicationCollectionWithReferencesPage.class, ApplicationCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ApplicationCollectionWithReferencesRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public ApplicationCollectionWithReferencesRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public ApplicationCollectionWithReferencesRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public ApplicationCollectionWithReferencesRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public ApplicationCollectionWithReferencesRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public ApplicationCollectionWithReferencesRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public ApplicationCollectionWithReferencesRequest count() {
        addCountOption(true);
        return this;
    }
}