package com.microsoft.graph.serviceprincipals.item.addpassword;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.PasswordCredential;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the addPassword method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddPasswordRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new AddPasswordRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AddPasswordRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/addPassword", pathParameters);
    }
    /**
     * Instantiates a new AddPasswordRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AddPasswordRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/addPassword", rawUrl);
    }
    /**
     * Add a strong password or secret to a servicePrincipal object.
     * @param body The request body
     * @return a PasswordCredential
     * @see <a href="https://learn.microsoft.com/graph/api/serviceprincipal-addpassword?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PasswordCredential post(@jakarta.annotation.Nonnull final AddPasswordPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Add a strong password or secret to a servicePrincipal object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a PasswordCredential
     * @see <a href="https://learn.microsoft.com/graph/api/serviceprincipal-addpassword?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PasswordCredential post(@jakarta.annotation.Nonnull final AddPasswordPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PasswordCredential::createFromDiscriminatorValue);
    }
    /**
     * Add a strong password or secret to a servicePrincipal object.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AddPasswordPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Add a strong password or secret to a servicePrincipal object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AddPasswordPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a AddPasswordRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AddPasswordRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AddPasswordRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}