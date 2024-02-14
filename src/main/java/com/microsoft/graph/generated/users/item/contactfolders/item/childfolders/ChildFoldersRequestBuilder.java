package com.microsoft.graph.users.item.contactfolders.item.childfolders;

import com.microsoft.graph.models.ContactFolder;
import com.microsoft.graph.models.ContactFolderCollectionResponse;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.users.item.contactfolders.item.childfolders.count.CountRequestBuilder;
import com.microsoft.graph.users.item.contactfolders.item.childfolders.delta.DeltaRequestBuilder;
import com.microsoft.graph.users.item.contactfolders.item.childfolders.item.ContactFolderItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Provides operations to manage the childFolders property of the microsoft.graph.contactFolder entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChildFoldersRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the delta method.
     * @return a {@link DeltaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeltaRequestBuilder delta() {
        return new DeltaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the childFolders property of the microsoft.graph.contactFolder entity.
     * @param contactFolderId1 The unique identifier of contactFolder
     * @return a {@link ContactFolderItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ContactFolderItemRequestBuilder byContactFolderId1(@jakarta.annotation.Nonnull final String contactFolderId1) {
        Objects.requireNonNull(contactFolderId1);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("contactFolder%2Did1", contactFolderId1);
        return new ContactFolderItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ChildFoldersRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChildFoldersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/contactFolders/{contactFolder%2Did}/childFolders{?%24count,%24expand,%24filter,%24orderby,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link ChildFoldersRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChildFoldersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/contactFolders/{contactFolder%2Did}/childFolders{?%24count,%24expand,%24filter,%24orderby,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get a collection of child folders under the specified contact folder.
     * @return a {@link ContactFolderCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/contactfolder-list-childfolders?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ContactFolderCollectionResponse get() {
        return get(null);
    }
    /**
     * Get a collection of child folders under the specified contact folder.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ContactFolderCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/contactfolder-list-childfolders?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ContactFolderCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ContactFolderCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new contactFolder as a child of a specified folder.  You can also create a new contactFolder under the user's default contact folder.
     * @param body The request body
     * @return a {@link ContactFolder}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/contactfolder-post-childfolders?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ContactFolder post(@jakarta.annotation.Nonnull final ContactFolder body) {
        return post(body, null);
    }
    /**
     * Create a new contactFolder as a child of a specified folder.  You can also create a new contactFolder under the user's default contact folder.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ContactFolder}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/contactfolder-post-childfolders?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ContactFolder post(@jakarta.annotation.Nonnull final ContactFolder body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ContactFolder::createFromDiscriminatorValue);
    }
    /**
     * Get a collection of child folders under the specified contact folder.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a collection of child folders under the specified contact folder.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Create a new contactFolder as a child of a specified folder.  You can also create a new contactFolder under the user's default contact folder.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ContactFolder body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new contactFolder as a child of a specified folder.  You can also create a new contactFolder under the user's default contact folder.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ContactFolder body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, "{+baseurl}/users/{user%2Did}/contactFolders/{contactFolder%2Did}/childFolders", pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ChildFoldersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChildFoldersRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ChildFoldersRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get a collection of child folders under the specified contact folder.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @jakarta.annotation.Nullable
        public Integer top;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24orderby", orderby);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
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
