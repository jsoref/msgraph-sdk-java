// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Administrative Unit With Reference Request.
 */
public interface IBaseAdministrativeUnitWithReferenceRequest extends IHttpRequest {

    void post(final AdministrativeUnit newAdministrativeUnit, final IJsonBackedObject payload, final ICallback<AdministrativeUnit> callback);

    AdministrativeUnit post(final AdministrativeUnit newAdministrativeUnit, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<AdministrativeUnit> callback);

    AdministrativeUnit get() throws ClientException;

    IBaseAdministrativeUnitWithReferenceRequest select(final String value);

    IBaseAdministrativeUnitWithReferenceRequest expand(final String value);

}
