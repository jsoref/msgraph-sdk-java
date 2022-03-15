// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.AccessPackageAssignmentPolicy;
import com.microsoft.graph.requests.AccessPackageAssignmentPolicyCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.AccessPackageAssignmentPolicyCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Policy Collection Page.
 */
public class AccessPackageAssignmentPolicyCollectionPage extends BaseCollectionPage<AccessPackageAssignmentPolicy, AccessPackageAssignmentPolicyCollectionRequestBuilder> {

    /**
     * A collection page for AccessPackageAssignmentPolicy
     *
     * @param response the serialized AccessPackageAssignmentPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AccessPackageAssignmentPolicyCollectionPage(@Nonnull final AccessPackageAssignmentPolicyCollectionResponse response, @Nonnull final AccessPackageAssignmentPolicyCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AccessPackageAssignmentPolicy
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AccessPackageAssignmentPolicyCollectionPage(@Nonnull final java.util.List<AccessPackageAssignmentPolicy> pageContents, @Nullable final AccessPackageAssignmentPolicyCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
