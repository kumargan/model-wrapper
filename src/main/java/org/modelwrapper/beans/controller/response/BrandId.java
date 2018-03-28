
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
    "100photos",
    "DUMMY",
    "Www",
    "amateurphotographer",
    "anglersmail",
    "beta",
    "beta-qa",
    "celebritybabies",
    "classifieds",
    "coastalliving",
    "community",
    "competitions",
    "cookinglight",
    "dailycatch",
    "departures",
    "dev-wpcom",
    "edit",
    "essence",
    "ew",
    "extracrispy",
    "feeds",
    "films",
    "flights",
    "foodandwine",
    "fortune",
    "foxsports",
    "games",
    "golf",
    "goodtoknow",
    "health",
    "hellogiggles",
    "horseandhound",
    "instant",
    "instyle",
    "life",
    "magazinesdirect",
    "mmqb",
    "money",
    "motto",
    "myhomeideas",
    "myrecipes",
    "new",
    "new-qa",
    "nme",
    "olympics",
    "others",
    "pages",
    "partneredcontent",
    "people",
    "peopleenespanol",
    "preview-service",
    "qa",
    "search",
    "search-app",
    "si",
    "sikids",
    "sitesearch-staging",
    "southernlivinghouseplans",
    "sponsored",
    "sportsillustrated",
    "stage",
    "style",
    "sunset",
    "swimsuit-site-dev",
    "test-www",
    "thedrive",
    "thefield",
    "time",
    "travelandleisure",
    "trustedreviews",
    "uncut",
    "wallpaper",
    "westphoria",
    "whatdigitalcamera",
    "whatsontv",
    "womanandhome",
    "worldsoccer",
    "yahoo",
    "ybw"
})
public class BrandId {

