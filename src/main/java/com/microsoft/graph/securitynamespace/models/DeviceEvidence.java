// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.security.models.DefenderAvStatus;
import com.microsoft.graph.security.models.DeviceHealthStatus;
import com.microsoft.graph.security.models.LoggedOnUser;
import com.microsoft.graph.security.models.OnboardingStatus;
import com.microsoft.graph.security.models.DeviceRiskScore;
import com.microsoft.graph.security.models.VmMetadata;
import com.microsoft.graph.security.models.AlertEvidence;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Evidence.
 */
public class DeviceEvidence extends AlertEvidence implements IJsonBackedObject {


    /**
     * The Azure Ad Device Id.
     * A unique identifier assigned to a device by Azure Active Directory (Azure AD) when device is Azure AD-joined.
     */
    @SerializedName(value = "azureAdDeviceId", alternate = {"AzureAdDeviceId"})
    @Expose
	@Nullable
    public String azureAdDeviceId;

    /**
     * The Defender Av Status.
     * State of the Defender AntiMalware engine. The possible values are: notReporting, disabled, notUpdated, updated, unknown, notSupported, unknownFutureValue.
     */
    @SerializedName(value = "defenderAvStatus", alternate = {"DefenderAvStatus"})
    @Expose
	@Nullable
    public DefenderAvStatus defenderAvStatus;

    /**
     * The Device Dns Name.
     * The fully qualified domain name (FQDN) for the device.
     */
    @SerializedName(value = "deviceDnsName", alternate = {"DeviceDnsName"})
    @Expose
	@Nullable
    public String deviceDnsName;

    /**
     * The First Seen Date Time.
     * The date and time when the device was first seen.
     */
    @SerializedName(value = "firstSeenDateTime", alternate = {"FirstSeenDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime firstSeenDateTime;

    /**
     * The Health Status.
     * The health state of the device. The possible values are: active, inactive, impairedCommunication, noSensorData, noSensorDataImpairedCommunication, unknown, unknownFutureValue.
     */
    @SerializedName(value = "healthStatus", alternate = {"HealthStatus"})
    @Expose
	@Nullable
    public DeviceHealthStatus healthStatus;

    /**
     * The Ip Interfaces.
     * Ip interfaces of the device during the time of the alert.
     */
    @SerializedName(value = "ipInterfaces", alternate = {"IpInterfaces"})
    @Expose
	@Nullable
    public java.util.List<String> ipInterfaces;

    /**
     * The Logged On Users.
     * Users that were logged on the machine during the time of the alert.
     */
    @SerializedName(value = "loggedOnUsers", alternate = {"LoggedOnUsers"})
    @Expose
	@Nullable
    public java.util.List<LoggedOnUser> loggedOnUsers;

    /**
     * The Mde Device Id.
     * A unique identifier assigned to a device by Microsoft Defender for Endpoint.
     */
    @SerializedName(value = "mdeDeviceId", alternate = {"MdeDeviceId"})
    @Expose
	@Nullable
    public String mdeDeviceId;

    /**
     * The Onboarding Status.
     * The status of the machine onboarding to Microsoft Defender for Endpoint. The possible values are: insufficientInfo, onboarded, canBeOnboarded, unsupported, unknownFutureValue.
     */
    @SerializedName(value = "onboardingStatus", alternate = {"OnboardingStatus"})
    @Expose
	@Nullable
    public OnboardingStatus onboardingStatus;

    /**
     * The Os Build.
     * The build version for the operating system the device is running.
     */
    @SerializedName(value = "osBuild", alternate = {"OsBuild"})
    @Expose
	@Nullable
    public Long osBuild;

    /**
     * The Os Platform.
     * The operating system platform the device is running.
     */
    @SerializedName(value = "osPlatform", alternate = {"OsPlatform"})
    @Expose
	@Nullable
    public String osPlatform;

    /**
     * The Rbac Group Id.
     * The ID of the role-based access control (RBAC) device group.
     */
    @SerializedName(value = "rbacGroupId", alternate = {"RbacGroupId"})
    @Expose
	@Nullable
    public Integer rbacGroupId;

    /**
     * The Rbac Group Name.
     * The name of the RBAC device group.
     */
    @SerializedName(value = "rbacGroupName", alternate = {"RbacGroupName"})
    @Expose
	@Nullable
    public String rbacGroupName;

    /**
     * The Risk Score.
     * Risk score as evaluated by Microsoft Defender for Endpoint. The possible values are: none, informational, low, medium, high, unknownFutureValue.
     */
    @SerializedName(value = "riskScore", alternate = {"RiskScore"})
    @Expose
	@Nullable
    public DeviceRiskScore riskScore;

    /**
     * The Version.
     * The version of the operating system platform.
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
	@Nullable
    public String version;

    /**
     * The Vm Metadata.
     * Metadata of the virtual machine (VM) on which Microsoft Defender for Endpoint is running.
     */
    @SerializedName(value = "vmMetadata", alternate = {"VmMetadata"})
    @Expose
	@Nullable
    public VmMetadata vmMetadata;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
