package com.microsoft.graph.applications.item.synchronization.templates;

import com.microsoft.graph.applications.item.synchronization.templates.count.CountRequestBuilder;
import com.microsoft.graph.applications.item.synchronization.templates.item.SynchronizationTemplateItemRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.SynchronizationTemplate;
import com.microsoft.graph.models.SynchronizationTemplateCollectionResponse;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;

import java.util.HashMap;
import java.util.Objects;
/**
 * Provides operations to manage the templates property of the microsoft.graph.synchronization entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TemplatesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the templates property of the microsoft.graph.synchronization entity.
     * @param synchronizationTemplateId The unique identifier of synchronizationTemplate
     * @return a SynchronizationTemplateItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SynchronizationTemplateItemRequestBuilder bySynchronizationTemplateId(@jakarta.annotation.Nonnull final String synchronizationTemplateId) {
        Objects.requireNonNull(synchronizationTemplateId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("synchronizationTemplate%2Did", synchronizationTemplateId);
        return new SynchronizationTemplateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new TemplatesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TemplatesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/applications/{application%2Did}/synchronization/templates{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new TemplatesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TemplatesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/applications/{application%2Did}/synchronization/templates{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * List the synchronization templates associated with a given application or service principal.
     * @return a SynchronizationTemplateCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/synchronization-synchronization-list-templates?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SynchronizationTemplateCollectionResponse get() {
        return get(null);
    }
    /**
     * List the synchronization templates associated with a given application or service principal.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SynchronizationTemplateCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/synchronization-synchronization-list-templates?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SynchronizationTemplateCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SynchronizationTemplateCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to templates for applications
     * @param body The request body
     * @return a SynchronizationTemplate
     */
    @jakarta.annotation.Nullable
    public SynchronizationTemplate post(@jakarta.annotation.Nonnull final SynchronizationTemplate body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to templates for applications
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SynchronizationTemplate
     */
    @jakarta.annotation.Nullable
    public SynchronizationTemplate post(@jakarta.annotation.Nonnull final SynchronizationTemplate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SynchronizationTemplate::createFromDiscriminatorValue);
    }
    /**
     * List the synchronization templates associated with a given application or service principal.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List the synchronization templates associated with a given application or service principal.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Create new navigation property to templates for applications
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SynchronizationTemplate body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to templates for applications
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SynchronizationTemplate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a TemplatesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public TemplatesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TemplatesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * List the synchronization templates associated with a given application or service principal.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Include count of items
         */
        @QueryParameter(name = "%24count")
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @QueryParameter(name = "%24filter")
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @QueryParameter(name = "%24orderby")
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @QueryParameter(name = "%24search")
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @QueryParameter(name = "%24skip")
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @QueryParameter(name = "%24top")
        @jakarta.annotation.Nullable
        public Integer top;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
