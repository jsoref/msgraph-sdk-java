// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Application;
import com.microsoft.graph.models.KeyCredential;
import com.microsoft.graph.models.PasswordCredential;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.ExtensionProperty;
import com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ExtensionPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.ExtensionPropertyRequestBuilder;
import com.microsoft.graph.requests.FederatedIdentityCredentialCollectionRequestBuilder;
import com.microsoft.graph.requests.FederatedIdentityCredentialRequestBuilder;
import com.microsoft.graph.requests.HomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.HomeRealmDiscoveryPolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.AppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.EndpointRequestBuilder;
import com.microsoft.graph.requests.ServicePrincipalRequestBuilder;
import com.microsoft.graph.requests.UserRequestBuilder;
import com.microsoft.graph.requests.TokenIssuancePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.TokenIssuancePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.TokenLifetimePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.TokenLifetimePolicyWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.ApplicationSetVerifiedPublisherParameterSet;
import com.microsoft.graph.models.ApplicationAddKeyParameterSet;
import com.microsoft.graph.models.ApplicationAddPasswordParameterSet;
import com.microsoft.graph.models.ApplicationRemoveKeyParameterSet;
import com.microsoft.graph.models.ApplicationRemovePasswordParameterSet;
import com.microsoft.graph.models.DirectoryObjectCheckMemberGroupsParameterSet;
import com.microsoft.graph.models.DirectoryObjectCheckMemberObjectsParameterSet;
import com.microsoft.graph.models.DirectoryObjectGetMemberGroupsParameterSet;
import com.microsoft.graph.models.DirectoryObjectGetMemberObjectsParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Request Builder.
 */
public class ApplicationRequestBuilder extends BaseRequestBuilder<Application> {