    @JsonProperty("100photos")
    private Integer _100photos;
    @JsonProperty("DUMMY")
    private Integer dUMMY;
    @JsonProperty("Www")
    private Integer www;
    @JsonProperty("amateurphotographer")
    private Integer amateurphotographer;
    @JsonProperty("anglersmail")
    private Integer anglersmail;
    @JsonProperty("beta")
    private Integer beta;
    @JsonProperty("beta-qa")
    private Integer betaQa;
    @JsonProperty("celebritybabies")
    private Integer celebritybabies;
    @JsonProperty("classifieds")
    private Integer classifieds;
    @JsonProperty("coastalliving")
    private Integer coastalliving;
    @JsonProperty("community")
    private Integer community;
    @JsonProperty("competitions")
    private Integer competitions;
    @JsonProperty("cookinglight")
    private Integer cookinglight;
    @JsonProperty("dailycatch")
    private Integer dailycatch;
    @JsonProperty("departures")
    private Integer departures;
    @JsonProperty("dev-wpcom")
    private Integer devWpcom;
    @JsonProperty("edit")
    private Integer edit;
    @JsonProperty("essence")
    private Integer essence;
    @JsonProperty("ew")
    private Integer ew;
    @JsonProperty("extracrispy")
    private Integer extracrispy;
    @JsonProperty("feeds")
    private Integer feeds;
    @JsonProperty("films")
    private Integer films;
    @JsonProperty("flights")
    private Integer flights;
    @JsonProperty("foodandwine")
    private Integer foodandwine;
    @JsonProperty("fortune")
    private Integer fortune;
    @JsonProperty("foxsports")
    private Integer foxsports;
    @JsonProperty("games")
    private Integer games;
    @JsonProperty("golf")
    private Integer golf;
    @JsonProperty("goodtoknow")
    private Integer goodtoknow;
    @JsonProperty("health")
    private Integer health;
    @JsonProperty("hellogiggles")
    private Integer hellogiggles;
    @JsonProperty("horseandhound")
    private Integer horseandhound;
    @JsonProperty("instant")
    private Integer instant;
    @JsonProperty("instyle")
    private Integer instyle;
    @JsonProperty("life")
    private Integer life;
    @JsonProperty("magazinesdirect")
    private Integer magazinesdirect;
    @JsonProperty("mmqb")
    private Integer mmqb;
    @JsonProperty("money")
    private Integer money;
    @JsonProperty("motto")
    private Integer motto;
    @JsonProperty("myhomeideas")
    private Integer myhomeideas;
    @JsonProperty("myrecipes")
    private Integer myrecipes;
    @JsonProperty("new")
    private Integer _new;
    @JsonProperty("new-qa")
    private Integer newQa;
    @JsonProperty("nme")
    private Integer nme;
    @JsonProperty("olympics")
    private Integer olympics;
    @JsonProperty("others")
    private Integer others;
    @JsonProperty("pages")
    private Integer pages;
    @JsonProperty("partneredcontent")
    private Integer partneredcontent;
    @JsonProperty("people")
    private Integer people;
    @JsonProperty("peopleenespanol")
    private Integer peopleenespanol;
    @JsonProperty("preview-service")
    private Integer previewService;
    @JsonProperty("qa")
    private Integer qa;
    @JsonProperty("search")
    private Integer search;
    @JsonProperty("search-app")
    private Integer searchApp;
    @JsonProperty("si")
    private Integer si;
    @JsonProperty("sikids")
    private Integer sikids;
    @JsonProperty("sitesearch-staging")
    private Integer sitesearchStaging;
    @JsonProperty("southernlivinghouseplans")
    private Integer southernlivinghouseplans;
    @JsonProperty("sponsored")
    private Integer sponsored;
    @JsonProperty("sportsillustrated")
    private Integer sportsillustrated;
    @JsonProperty("stage")
    private Integer stage;
    @JsonProperty("style")
    private Integer style;
    @JsonProperty("sunset")
    private Integer sunset;
    @JsonProperty("swimsuit-site-dev")
    private Integer swimsuitSiteDev;
    @JsonProperty("test-www")
    private Integer testWww;
    @JsonProperty("thedrive")
    private Integer thedrive;
    @JsonProperty("thefield")
    private Integer thefield;
    @JsonProperty("time")
    private Integer time;
    @JsonProperty("travelandleisure")
    private Integer travelandleisure;
    @JsonProperty("trustedreviews")
    private Integer trustedreviews;
    @JsonProperty("uncut")
    private Integer uncut;
    @JsonProperty("wallpaper")
    private Integer wallpaper;
    @JsonProperty("westphoria")
    private Integer westphoria;
    @JsonProperty("whatdigitalcamera")
    private Integer whatdigitalcamera;
    @JsonProperty("whatsontv")
    private Integer whatsontv;
    @JsonProperty("womanandhome")
    private Integer womanandhome;
    @JsonProperty("worldsoccer")
    private Integer worldsoccer;
    @JsonProperty("yahoo")
    private Integer yahoo;
    @JsonProperty("ybw")
    private Integer ybw;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("100photos")
    public Integer get100photos() {
        return _100photos;
    }

    @JsonProperty("100photos")
    public void set100photos(Integer _100photos) {
        this._100photos = _100photos;
    }

    @JsonProperty("DUMMY")
    public Integer getDUMMY() {
        return dUMMY;
    }

    @JsonProperty("DUMMY")
    public void setDUMMY(Integer dUMMY) {
        this.dUMMY = dUMMY;
    }

    @JsonProperty("Www")
    public Integer getWww() {
        return www;
    }

    @JsonProperty("Www")
    public void setWww(Integer www) {
        this.www = www;
    }

    @JsonProperty("amateurphotographer")
    public Integer getAmateurphotographer() {
        return amateurphotographer;
    }

    @JsonProperty("amateurphotographer")
    public void setAmateurphotographer(Integer amateurphotographer) {
        this.amateurphotographer = amateurphotographer;
    }

    @JsonProperty("anglersmail")
    public Integer getAnglersmail() {
        return anglersmail;
    }

    @JsonProperty("anglersmail")
    public void setAnglersmail(Integer anglersmail) {
        this.anglersmail = anglersmail;
    }

    @JsonProperty("beta")
    public Integer getBeta() {
        return beta;
    }

    @JsonProperty("beta")
    public void setBeta(Integer beta) {
        this.beta = beta;
    }

