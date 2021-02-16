// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AuthenticationMethodsPolicy;
import com.microsoft.graph.requests.extensions.IAuthenticationMethodConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuthenticationMethodConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.AuthenticationMethodConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AuthenticationMethodConfigurationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Methods Policy Request.
 */
public class AuthenticationMethodsPolicyRequest extends BaseRequest implements IAuthenticationMethodsPolicyRequest {
	
    /**
     * The request for the AuthenticationMethodsPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuthenticationMethodsPolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AuthenticationMethodsPolicy.class);
    }

    /**
     * Gets the AuthenticationMethodsPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AuthenticationMethodsPolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AuthenticationMethodsPolicy from the service
     *
     * @return the AuthenticationMethodsPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AuthenticationMethodsPolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AuthenticationMethodsPolicy> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AuthenticationMethodsPolicy with a source
     *
     * @param sourceAuthenticationMethodsPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AuthenticationMethodsPolicy sourceAuthenticationMethodsPolicy, final ICallback<? super AuthenticationMethodsPolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceAuthenticationMethodsPolicy);
    }

    /**
     * Patches this AuthenticationMethodsPolicy with a source
     *
     * @param sourceAuthenticationMethodsPolicy the source object with updates
     * @return the updated AuthenticationMethodsPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AuthenticationMethodsPolicy patch(final AuthenticationMethodsPolicy sourceAuthenticationMethodsPolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceAuthenticationMethodsPolicy);
    }

    /**
     * Creates a AuthenticationMethodsPolicy with a new object
     *
     * @param newAuthenticationMethodsPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AuthenticationMethodsPolicy newAuthenticationMethodsPolicy, final ICallback<? super AuthenticationMethodsPolicy> callback) {
        send(HttpMethod.POST, callback, newAuthenticationMethodsPolicy);
    }

    /**
     * Creates a AuthenticationMethodsPolicy with a new object
     *
     * @param newAuthenticationMethodsPolicy the new object to create
     * @return the created AuthenticationMethodsPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AuthenticationMethodsPolicy post(final AuthenticationMethodsPolicy newAuthenticationMethodsPolicy) throws ClientException {
        return send(HttpMethod.POST, newAuthenticationMethodsPolicy);
    }

    /**
     * Creates a AuthenticationMethodsPolicy with a new object
     *
     * @param newAuthenticationMethodsPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AuthenticationMethodsPolicy newAuthenticationMethodsPolicy, final ICallback<? super AuthenticationMethodsPolicy> callback) {
        send(HttpMethod.PUT, callback, newAuthenticationMethodsPolicy);
    }

    /**
     * Creates a AuthenticationMethodsPolicy with a new object
     *
     * @param newAuthenticationMethodsPolicy the object to create/update
     * @return the created AuthenticationMethodsPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AuthenticationMethodsPolicy put(final AuthenticationMethodsPolicy newAuthenticationMethodsPolicy) throws ClientException {
        return send(HttpMethod.PUT, newAuthenticationMethodsPolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAuthenticationMethodsPolicyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AuthenticationMethodsPolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAuthenticationMethodsPolicyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AuthenticationMethodsPolicyRequest)this;
     }

}
