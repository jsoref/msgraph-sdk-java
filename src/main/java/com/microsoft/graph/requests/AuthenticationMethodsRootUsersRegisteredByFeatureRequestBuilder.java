// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.AuthenticationMethodsRootUsersRegisteredByFeatureRequest;
import com.microsoft.graph.models.AuthenticationMethodsRoot;
import com.microsoft.graph.models.UserRegistrationFeatureSummary;
import com.microsoft.graph.models.IncludedUserTypes;
import com.microsoft.graph.models.IncludedUserRoles;
import com.microsoft.graph.models.UserRegistrationFeatureSummary;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.models.AuthenticationMethodsRootUsersRegisteredByFeatureParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Methods Root Users Registered By Feature Request Builder.
 */
public class AuthenticationMethodsRootUsersRegisteredByFeatureRequestBuilder extends BaseFunctionRequestBuilder<UserRegistrationFeatureSummary> {

    /**
     * The request builder for this AuthenticationMethodsRootUsersRegisteredByFeature
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuthenticationMethodsRootUsersRegisteredByFeatureRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this AuthenticationMethodsRootUsersRegisteredByFeature
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public AuthenticationMethodsRootUsersRegisteredByFeatureRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final AuthenticationMethodsRootUsersRegisteredByFeatureParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }

    /**
     * Creates the AuthenticationMethodsRootUsersRegisteredByFeatureRequest
     *
     * @param requestOptions the options for the request
     * @return the AuthenticationMethodsRootUsersRegisteredByFeatureRequest instance
     */
    @Nonnull
    public AuthenticationMethodsRootUsersRegisteredByFeatureRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the AuthenticationMethodsRootUsersRegisteredByFeatureRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the AuthenticationMethodsRootUsersRegisteredByFeatureRequest instance
     */
    @Nonnull
    public AuthenticationMethodsRootUsersRegisteredByFeatureRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final AuthenticationMethodsRootUsersRegisteredByFeatureRequest request = new AuthenticationMethodsRootUsersRegisteredByFeatureRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
        }
        return request;
    }
}