    /**
     * The request builder for the Application
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplicationRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ApplicationRequest instance
     */
    @Nonnull
    public ApplicationRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ApplicationRequest instance
     */
    @Nonnull
    public ApplicationRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.ApplicationRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the DirectoryObjectWithReferenceRequestBuilder instance
     */
    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder createdOnBehalfOf() {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdOnBehalfOf"), getClient(), null);
    }
    /**
     *  Gets a request builder for the ExtensionProperty collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ExtensionPropertyCollectionRequestBuilder extensionProperties() {
        return new ExtensionPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensionProperties"), getClient(), null);
    }

    /**
     * Gets a request builder for the ExtensionProperty item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ExtensionPropertyRequestBuilder extensionProperties(@Nonnull final String id) {
        return new ExtensionPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("extensionProperties") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the FederatedIdentityCredential collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public FederatedIdentityCredentialCollectionRequestBuilder federatedIdentityCredentials() {
        return new FederatedIdentityCredentialCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("federatedIdentityCredentials"), getClient(), null);
    }

    /**
     * Gets a request builder for the FederatedIdentityCredential item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public FederatedIdentityCredentialRequestBuilder federatedIdentityCredentials(@Nonnull final String id) {
        return new FederatedIdentityCredentialRequestBuilder(getRequestUrlWithAdditionalSegment("federatedIdentityCredentials") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the HomeRealmDiscoveryPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public HomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder homeRealmDiscoveryPolicies() {
        return new HomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("homeRealmDiscoveryPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the HomeRealmDiscoveryPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public HomeRealmDiscoveryPolicyWithReferenceRequestBuilder homeRealmDiscoveryPolicies(@Nonnull final String id) {
        return new HomeRealmDiscoveryPolicyWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("homeRealmDiscoveryPolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DirectoryObjectCollectionWithReferencesRequestBuilder owners() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder owners(@Nonnull final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the AppRoleAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AppRoleAssignmentCollectionRequestBuilder ownersAsAppRoleAssignment() {
        return new AppRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }

    /**
     * Gets a request builder for the AppRoleAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AppRoleAssignmentRequestBuilder ownersAsAppRoleAssignment(@Nonnull final String id) {
        return new AppRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }
    /**
     *  Gets a request builder for the Endpoint collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public EndpointCollectionRequestBuilder ownersAsEndpoint() {
        return new EndpointCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.endpoint", getClient(), null);
    }

    /**
     * Gets a request builder for the Endpoint item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public EndpointRequestBuilder ownersAsEndpoint(@Nonnull final String id) {
        return new EndpointRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.endpoint", getClient(), null);
    }
    /**
     *  Gets a request builder for the ServicePrincipal collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ServicePrincipalCollectionRequestBuilder ownersAsServicePrincipal() {
        return new ServicePrincipalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    /**
     * Gets a request builder for the ServicePrincipal item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ServicePrincipalRequestBuilder ownersAsServicePrincipal(@Nonnull final String id) {
        return new ServicePrincipalRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    /**
     *  Gets a request builder for the User collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserCollectionRequestBuilder ownersAsUser() {
        return new UserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.user", getClient(), null);
    }

    /**
     * Gets a request builder for the User item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserRequestBuilder ownersAsUser(@Nonnull final String id) {
        return new UserRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    /**
     *  Gets a request builder for the TokenIssuancePolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TokenIssuancePolicyCollectionWithReferencesRequestBuilder tokenIssuancePolicies() {
        return new TokenIssuancePolicyCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("tokenIssuancePolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the TokenIssuancePolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TokenIssuancePolicyWithReferenceRequestBuilder tokenIssuancePolicies(@Nonnull final String id) {
        return new TokenIssuancePolicyWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("tokenIssuancePolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TokenLifetimePolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TokenLifetimePolicyCollectionWithReferencesRequestBuilder tokenLifetimePolicies() {
        return new TokenLifetimePolicyCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("tokenLifetimePolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the TokenLifetimePolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TokenLifetimePolicyWithReferenceRequestBuilder tokenLifetimePolicies(@Nonnull final String id) {
        return new TokenLifetimePolicyWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("tokenLifetimePolicies") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for logo
     *
     * @return the ApplicationLogoStreamRequestBuilder instance
     */
    @Nonnull
    public ApplicationLogoStreamRequestBuilder logo() {
        return new ApplicationLogoStreamRequestBuilder(getRequestUrlWithAdditionalSegment("logo"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ApplicationSetVerifiedPublisherRequestBuilder setVerifiedPublisher(@Nonnull final ApplicationSetVerifiedPublisherParameterSet parameters) {
        return new ApplicationSetVerifiedPublisherRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.setVerifiedPublisher"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ApplicationUnsetVerifiedPublisherRequestBuilder unsetVerifiedPublisher() {
        return new ApplicationUnsetVerifiedPublisherRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unsetVerifiedPublisher"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ApplicationAddKeyRequestBuilder addKey(@Nonnull final ApplicationAddKeyParameterSet parameters) {
        return new ApplicationAddKeyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.addKey"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ApplicationAddPasswordRequestBuilder addPassword(@Nonnull final ApplicationAddPasswordParameterSet parameters) {
        return new ApplicationAddPasswordRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.addPassword"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ApplicationRemoveKeyRequestBuilder removeKey(@Nonnull final ApplicationRemoveKeyParameterSet parameters) {
        return new ApplicationRemoveKeyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.removeKey"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ApplicationRemovePasswordRequestBuilder removePassword(@Nonnull final ApplicationRemovePasswordParameterSet parameters) {
        return new ApplicationRemovePasswordRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.removePassword"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectCheckMemberGroupsCollectionRequestBuilder checkMemberGroups(@Nonnull final DirectoryObjectCheckMemberGroupsParameterSet parameters) {
        return new DirectoryObjectCheckMemberGroupsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkMemberGroups"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectCheckMemberObjectsCollectionRequestBuilder checkMemberObjects(@Nonnull final DirectoryObjectCheckMemberObjectsParameterSet parameters) {
        return new DirectoryObjectCheckMemberObjectsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkMemberObjects"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectGetMemberGroupsCollectionRequestBuilder getMemberGroups(@Nonnull final DirectoryObjectGetMemberGroupsParameterSet parameters) {
        return new DirectoryObjectGetMemberGroupsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMemberGroups"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectGetMemberObjectsCollectionRequestBuilder getMemberObjects(@Nonnull final DirectoryObjectGetMemberObjectsParameterSet parameters) {
        return new DirectoryObjectGetMemberObjectsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMemberObjects"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public DirectoryObjectRestoreRequestBuilder restore() {
        return new DirectoryObjectRestoreRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.restore"), getClient(), null);
    }
}
