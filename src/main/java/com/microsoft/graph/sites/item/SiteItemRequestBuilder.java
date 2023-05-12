package com.microsoft.graph.sites.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Site;
import com.microsoft.graph.sites.item.analytics.AnalyticsRequestBuilder;
import com.microsoft.graph.sites.item.columns.ColumnsRequestBuilder;
import com.microsoft.graph.sites.item.contenttypes.ContentTypesRequestBuilder;
import com.microsoft.graph.sites.item.createdbyuser.CreatedByUserRequestBuilder;
import com.microsoft.graph.sites.item.drive.DriveRequestBuilder;
import com.microsoft.graph.sites.item.drives.DrivesRequestBuilder;
import com.microsoft.graph.sites.item.externalcolumns.ExternalColumnsRequestBuilder;
import com.microsoft.graph.sites.item.getactivitiesbyinterval.GetActivitiesByIntervalRequestBuilder;
import com.microsoft.graph.sites.item.getactivitiesbyintervalwithstartdatetimewithenddatetimewithinterval.GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder;
import com.microsoft.graph.sites.item.getapplicablecontenttypesforlistwithlistid.GetApplicableContentTypesForListWithListIdRequestBuilder;
import com.microsoft.graph.sites.item.getbypathwithpath.GetByPathWithPathRequestBuilder;
import com.microsoft.graph.sites.item.items.ItemsRequestBuilder;
import com.microsoft.graph.sites.item.lastmodifiedbyuser.LastModifiedByUserRequestBuilder;
import com.microsoft.graph.sites.item.lists.ListsRequestBuilder;
import com.microsoft.graph.sites.item.onenote.OnenoteRequestBuilder;
import com.microsoft.graph.sites.item.operations.OperationsRequestBuilder;
import com.microsoft.graph.sites.item.permissions.PermissionsRequestBuilder;
import com.microsoft.graph.sites.item.sites.SitesRequestBuilder;
import com.microsoft.graph.sites.item.termstore.TermStoreRequestBuilder;
import com.microsoft.graph.sites.item.termstores.TermStoresRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the collection of site entities.
 */
public class SiteItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the analytics property of the microsoft.graph.site entity. */
    @javax.annotation.Nonnull
    public AnalyticsRequestBuilder analytics() {
        return new AnalyticsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the columns property of the microsoft.graph.site entity. */
    @javax.annotation.Nonnull
    public ColumnsRequestBuilder columns() {
        return new ColumnsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the contentTypes property of the microsoft.graph.site entity. */
    @javax.annotation.Nonnull
    public ContentTypesRequestBuilder contentTypes() {
        return new ContentTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the createdByUser property of the microsoft.graph.baseItem entity. */
    @javax.annotation.Nonnull
    public CreatedByUserRequestBuilder createdByUser() {
        return new CreatedByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the drive property of the microsoft.graph.site entity. */
    @javax.annotation.Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the drives property of the microsoft.graph.site entity. */
    @javax.annotation.Nonnull
    public DrivesRequestBuilder drives() {
        return new DrivesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the externalColumns property of the microsoft.graph.site entity. */
    @javax.annotation.Nonnull
    public ExternalColumnsRequestBuilder externalColumns() {
        return new ExternalColumnsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getActivitiesByInterval method. */
    @javax.annotation.Nonnull
    public GetActivitiesByIntervalRequestBuilder getActivitiesByInterval() {
        return new GetActivitiesByIntervalRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the items property of the microsoft.graph.site entity. */
    @javax.annotation.Nonnull
    public ItemsRequestBuilder items() {
        return new ItemsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the lastModifiedByUser property of the microsoft.graph.baseItem entity. */
    @javax.annotation.Nonnull
    public LastModifiedByUserRequestBuilder lastModifiedByUser() {
        return new LastModifiedByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the lists property of the microsoft.graph.site entity. */
    @javax.annotation.Nonnull
    public ListsRequestBuilder lists() {
        return new ListsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the onenote property of the microsoft.graph.site entity. */
    @javax.annotation.Nonnull
    public OnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the operations property of the microsoft.graph.site entity. */
    @javax.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the permissions property of the microsoft.graph.site entity. */
    @javax.annotation.Nonnull
    public PermissionsRequestBuilder permissions() {
        return new PermissionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the sites property of the microsoft.graph.site entity. */
    @javax.annotation.Nonnull
    public SitesRequestBuilder sites() {
        return new SitesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the termStore property of the microsoft.graph.site entity. */
    @javax.annotation.Nonnull
    public TermStoreRequestBuilder termStore() {
        return new TermStoreRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the termStores property of the microsoft.graph.site entity. */
    @javax.annotation.Nonnull
    public TermStoresRequestBuilder termStores() {
        return new TermStoresRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new SiteItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public SiteItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sites/{site%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new SiteItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public SiteItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sites/{site%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Retrieve properties and relationships for a [site][] resource.A **site** resource represents a team site in SharePoint.
     * @return a CompletableFuture of site
     * @see <a href="https://docs.microsoft.com/graph/api/site-get?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Site> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Site::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Site> executionException = new java.util.concurrent.CompletableFuture<Site>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Retrieve properties and relationships for a [site][] resource.A **site** resource represents a team site in SharePoint.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of site
     * @see <a href="https://docs.microsoft.com/graph/api/site-get?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Site> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Site::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Site> executionException = new java.util.concurrent.CompletableFuture<Site>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to call the getActivitiesByInterval method.
     * @param endDateTime Usage: endDateTime='{endDateTime}'
     * @param interval Usage: interval='{interval}'
     * @param startDateTime Usage: startDateTime='{startDateTime}'
     * @return a getActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder getActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithInterval(@javax.annotation.Nonnull final String endDateTime, @javax.annotation.Nonnull final String interval, @javax.annotation.Nonnull final String startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(interval);
        Objects.requireNonNull(startDateTime);
        return new GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder(pathParameters, requestAdapter, endDateTime, interval, startDateTime);
    }
    /**
     * Provides operations to call the getApplicableContentTypesForList method.
     * @param listId Usage: listId='{listId}'
     * @return a getApplicableContentTypesForListWithListIdRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetApplicableContentTypesForListWithListIdRequestBuilder getApplicableContentTypesForListWithListId(@javax.annotation.Nonnull final String listId) {
        Objects.requireNonNull(listId);
        return new GetApplicableContentTypesForListWithListIdRequestBuilder(pathParameters, requestAdapter, listId);
    }
    /**
     * Provides operations to call the getByPath method.
     * @param path Usage: path='{path}'
     * @return a getByPathWithPathRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetByPathWithPathRequestBuilder getByPathWithPath(@javax.annotation.Nonnull final String path) {
        Objects.requireNonNull(path);
        return new GetByPathWithPathRequestBuilder(pathParameters, requestAdapter, path);
    }
    /**
     * Update entity in sites
     * @param body The request body
     * @return a CompletableFuture of site
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Site> patch(@javax.annotation.Nonnull final Site body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Site::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Site> executionException = new java.util.concurrent.CompletableFuture<Site>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update entity in sites
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of site
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Site> patch(@javax.annotation.Nonnull final Site body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Site::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Site> executionException = new java.util.concurrent.CompletableFuture<Site>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Retrieve properties and relationships for a [site][] resource.A **site** resource represents a team site in SharePoint.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve properties and relationships for a [site][] resource.A **site** resource represents a team site in SharePoint.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update entity in sites
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final Site body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update entity in sites
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final Site body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Retrieve properties and relationships for a [site][] resource.A **site** resource represents a team site in SharePoint.
     */
    public class GetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
