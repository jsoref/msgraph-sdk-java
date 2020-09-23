// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AdministrativeUnit;
import com.microsoft.graph.requests.extensions.IAdministrativeUnitCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.AdministrativeUnitCollectionPage;
import com.microsoft.graph.requests.extensions.AdministrativeUnitCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Administrative Unit Collection Page.
 */
public class AdministrativeUnitCollectionPage extends BaseCollectionPage<AdministrativeUnit, IAdministrativeUnitCollectionRequestBuilder> implements IAdministrativeUnitCollectionPage {

    /**
     * A collection page for AdministrativeUnit
     *
     * @param response the serialized AdministrativeUnitCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AdministrativeUnitCollectionPage(final AdministrativeUnitCollectionResponse response, final IAdministrativeUnitCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}