package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingBirds = initialNumberOfBirds - birdsThatFlewAway;
		
		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		int numberOfNests = 3;
        int numberOfBirds = 6;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		
        
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numberOfRacoonsPlaying = 3;
		int numberOfRacoonsEating = 2;
		int numberOfRacoonsLeft = numberOfRacoonsPlaying - numberOfRacoonsEating;
		
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int flowers = 5;
		int bees = 3;
		int extraFlowers = flowers - bees ;
		
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int lonelyPigeon = 1;
		int extraPigeon = 1;
		int totalPigeonsEating = lonelyPigeon + extraPigeon;
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int firstSetOfOwls = 3;
		int secondSetOfOwls = 2;
		int totalOwls = firstSetOfOwls + secondSetOfOwls;
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int totalBeaversWorking = 2;
		int beaversSwimming = 1;
		int beaversStillWorking = totalBeaversWorking - beaversSwimming;
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansSitting = 1;
		int toucansJoining = 1;
		int totalToucans = toucansSitting + toucansJoining;
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int totalSquirrels = 4;
		int totalNuts = 2;
		int nutlessSquirrles = totalSquirrels - totalNuts;
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		int quarter = 25;
		int dime = 10;
		int nickels = 10;
		int totalMoney = quarter + dime + nickels;
		
		
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int brierMuffins = 18;
		int macAdamMuffins = 20;
		int flanneryMuffins = 17;
		int totalMuffins = brierMuffins + macAdamMuffins + flanneryMuffins;
		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		int yoyoCost = 24;
		int whistleCost = 14;
		int totalExpedetures = yoyoCost + whistleCost;
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int marshmallowLarge = 8;
		int marshmallowMini = 10;
		int marshmallowTotal = marshmallowMini + marshmallowLarge;
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int snowAtHiltHouse = 29;
		int snowAtElementarySchool = 17;
		int moreSnowAtHiltHouse = snowAtHiltHouse - snowAtElementarySchool;
		
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int originalTotal = 10;
		int costOfToyTruck = 3;
		int costOfPencil = 2;
		int totalCost = costOfToyTruck + costOfPencil;
		int newTotal = originalTotal - totalCost;
		
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int marbleCollection = 16;
		int lostMarbles = 7;
		int remainingMarbles = marbleCollection - lostMarbles;
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int desiredShells = 25;
		int currentTotal = 19;
		int shellsNeeded = desiredShells - currentTotal;
		
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = totalBalloons - redBalloons;
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int currentNumberOfBooks = 38;
		int newBooks = 10;
		int totalBooks = currentNumberOfBooks + newBooks;
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int legs = 6;
		int numberOfBee = 8;
		int TotalBeeLegs = legs * numberOfBee; 
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		float iceCreamCost = (float)99;
		int totalIceCream = 2;
		float totalPrice = (float)iceCreamCost * totalIceCream;
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int sizeOfBorder = 125;
		int currentRocks = 64;
		int necessaryRocks = sizeOfBorder - currentRocks;
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hiltMarbles = 38;
		int lostHiltMarbles = 15;
		int marblesRemaining = hiltMarbles - lostHiltMarbles;
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int totalMiles = 78;
		int gasStop =  32;
		int milesToGo = totalMiles - gasStop;
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		int saturdayAfternoonShovel = 45;
		int saturdayMorningShovel = 90;
		int totalTimeToShovel = saturdayMorningShovel + saturdayAfternoonShovel;
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		float totalHotDogs = 6;
		float hotDogPrice = (float).50;
		float moneySpentOnHotDogs = hotDogPrice * totalHotDogs;
		
		
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		float hiltMoneyTotal = .50f;
		float pencilPrice = .07f;
		 float totalPencils = hiltMoneyTotal / pencilPrice;
		
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int butterflyTotal = 33;
		int orangeButterfly = 20;
		int redButterfly = butterflyTotal - orangeButterfly;
	
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		float kate = (float)1.00;
		float price = (float).54;
		float returnPrice = kate - price;
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int backYardTrees = 13;
		int plantedTrees = 12;
		int totalTrees = plantedTrees + backYardTrees;
		
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int days = 2;
		int hours = days * 24;
		int joyReunion = hours;
		
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int gumPerPerson = 5;
		int cousins = 4;
		int gumNeeded = cousins * gumPerPerson;
		
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		float danWallet = (float)3.00;
		float candyBarPrice = (float)1.00;
		float moneyRemaining = danWallet - candyBarPrice;
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsInLake = 5;
		int peopleInBoat = 3;
		int peopleInLake = boatsInLake * peopleInBoat;
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int totalLegos = 380;
		int lostLegos = 57;
		int remainingLegos = totalLegos - lostLegos;
		
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int totalMuffinsWanted = 83;
		int bakedMuffins = 35;
		int muffinsLeftToBake = totalMuffinsWanted - bakedMuffins;
		
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyCrayons = 1400;
		int lucyCrayons = 290;
		int differenceInCrayons = willyCrayons - lucyCrayons;
		
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersOnPage = 10;
		int totalPages = 22;
		int totalStickets = stickersOnPage * totalPages;
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int cupcakes = 96;
		int children = 8;
		int totalCupcakesPerPerson = cupcakes / children;
		
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int cookies = 47;
		int cookiesInJar = 6;
		int leftOverCookies = cookies % cookiesInJar;
		
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int croissants = 59;
		int neighbors = 8;
		int crossantsLeftOver = croissants % neighbors;
		
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int totalCookies = 276;
		int bakingpan = totalCookies / 12;
		int totalyPans = bakingpan;
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int servingSize = 12;
		int totalPretzels = 480;
		int totalServings = totalPretzels / servingSize;
		
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int bakedLemonCupcakes = 53;
		int forgottenLemonCupcakes = 2;
		int lemonCupcakesAvailable = bakedLemonCupcakes - forgottenLemonCupcakes;
		int boxWithLemonCupcakes = lemonCupcakesAvailable / 3;
		
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotsPrepared = 74;
		int totalPeople = 12;
		int carrotsLeftUneaten = carrotsPrepared % totalPeople;
		
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int totalTeddyBear = 98;
		int shelfCapacity = 7;
		int usedShelves = totalTeddyBear / shelfCapacity;
		
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int albumCapacity = 20;
		int totalPhotos = 480;
		int album = totalPhotos / albumCapacity;
		
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int tradingCards = 94;
		int boxCapacity = 8;
		int boxesFilled = tradingCards / boxCapacity;
		int cardsLeftOver = tradingCards % boxCapacity;
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int amountOfBooks = 210;
		int totalShelves = 10;
		int booksOnShelves = amountOfBooks / totalShelves;
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int totalGuests = 7;
		int totalCroissants = 17;
		int croissantsReceived = totalCroissants / totalGuests;
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
		//??????//
		
		float billAveragePaintingTime = 129;
		float jillAveragePaintingTime = 114;
		float combinedAverageTime = billAveragePaintingTime + jillAveragePaintingTime / 2; //121.5//
		float walls = 5;
		float expectedHours = walls * combinedAverageTime / 60;
		
		float totalDays = 623;
		float totalHours = 623 / 8;
		float expectedDays = combinedAverageTime / totalHours;
		
		
		//???????//
		
		
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
		
		
		
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */


	}

}
