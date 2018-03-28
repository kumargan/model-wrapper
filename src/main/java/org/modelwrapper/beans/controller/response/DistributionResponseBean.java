
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
    "Status",
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
public class DistributionResponseBean {

    @JsonProperty("Status")
    private String status;
    @JsonProperty("os")
    private Os os;
    @JsonProperty("version")
    private Version version;
    @JsonProperty("country")
    private Country country;
    @JsonProperty("state")
    private State state;
    @JsonProperty("metro_code")
    private MetroCode metroCode;
    @JsonProperty("brand_id")
    private BrandId brandId;
    @JsonProperty("T1")
    private T1 t1;
    @JsonProperty("gender")
    private Gender gender;
    @JsonProperty("age")
    private Age age;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("os")
    public Os getOs() {
        return os;
    }

    @JsonProperty("os")
    public void setOs(Os os) {
        this.os = os;
    }

    @JsonProperty("version")
    public Version getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Version version) {
        this.version = version;
    }

    @JsonProperty("country")
    public Country getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(Country country) {
        this.country = country;
    }

    @JsonProperty("state")
    public State getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(State state) {
        this.state = state;
    }

    @JsonProperty("metro_code")
    public MetroCode getMetroCode() {
        return metroCode;
    }

    @JsonProperty("metro_code")
    public void setMetroCode(MetroCode metroCode) {
        this.metroCode = metroCode;
    }

    @JsonProperty("brand_id")
    public BrandId getBrandId() {
        return brandId;
    }

    @JsonProperty("brand_id")
    public void setBrandId(BrandId brandId) {
        this.brandId = brandId;
    }

    @JsonProperty("T1")
    public T1 getT1() {
        return t1;
    }

    @JsonProperty("T1")
    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    @JsonProperty("gender")
    public Gender getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @JsonProperty("age")
    public Age getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(Age age) {
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
