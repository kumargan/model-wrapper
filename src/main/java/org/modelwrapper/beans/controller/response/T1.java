
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
    "art and entertainment",
    "automotive and vehicles",
    "business and industrial",
    "careers",
    "education",
    "family and parenting",
    "finance",
    "food and drink",
    "health and fitness",
    "hobbies and interests",
    "home and garden",
    "law, govt and politics",
    "news",
    "pets",
    "real estate",
    "religion and spirituality",
    "science",
    "shopping",
    "society",
    "sports",
    "style and fashion",
    "technology and computing",
    "travel"
})
public class T1 {

    @JsonProperty("DUMMY")
    private Integer dUMMY;
    @JsonProperty("art and entertainment")
    private Integer artAndEntertainment;
    @JsonProperty("automotive and vehicles")
    private Integer automotiveAndVehicles;
    @JsonProperty("business and industrial")
    private Integer businessAndIndustrial;
    @JsonProperty("careers")
    private Integer careers;
    @JsonProperty("education")
    private Integer education;
    @JsonProperty("family and parenting")
    private Integer familyAndParenting;
    @JsonProperty("finance")
    private Integer finance;
    @JsonProperty("food and drink")
    private Integer foodAndDrink;
    @JsonProperty("health and fitness")
    private Integer healthAndFitness;
    @JsonProperty("hobbies and interests")
    private Integer hobbiesAndInterests;
    @JsonProperty("home and garden")
    private Integer homeAndGarden;
    @JsonProperty("law, govt and politics")
    private Integer lawGovtAndPolitics;
    @JsonProperty("news")
    private Integer news;
    @JsonProperty("pets")
    private Integer pets;
    @JsonProperty("real estate")
    private Integer realEstate;
    @JsonProperty("religion and spirituality")
    private Integer religionAndSpirituality;
    @JsonProperty("science")
    private Integer science;
    @JsonProperty("shopping")
    private Integer shopping;
    @JsonProperty("society")
    private Integer society;
    @JsonProperty("sports")
    private Integer sports;
    @JsonProperty("style and fashion")
    private Integer styleAndFashion;
    @JsonProperty("technology and computing")
    private Integer technologyAndComputing;
    @JsonProperty("travel")
    private Integer travel;
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

    @JsonProperty("art and entertainment")
    public Integer getArtAndEntertainment() {
        return artAndEntertainment;
    }

    @JsonProperty("art and entertainment")
    public void setArtAndEntertainment(Integer artAndEntertainment) {
        this.artAndEntertainment = artAndEntertainment;
    }

    @JsonProperty("automotive and vehicles")
    public Integer getAutomotiveAndVehicles() {
        return automotiveAndVehicles;
    }

    @JsonProperty("automotive and vehicles")
    public void setAutomotiveAndVehicles(Integer automotiveAndVehicles) {
        this.automotiveAndVehicles = automotiveAndVehicles;
    }

    @JsonProperty("business and industrial")
    public Integer getBusinessAndIndustrial() {
        return businessAndIndustrial;
    }

    @JsonProperty("business and industrial")
    public void setBusinessAndIndustrial(Integer businessAndIndustrial) {
        this.businessAndIndustrial = businessAndIndustrial;
    }

    @JsonProperty("careers")
    public Integer getCareers() {
        return careers;
    }

    @JsonProperty("careers")
    public void setCareers(Integer careers) {
        this.careers = careers;
    }

    @JsonProperty("education")
    public Integer getEducation() {
        return education;
    }

    @JsonProperty("education")
    public void setEducation(Integer education) {
        this.education = education;
    }

    @JsonProperty("family and parenting")
    public Integer getFamilyAndParenting() {
        return familyAndParenting;
    }

    @JsonProperty("family and parenting")
    public void setFamilyAndParenting(Integer familyAndParenting) {
        this.familyAndParenting = familyAndParenting;
    }

    @JsonProperty("finance")
    public Integer getFinance() {
        return finance;
    }