    @JsonProperty("beta-qa")
    public Integer getBetaQa() {
        return betaQa;
    }

    @JsonProperty("beta-qa")
    public void setBetaQa(Integer betaQa) {
        this.betaQa = betaQa;
    }

    @JsonProperty("celebritybabies")
    public Integer getCelebritybabies() {
        return celebritybabies;
    }

    @JsonProperty("celebritybabies")
    public void setCelebritybabies(Integer celebritybabies) {
        this.celebritybabies = celebritybabies;
    }

    @JsonProperty("classifieds")
    public Integer getClassifieds() {
        return classifieds;
    }

    @JsonProperty("classifieds")
    public void setClassifieds(Integer classifieds) {
        this.classifieds = classifieds;
    }

    @JsonProperty("coastalliving")
    public Integer getCoastalliving() {
        return coastalliving;
    }

    @JsonProperty("coastalliving")
    public void setCoastalliving(Integer coastalliving) {
        this.coastalliving = coastalliving;
    }

    @JsonProperty("community")
    public Integer getCommunity() {
        return community;
    }

    @JsonProperty("community")
    public void setCommunity(Integer community) {
        this.community = community;
    }

    @JsonProperty("competitions")
    public Integer getCompetitions() {
        return competitions;
    }

    @JsonProperty("competitions")
    public void setCompetitions(Integer competitions) {
        this.competitions = competitions;
    }

    @JsonProperty("cookinglight")
    public Integer getCookinglight() {
        return cookinglight;
    }

    @JsonProperty("cookinglight")
    public void setCookinglight(Integer cookinglight) {
        this.cookinglight = cookinglight;
    }

    @JsonProperty("dailycatch")
    public Integer getDailycatch() {
        return dailycatch;
    }

    @JsonProperty("dailycatch")
    public void setDailycatch(Integer dailycatch) {
        this.dailycatch = dailycatch;
    }

    @JsonProperty("departures")
    public Integer getDepartures() {
        return departures;
    }

    @JsonProperty("departures")
    public void setDepartures(Integer departures) {
        this.departures = departures;
    }

    @JsonProperty("dev-wpcom")
    public Integer getDevWpcom() {
        return devWpcom;
    }

    @JsonProperty("dev-wpcom")
    public void setDevWpcom(Integer devWpcom) {
        this.devWpcom = devWpcom;
    }

    @JsonProperty("edit")
    public Integer getEdit() {
        return edit;
    }

    @JsonProperty("edit")
    public void setEdit(Integer edit) {
        this.edit = edit;
    }

    @JsonProperty("essence")
    public Integer getEssence() {
        return essence;
    }

    @JsonProperty("essence")
    public void setEssence(Integer essence) {
        this.essence = essence;
    }

    @JsonProperty("ew")
    public Integer getEw() {
        return ew;
    }

    @JsonProperty("ew")
    public void setEw(Integer ew) {
        this.ew = ew;
    }

    @JsonProperty("extracrispy")
    public Integer getExtracrispy() {
        return extracrispy;
    }

    @JsonProperty("extracrispy")
    public void setExtracrispy(Integer extracrispy) {
        this.extracrispy = extracrispy;
    }

    @JsonProperty("feeds")
    public Integer getFeeds() {
        return feeds;
    }

    @JsonProperty("feeds")
    public void setFeeds(Integer feeds) {
        this.feeds = feeds;
    }

    @JsonProperty("films")
    public Integer getFilms() {
        return films;
    }

    @JsonProperty("films")
    public void setFilms(Integer films) {
        this.films = films;
    }

    @JsonProperty("flights")
    public Integer getFlights() {
        return flights;
    }

    @JsonProperty("flights")
    public void setFlights(Integer flights) {
        this.flights = flights;
    }

    @JsonProperty("foodandwine")
    public Integer getFoodandwine() {
        return foodandwine;
    }

    @JsonProperty("foodandwine")
    public void setFoodandwine(Integer foodandwine) {
        this.foodandwine = foodandwine;
    }

    @JsonProperty("fortune")
    public Integer getFortune() {
        return fortune;
    }

