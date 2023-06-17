package com.virgingames.testsuite;

import com.virgingames.jackpotbingoinfo.JackpotBingoSteps;
import com.virgingames.testbase.TestBase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.hasItems;


@RunWith(SerenityRunner.class)
public class JackpotBingoTest extends TestBase {
    @Steps
    JackpotBingoSteps jackpotBingoSteps;

    @Title("Verify when currency = GBP, then the response contain currency GBP only")
    @Test
    public void test01(){
        jackpotBingoSteps.getBingoJackpotCurrencyInGBP().body("data.pots.currency", hasItems("GBP"))
                .statusCode(200).log().all();
    }

    @Title("Verify when currency = EUR, then the response contain currency Euro only")
    @Test
    public void test02(){
        jackpotBingoSteps.getBingoJackpotCurrencyInEuro().body("data.pots.currency", hasItems("EUR"))
                .statusCode(200).log().all();
    }

    @Title("Verify when currency = SEK, then the response contain currency Swedish Krona only")
    @Test
    public void test03(){
        jackpotBingoSteps.getBingoJackpotCurrencyInSwedishKrona().body("data.pots.currency", hasItems("SEK"))
                .statusCode(200).log().all();
    }

}
