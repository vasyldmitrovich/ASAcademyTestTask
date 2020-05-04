package com.example.mycocktailsapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Drink {

    @SerializedName("idDrink")
    @Expose
    public long idDrink;
    @SerializedName("strDrink")
    @Expose
    public String strDrink;
    @SerializedName("strDrinkAlternate")
    @Expose
    public String strDrinkAlternate;
    @SerializedName("strDrinkES")
    @Expose
    public String strDrinkES;
    @SerializedName("strDrinkDE")
    @Expose
    public String strDrinkDE;
    @SerializedName("strDrinkFR")
    @Expose
    public String strDrinkFR;
    @SerializedName("strDrinkZHHANS")
    @Expose
    public String strDrinkZHHANS;
    @SerializedName("strDrinkZHHANT")
    @Expose
    public String strDrinkZHHANT;
    @SerializedName("strTags")
    @Expose
    public String strTags;
    @SerializedName("strVideo")
    @Expose
    public String strVideo;
    @SerializedName("strCategory")
    @Expose
    public String strCategory;
    @SerializedName("strIBA")
    @Expose
    public String strIBA;
    @SerializedName("strAlcoholic")
    @Expose
    public String strAlcoholic;
    @SerializedName("strGlass")
    @Expose
    public String strGlass;
    @SerializedName("strInstructions")
    @Expose
    public String strInstructions;
    @SerializedName("strInstructionsES")
    @Expose
    public String strInstructionsES;
    @SerializedName("strInstructionsDE")
    @Expose
    public String strInstructionsDE;
    @SerializedName("strInstructionsFR")
    @Expose
    public String strInstructionsFR;
    @SerializedName("strInstructionsZHHANS")
    @Expose
    public String strInstructionsZHHANS;
    @SerializedName("strInstructionsZHHANT")
    @Expose
    public String strInstructionsZHHANT;
    @SerializedName("strDrinkThumb")
    @Expose
    public String strDrinkThumb;
    @SerializedName("strIngredient1")
    @Expose
    public String strIngredient1;
    @SerializedName("strIngredient2")
    @Expose
    public String strIngredient2;
    @SerializedName("strIngredient3")
    @Expose
    public String strIngredient3;
    @SerializedName("strIngredient4")
    @Expose
    public String strIngredient4;
    @SerializedName("strIngredient5")
    @Expose
    public String strIngredient5;
    @SerializedName("strIngredient6")
    @Expose
    public String strIngredient6;
    @SerializedName("strIngredient7")
    @Expose
    public String strIngredient7;
    @SerializedName("strIngredient8")
    @Expose
    public String strIngredient8;
    @SerializedName("strIngredient9")
    @Expose
    public String strIngredient9;
    @SerializedName("strIngredient10")
    @Expose
    public String strIngredient10;
    @SerializedName("strIngredient11")
    @Expose
    public String strIngredient11;
    @SerializedName("strIngredient12")
    @Expose
    public String strIngredient12;
    @SerializedName("strIngredient13")
    @Expose
    public String strIngredient13;
    @SerializedName("strIngredient14")
    @Expose
    public String strIngredient14;
    @SerializedName("strIngredient15")
    @Expose
    public String strIngredient15;
    @SerializedName("strMeasure1")
    @Expose
    public String strMeasure1;
    @SerializedName("strMeasure2")
    @Expose
    public String strMeasure2;
    @SerializedName("strMeasure3")
    @Expose
    public String strMeasure3;
    @SerializedName("strMeasure4")
    @Expose
    public String strMeasure4;
    @SerializedName("strMeasure5")
    @Expose
    public String strMeasure5;
    @SerializedName("strMeasure6")
    @Expose
    public String strMeasure6;
    @SerializedName("strMeasure7")
    @Expose
    public String strMeasure7;
    @SerializedName("strMeasure8")
    @Expose
    public String strMeasure8;
    @SerializedName("strMeasure9")
    @Expose
    public String strMeasure9;
    @SerializedName("strMeasure10")
    @Expose
    public String strMeasure10;
    @SerializedName("strMeasure11")
    @Expose
    public String strMeasure11;
    @SerializedName("strMeasure12")
    @Expose
    public String strMeasure12;
    @SerializedName("strMeasure13")
    @Expose
    public String strMeasure13;
    @SerializedName("strMeasure14")
    @Expose
    public String strMeasure14;
    @SerializedName("strMeasure15")
    @Expose
    public String strMeasure15;
    @SerializedName("strCreativeCommonsConfirmed")
    @Expose
    public String strCreativeCommonsConfirmed;
    @SerializedName("dateModified")
    @Expose
    public String dateModified;

    public Drink(){}

    public Drink(long idDrink, String strDrink, String strDrinkAlternate, String strDrinkES,
                 String strDrinkDE, String strDrinkFR, String strDrinkZHHANS, String strDrinkZHHANT,
                 String strTags, String strVideo, String strCategory, String strIBA,
                 String strAlcoholic, String strGlass, String strInstructions,
                 String strInstructionsES, String strInstructionsDE, String strInstructionsFR,
                 String strInstructionsZHHANS, String strInstructionsZHHANT, String strDrinkThumb,
                 String strIngredient1, String strIngredient2, String strIngredient3,
                 String strIngredient4, String strIngredient5, String strIngredient6,
                 String strIngredient7, String strIngredient8, String strIngredient9,
                 String strIngredient10, String strIngredient11, String strIngredient12,
                 String strIngredient13, String strIngredient14, String strIngredient15,
                 String strMeasure1, String strMeasure2, String strMeasure3, String strMeasure4,
                 String strMeasure5, String strMeasure6, String strMeasure7, String strMeasure8,
                 String strMeasure9, String strMeasure10, String strMeasure11, String strMeasure12,
                 String strMeasure13, String strMeasure14, String strMeasure15,
                 String strCreativeCommonsConfirmed, String dateModified) {
        this.idDrink = idDrink;
        this.strDrink = strDrink;
        this.strDrinkAlternate = strDrinkAlternate;
        this.strDrinkES = strDrinkES;
        this.strDrinkDE = strDrinkDE;
        this.strDrinkFR = strDrinkFR;
        this.strDrinkZHHANS = strDrinkZHHANS;
        this.strDrinkZHHANT = strDrinkZHHANT;
        this.strTags = strTags;
        this.strVideo = strVideo;
        this.strCategory = strCategory;
        this.strIBA = strIBA;
        this.strAlcoholic = strAlcoholic;
        this.strGlass = strGlass;
        this.strInstructions = strInstructions;
        this.strInstructionsES = strInstructionsES;
        this.strInstructionsDE = strInstructionsDE;
        this.strInstructionsFR = strInstructionsFR;
        this.strInstructionsZHHANS = strInstructionsZHHANS;
        this.strInstructionsZHHANT = strInstructionsZHHANT;
        this.strDrinkThumb = strDrinkThumb;
        this.strIngredient1 = strIngredient1;
        this.strIngredient2 = strIngredient2;
        this.strIngredient3 = strIngredient3;
        this.strIngredient4 = strIngredient4;
        this.strIngredient5 = strIngredient5;
        this.strIngredient6 = strIngredient6;
        this.strIngredient7 = strIngredient7;
        this.strIngredient8 = strIngredient8;
        this.strIngredient9 = strIngredient9;
        this.strIngredient10 = strIngredient10;
        this.strIngredient11 = strIngredient11;
        this.strIngredient12 = strIngredient12;
        this.strIngredient13 = strIngredient13;
        this.strIngredient14 = strIngredient14;
        this.strIngredient15 = strIngredient15;
        this.strMeasure1 = strMeasure1;
        this.strMeasure2 = strMeasure2;
        this.strMeasure3 = strMeasure3;
        this.strMeasure4 = strMeasure4;
        this.strMeasure5 = strMeasure5;
        this.strMeasure6 = strMeasure6;
        this.strMeasure7 = strMeasure7;
        this.strMeasure8 = strMeasure8;
        this.strMeasure9 = strMeasure9;
        this.strMeasure10 = strMeasure10;
        this.strMeasure11 = strMeasure11;
        this.strMeasure12 = strMeasure12;
        this.strMeasure13 = strMeasure13;
        this.strMeasure14 = strMeasure14;
        this.strMeasure15 = strMeasure15;
        this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed;
        this.dateModified = dateModified;
    }

    public long getIdDrink() {
        return idDrink;
    }

    public void setIdDrink(long idDrink) {
        this.idDrink = idDrink;
    }

    public String getStrDrink() {
        return strDrink;
    }

    public void setStrDrink(String strDrink) {
        this.strDrink = strDrink;
    }

    public String getStrDrinkAlternate() {
        return strDrinkAlternate;
    }

    public void setStrDrinkAlternate(String strDrinkAlternate) {
        this.strDrinkAlternate = strDrinkAlternate;
    }

    public String getStrDrinkES() {
        return strDrinkES;
    }

    public void setStrDrinkES(String strDrinkES) {
        this.strDrinkES = strDrinkES;
    }

    public String getStrDrinkDE() {
        return strDrinkDE;
    }

    public void setStrDrinkDE(String strDrinkDE) {
        this.strDrinkDE = strDrinkDE;
    }

    public String getStrDrinkFR() {
        return strDrinkFR;
    }

    public void setStrDrinkFR(String strDrinkFR) {
        this.strDrinkFR = strDrinkFR;
    }

    public String getStrDrinkZHHANS() {
        return strDrinkZHHANS;
    }

    public void setStrDrinkZHHANS(String strDrinkZHHANS) {
        this.strDrinkZHHANS = strDrinkZHHANS;
    }

    public String getStrDrinkZHHANT() {
        return strDrinkZHHANT;
    }

    public void setStrDrinkZHHANT(String strDrinkZHHANT) {
        this.strDrinkZHHANT = strDrinkZHHANT;
    }

    public String getStrTags() {
        return strTags;
    }

    public void setStrTags(String strTags) {
        this.strTags = strTags;
    }

    public String getStrVideo() {
        return strVideo;
    }

    public void setStrVideo(String strVideo) {
        this.strVideo = strVideo;
    }

    public String getStrCategory() {
        return strCategory;
    }

    public void setStrCategory(String strCategory) {
        this.strCategory = strCategory;
    }

    public String getStrIBA() {
        return strIBA;
    }

    public void setStrIBA(String strIBA) {
        this.strIBA = strIBA;
    }

    public String getStrAlcoholic() {
        return strAlcoholic;
    }

    public void setStrAlcoholic(String strAlcoholic) {
        this.strAlcoholic = strAlcoholic;
    }

    public String getStrGlass() {
        return strGlass;
    }

    public void setStrGlass(String strGlass) {
        this.strGlass = strGlass;
    }

    public String getStrInstructions() {
        return strInstructions;
    }

    public void setStrInstructions(String strInstructions) {
        this.strInstructions = strInstructions;
    }

    public String getStrInstructionsES() {
        return strInstructionsES;
    }

    public void setStrInstructionsES(String strInstructionsES) {
        this.strInstructionsES = strInstructionsES;
    }

    public String getStrInstructionsDE() {
        return strInstructionsDE;
    }

    public void setStrInstructionsDE(String strInstructionsDE) {
        this.strInstructionsDE = strInstructionsDE;
    }

    public String getStrInstructionsFR() {
        return strInstructionsFR;
    }

    public void setStrInstructionsFR(String strInstructionsFR) {
        this.strInstructionsFR = strInstructionsFR;
    }

    public String getStrInstructionsZHHANS() {
        return strInstructionsZHHANS;
    }

    public void setStrInstructionsZHHANS(String strInstructionsZHHANS) {
        this.strInstructionsZHHANS = strInstructionsZHHANS;
    }

    public String getStrInstructionsZHHANT() {
        return strInstructionsZHHANT;
    }

    public void setStrInstructionsZHHANT(String strInstructionsZHHANT) {
        this.strInstructionsZHHANT = strInstructionsZHHANT;
    }

    public String getStrDrinkThumb() {
        return strDrinkThumb;
    }

    public void setStrDrinkThumb(String strDrinkThumb) {
        this.strDrinkThumb = strDrinkThumb;
    }

    public String getStrIngredient1() {
        return strIngredient1;
    }

    public void setStrIngredient1(String strIngredient1) {
        this.strIngredient1 = strIngredient1;
    }

    public String getStrIngredient2() {
        return strIngredient2;
    }

    public void setStrIngredient2(String strIngredient2) {
        this.strIngredient2 = strIngredient2;
    }

    public String getStrIngredient3() {
        return strIngredient3;
    }

    public void setStrIngredient3(String strIngredient3) {
        this.strIngredient3 = strIngredient3;
    }

    public String getStrIngredient4() {
        return strIngredient4;
    }

    public void setStrIngredient4(String strIngredient4) {
        this.strIngredient4 = strIngredient4;
    }

    public String getStrIngredient5() {
        return strIngredient5;
    }

    public void setStrIngredient5(String strIngredient5) {
        this.strIngredient5 = strIngredient5;
    }

    public String getStrIngredient6() {
        return strIngredient6;
    }

    public void setStrIngredient6(String strIngredient6) {
        this.strIngredient6 = strIngredient6;
    }

    public String getStrIngredient7() {
        return strIngredient7;
    }

    public void setStrIngredient7(String strIngredient7) {
        this.strIngredient7 = strIngredient7;
    }

    public String getStrIngredient8() {
        return strIngredient8;
    }

    public void setStrIngredient8(String strIngredient8) {
        this.strIngredient8 = strIngredient8;
    }

    public String getStrIngredient9() {
        return strIngredient9;
    }

    public void setStrIngredient9(String strIngredient9) {
        this.strIngredient9 = strIngredient9;
    }

    public String getStrIngredient10() {
        return strIngredient10;
    }

    public void setStrIngredient10(String strIngredient10) {
        this.strIngredient10 = strIngredient10;
    }

    public String getStrIngredient11() {
        return strIngredient11;
    }

    public void setStrIngredient11(String strIngredient11) {
        this.strIngredient11 = strIngredient11;
    }

    public String getStrIngredient12() {
        return strIngredient12;
    }

    public void setStrIngredient12(String strIngredient12) {
        this.strIngredient12 = strIngredient12;
    }

    public String getStrIngredient13() {
        return strIngredient13;
    }

    public void setStrIngredient13(String strIngredient13) {
        this.strIngredient13 = strIngredient13;
    }

    public String getStrIngredient14() {
        return strIngredient14;
    }

    public void setStrIngredient14(String strIngredient14) {
        this.strIngredient14 = strIngredient14;
    }

    public String getStrIngredient15() {
        return strIngredient15;
    }

    public void setStrIngredient15(String strIngredient15) {
        this.strIngredient15 = strIngredient15;
    }

    public String getStrMeasure1() {
        return strMeasure1;
    }

    public void setStrMeasure1(String strMeasure1) {
        this.strMeasure1 = strMeasure1;
    }

    public String getStrMeasure2() {
        return strMeasure2;
    }

    public void setStrMeasure2(String strMeasure2) {
        this.strMeasure2 = strMeasure2;
    }

    public String getStrMeasure3() {
        return strMeasure3;
    }

    public void setStrMeasure3(String strMeasure3) {
        this.strMeasure3 = strMeasure3;
    }

    public String getStrMeasure4() {
        return strMeasure4;
    }

    public void setStrMeasure4(String strMeasure4) {
        this.strMeasure4 = strMeasure4;
    }

    public String getStrMeasure5() {
        return strMeasure5;
    }

    public void setStrMeasure5(String strMeasure5) {
        this.strMeasure5 = strMeasure5;
    }

    public String getStrMeasure6() {
        return strMeasure6;
    }

    public void setStrMeasure6(String strMeasure6) {
        this.strMeasure6 = strMeasure6;
    }

    public String getStrMeasure7() {
        return strMeasure7;
    }

    public void setStrMeasure7(String strMeasure7) {
        this.strMeasure7 = strMeasure7;
    }

    public String getStrMeasure8() {
        return strMeasure8;
    }

    public void setStrMeasure8(String strMeasure8) {
        this.strMeasure8 = strMeasure8;
    }

    public String getStrMeasure9() {
        return strMeasure9;
    }

    public void setStrMeasure9(String strMeasure9) {
        this.strMeasure9 = strMeasure9;
    }

    public String getStrMeasure10() {
        return strMeasure10;
    }

    public void setStrMeasure10(String strMeasure10) {
        this.strMeasure10 = strMeasure10;
    }

    public String getStrMeasure11() {
        return strMeasure11;
    }

    public void setStrMeasure11(String strMeasure11) {
        this.strMeasure11 = strMeasure11;
    }

    public String getStrMeasure12() {
        return strMeasure12;
    }

    public void setStrMeasure12(String strMeasure12) {
        this.strMeasure12 = strMeasure12;
    }

    public String getStrMeasure13() {
        return strMeasure13;
    }

    public void setStrMeasure13(String strMeasure13) {
        this.strMeasure13 = strMeasure13;
    }

    public String getStrMeasure14() {
        return strMeasure14;
    }

    public void setStrMeasure14(String strMeasure14) {
        this.strMeasure14 = strMeasure14;
    }

    public String getStrMeasure15() {
        return strMeasure15;
    }

    public void setStrMeasure15(String strMeasure15) {
        this.strMeasure15 = strMeasure15;
    }

    public String getStrCreativeCommonsConfirmed() {
        return strCreativeCommonsConfirmed;
    }

    public void setStrCreativeCommonsConfirmed(String strCreativeCommonsConfirmed) {
        this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return idDrink == drink.idDrink &&
                Objects.equals(strDrink, drink.strDrink) &&
                Objects.equals(strDrinkAlternate, drink.strDrinkAlternate) &&
                Objects.equals(strDrinkES, drink.strDrinkES) &&
                Objects.equals(strDrinkDE, drink.strDrinkDE) &&
                Objects.equals(strDrinkFR, drink.strDrinkFR) &&
                Objects.equals(strDrinkZHHANS, drink.strDrinkZHHANS) &&
                Objects.equals(strDrinkZHHANT, drink.strDrinkZHHANT) &&
                Objects.equals(strTags, drink.strTags) &&
                Objects.equals(strVideo, drink.strVideo) &&
                Objects.equals(strCategory, drink.strCategory) &&
                Objects.equals(strIBA, drink.strIBA) &&
                Objects.equals(strAlcoholic, drink.strAlcoholic) &&
                Objects.equals(strGlass, drink.strGlass) &&
                Objects.equals(strInstructions, drink.strInstructions) &&
                Objects.equals(strInstructionsES, drink.strInstructionsES) &&
                Objects.equals(strInstructionsDE, drink.strInstructionsDE) &&
                Objects.equals(strInstructionsFR, drink.strInstructionsFR) &&
                Objects.equals(strInstructionsZHHANS, drink.strInstructionsZHHANS) &&
                Objects.equals(strInstructionsZHHANT, drink.strInstructionsZHHANT) &&
                Objects.equals(strDrinkThumb, drink.strDrinkThumb) &&
                Objects.equals(strIngredient1, drink.strIngredient1) &&
                Objects.equals(strIngredient2, drink.strIngredient2) &&
                Objects.equals(strIngredient3, drink.strIngredient3) &&
                Objects.equals(strIngredient4, drink.strIngredient4) &&
                Objects.equals(strIngredient5, drink.strIngredient5) &&
                Objects.equals(strIngredient6, drink.strIngredient6) &&
                Objects.equals(strIngredient7, drink.strIngredient7) &&
                Objects.equals(strIngredient8, drink.strIngredient8) &&
                Objects.equals(strIngredient9, drink.strIngredient9) &&
                Objects.equals(strIngredient10, drink.strIngredient10) &&
                Objects.equals(strIngredient11, drink.strIngredient11) &&
                Objects.equals(strIngredient12, drink.strIngredient12) &&
                Objects.equals(strIngredient13, drink.strIngredient13) &&
                Objects.equals(strIngredient14, drink.strIngredient14) &&
                Objects.equals(strIngredient15, drink.strIngredient15) &&
                Objects.equals(strMeasure1, drink.strMeasure1) &&
                Objects.equals(strMeasure2, drink.strMeasure2) &&
                Objects.equals(strMeasure3, drink.strMeasure3) &&
                Objects.equals(strMeasure4, drink.strMeasure4) &&
                Objects.equals(strMeasure5, drink.strMeasure5) &&
                Objects.equals(strMeasure6, drink.strMeasure6) &&
                Objects.equals(strMeasure7, drink.strMeasure7) &&
                Objects.equals(strMeasure8, drink.strMeasure8) &&
                Objects.equals(strMeasure9, drink.strMeasure9) &&
                Objects.equals(strMeasure10, drink.strMeasure10) &&
                Objects.equals(strMeasure11, drink.strMeasure11) &&
                Objects.equals(strMeasure12, drink.strMeasure12) &&
                Objects.equals(strMeasure13, drink.strMeasure13) &&
                Objects.equals(strMeasure14, drink.strMeasure14) &&
                Objects.equals(strMeasure15, drink.strMeasure15) &&
                Objects.equals(strCreativeCommonsConfirmed, drink.strCreativeCommonsConfirmed) &&
                Objects.equals(dateModified, drink.dateModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDrink, strDrink, strDrinkAlternate, strDrinkES, strDrinkDE, strDrinkFR, strDrinkZHHANS, strDrinkZHHANT, strTags, strVideo, strCategory, strIBA, strAlcoholic, strGlass, strInstructions, strInstructionsES, strInstructionsDE, strInstructionsFR, strInstructionsZHHANS, strInstructionsZHHANT, strDrinkThumb, strIngredient1, strIngredient2, strIngredient3, strIngredient4, strIngredient5, strIngredient6, strIngredient7, strIngredient8, strIngredient9, strIngredient10, strIngredient11, strIngredient12, strIngredient13, strIngredient14, strIngredient15, strMeasure1, strMeasure2, strMeasure3, strMeasure4, strMeasure5, strMeasure6, strMeasure7, strMeasure8, strMeasure9, strMeasure10, strMeasure11, strMeasure12, strMeasure13, strMeasure14, strMeasure15, strCreativeCommonsConfirmed, dateModified);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "idDrink=" + idDrink +
                ", strDrink='" + strDrink + '\'' +
                ", strDrinkAlternate='" + strDrinkAlternate + '\'' +
                ", strDrinkES='" + strDrinkES + '\'' +
                ", strDrinkDE='" + strDrinkDE + '\'' +
                ", strDrinkFR='" + strDrinkFR + '\'' +
                ", strDrinkZHHANS='" + strDrinkZHHANS + '\'' +
                ", strDrinkZHHANT='" + strDrinkZHHANT + '\'' +
                ", strTags='" + strTags + '\'' +
                ", strVideo='" + strVideo + '\'' +
                ", strCategory='" + strCategory + '\'' +
                ", strIBA='" + strIBA + '\'' +
                ", strAlcoholic='" + strAlcoholic + '\'' +
                ", strGlass='" + strGlass + '\'' +
                ", strInstructions='" + strInstructions + '\'' +
                ", strInstructionsES='" + strInstructionsES + '\'' +
                ", strInstructionsDE='" + strInstructionsDE + '\'' +
                ", strInstructionsFR='" + strInstructionsFR + '\'' +
                ", strInstructionsZHHANS='" + strInstructionsZHHANS + '\'' +
                ", strInstructionsZHHANT='" + strInstructionsZHHANT + '\'' +
                ", strDrinkThumb='" + strDrinkThumb + '\'' +
                ", strIngredient1='" + strIngredient1 + '\'' +
                ", strIngredient2='" + strIngredient2 + '\'' +
                ", strIngredient3='" + strIngredient3 + '\'' +
                ", strIngredient4='" + strIngredient4 + '\'' +
                ", strIngredient5='" + strIngredient5 + '\'' +
                ", strIngredient6='" + strIngredient6 + '\'' +
                ", strIngredient7='" + strIngredient7 + '\'' +
                ", strIngredient8='" + strIngredient8 + '\'' +
                ", strIngredient9='" + strIngredient9 + '\'' +
                ", strIngredient10='" + strIngredient10 + '\'' +
                ", strIngredient11='" + strIngredient11 + '\'' +
                ", strIngredient12='" + strIngredient12 + '\'' +
                ", strIngredient13='" + strIngredient13 + '\'' +
                ", strIngredient14='" + strIngredient14 + '\'' +
                ", strIngredient15='" + strIngredient15 + '\'' +
                ", strMeasure1='" + strMeasure1 + '\'' +
                ", strMeasure2='" + strMeasure2 + '\'' +
                ", strMeasure3='" + strMeasure3 + '\'' +
                ", strMeasure4='" + strMeasure4 + '\'' +
                ", strMeasure5='" + strMeasure5 + '\'' +
                ", strMeasure6='" + strMeasure6 + '\'' +
                ", strMeasure7='" + strMeasure7 + '\'' +
                ", strMeasure8='" + strMeasure8 + '\'' +
                ", strMeasure9='" + strMeasure9 + '\'' +
                ", strMeasure10='" + strMeasure10 + '\'' +
                ", strMeasure11='" + strMeasure11 + '\'' +
                ", strMeasure12='" + strMeasure12 + '\'' +
                ", strMeasure13='" + strMeasure13 + '\'' +
                ", strMeasure14='" + strMeasure14 + '\'' +
                ", strMeasure15='" + strMeasure15 + '\'' +
                ", strCreativeCommonsConfirmed='" + strCreativeCommonsConfirmed + '\'' +
                ", dateModified='" + dateModified + '\'' +
                '}';
    }
}

