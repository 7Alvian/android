package com.example.submission1;

import java.util.ArrayList;

public class BiasData {
    private static String[] biasName = {
            "Kang Seulgi",
            "Minatozaki Sana",
            "Son Seungwan",
            "Hirai Momo",
            "Park Chaeyong",
            "Kim Jisoo",
            "Bae Suzy",
            "Son Chaeyoung",
            "Bae Joo-hyun",
            "Lee Ji-eun"
    };

    private static String[] biasDetails = {
      //Seulgi
      "Seulgi (Korean name: Kang Seul-gi; Hangul: 강슬기, born on February 10, 1994) is a South-Korean singer, dancer and rapper. She is the lead vocalist, and main dancer of South-Korean girl group Red Velvet." +
              "\n\nOn August 1 2014, she finally debuted with Red Velvet. In January 2015, she starred in a musical arranged by the company entitled School Oz, playing the lead role of Dorothy. In July 2016, she released the song \"Don't Push Me\" with Wendy as part of the soundtrack of the KBS2 drama, Uncontrollably Fond. Seulgi, Wendy and other SM artists released a digital single titled \"Sound of Your Heart\" for SM Station on December 30.\n" +
              "\n" +
              "In January 2017, she released the song \"You're the Only One I See\" with Wendy as part of the soundtrack of the KBS2 drama, Hwarang: The Poet Warrior Youth. She also released a duet titled \"Darling U\" with Super Junior's Yesung on January 22, as part of SM Station.",
      //Sana
      "Sana Minatozaki (湊崎 紗夏 Minatozaki Sana), (Hangul: 사나), better known as Sana, is a Japanese singer, she is a member of Twice as a vocalist of the group." +
              "\n\nIn 2014, she appeared in the music video of Got7's \"A\" and Junho's \"Feel\", making her noticeable and likeable by the public eye.\n" +
              "\n" +
              "In 2015, Sana was a contestant on the TV Show Sixteen, she was one of sixteen female trainees in JYP Entertainment, who had to compete in singing, dancing and modelling, in order to become a member of JYP's upcoming girl group. At the end of the show, she was announced as a member of Twice.",

      //Wendy
      "Wendy Son (born February 21, 1994 in Seongbuk-dong, Seoul. South Korea), better known as Wendy, is a Korean singer. She is the main vocalist of the South-Korean girl group Red Velvet. " +
              "\n\nWendy has also collaborated with rapper Yuk Ji-dam for the song \"Return\", one of the OSTs of KBS2's drama Who Are You: School 2015. " +
              "The song was released on June 8, 2015 and debuted at #31 on the Gaon Singles Chart. She released another song \"Let You Know\" for the soundtrack of the JTBC drama D-Day on October 16. " +
              "\n\nOn January 9, 2016, she became a panelist on We Got Married. On King of Mask Singer (episode 43 aired on January 24, 2016), she participated as a contestant with the stage name \"Space Beauty Maetel\". " +
              "Wendy released a collaboration single with Eric Nam titled \"Spring Love\" on March 4, 2016, as part of S.M. Entertainment's SM Station project.",

      //Momo
      "Momo Hirai (Hangul: 히라이 모모, Japanese: 平井 もも／ひらい もも Hirai Momo, born November 9, 1996 in Kyotanabe, Kyoto, Japan), better known as Momo, is a Japanese singer. She is a member of the K-pop girl group, Twice." +
              "\n\nMomo was given the roles of a supporting vocalist, sub-rapper and a main dancer in Twice. In November 2015, Twice made their debut with the single \"Ooh-Aah\", and rose to the title of 'The Nation's Girl Group'.\n" +
              "\n" +
              "In the fall of 2016, Kim Hee-chul and Min Kyung-hoon released a digital single, \"Sweet Dream\", under SM Entertainment, with the music video starring Momo and the rest of the Knowing Bros cast.",

      //Rose
      "Roseanne Park (born February 11, 1997 in Auckland, New Zealand) better known as Rosé, is the main vocalist and lead dancer of South Korean girl group BLACKPINK." +
              "\n\nOn August 8th, 2016, Rosé made her debut under YG Entertainment, as a member of BLACKPINK. " +
              "On October 17th, 2018, YG announced that Rosé would be the next member to debut solo after Jennie. He further added on February 8th, 2019, that her solo track would be released after BLACKPINK's comeback with Kill This Love." +
              "\n\nRosé's voice has received acknowledgment in the K-Pop industry for its distinct vocal timbre. Following her debut as a member of Blackpink, Rosé's vocal colour was largely met with praise. Philippine critic Almira Blancada, writing for ABS-CBN, stated that \"it's hard to find an idol [singer] who stands out from the rest\" due to their \"common singing style\", " +
              "but \"you would know it's Rosé singing in a heartbeat\".Following Rosé's performance on an episode of Fantastic Duo 2, South Korean singer Gummy, who Rosé cited as a musical role model, stated that \"Rosé's voice is so unique, it's the [type of] voice young people love”. Rosé has also been acknowledged for having a wide vocal range. As a musician, " +
              "Rosé considers American singer Tori Kelly an inspiration on her musical style.",

      //Jisoo
      "Kim Ji-soo (Hangul: 김지수, born January 3, 1995 in Gunpo, Gyeonggi Province, South Korea), better known mononymously as Jisoo, is a South Korean singer and actress. She is a member of BLACKPINK." +
              "\n\nJisoo became a YG Entertainment trainee in August 2011, when she was 16 years old, she trained five years for her singing career. In August 2016, she became a member of BLACKPINK, as a main vocalist and visualist in the group.\n" +
              "\n" +
              "Before she became a trainee at YG, she was known by many for her beauty. She was very popular in school because of her beautiful face and talents. She used to study at the School Of Performing Arts High School. She eventually transferred schools when her family moved to Seoul, South Korea. \n" +
              "\n" +
              "In 2012, she was revealed through the “Who’s That Girl?” teaser by YG Entertainment, and it was followed with two photos in January of the next year.",

      //Suzy
      "Suzy (수지) is a South Korean singer and actress currently under Management SOOP. She was the maknae of the girl group miss A." +
              "\n\nIn March 2010, Suzy joined fellow members Fei and Jia to form the group miss A. The trio began their first official promotional activities in China as a group by signing up with the Samsung Electronics group in China. The group released a song used for the commercial called \"Love Again\" for the Samsung " +
              "Beat Festival. The song was written by Korean composer Super Changddai, and the music video was directed by Hong Won Ki. " +
              "\n\nThe group was later joined by a fourth member, Min. The four piece girl group eventually made their debut in July 2010 through JYP Entertainment, with the single \"Bad Girl Good Girl\" " +
              "After a successful promotion period of seven weeks, the group came back in October with a new title track, \"Breathe\", from the second singleStep Up. They promoted the song for a month and had their last goodbye stage on November 7. The group then returned in July 2011 with the release of their first full-length studio album A Class with the title track \"Good Bye Baby\".",

      //Chae
      "Son Chae-young (Hangul: 채영, born April 23, 1999 in Seoul, South Korea), better known by her first name, Chaeyoung, is a South Korean singer, rapper and dancer. A member of the girl group Twice, she was assigned the role of the group's main rapper." +
              "\n\nOn May 5, 2015, she became a contestant on JYP's newest survival show, SIXTEEN. She finished the survival in 7th place, hence becoming a member of the girl group TWICE.[1] They officially debuted on October 20, 2015 with their first mini album, The Story Begins.",
      //Irene
      "Bae Joo-hyun (Hangul: 배주현, born on March 29, 1991), also known as Irene, is a South-Korean singer, dancer, rapper and television personality. She is the leader, sub vocal, lead dancer, main rapper, face, visual and center of South-Korean girl group Red Velvet. " +
              "\n\nOn August 1, 2014, she finally debuted with Red Velvet. She was assigned to represent the color pink. In November 2014, she appeared in the music video for Cho Kyuhyun's single \"At Gwanghwamun\". From May 1, 2015 to June 24, 2016, Irene hosted Music Bank with model Park Bo-gum.\n" +
              "\n" +
              "Irene made her acting debut with web drama 'The Female Employees of a Game Company' as the female lead A-reum. On October 14, Irene became a host of OnStyle's fashion show Laundry Day. The show premiered on October 22, 2016. In the same month, she became a panelist on the KBS show Trick & True with band mate Wendy.",

      //IU
      "IU (아이유) is a South Korean singer-songwriter and actress under Kakao M. She debuted on September 18, 2008 with her debut stage on M Countdown for the song \"Lost Child\". Her stage name is derived from the phrase \"I and You\", symbolizing that people can become one through music." +
              "\n\nIU debuted on Mnet M! Countdown on September 18, 2008 with her debut single \"Lost Child\". It was later released as the title track for her debut mini album Lost and Found on September 24, 2008. However, she did not gain mainstream popularity until her follow-up and debut studio album Growing Up.",
    };

