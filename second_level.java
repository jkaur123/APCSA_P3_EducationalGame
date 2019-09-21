import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worldy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class second_level extends World
{
    public second_level()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1);

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        //getWorld().removeObject(wrong_ant);
        
        
        Label q1 = new Label ("What is 20 x 0?", 50);
        
        Label question1answera = new Label ("0", 35);
        Label question1answerb = new Label ("20", 35);
        Label question1answerc = new Label ("1", 35);
        Label question1answerd = new Label ("2", 35);
        
        q1.setFillColor(Color.BLACK);
        q1.setLineColor(Color.WHITE);
        addObject(q1, 300, 100);
        

        
        Ant ant = new Ant();
        addObject(ant,350,325);
        question1answera.setFillColor(Color.WHITE);
        question1answera.setLineColor(Color.BLACK);
        addObject(question1answera, 350,325);
        
        Wrong_ant wrong_ant = new Wrong_ant();
        addObject(wrong_ant,500,625);
        question1answerb.setFillColor(Color.WHITE);
        question1answerb.setLineColor(Color.BLACK);
        addObject(question1answerb, 500,625);
        
        Wrong_ant wrong_ant1 = new Wrong_ant();
        addObject(wrong_ant1,650,625);
        question1answerc.setFillColor(Color.WHITE);
        question1answerc.setLineColor(Color.BLACK);
        addObject(question1answerc, 650,625);
        
        Wrong_ant wrong_ant2 = new Wrong_ant();
        addObject(wrong_ant2,700,425);
        question1answerd.setFillColor(Color.WHITE);
        question1answerd.setLineColor(Color.BLACK);
        addObject(question1answerd, 700,425);
        
        Ground ground100 = new Ground();
        addObject(ground100, 700, 445);
        
        
        
        //wrong_ant.setLocation(712,374);
        //Wrong_ant wrong_ant2 = new Wrong_ant();
        //addObject(wrong_ant2,568,380);
        //wrong_ant2.setLocation(559,373);
        //Wrong_ant wrong_ant3 = new Wrong_ant();
        //addObject(wrong_ant3,600,600);
        //wrong_ant3.setLocation(680,215);
        //Ant ant = new Ant();
        //addObject(ant,500,625);
        Wall wall = new Wall();
        addObject(wall, 32, 382);
        Wall wall2 = new Wall();
        addObject(wall2, 93, 373);
        Wall wall3 = new Wall();
        addObject(wall3, 153, 361);
        Wall wall4 = new Wall();
        addObject(wall4, 249, 347);
        Wall wall5 = new Wall();
        addObject(wall5, 306, 344);
        Wall wall6 = new Wall();
        addObject(wall6, 397, 335);
        Wall wall7 = new Wall();
        addObject(wall7, 501, 333);
        Wall wall8 = new Wall();
        addObject(wall8, 562, 338);
        Wall wall9 = new Wall();
        addObject(wall9, 428, 273);
        Wall wall10 = new Wall();
        addObject(wall10, 334, 273);
        Wall wall11 = new Wall();
        addObject(wall11, 207, 267);
        wall.setLocation(25, 376);
        wall2.setLocation(75, 376);
        wall3.setLocation(125, 376);
        wall4.setLocation(175, 376);
        wall11.setLocation(225, 376);
        wall5.setLocation(275, 376);
        wall10.setLocation(325, 376);
        P2 p2 = new P2();
        addObject(p2, 133, 321);
        wall6.setLocation(375, 376);
        wall9.setLocation(425, 376);
        wall7.setLocation(475, 376);
        wall8.setLocation(525, 376);
        Wall wall12 = new Wall();
        addObject(wall12, 584, 384);
        wall12.setLocation(575, 376);
        Wall wall13 = new Wall();
        addObject(wall13, 283, 331);
        wall13.setLocation(275, 326);
        Wall wall14 = new Wall();
        addObject(wall14, 346, 314);
        Wall wall15 = new Wall();
        addObject(wall15, 423, 310);
        Wall wall16 = new Wall();
        addObject(wall16, 346, 233);
        wall14.setLocation(325, 326);
        wall15.setLocation(375, 326);
        wall16.setLocation(425, 326);
        wall16.setLocation(325, 276);
        Wall wall17 = new Wall();
        addObject(wall17, 433, 283);
        wall17.setLocation(425, 276);
        Wall wall18 = new Wall();
        addObject(wall18, 433, 215);
        wall18.setLocation(425, 226);
        removeObject(wall17);
        Ground ground = new Ground();
        addObject(ground, 242, 315);
        ground.setLocation(235, 308);
        Ground ground2 = new Ground();
        addObject(ground2, 161, 314);
        Ground ground3 = new Ground();
        addObject(ground3, 100, 313);
        Ground ground4 = new Ground();
        addObject(ground4, 105, 275);
        ground2.setLocation(205, 319);
        ground3.setLocation(175, 331);
        ground4.setLocation(145, 343);
        p2.setLocation(80, 319);
        Wall wall19 = new Wall();
        addObject(wall19, 33, 332);
        wall19.setLocation(25, 326);
        Wall wall20 = new Wall();
        addObject(wall20, 31, 283);
        Wall wall21 = new Wall();
        addObject(wall21, 29, 220);
        Wall wall22 = new Wall();
        addObject(wall22, 39, 156);
        Wall wall23 = new Wall();
        addObject(wall23, 34, 100);
        Wall wall24 = new Wall();
        addObject(wall24, 43, 46);
        Wall wall25 = new Wall();
        addObject(wall25, 127, 122);
        wall20.setLocation(25, 276);
        wall21.setLocation(25, 226);
        wall22.setLocation(25, 176);
        wall23.setLocation(25, 126);
        wall24.setLocation(25, 76);
        wall25.setLocation(25, 25);
        wall24.setLocation(25, 75);
        wall23.setLocation(25, 125);
        wall22.setLocation(25, 175);
        wall21.setLocation(25, 225);
        wall20.setLocation(25, 275);
        wall19.setLocation(25, 326);
        wall.setLocation(25, 375);
        wall19.setLocation(25, 325);
        wall2.setLocation(75, 375);
        wall3.setLocation(125, 375);
        wall4.setLocation(175, 375);
        wall11.setLocation(225, 375);
        wall5.setLocation(275, 375);
        wall10.setLocation(325, 375);
        wall6.setLocation(375, 375);
        wall9.setLocation(425, 375);
        wall7.setLocation(475, 375);
        wall8.setLocation(525, 375);
        wall12.setLocation(575, 375);
        ground4.setLocation(145, 342);
        ground3.setLocation(175, 330);
        ground2.setLocation(205, 318);
        ground.setLocation(235, 307);
        wall13.setLocation(275, 325);
        wall14.setLocation(325, 325);
        wall15.setLocation(375, 325);
        wall16.setLocation(325, 275);
        wall18.setLocation(425, 225);
        Wall wall26 = new Wall();
        addObject(wall26, 569, 314);
        wall26.setLocation(575, 325);
        Wall wall27 = new Wall();
        addObject(wall27, 577, 273);
        Wall wall28 = new Wall();
        addObject(wall28, 572, 216);
        Wall wall29 = new Wall();
        addObject(wall29, 571, 158);
        Wall wall30 = new Wall();
        addObject(wall30, 560, 110);
        Wall wall31 = new Wall();
        addObject(wall31, 560, 66);
        Wall wall32 = new Wall();
        addObject(wall32, 555, 17);
        wall27.setLocation(575, 275);
        wall28.setLocation(575, 225);
        wall29.setLocation(575, 176);
        wall30.setLocation(575, 126);
        wall31.setLocation(575, 76);
        wall32.setLocation(575, 25);
        wall31.setLocation(575, 75);
        wall30.setLocation(575, 125);
        wall29.setLocation(576, 174);
        wall29.setLocation(575, 174);
        wall28.setLocation(575, 224);
        wall27.setLocation(575, 274);
        wall26.setLocation(575, 325);
        wall27.setLocation(575, 275);
        wall28.setLocation(575, 225);
        wall29.setLocation(575, 175);
        Wall wall33 = new Wall();
        addObject(wall33, 237, 63);
        wall33.setLocation(99, 29);
        wall33.setLocation(74, 25);
        wall33.setLocation(75, 25);
        Wall wall34 = new Wall();
        addObject(wall34, 166, 39);
        wall34.setLocation(125, 25);
        Wall wall35 = new Wall();
        addObject(wall35, 197, 37);
        wall35.setLocation(175, 24);
        wall35.setLocation(175, 25);
        Wall wall36 = new Wall();
        addObject(wall36, 227, 37);
        wall36.setLocation(225, 25);
        Wall wall37 = new Wall();
        addObject(wall37, 290, 63);
        wall37.setLocation(275, 25);
        Wall wall38 = new Wall();
        addObject(wall38, 340, 67);
        wall38.setLocation(325, 25);
        Wall wall39 = new Wall();
        addObject(wall39, 369, 79);
        wall39.setLocation(375, 25);
        Wall wall40 = new Wall();
        addObject(wall40, 458, 89);
        wall40.setLocation(425, 25);
        Wall wall41 = new Wall();
        addObject(wall41, 497, 87);
        wall41.setLocation(475, 25);
        Wall wall42 = new Wall();
        addObject(wall42, 497, 87);
        wall42.setLocation(525, 25);
        Wall wall43 = new Wall();
        addObject(wall43, 432, 182);
        wall43.setLocation(425, 175);
        Wall wall44 = new Wall();
        addObject(wall44, 426, 120);
        wall44.setLocation(425, 125);
        wall43.setLocation(475, 274);
        wall44.setLocation(525, 274);
        wall44.setLocation(525, 275);
        wall43.setLocation(475, 275);
        wall43.setLocation(475, 275);
        Wall wall45 = new Wall();
        addObject(wall45, 476, 212);
        wall45.setLocation(475, 225);
        removeObject(wall45);
        Wall wall46 = new Wall();
        addObject(wall46, 331, 230);
        wall46.setLocation(325, 225);
        Wall wall47 = new Wall();
        addObject(wall47, 334, 167);
        wall47.setLocation(325, 175);
        removeObject(wall46);
        Ground ground5 = new Ground();
        addObject(ground5, 342, 164);
        ground5.setLocation(335, 157);
        Ground ground6 = new Ground();
        addObject(ground6, 308, 159);
        wall47.setLocation(323, 173);
        wall47.setLocation(325, 175);
        Ground ground7 = new Ground();
        addObject(ground7, 316, 202);
        ground7.setLocation(330, 212);
        removeObject(ground7);
        ground6.setLocation(315, 157);
        Wall wall48 = new Wall();
        addObject(wall48, 325, 224);
        wall48.setLocation(325, 225);
        removeObject(wall48);
        removeObject(wall47);
        Wall wall49 = new Wall();
        addObject(wall49, 254, 182);
        wall49.setLocation(275, 175);
        Ground ground8 = new Ground();
        addObject(ground8, 289, 164);
        Ground ground9 = new Ground();
        addObject(ground9, 248, 167);
        ground8.setLocation(285, 157);
        ground9.setLocation(265, 157);
        ground9.setLocation(265, 157);
        removeObject(wall49);
        Ground ground10 = new Ground();
        addObject(ground10, 531, 236);
        ground10.setLocation(527, 226);
        ground10.setLocation(525, 226);
        ground10.setLocation(525, 225);
        Ground ground11 = new Ground();
        addObject(ground11, 515, 165);
        ground11.setLocation(525, 194);
        Ground ground12 = new Ground();
        addObject(ground12, 519, 159);
        ground12.setLocation(525, 159);
        ground11.setLocation(525, 193);
        ground12.setLocation(525, 158);
        ground12.setLocation(525, 157);
        ground11.setLocation(525, 192);
        Ground ground13 = new Ground();
        addObject(ground13, 497, 144);
        ground13.setLocation(491, 141);
        ground13.setLocation(495, 142);
        Ground ground14 = new Ground();
        addObject(ground14, 468, 124);
        ground14.setLocation(465, 127);
        Ground ground15 = new Ground();
        addObject(ground15, 432, 124);
        ground15.setLocation(435, 112);
        Ground ground16 = new Ground();
        addObject(ground16, 410, 114);
        ground16.setLocation(405, 98);
        Wall wall50 = new Wall();
        addObject(wall50, 365, 132);
        wall50.setLocation(369, 125);
        ground16.setLocation(405, 107);
        ground15.setLocation(435, 117);
        ground14.setLocation(465, 129);
        ground15.setLocation(435, 118);
        ground15.setLocation(435, 119);
        ground14.setLocation(465, 130);
        ground15.setLocation(435, 120);
        ground14.setLocation(465, 131);
        ground13.setLocation(495, 143);
        ground13.setLocation(495, 143);
        wall50.setLocation(375, 130);
        Ground ground17 = new Ground();
        addObject(ground17, 385, 113);
        ground17.setLocation(382, 107);
        ground17.setLocation(365, 107);
        Ground ground18 = new Ground();
        addObject(ground18, 387, 115);
        ground18.setLocation(386, 107);
        removeObject(ground17);
        Ground ground19 = new Ground();
        addObject(ground19, 368, 130);
        ground19.setLocation(365, 107);
        wall50.setLocation(351, 247);
        removeObject(wall50);
        Ground ground20 = new Ground();
        addObject(ground20, 297, 94);
        ground20.setLocation(323, 121);
        removeObject(ground20);
        Wall wall51 = new Wall();
        addObject(wall51, 232, 182);
        wall51.setLocation(222, 174);
        wall51.setLocation(225, 175);
        wall2.setLocation(25, 425);
        wall3.setLocation(25, 475);
        wall4.setLocation(25, 525);
        wall11.setLocation(25, 575);
        wall5.setLocation(25, 625);
        wall10.setLocation(25, 675);
        wall6.setLocation(375, 375);
        wall6.setLocation(375, 375);
        wall6.setLocation(375, 375);
        wall6.setLocation(375, 375);
        wall6.setLocation(375, 375);
        wall6.setLocation(375, 375);
        wall6.setLocation(375, 375);
        wall6.setLocation(74, 675);
        wall9.setLocation(124, 675);
        wall6.setLocation(75, 675);
        wall9.setLocation(125, 675);
        wall7.setLocation(475, 375);
        wall7.setLocation(475, 375);
        wall7.setLocation(475, 375);
        wall7.setLocation(475, 375);
        wall7.setLocation(475, 375);
        wall7.setLocation(175, 675);
        wall8.setLocation(225, 675);
        wall12.setLocation(575, 375);
        wall12.setLocation(575, 375);
        wall12.setLocation(575, 375);
        wall12.setLocation(275, 675);
        wall26.setLocation(325, 675);
        wall43.setLocation(475, 275);
        wall27.setLocation(375, 675);
        wall28.setLocation(425, 675);
        wall29.setLocation(475, 675);
        wall30.setLocation(525, 675);
        wall31.setLocation(575, 675);
        Wall wall52 = new Wall();
        addObject(wall52, 634, 571);
        Wall wall53 = new Wall();
        addObject(wall53, 743, 590);
        Wall wall54 = new Wall();
        addObject(wall54, 709, 522);
        Wall wall55 = new Wall();
        addObject(wall55, 813, 540);
        Wall wall56 = new Wall();
        addObject(wall56, 862, 598);
        Wall wall57 = new Wall();
        addObject(wall57, 912, 528);
        Wall wall58 = new Wall();
        addObject(wall58, 974, 596);
        wall52.setLocation(625, 675);
        wall54.setLocation(709, 522);
        wall54.setLocation(675, 675);
        wall53.setLocation(725, 675);
        wall55.setLocation(775, 675);
        wall56.setLocation(825, 675);
        wall57.setLocation(875, 675);
        wall58.setLocation(925, 675);
        Wall wall59 = new Wall();
        addObject(wall59, 917, 608);
        wall59.setLocation(975, 675);
        Wall wall60 = new Wall();
        addObject(wall60, 953, 636);
        Wall wall61 = new Wall();
        addObject(wall61, 979, 580);
        Wall wall62 = new Wall();
        addObject(wall62, 925, 543);
        Wall wall63 = new Wall();
        addObject(wall63, 983, 504);
        Wall wall64 = new Wall();
        addObject(wall64, 925, 459);
        Wall wall65 = new Wall();
        addObject(wall65, 973, 406);
        Wall wall66 = new Wall();
        addObject(wall66, 919, 359);
        Wall wall67 = new Wall();
        addObject(wall67, 965, 308);
        Wall wall68 = new Wall();
        addObject(wall68, 916, 276);
        Wall wall69 = new Wall();
        addObject(wall69, 960, 223);
        Wall wall70 = new Wall();
        addObject(wall70, 916, 181);
        Wall wall71 = new Wall();
        addObject(wall71, 968, 153);
        Wall wall72 = new Wall();
        addObject(wall72, 915, 109);
        Wall wall73 = new Wall();
        addObject(wall73, 968, 63);
        wall73.setLocation(975, 25);
        wall73.setLocation(975, 25);
        wall72.setLocation(975, 75);
        wall71.setLocation(976, 125);
        wall70.setLocation(924, 181);
        wall71.setLocation(975, 125);
        wall70.setLocation(975, 175);
        wall69.setLocation(975, 225);
        wall68.setLocation(975, 275);
        wall67.setLocation(975, 325);
        wall66.setLocation(975, 375);
        wall65.setLocation(975, 425);
        wall64.setLocation(975, 475);
        wall63.setLocation(975, 525);
        wall63.setLocation(975, 525);
        wall61.setLocation(975, 575);
        wall60.setLocation(975, 625);
        wall62.setLocation(925, 25);
        Wall wall74 = new Wall();
        addObject(wall74, 879, 88);
        Wall wall75 = new Wall();
        addObject(wall75, 833, 35);
        Wall wall76 = new Wall();
        addObject(wall76, 789, 107);
        Wall wall77 = new Wall();
        addObject(wall77, 724, 28);
        Wall wall78 = new Wall();
        addObject(wall78, 690, 109);
        Wall wall79 = new Wall();
        addObject(wall79, 649, 39);
        wall79.setLocation(625, 25);
        wall78.setLocation(675, 25);
        wall77.setLocation(725, 24);
        wall77.setLocation(725, 25);
        wall76.setLocation(777, 22);
        wall76.setLocation(775, 25);
        wall75.setLocation(825, 25);
        wall74.setLocation(875, 25);
        wall13.setLocation(275, 625);
        wall14.setLocation(325, 625);
        wall15.setLocation(375, 625);
        wall16.setLocation(325, 575);
        ground.setLocation(235, 607);
        ground2.setLocation(205, 618);
        ground3.setLocation(175, 631);
        ground4.setLocation(145, 643);
        ground4.setLocation(145, 642);
        ground3.setLocation(175, 630);
        wall43.setLocation(433, 518);
        Wall wall80 = new Wall();
        addObject(wall80, 440, 612);
        wall80.setLocation(375, 575);
        wall43.setLocation(425, 525);
        wall80.setLocation(375, 475);
        wall18.setLocation(475, 525);
        wall18.setLocation(485, 525);
        wall43.setLocation(425, 525);
        wall80.setLocation(475, 575);
        wall18.setLocation(525, 575);
        wall44.setLocation(525, 525);
        wall51.setLocation(525, 475);
        wall44.setLocation(236, 337);
        ground10.setLocation(531, 417);
        wall44.setLocation(525, 425);
        ground10.setLocation(535, 407);
        ground10.setLocation(600, 482);
        wall51.setLocation(382, 377);
        wall44.setLocation(523, 469);
        wall51.setLocation(368, 434);
        wall44.setLocation(525, 525);
        ground10.setLocation(529, 428);
        wall44.setLocation(575, 575);
        wall51.setLocation(477, 476);
        wall44.setLocation(526, 437);
        wall51.setLocation(575, 575);
        wall44.setLocation(627, 425);
        Wall wall81 = new Wall();
        addObject(wall81, 681, 558);
        wall81.setLocation(625, 575);
        wall44.setLocation(625, 525);
        ground10.setLocation(626, 507);
        ground10.setLocation(625, 507);
        wall44.setLocation(625, 475);
        ground11.setLocation(625, 457);
        wall44.setLocation(624, 425);
        wall44.setLocation(625, 425);
        ground12.setLocation(625, 407);
        wall44.setLocation(404, 355);
        ground13.setLocation(595, 392);
        ground14.setLocation(565, 378);
        wall44.setLocation(555, 375);
        ground15.setLocation(536, 363);
        ground15.setLocation(533, 364);
        ground15.setLocation(535, 363);
        ground16.setLocation(505, 348);
        Wall wall82 = new Wall();
        addObject(wall82, 440, 341);
        wall82.setLocation(555, 325);
        Wall wall83 = new Wall();
        addObject(wall83, 469, 322);
        wall83.setLocation(505, 325);
        wall82.setLocation(455, 375);
        Wall wall84 = new Wall();
        addObject(wall84, 398, 381);
        wall84.setLocation(586, 220);
        wall83.setLocation(405, 375);
        ground18.setLocation(475, 333);
        wall44.setLocation(555, 375);
        wall44.setLocation(538, 455);
        ground18.setLocation(805, 539);
        ground18.setLocation(475, 348);
        wall44.setLocation(505, 375);
        wall82.setLocation(455, 375);
        ground16.setLocation(505, 357);
        ground15.setLocation(535, 369);
        ground14.setLocation(565, 380);
        ground14.setLocation(565, 381);
        ground15.setLocation(535, 370);
        ground18.setLocation(475, 357);
        wall82.setLocation(396, 421);
        ground18.setLocation(495, 357);
        wall44.setLocation(455, 375);
        wall82.setLocation(355, 375);
        ground5.setLocation(757, 587);
        ground5.setLocation(764, 642);
        ground19.setLocation(783, 642);
        wall82.setLocation(775, 621);
        ground19.setLocation(785, 642);
        ground5.setLocation(765, 642);
        wall82.setLocation(775, 610);
        ground19.setLocation(735, 638);
        ground5.setLocation(785, 642);
        ground19.setLocation(765, 642);
        wall82.setLocation(690, 585);
        ground6.setLocation(775, 627);
        ground9.setLocation(815, 642);
        ground8.setLocation(805, 627);
        p2.setLocation(100, 621);
        wall84.setLocation(925, 625);
        wall84.setLocation(441, 456);
        wall84.setLocation(355, 375);
        wall82.setLocation(675, 575);
        Wall wall85 = new Wall();
        addObject(wall85, 43, 46);
        wall85.setLocation(856, 618);
        wall85.turn(20);
    }
}
