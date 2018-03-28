
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
    "DUMMY",
    "android",
    "ios",
    "linux",
    "osx",
    "windows",
    "windows_phone"
})
public class Os {

    @JsonProperty("DUMMY")
    private Integer dUMMY;
    @JsonProperty("android")
    private Integer android;
    @JsonProperty("ios")
    private Integer ios;
    @JsonProperty("linux")
    private Integer linux;
    @JsonProperty("osx")
    private Integer osx;
    @JsonProperty("windows")
    private Integer windows;
    @JsonProperty("windows_phone")
    private Integer windowsPhone;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("DUMMY")
    public Integer getDUMMY() {
        return dUMMY;
    }

    @JsonProperty("DUMMY")
    public void setDUMMY(Integer dUMMY) {
        this.dUMMY = dUMMY;
    }

    @JsonProperty("android")
    public Integer getAndroid() {
        return android;
    }

    @JsonProperty("android")
    public void setAndroid(Integer android) {
        this.android = android;
    }

    @JsonProperty("ios")
    public Integer getIos() {
        return ios;
    }

    @JsonProperty("ios")
    public void setIos(Integer ios) {
        this.ios = ios;
    }

    @JsonProperty("linux")
    public Integer getLinux() {
        return linux;
    }

    @JsonProperty("linux")
    public void setLinux(Integer linux) {
        this.linux = linux;
    }

    @JsonProperty("osx")
    public Integer getOsx() {
        return osx;
    }

    @JsonProperty("osx")
    public void setOsx(Integer osx) {
        this.osx = osx;
    }

    @JsonProperty("windows")
    public Integer getWindows() {
        return windows;
    }

    @JsonProperty("windows")
    public void setWindows(Integer windows) {
        this.windows = windows;
    }

    @JsonProperty("windows_phone")
    public Integer getWindowsPhone() {
        return windowsPhone;
    }

    @JsonProperty("windows_phone")
    public void setWindowsPhone(Integer windowsPhone) {
        this.windowsPhone = windowsPhone;
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