    @JsonProperty("finance")
    public void setFinance(Integer finance) {
        this.finance = finance;
    }

    @JsonProperty("food and drink")
    public Integer getFoodAndDrink() {
        return foodAndDrink;
    }

    @JsonProperty("food and drink")
    public void setFoodAndDrink(Integer foodAndDrink) {
        this.foodAndDrink = foodAndDrink;
    }

    @JsonProperty("health and fitness")
    public Integer getHealthAndFitness() {
        return healthAndFitness;
    }

    @JsonProperty("health and fitness")
    public void setHealthAndFitness(Integer healthAndFitness) {
        this.healthAndFitness = healthAndFitness;
    }

    @JsonProperty("hobbies and interests")
    public Integer getHobbiesAndInterests() {
        return hobbiesAndInterests;
    }

    @JsonProperty("hobbies and interests")
    public void setHobbiesAndInterests(Integer hobbiesAndInterests) {
        this.hobbiesAndInterests = hobbiesAndInterests;
    }

    @JsonProperty("home and garden")
    public Integer getHomeAndGarden() {
        return homeAndGarden;
    }

    @JsonProperty("home and garden")
    public void setHomeAndGarden(Integer homeAndGarden) {
        this.homeAndGarden = homeAndGarden;
    }

    @JsonProperty("law, govt and politics")
    public Integer getLawGovtAndPolitics() {
        return lawGovtAndPolitics;
    }

    @JsonProperty("law, govt and politics")
    public void setLawGovtAndPolitics(Integer lawGovtAndPolitics) {
        this.lawGovtAndPolitics = lawGovtAndPolitics;
    }

    @JsonProperty("news")
    public Integer getNews() {
        return news;
    }

    @JsonProperty("news")
    public void setNews(Integer news) {
        this.news = news;
    }

    @JsonProperty("pets")
    public Integer getPets() {
        return pets;
    }

    @JsonProperty("pets")
    public void setPets(Integer pets) {
        this.pets = pets;
    }

    @JsonProperty("real estate")
    public Integer getRealEstate() {
        return realEstate;
    }

    @JsonProperty("real estate")
    public void setRealEstate(Integer realEstate) {
        this.realEstate = realEstate;
    }

    @JsonProperty("religion and spirituality")
    public Integer getReligionAndSpirituality() {
        return religionAndSpirituality;
    }

    @JsonProperty("religion and spirituality")
    public void setReligionAndSpirituality(Integer religionAndSpirituality) {
        this.religionAndSpirituality = religionAndSpirituality;
    }

    @JsonProperty("science")
    public Integer getScience() {
        return science;
    }

    @JsonProperty("science")
    public void setScience(Integer science) {
        this.science = science;
    }

    @JsonProperty("shopping")
    public Integer getShopping() {
        return shopping;
    }

    @JsonProperty("shopping")
    public void setShopping(Integer shopping) {
        this.shopping = shopping;
    }

    @JsonProperty("society")
    public Integer getSociety() {
        return society;
    }

    @JsonProperty("society")
    public void setSociety(Integer society) {
        this.society = society;
    }

    @JsonProperty("sports")
    public Integer getSports() {
        return sports;
    }

    @JsonProperty("sports")
    public void setSports(Integer sports) {
        this.sports = sports;
    }

    @JsonProperty("style and fashion")
    public Integer getStyleAndFashion() {
        return styleAndFashion;
    }

    @JsonProperty("style and fashion")
    public void setStyleAndFashion(Integer styleAndFashion) {
        this.styleAndFashion = styleAndFashion;
    }

    @JsonProperty("technology and computing")
    public Integer getTechnologyAndComputing() {
        return technologyAndComputing;
    }

    @JsonProperty("technology and computing")
    public void setTechnologyAndComputing(Integer technologyAndComputing) {
        this.technologyAndComputing = technologyAndComputing;
    }

    @JsonProperty("travel")
    public Integer getTravel() {
        return travel;
    }

    @JsonProperty("travel")
    public void setTravel(Integer travel) {
        this.travel = travel;
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
