package com.techelevator;

public class Exercises {

	public static void main(String[] args) {
        
        /*
        INSTRUCTIONS

        The primary purposes of these exercises are to practice: 
        		
        		1. declaring variables and using assignment statements
        		2. using variables, literals, and operators within arithmetic expressions
        		3. choosing meaningful variable names
        		4. choosing appropriate data types

        One of the hardest things about programming is choosing good names. Spend time
        to find good, meaningful, and descriptive names for your variables. Clarity and
        expressiveness is more important than brevity. Err on the side of longer, more 
        descriptive names over short, cryptic ones.

        Be consistent with your choice of datatypes, especially when it comes to 
        some values like money. There are many different ways to express money. Pick one, 
        and stick with it throughout these exercises.
        
        Keep your code consistent and well formatted. When code is poorly indented, 
        or lost in a flood of blank lines, it can make it difficult to read. 
        */

        /* 
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */
		
		// ### EXAMPLE:  
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
        System.out.println("1. Birds remaining: " + remainingNumberOfBirds);

        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests? 
        */
		
		// ### EXAMPLE: 
		int numberOfBirds = 6;
		int numberOfNests = 3;
        int numberOfExtraBirds = numberOfBirds - numberOfNests;
        System.out.println("2. More birds than nests: " + numberOfExtraBirds);

        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */
		
		int numberOfRaccoons = 3;
		int numberWhoLeave = 2;
		int remainngRaccoons = numberOfRaccoons - numberWhoLeave;
        System.out.println("3. Remaining Raccoons: " + remainngRaccoons);

        /* 
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        */
		int flowers = 5;
		int bees = 3;
		int beeDeficit = flowers - bees;
        System.out.println("4. Bee difference: " + beeDeficit);

        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */
		
		int lonleyPidgeon = 1;
		int newPidgeon = 1;
		int totalPidgeons = lonleyPidgeon + newPidgeon;
        System.out.println("5. Pidgeons eating: " + totalPidgeons);

        /* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */
		
		int initialOwls = 3;
		int newOwls = 2;
		int totalOwls = initialOwls + newOwls;
        System.out.println("6. Total owls: " + totalOwls);

		
        /* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
        */
		
		int initialBeavers = 2;
		int lazyBeaver = 1;
		int totalBeavers = initialBeavers - lazyBeaver;
        System.out.println("7. Beavers still working: " + totalBeavers);

        /* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */

        int initialTucans = 2;
        int newTucans = 1;
        int totalTucans = initialTucans + newTucans;
        System.out.println("8. Total tucans: " + totalTucans);


        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */

        int totalSquirrels = 4;
        int totalNuts = 2;
        int excessSquirrels = totalSquirrels - totalNuts;
        System.out.println("9. Squirrel surplus: " + excessSquirrels);

        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */

        float qValue = 0.25f;
        float dValue = 0.10f;
        float nValue = 0.10f;
        float totalValue = qValue + dValue + nValue;
        System.out.println("10. Money found: $" + totalValue);



        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */

        int briersMuffins = 18;
        int macadamsMuffins = 20;
        int flanneryMuffins = 17;
        int totalMuffins = briersMuffins + macadamsMuffins + flanneryMuffins;
        System.out.println("11. Total Muffins: " + totalMuffins);

        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
        
        float yoyoPrice = 0.24f;
        float whistlePrice = 0.14f;
        float totalSpent = yoyoPrice + whistlePrice;
        System.out.println("12. Money spent: $" + totalSpent);

        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */

        int miniMallows = 10;
        int largeMallows = 8;
        int totalMallows = miniMallows + largeMallows;
        System.out.println("13. Total Marshmallows: " + totalMallows);

        
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        
        int hiltHouse = 29;
        int brecknock = 17;
        int deltaInSnow = hiltHouse - brecknock;
        System.out.println("14. Difference in snow at Hilt's house; " + deltaInSnow);


        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
        
        int initialFunds = 10;
        int toyTruck = 3;
        int pencil = 2;
        int remainingFundsinDollars = initialFunds - toyTruck - pencil;
        System.out.println("15. Money left: $" + remainingFundsinDollars);


        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */

        int initialMarbles = 16;
        int lostMarbles = 7;
        int remainingMarbles = initialMarbles - lostMarbles;
        System.out.println("16. Remaining Marbles: " + remainingMarbles);

        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */

        int initialShells = 19;
        int goalShells = 25;
        int findShells = goalShells - initialShells;
        System.out.println("17. Shells needed: " + findShells);


        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
        
        int totalBalloons = 17;
        int redBalloons = 8;
        int greenBallons = totalBalloons - redBalloons;
        System.out.println("18. Green ballons: " + greenBallons);


        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */

        int initialBooks =  38;
        int addedBooks = 10;
        int totalBooks = initialBooks + addedBooks;
        System.out.println("19. Books left: " + totalBooks);

        
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

        int beeLegs = 6;
        int totalBees = 8;
        int totalLegs = beeLegs * totalBees;
        System.out.println("20. Total legs: " + totalLegs);

        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        
        float unitCost = 0.99f;
        float desiredUnits = 2.0f;
        float totalCost = unitCost * desiredUnits;
        System.out.println("21. Total Cost: $" + totalCost);


        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */

        int requiredRocks = 125;
        int currentRocks = 64;
        int rockDeficit = requiredRocks - currentRocks;
        System.out.println("22. Rocks needed: " + rockDeficit);


        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */

        int hiltMarbles = 38;
        int lostHiltMarbles = 15;
        int remainingHiltMarbles = hiltMarbles - lostHiltMarbles;
        System.out.println("23. Remaining marbles: " + remainingHiltMarbles);


        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

        int totalMiles = 78;
        int drivenMiles = 32;
        int remainingMiles = totalMiles - drivenMiles;
        System.out.println("24. Miles left: " + remainingMiles);


        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
        
        int saturdayMorningInMinutes = 90;
        int saturdayAfternoonInMinutes = 45;
        int totalTime = saturdayAfternoonInMinutes + saturdayMorningInMinutes;
        System.out.println("25. Total time in minutes: " + totalTime);


        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */

        float purchasedDogs = 6.00f;
        float unitCostPerDog = 0.50f;
        float totalCostOfDogs = purchasedDogs * unitCostPerDog;
        System.out.println("26. Total Cost: $" + totalCostOfDogs);

        
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        
        float hiltFunds = 0.50f;
        float pencilCost = 0.07f;
        int totalPencils = (int)(hiltFunds / pencilCost);
        System.out.println("27. Pencils she can buy: " + totalPencils);


        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        
        int totalButterflies = 33;
        int orangeButterflies = 20;
        int redButterflies = totalButterflies - orangeButterflies;
        System.out.println("28. Red butterflies: " + redButterflies);


        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        
        double fundsProvided = 1.00;
        double candyCost = 0.54;
        double changeReceived = fundsProvided - candyCost;
        System.out.println("29. Change expected: $" + changeReceived);


        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        
        int currentTrees = 13;
        int plantedTrees = 12;
        int totalTrees = currentTrees + plantedTrees;
        System.out.println("30. Trees: " + totalTrees);


        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        
        int numberOfDays = 2;
        int numberOfHours = numberOfDays * 24;
        System.out.println("31. Hours until Grandma: " + numberOfHours);


        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        
        int cousins = 4;
        int gumPerCousin = 5;
        int totalGum = cousins * gumPerCousin;
        System.out.println("32. Gum needed: " + totalGum);


        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */

        double startingFunds = 3.00f;
        double candyBarCost = 1.00f;
        double moneyLeftOver = startingFunds - candyBarCost;
        System.out.println("33. Money left: $" + moneyLeftOver);

        
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */

        int totalBoats = 5;
        int peoplePerBoat = 3;
        int totalPeople = totalBoats * peoplePerBoat;
        System.out.println("34. Total people: " + totalPeople);

        
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */

        int totalLegos = 380;
        int lostLegos = 57;
        int remainingLegos = totalLegos - lostLegos;
        System.out.println("35. Remaining legos: " + remainingLegos);

        
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        
        int desiredMuffins = 83;
        int currentMuffins = 35;
        int remainingMuffins = desiredMuffins - currentMuffins;
        System.out.println("36. Muffins needed: " + remainingMuffins);


        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

        int willyCrayons = 1400;
        int lucyCrayons = 290;
        int willyAdvantage = willyCrayons - lucyCrayons;
        System.out.println("37. Willy's advantage in crayons: " + willyAdvantage);

        
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */

        int stickersPerPage = 10;
        int numberOfPages = 22;
        int totalStickers = stickersPerPage * numberOfPages;
        System.out.println("38. Total stickers: " + totalStickers);

        
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */

        int totalCupcakes = 96;
        int totalKids = 8;
        int cupcakesPerKid = totalCupcakes / totalKids;
        System.out.println("39. Cupcakse per child: " + cupcakesPerKid);

        
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */

        int totalCookies = 47;
        int cookiesPerJar = 6;
        int remainingCookies = totalCookies % cookiesPerJar;
        System.out.println("40. Cookies not in jar: " + remainingCookies);

        
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

        int totalCros = 59;
        int crosPerPerson = 8;
        int remainingCros = totalCros % crosPerPerson;
        System.out.println("41. Croissants leftwith marian: " + remainingCros);

        
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        
        int totalOatmealCookies = 276;
        int cookiesPerTray = 12;
        int totalTrays = totalOatmealCookies / cookiesPerTray;
        System.out.println("42. trays needed: " + totalTrays);


        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */

        int initialPretzels = 480;
        int servingSize = 12;
        int numberOfServings = initialPretzels / servingSize;
        System.out.println("43. Servings prepared: " + numberOfServings);

        
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */

        int totalLemonCupcakes = 53;
        int missingCupcakes = 2;
        int cupcakesBrought = totalLemonCupcakes - missingCupcakes;
        int cupcakesPerBox = 3;
        int totalBoxes = cupcakesBrought / cupcakesPerBox;
        System.out.println("44. Boxes given away: " + totalBoxes);

        
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */

        int totalCarrots = 74;
        int numberOfPeople = 12;
        int remainingCarrots = totalCarrots % numberOfPeople;
        System.out.println("45. Carrot Sticks uneaten: " + remainingCarrots);

        
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */

        int totalTeddyBears = 98;
        int bearsPerShelf = 7;
        int shelvesFilled = totalTeddyBears / bearsPerShelf;
        System.out.println("46. Shelves filled: " + shelvesFilled);



        
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

        int totalPictures = 480;
        int picturesPerAlbum = 20;
        int totalAlbums = totalPictures / picturesPerAlbum;
        System.out.println("47. Albums needed: " + totalAlbums);

        
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

        float totalCards = 94.0f;
        float cardsPerBox = 8.0f;
        int fillBoxes = (int)(totalCards / cardsPerBox);
        int totalCardsInt = 94;
        int cardsPerBoxInt = 8;
        int remainingCards = totalCardsInt % cardsPerBoxInt;
        System.out.println("48. p1. Boxes filled: " + fillBoxes);
        System.out.println("48. p2. Cards left: " + remainingCards);

        // Is there a mehtod that can coerce an int from a float?
        
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

        int totalBooksForShelves = 210;
        int totalShelves = 10;
        int booksPerShelf = totalBooksForShelves / totalShelves;
        System.out.println("49. Books per shelf: " + booksPerShelf);


        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

        float totalCroissants = 17.0f;
        float totalGuests = 7.0f;
        int croissantsPerGuest = (int)(totalCroissants / totalGuests);
        System.out.println("50. Criossants per guest: " + croissantsPerGuest);


        /*
            CHALLENGE PROBLEMS
        */
        
        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages 
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

        //float numberOfRooms = 5.0f;
        //float roomLength = 12.0f;
        //float roomWidth = 14.0f;
        //float roomZize = roomLength * roomWidth;
        //float totalSquareFootage = roomZize * numberOfRooms
        //float billRate = roomZize / 2.25;
        //float jillRate = roomZize / 1.90;
        //float combinedRate = billRate + jillRate;
        //float answer = totalSquareFootage / combinedRate
        System.out.println("***Challenge 1***:");
        System.out.println("Commented out");


        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B." 
        */

        String firstName = "Ben ";
        String middleI = "D.";
        String lastName = "Leder, ";
        System.out.println("***Challenge 2***:");
        System.out.println(lastName + firstName + middleI);


        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles. 
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */

        float distance = 800f;
        float travelled = 537f;
        int completed = (int)((travelled / distance)*100);
        System.out.println("***Challenge 3***:");
        System.out.println("Percent trip traveled: %" + completed);

 
            
	}

}
