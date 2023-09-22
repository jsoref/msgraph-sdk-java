// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.callrecords.models.NetworkConnectionType;
import com.microsoft.graph.callrecords.models.NetworkTransportProtocol;
import com.microsoft.graph.callrecords.models.TraceRouteHop;
import com.microsoft.graph.callrecords.models.WifiBand;
import com.microsoft.graph.callrecords.models.WifiRadioType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Network Info.
 */
public class NetworkInfo implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Bandwidth Low Event Ratio.
     * Fraction of the call that the media endpoint detected the available bandwidth or bandwidth policy was low enough to cause poor quality of the audio sent.
     */
    @SerializedName(value = "bandwidthLowEventRatio", alternate = {"BandwidthLowEventRatio"})
    @Expose
	@Nullable
    public Float bandwidthLowEventRatio;

    /**
     * The Basic Service Set Identifier.
     * The wireless LAN basic service set identifier of the media endpoint used to connect to the network.
     */
    @SerializedName(value = "basicServiceSetIdentifier", alternate = {"BasicServiceSetIdentifier"})
    @Expose
	@Nullable
    public String basicServiceSetIdentifier;

    /**
     * The Connection Type.
     * Type of network used by the media endpoint. Possible values are: unknown, wired, wifi, mobile, tunnel, unknownFutureValue.
     */
    @SerializedName(value = "connectionType", alternate = {"ConnectionType"})
    @Expose
	@Nullable
    public NetworkConnectionType connectionType;

    /**
     * The Delay Event Ratio.
     * Fraction of the call that the media endpoint detected the network delay was significant enough to impact the ability to have real-time two-way communication.
     */
    @SerializedName(value = "delayEventRatio", alternate = {"DelayEventRatio"})
    @Expose
	@Nullable
    public Float delayEventRatio;

    /**
     * The Dns Suffix.
     * DNS suffix associated with the network adapter of the media endpoint.
     */
    @SerializedName(value = "dnsSuffix", alternate = {"DnsSuffix"})
    @Expose
	@Nullable
    public String dnsSuffix;

    /**
     * The Ip Address.
     * IP address of the media endpoint.
     */
    @SerializedName(value = "ipAddress", alternate = {"IpAddress"})
    @Expose
	@Nullable
    public String ipAddress;

    /**
     * The Link Speed.
     * Link speed in bits per second reported by the network adapter used by the media endpoint.
     */
    @SerializedName(value = "linkSpeed", alternate = {"LinkSpeed"})
    @Expose
	@Nullable
    public Long linkSpeed;

    /**
     * The Mac Address.
     * The media access control (MAC) address of the media endpoint's network device. This value may be missing or shown as 02:00:00:00:00:00 due to operating system privacy policies.
     */
    @SerializedName(value = "macAddress", alternate = {"MacAddress"})
    @Expose
	@Nullable
    public String macAddress;

    /**
     * The Network Transport Protocol.
     * Network protocol used for the transmission of stream. Possible values are: unknown, udp, tcp, unknownFutureValue.
     */
    @SerializedName(value = "networkTransportProtocol", alternate = {"NetworkTransportProtocol"})
    @Expose
	@Nullable
    public NetworkTransportProtocol networkTransportProtocol;

    /**
     * The Port.
     * Network port number used by media endpoint.
     */
    @SerializedName(value = "port", alternate = {"Port"})
    @Expose
	@Nullable
    public Integer port;

    /**
     * The Received Quality Event Ratio.
     * Fraction of the call that the media endpoint detected the network was causing poor quality of the audio received.
     */
    @SerializedName(value = "receivedQualityEventRatio", alternate = {"ReceivedQualityEventRatio"})
    @Expose
	@Nullable
    public Float receivedQualityEventRatio;

    /**
     * The Reflexive IPAddress.
     * IP address of the media endpoint as seen by the media relay server. This is typically the public internet IP address associated to the endpoint.
     */
    @SerializedName(value = "reflexiveIPAddress", alternate = {"ReflexiveIPAddress"})
    @Expose
	@Nullable
    public String reflexiveIPAddress;

    /**
     * The Relay IPAddress.
     * IP address of the media relay server allocated by the media endpoint.
     */
    @SerializedName(value = "relayIPAddress", alternate = {"RelayIPAddress"})
    @Expose
	@Nullable
    public String relayIPAddress;

    /**
     * The Relay Port.
     * Network port number allocated on the media relay server by the media endpoint.
     */
    @SerializedName(value = "relayPort", alternate = {"RelayPort"})
    @Expose
	@Nullable
    public Integer relayPort;

    /**
     * The Sent Quality Event Ratio.
     * Fraction of the call that the media endpoint detected the network was causing poor quality of the audio sent.
     */
    @SerializedName(value = "sentQualityEventRatio", alternate = {"SentQualityEventRatio"})
    @Expose
	@Nullable
    public Float sentQualityEventRatio;

    /**
     * The Subnet.
     * Subnet used for media stream by the media endpoint.
     */
    @SerializedName(value = "subnet", alternate = {"Subnet"})
    @Expose
	@Nullable
    public String subnet;

    /**
     * The Trace Route Hops.
     * List of network trace route hops collected for this media stream.*
     */
    @SerializedName(value = "traceRouteHops", alternate = {"TraceRouteHops"})
    @Expose
	@Nullable
    public java.util.List<TraceRouteHop> traceRouteHops;

    /**
     * The Wifi Band.
     * WiFi band used by the media endpoint. Possible values are: unknown, frequency24GHz, frequency50GHz, frequency60GHz, unknownFutureValue.
     */
    @SerializedName(value = "wifiBand", alternate = {"WifiBand"})
    @Expose
	@Nullable
    public WifiBand wifiBand;

    /**
     * The Wifi Battery Charge.
     * Estimated remaining battery charge in percentage reported by the media endpoint.
     */
    @SerializedName(value = "wifiBatteryCharge", alternate = {"WifiBatteryCharge"})
    @Expose
	@Nullable
    public Integer wifiBatteryCharge;

    /**
     * The Wifi Channel.
     * WiFi channel used by the media endpoint.
     */
    @SerializedName(value = "wifiChannel", alternate = {"WifiChannel"})
    @Expose
	@Nullable
    public Integer wifiChannel;

    /**
     * The Wifi Microsoft Driver.
     * Name of the Microsoft WiFi driver used by the media endpoint. Value may be localized based on the language used by endpoint.
     */
    @SerializedName(value = "wifiMicrosoftDriver", alternate = {"WifiMicrosoftDriver"})
    @Expose
	@Nullable
    public String wifiMicrosoftDriver;

    /**
     * The Wifi Microsoft Driver Version.
     * Version of the Microsoft WiFi driver used by the media endpoint.
     */
    @SerializedName(value = "wifiMicrosoftDriverVersion", alternate = {"WifiMicrosoftDriverVersion"})
    @Expose
	@Nullable
    public String wifiMicrosoftDriverVersion;

    /**
     * The Wifi Radio Type.
     * Type of WiFi radio used by the media endpoint. Possible values are: unknown, wifi80211a, wifi80211b, wifi80211g, wifi80211n, wifi80211ac, wifi80211ax, unknownFutureValue.
     */
    @SerializedName(value = "wifiRadioType", alternate = {"WifiRadioType"})
    @Expose
	@Nullable
    public WifiRadioType wifiRadioType;

    /**
     * The Wifi Signal Strength.
     * WiFi signal strength in percentage reported by the media endpoint.
     */
    @SerializedName(value = "wifiSignalStrength", alternate = {"WifiSignalStrength"})
    @Expose
	@Nullable
    public Integer wifiSignalStrength;

    /**
     * The Wifi Vendor Driver.
     * Name of the WiFi driver used by the media endpoint. Value may be localized based on the language used by endpoint.
     */
    @SerializedName(value = "wifiVendorDriver", alternate = {"WifiVendorDriver"})
    @Expose
	@Nullable
    public String wifiVendorDriver;

    /**
     * The Wifi Vendor Driver Version.
     * Version of the WiFi driver used by the media endpoint.
     */
    @SerializedName(value = "wifiVendorDriverVersion", alternate = {"WifiVendorDriverVersion"})
    @Expose
	@Nullable
    public String wifiVendorDriverVersion;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
