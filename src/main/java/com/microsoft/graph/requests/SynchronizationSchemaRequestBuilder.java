// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SynchronizationSchema;
import com.microsoft.graph.models.ExpressionInputObject;
import com.microsoft.graph.models.AttributeDefinition;
import com.microsoft.graph.models.ParseExpressionResponse;
import com.microsoft.graph.models.FilterOperatorSchema;
import com.microsoft.graph.models.AttributeMappingFunctionSchema;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.SynchronizationSchemaParseExpressionParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Schema Request Builder.
 */
public class SynchronizationSchemaRequestBuilder extends BaseRequestBuilder<SynchronizationSchema> {

    /**
     * The request builder for the SynchronizationSchema
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SynchronizationSchemaRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the SynchronizationSchemaRequest instance
     */
    @Nonnull
    public SynchronizationSchemaRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the SynchronizationSchemaRequest instance
     */
    @Nonnull
    public SynchronizationSchemaRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.SynchronizationSchemaRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the DirectoryDefinition collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DirectoryDefinitionCollectionRequestBuilder directories() {
        return new com.microsoft.graph.requests.DirectoryDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("directories"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryDefinition item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DirectoryDefinitionRequestBuilder directories(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DirectoryDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("directories") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public SynchronizationSchemaParseExpressionRequestBuilder parseExpression(@Nonnull final SynchronizationSchemaParseExpressionParameterSet parameters) {
        return new SynchronizationSchemaParseExpressionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.parseExpression"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public SynchronizationSchemaFilterOperatorsCollectionRequestBuilder filterOperators() {
        return new SynchronizationSchemaFilterOperatorsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.filterOperators"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public SynchronizationSchemaFunctionsCollectionRequestBuilder functions() {
        return new SynchronizationSchemaFunctionsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.functions"), getClient(), null);
    }
}