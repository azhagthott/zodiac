package com.fbarrios.dev.zodiac.model;

import java.util.Date;

/**
 * Created by fbarrios80 on 20-02-17.
 */

public class ZodiacSign {

    private String name;
    private String description;
    private int image;
    private Date birthday;

    public ZodiacSign() {
    }

    public ZodiacSign(String name, String description, int image, Date birthday) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBrightestStar(String value) {

        String star = "";

        if (value.equals("Aries")) {
            return star = "Hamal";
        }
        if (value.equals("Taurus")) {
            return star = "Aldebaran";
        }
        if (value.equals("Gemini")) {
            return star = "Pollux";
        }
        if (value.equals("Cancer")) {
            return star = "Al Tarf";
        }
        if (value.equals("Leo")) {
            return star = "Regulus";
        }
        if (value.equals("Virgo")) {
            return star = "Spica";
        }
        if (value.equals("Libra")) {
            return star = "Zubeneschamali";
        }
        if (value.equals("Scorpio")) {
            return star = "Antares";
        }
        if (value.equals("Sagittarius")) {
            return star = "Kaus Australis";
        }
        if (value.equals("Capricorn")) {
            return star = "Deneb Algedi";
        }
        if (value.equals("Aquarius")) {
            return star = "Sadalsuud";
        }
        if (value.equals("Pisces")) {
            return star = "Eta Piscium";
        }
        return star = "Not found";
    }
}
