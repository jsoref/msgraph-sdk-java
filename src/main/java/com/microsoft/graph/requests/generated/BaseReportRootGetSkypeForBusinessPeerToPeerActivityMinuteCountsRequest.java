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
 * The class for the Base Report Root Get Skype For Business Peer To Peer Activity Minute Counts Request.
 */
public class BaseReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest extends BaseRequest implements IBaseReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest {

    /**
     * The request for this ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, Report.class);
    }

    /**
     * Patches the ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCounts
     * @param srcReport the Report with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    public void patch(Report srcReport, final ICallback<Report> callback) {
        send(HttpMethod.PATCH, callback, srcReport);
    }

    /**
     * Patches the ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCounts
     *
     * @param srcReport the Report with which to PATCH
     * @return the Report
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public Report patch(Report srcReport) throws ClientException {
        return this.send(HttpMethod.PATCH, srcReport);
    }

    /**
     * Puts the ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCounts
     *
     * @param srcReport the Report to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(Report srcReport, final ICallback<Report> callback) {
        send(HttpMethod.PUT, callback, srcReport);
    }

    /**
     * Puts the ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCounts
     *
     * @param srcReport the Report to PUT
     * @return the Report
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public Report put(Report srcReport) throws ClientException {
        return this.send(HttpMethod.PUT, srcReport);
    }
    /**
     * Gets the Report
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Report> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Report
     *
     * @return the Report
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public Report get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest)this;
    }

}
