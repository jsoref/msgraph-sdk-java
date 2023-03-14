// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.AppManagementPolicy;
import com.microsoft.graph.requests.AppManagementPolicyCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.AppManagementPolicyCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Management Policy Collection Page.
 */
public class AppManagementPolicyCollectionPage extends BaseCollectionPage<AppManagementPolicy, AppManagementPolicyCollectionRequestBuilder> {

    /**
     * A collection page for AppManagementPolicy
     *
     * @param response the serialized AppManagementPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AppManagementPolicyCollectionPage(@Nonnull final AppManagementPolicyCollectionResponse response, @Nonnull final AppManagementPolicyCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AppManagementPolicy
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AppManagementPolicyCollectionPage(@Nonnull final java.util.List<AppManagementPolicy> pageContents, @Nullable final AppManagementPolicyCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}