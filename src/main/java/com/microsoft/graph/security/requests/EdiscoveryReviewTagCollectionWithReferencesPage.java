// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.EdiscoveryReviewTag;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.security.requests.EdiscoveryReviewTagCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.security.requests.EdiscoveryReviewTagCollectionWithReferencesPage;
import com.microsoft.graph.security.requests.EdiscoveryReviewTagCollectionResponse;
import com.microsoft.graph.security.models.EdiscoveryReviewTag;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Review Tag Collection With References Page.
 */
public class EdiscoveryReviewTagCollectionWithReferencesPage extends BaseCollectionPage<EdiscoveryReviewTag, EdiscoveryReviewTagCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for EdiscoveryReviewTag
     *
     * @param response the serialized EdiscoveryReviewTagCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EdiscoveryReviewTagCollectionWithReferencesPage(@Nonnull final EdiscoveryReviewTagCollectionResponse response, @Nullable final EdiscoveryReviewTagCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for EdiscoveryReviewTag
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public EdiscoveryReviewTagCollectionWithReferencesPage(@Nonnull final java.util.List<EdiscoveryReviewTag> pageContents, @Nullable final EdiscoveryReviewTagCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
