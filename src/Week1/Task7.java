package Week1;

public class Task7 {
    public static void main(String[] args) {
        // one birth every 7 seconds
        // one death every 13 seconds
        // one new immigrant every 45 seconds

        // initial population is 312,032,486
        // one year has 365 days
        // show the population for the following 5 years

        // first, find how many seconds in a year
        // 365 * 24 * 60 * 60 = 31,536,000

        // next, find the amount of births in a year
        // (365 * 24 * 60 * 60) / 7.0 = approx. 4,505,142.857

        // find the number of deaths per year
        // (365 * 24 * 60 * 60) / 13.0 = approx. 2,425,846.154

        // find the number of immigrants per year
        // (365 * 24 * 60 * 60) / 45.0 = 700,800

        // store these in variables for sake of readability
        double birthsPerYear = 365 * 24 * 60 * 60 / 7.0;
        double deathsPerYear = 365 * 24 * 60 * 60 / 13.0;
        double immigrantsPerYear = 365 * 24 * 60 * 60 / 45.0;

        // to find the final net change in a year, calculate (births + immigrants - deaths)
        System.out.print("Net change per year: ");
        System.out.println(birthsPerYear + immigrantsPerYear - deathsPerYear);
        // this will print ~2,780,096.7

        // thus, each year will experience this increase

        // print an empty line for formatting
        System.out.println();

        System.out.print("Population after year one: ");
        // this prints in scientific notation
        System.out.println(312032486 + (birthsPerYear + immigrantsPerYear - deathsPerYear));

        System.out.print("Population after year two: ");
        // this prints in scientific notation
        System.out.println(312032486 + (birthsPerYear + immigrantsPerYear - deathsPerYear) * 2);

        System.out.print("Population after year three: ");
        // this prints in scientific notation
        System.out.println(312032486 + (birthsPerYear + immigrantsPerYear - deathsPerYear) * 3);

        System.out.print("Population after year four: ");
        // this prints in scientific notation
        System.out.println(312032486 + (birthsPerYear + immigrantsPerYear - deathsPerYear) * 4);

        System.out.print("Population after year five: ");
        // this prints in scientific notation
        System.out.println(312032486 + (birthsPerYear + immigrantsPerYear - deathsPerYear) * 5);
    }
}
