// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;
import com.microsoft.graph.security.models.SiteSource;
import com.microsoft.graph.security.requests.SiteSourceCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.security.requests.SiteSourceCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Source Collection Page.
 */
public class SiteSourceCollectionPage extends BaseCollectionPage<SiteSource, SiteSourceCollectionRequestBuilder> {

    /**
     * A collection page for SiteSource
     *
     * @param response the serialized SiteSourceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SiteSourceCollectionPage(@Nonnull final SiteSourceCollectionResponse response, @Nonnull final SiteSourceCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for SiteSource
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public SiteSourceCollectionPage(@Nonnull final java.util.List<SiteSource> pageContents, @Nullable final SiteSourceCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