    @JsonProperty("fortune")
    public void setFortune(Integer fortune) {
        this.fortune = fortune;
    }

    @JsonProperty("foxsports")
    public Integer getFoxsports() {
        return foxsports;
    }

    @JsonProperty("foxsports")
    public void setFoxsports(Integer foxsports) {
        this.foxsports = foxsports;
    }

    @JsonProperty("games")
    public Integer getGames() {
        return games;
    }

    @JsonProperty("games")
    public void setGames(Integer games) {
        this.games = games;
    }

    @JsonProperty("golf")
    public Integer getGolf() {
        return golf;
    }

    @JsonProperty("golf")
    public void setGolf(Integer golf) {
        this.golf = golf;
    }

    @JsonProperty("goodtoknow")
    public Integer getGoodtoknow() {
        return goodtoknow;
    }

    @JsonProperty("goodtoknow")
    public void setGoodtoknow(Integer goodtoknow) {
        this.goodtoknow = goodtoknow;
    }

    @JsonProperty("health")
    public Integer getHealth() {
        return health;
    }

    @JsonProperty("health")
    public void setHealth(Integer health) {
        this.health = health;
    }

    @JsonProperty("hellogiggles")
    public Integer getHellogiggles() {
        return hellogiggles;
    }

    @JsonProperty("hellogiggles")
    public void setHellogiggles(Integer hellogiggles) {
        this.hellogiggles = hellogiggles;
    }

    @JsonProperty("horseandhound")
    public Integer getHorseandhound() {
        return horseandhound;
    }

    @JsonProperty("horseandhound")
    public void setHorseandhound(Integer horseandhound) {
        this.horseandhound = horseandhound;
    }

    @JsonProperty("instant")
    public Integer getInstant() {
        return instant;
    }

    @JsonProperty("instant")
    public void setInstant(Integer instant) {
        this.instant = instant;
    }

    @JsonProperty("instyle")
    public Integer getInstyle() {
        return instyle;
    }

    @JsonProperty("instyle")
    public void setInstyle(Integer instyle) {
        this.instyle = instyle;
    }

    @JsonProperty("life")
    public Integer getLife() {
        return life;
    }

    @JsonProperty("life")
    public void setLife(Integer life) {
        this.life = life;
    }

    @JsonProperty("magazinesdirect")
    public Integer getMagazinesdirect() {
        return magazinesdirect;
    }

    @JsonProperty("magazinesdirect")
    public void setMagazinesdirect(Integer magazinesdirect) {
        this.magazinesdirect = magazinesdirect;
    }

    @JsonProperty("mmqb")
    public Integer getMmqb() {
        return mmqb;
    }

    @JsonProperty("mmqb")
    public void setMmqb(Integer mmqb) {
        this.mmqb = mmqb;
    }

    @JsonProperty("money")
    public Integer getMoney() {
        return money;
    }

    @JsonProperty("money")
    public void setMoney(Integer money) {
        this.money = money;
    }

    @JsonProperty("motto")
    public Integer getMotto() {
        return motto;
    }

    @JsonProperty("motto")
    public void setMotto(Integer motto) {
        this.motto = motto;
    }

    @JsonProperty("myhomeideas")
    public Integer getMyhomeideas() {
        return myhomeideas;
    }

    @JsonProperty("myhomeideas")
    public void setMyhomeideas(Integer myhomeideas) {
        this.myhomeideas = myhomeideas;
    }

    @JsonProperty("myrecipes")
    public Integer getMyrecipes() {
        return myrecipes;
    }

    @JsonProperty("myrecipes")
    public void setMyrecipes(Integer myrecipes) {
        this.myrecipes = myrecipes;
    }

    @JsonProperty("new")
    public Integer getNew() {
        return _new;
    }

    @JsonProperty("new")
    public void setNew(Integer _new) {
        this._new = _new;
    }

    @JsonProperty("new-qa")
    public Integer getNewQa() {
        return newQa;
    }

    @JsonProperty("new-qa")
    public void setNewQa(Integer newQa) {
        this.newQa = newQa;
    }

    @JsonProperty("nme")
    public Integer getNme() {
        return nme;
    }

