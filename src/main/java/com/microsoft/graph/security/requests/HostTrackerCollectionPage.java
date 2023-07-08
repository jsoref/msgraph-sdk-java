// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;
import com.microsoft.graph.security.models.HostTracker;
import com.microsoft.graph.security.requests.HostTrackerCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.security.requests.HostTrackerCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Host Tracker Collection Page.
 */
public class HostTrackerCollectionPage extends BaseCollectionPage<HostTracker, HostTrackerCollectionRequestBuilder> {

    /**
     * A collection page for HostTracker
     *
     * @param response the serialized HostTrackerCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public HostTrackerCollectionPage(@Nonnull final HostTrackerCollectionResponse response, @Nonnull final HostTrackerCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for HostTracker
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public HostTrackerCollectionPage(@Nonnull final java.util.List<HostTracker> pageContents, @Nullable final HostTrackerCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}