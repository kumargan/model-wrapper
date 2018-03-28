
package org.modelwrapper.beans.controller.request;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "os",
    "version",
    "country",
    "state",
    "metro_code",
    "brand_id",
    "T1",
    "gender",
    "age"
})
public class Options {

    @JsonProperty("os")
    private List<String> os = null;
    @JsonProperty("version")
    private List<String> version = null;
    @JsonProperty("country")
    private List<String> country = null;
    @JsonProperty("state")
    private List<String> state = null;
    @JsonProperty("metro_code")
    private List<String> metroCode = null;
    @JsonProperty("brand_id")
    private List<String> brandId = null;
    @JsonProperty("T1")
    private List<String> t1 = null;
    @JsonProperty("gender")
    private List<String> gender = null;
    @JsonProperty("age")
    private List<String> age = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("os")
    public List<String> getOs() {
        return os;
    }

    @JsonProperty("os")
    public void setOs(List<String> os) {
        this.os = os;
    }

    @JsonProperty("version")
    public List<String> getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(List<String> version) {
        this.version = version;
    }

    @JsonProperty("country")
    public List<String> getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(List<String> country) {
        this.country = country;
    }

    @JsonProperty("state")
    public List<String> getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(List<String> state) {
        this.state = state;
    }

    @JsonProperty("metro_code")
    public List<String> getMetroCode() {
        return metroCode;
    }

    @JsonProperty("metro_code")
    public void setMetroCode(List<String> metroCode) {
        this.metroCode = metroCode;
    }

    @JsonProperty("brand_id")
    public List<String> getBrandId() {
        return brandId;
    }

    @JsonProperty("brand_id")
    public void setBrandId(List<String> brandId) {
        this.brandId = brandId;
    }

    @JsonProperty("T1")
    public List<String> getT1() {
        return t1;
    }

    @JsonProperty("T1")
    public void setT1(List<String> t1) {
        this.t1 = t1;
    }

    @JsonProperty("gender")
    public List<String> getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(List<String> gender) {
        this.gender = gender;
    }

    @JsonProperty("age")
    public List<String> getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(List<String> age) {
        this.age = age;
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