    @JsonProperty("nme")
    public void setNme(Integer nme) {
        this.nme = nme;
    }

    @JsonProperty("olympics")
    public Integer getOlympics() {
        return olympics;
    }

    @JsonProperty("olympics")
    public void setOlympics(Integer olympics) {
        this.olympics = olympics;
    }

    @JsonProperty("others")
    public Integer getOthers() {
        return others;
    }

    @JsonProperty("others")
    public void setOthers(Integer others) {
        this.others = others;
    }

    @JsonProperty("pages")
    public Integer getPages() {
        return pages;
    }

    @JsonProperty("pages")
    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @JsonProperty("partneredcontent")
    public Integer getPartneredcontent() {
        return partneredcontent;
    }

    @JsonProperty("partneredcontent")
    public void setPartneredcontent(Integer partneredcontent) {
        this.partneredcontent = partneredcontent;
    }

    @JsonProperty("people")
    public Integer getPeople() {
        return people;
    }

    @JsonProperty("people")
    public void setPeople(Integer people) {
        this.people = people;
    }

    @JsonProperty("peopleenespanol")
    public Integer getPeopleenespanol() {
        return peopleenespanol;
    }

    @JsonProperty("peopleenespanol")
    public void setPeopleenespanol(Integer peopleenespanol) {
        this.peopleenespanol = peopleenespanol;
    }

    @JsonProperty("preview-service")
    public Integer getPreviewService() {
        return previewService;
    }

    @JsonProperty("preview-service")
    public void setPreviewService(Integer previewService) {
        this.previewService = previewService;
    }

    @JsonProperty("qa")
    public Integer getQa() {
        return qa;
    }

    @JsonProperty("qa")
    public void setQa(Integer qa) {
        this.qa = qa;
    }

    @JsonProperty("search")
    public Integer getSearch() {
        return search;
    }

    @JsonProperty("search")
    public void setSearch(Integer search) {
        this.search = search;
    }

    @JsonProperty("search-app")
    public Integer getSearchApp() {
        return searchApp;
    }

    @JsonProperty("search-app")
    public void setSearchApp(Integer searchApp) {
        this.searchApp = searchApp;
    }

    @JsonProperty("si")
    public Integer getSi() {
        return si;
    }

    @JsonProperty("si")
    public void setSi(Integer si) {
        this.si = si;
    }

    @JsonProperty("sikids")
    public Integer getSikids() {
        return sikids;
    }

    @JsonProperty("sikids")
    public void setSikids(Integer sikids) {
        this.sikids = sikids;
    }

    @JsonProperty("sitesearch-staging")
    public Integer getSitesearchStaging() {
        return sitesearchStaging;
    }

    @JsonProperty("sitesearch-staging")
    public void setSitesearchStaging(Integer sitesearchStaging) {
        this.sitesearchStaging = sitesearchStaging;
    }

    @JsonProperty("southernlivinghouseplans")
    public Integer getSouthernlivinghouseplans() {
        return southernlivinghouseplans;
    }

    @JsonProperty("southernlivinghouseplans")
    public void setSouthernlivinghouseplans(Integer southernlivinghouseplans) {
        this.southernlivinghouseplans = southernlivinghouseplans;
    }

    @JsonProperty("sponsored")
    public Integer getSponsored() {
        return sponsored;
    }

    @JsonProperty("sponsored")
    public void setSponsored(Integer sponsored) {
        this.sponsored = sponsored;
    }

    @JsonProperty("sportsillustrated")
    public Integer getSportsillustrated() {
        return sportsillustrated;
    }

    @JsonProperty("sportsillustrated")
    public void setSportsillustrated(Integer sportsillustrated) {
        this.sportsillustrated = sportsillustrated;
    }

    @JsonProperty("stage")
    public Integer getStage() {
        return stage;
    }

    @JsonProperty("stage")
    public void setStage(Integer stage) {
        this.stage = stage;
    }

    @JsonProperty("style")
    public Integer getStyle() {
        return style;
    }

    @JsonProperty("style")
    public void setStyle(Integer style) {
        this.style = style;
    }

