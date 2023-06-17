package com.virgingames.jackpotbingoinfo;

import com.virgingames.constants.EndPoint;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class JackpotBingoSteps {

    @Step("Get Bingo jackpots in GBP currency")
    public ValidatableResponse getBingoJackpotCurrencyInGBP(){
        return SerenityRest.given().log().all()
                .queryParam("currency","GBP")
                .when()
                .get(EndPoint.GET_BINGO)
                .then().log().all();
    }

    @Step("Get Bingo jackpots in Euro currency")
    public ValidatableResponse getBingoJackpotCurrencyInEuro(){
        return SerenityRest.given().log().all()
                .queryParam("currency","EUR")
                .when()
                .get(EndPoint.GET_BINGO)
                .then().log().all();
    }

    @Step("Get Bingo jackpots in Swedish Krona currency")
    public ValidatableResponse getBingoJackpotCurrencyInSwedishKrona(){
        return SerenityRest.given().log().all()
                .queryParam("currency","SEK")
                .when()
                .get(EndPoint.GET_BINGO)
                .then().log().all();
    }
}
