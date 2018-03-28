
package org.modelwrapper.beans.controller.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "10",
    "4 & below",
    "5",
    "6",
    "7",
    "8",
    "DUMMY",
    "osx_10_version",
    "unknown_ios_version",
    "unknown_linux_version",
    "unknown_windows_phone_version",
    "vista & below"
})
public class Version {

    @JsonProperty("10")
    private Integer _10;
    @JsonProperty("4 & below")
    private Integer _4Below;
    @JsonProperty("5")
    private Integer _5;
    @JsonProperty("6")
    private Integer _6;
    @JsonProperty("7")
    private Integer _7;
    @JsonProperty("8")
    private Integer _8;
    @JsonProperty("DUMMY")
    private Integer dUMMY;
    @JsonProperty("osx_10_version")
    private Integer osx10Version;
    @JsonProperty("unknown_ios_version")
    private Integer unknownIosVersion;
    @JsonProperty("unknown_linux_version")
    private Integer unknownLinuxVersion;
    @JsonProperty("unknown_windows_phone_version")
    private Integer unknownWindowsPhoneVersion;
    @JsonProperty("vista & below")
    private Integer vistaBelow;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("10")
    public Integer get10() {
        return _10;
    }

    @JsonProperty("10")
    public void set10(Integer _10) {
        this._10 = _10;
    }

    @JsonProperty("4 & below")
    public Integer get4Below() {
        return _4Below;
    }

    @JsonProperty("4 & below")
    public void set4Below(Integer _4Below) {
        this._4Below = _4Below;
    }

    @JsonProperty("5")
    public Integer get5() {
        return _5;
    }

    @JsonProperty("5")
    public void set5(Integer _5) {
        this._5 = _5;
    }

    @JsonProperty("6")
    public Integer get6() {
        return _6;
    }

    @JsonProperty("6")
    public void set6(Integer _6) {
        this._6 = _6;
    }

    @JsonProperty("7")
    public Integer get7() {
        return _7;
    }

    @JsonProperty("7")
    public void set7(Integer _7) {
        this._7 = _7;
    }

    @JsonProperty("8")
    public Integer get8() {
        return _8;
    }

    @JsonProperty("8")
    public void set8(Integer _8) {
        this._8 = _8;
    }

    @JsonProperty("DUMMY")
    public Integer getDUMMY() {
        return dUMMY;
    }

    @JsonProperty("DUMMY")
    public void setDUMMY(Integer dUMMY) {
        this.dUMMY = dUMMY;
    }

    @JsonProperty("osx_10_version")
    public Integer getOsx10Version() {
        return osx10Version;
    }

    @JsonProperty("osx_10_version")
    public void setOsx10Version(Integer osx10Version) {
        this.osx10Version = osx10Version;
    }

    @JsonProperty("unknown_ios_version")
    public Integer getUnknownIosVersion() {
        return unknownIosVersion;
    }

    @JsonProperty("unknown_ios_version")
    public void setUnknownIosVersion(Integer unknownIosVersion) {
        this.unknownIosVersion = unknownIosVersion;
    }

    @JsonProperty("unknown_linux_version")
    public Integer getUnknownLinuxVersion() {
        return unknownLinuxVersion;
    }

    @JsonProperty("unknown_linux_version")
    public void setUnknownLinuxVersion(Integer unknownLinuxVersion) {
        this.unknownLinuxVersion = unknownLinuxVersion;
    }

    @JsonProperty("unknown_windows_phone_version")
    public Integer getUnknownWindowsPhoneVersion() {
        return unknownWindowsPhoneVersion;
    }

    @JsonProperty("unknown_windows_phone_version")
    public void setUnknownWindowsPhoneVersion(Integer unknownWindowsPhoneVersion) {
        this.unknownWindowsPhoneVersion = unknownWindowsPhoneVersion;
    }

    @JsonProperty("vista & below")
    public Integer getVistaBelow() {
        return vistaBelow;
    }

    @JsonProperty("vista & below")
    public void setVistaBelow(Integer vistaBelow) {
        this.vistaBelow = vistaBelow;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