    @JsonProperty("sunset")
    public Integer getSunset() {
        return sunset;
    }

    @JsonProperty("sunset")
    public void setSunset(Integer sunset) {
        this.sunset = sunset;
    }

    @JsonProperty("swimsuit-site-dev")
    public Integer getSwimsuitSiteDev() {
        return swimsuitSiteDev;
    }

    @JsonProperty("swimsuit-site-dev")
    public void setSwimsuitSiteDev(Integer swimsuitSiteDev) {
        this.swimsuitSiteDev = swimsuitSiteDev;
    }

    @JsonProperty("test-www")
    public Integer getTestWww() {
        return testWww;
    }

    @JsonProperty("test-www")
    public void setTestWww(Integer testWww) {
        this.testWww = testWww;
    }

    @JsonProperty("thedrive")
    public Integer getThedrive() {
        return thedrive;
    }

    @JsonProperty("thedrive")
    public void setThedrive(Integer thedrive) {
        this.thedrive = thedrive;
    }

    @JsonProperty("thefield")
    public Integer getThefield() {
        return thefield;
    }

    @JsonProperty("thefield")
    public void setThefield(Integer thefield) {
        this.thefield = thefield;
    }

    @JsonProperty("time")
    public Integer getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Integer time) {
        this.time = time;
    }

    @JsonProperty("travelandleisure")
    public Integer getTravelandleisure() {
        return travelandleisure;
    }

    @JsonProperty("travelandleisure")
    public void setTravelandleisure(Integer travelandleisure) {
        this.travelandleisure = travelandleisure;
    }

    @JsonProperty("trustedreviews")
    public Integer getTrustedreviews() {
        return trustedreviews;
    }

    @JsonProperty("trustedreviews")
    public void setTrustedreviews(Integer trustedreviews) {
        this.trustedreviews = trustedreviews;
    }

    @JsonProperty("uncut")
    public Integer getUncut() {
        return uncut;
    }

    @JsonProperty("uncut")
    public void setUncut(Integer uncut) {
        this.uncut = uncut;
    }

    @JsonProperty("wallpaper")
    public Integer getWallpaper() {
        return wallpaper;
    }

    @JsonProperty("wallpaper")
    public void setWallpaper(Integer wallpaper) {
        this.wallpaper = wallpaper;
    }

    @JsonProperty("westphoria")
    public Integer getWestphoria() {
        return westphoria;
    }

    @JsonProperty("westphoria")
    public void setWestphoria(Integer westphoria) {
        this.westphoria = westphoria;
    }

    @JsonProperty("whatdigitalcamera")
    public Integer getWhatdigitalcamera() {
        return whatdigitalcamera;
    }

    @JsonProperty("whatdigitalcamera")
    public void setWhatdigitalcamera(Integer whatdigitalcamera) {
        this.whatdigitalcamera = whatdigitalcamera;
    }

    @JsonProperty("whatsontv")
    public Integer getWhatsontv() {
        return whatsontv;
    }

    @JsonProperty("whatsontv")
    public void setWhatsontv(Integer whatsontv) {
        this.whatsontv = whatsontv;
    }

    @JsonProperty("womanandhome")
    public Integer getWomanandhome() {
        return womanandhome;
    }

    @JsonProperty("womanandhome")
    public void setWomanandhome(Integer womanandhome) {
        this.womanandhome = womanandhome;
    }

    @JsonProperty("worldsoccer")
    public Integer getWorldsoccer() {
        return worldsoccer;
    }

    @JsonProperty("worldsoccer")
    public void setWorldsoccer(Integer worldsoccer) {
        this.worldsoccer = worldsoccer;
    }

    @JsonProperty("yahoo")
    public Integer getYahoo() {
        return yahoo;
    }

    @JsonProperty("yahoo")
    public void setYahoo(Integer yahoo) {
        this.yahoo = yahoo;
    }

    @JsonProperty("ybw")
    public Integer getYbw() {
        return ybw;
    }

    @JsonProperty("ybw")
    public void setYbw(Integer ybw) {
        this.ybw = ybw;
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