    private static String[] biasFullname = {
        "Kang Seul Gi (강슬기)",
        "Minatozaki Sana (ミナトサキ・サナ)",
        "Song Seung Wan (손승완)",
        "Hirai Momo (平井もも)",
        "Park Chaeyoung (박채영)",
        "Kim Jisoo (김지수)",
        "Bae Suzy (배수지)",
        "Son Chae Young (손채영)",
        "Bae Joo Hyun (배주현)",
        "Lee Ji Eun (이지은)"
    };

    private static String[] biasBirth = {
        "February 10, 1994",
        "December 29, 1996",
        "February 21, 1994",
        "November 9, 1996",
        "February 11, 1997",
        "January 3, 1995",
        "October 10, 1994",
        "April 23, 1999",
        "March 29, 1991",
        "May 16, 1993"
    };

    private static String[] biasWeight = {
            "42kg",
            "48kg",
            "40kg",
            "48kg",
            "46kg",
            "45kg",
            "46kg",
            "48kg",
            "44kg",
            "60kg",
    };

    private static String[] biasHeight = {
            "162cm",
            "163cm",
            "160cm",
            "162cm",
            "168cm",
            "162cm",
            "168cm",
            "159cm",
            "160cm",
            "160cm"
    };

    private static int[] biasImage = {
      R.drawable.seulgi,
      R.drawable.sana,
      R.drawable.wendy,
      R.drawable.momo,
      R.drawable.rose,
      R.drawable.jisoo,
      R.drawable.suzy,
      R.drawable.chae,
      R.drawable.irene,
      R.drawable.iu
    };

    static ArrayList<Bias> getListData(){
        ArrayList<Bias> list = new ArrayList<>();
        for (int position = 0; position <biasName.length;position++){
            Bias bias = new Bias();
            bias.setName(biasName[position]);
            bias.setDetail(biasDetails[position]);
            bias.setPhoto(biasImage[position]);
            bias.setFullName(biasFullname[position]);
            bias.setBirth(biasBirth[position]);
            bias.setHeight(biasHeight[position]);
            bias.setWeight(biasWeight[position]);
            list.add(bias);
        }
        return list;
    }
}
