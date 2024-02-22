package com.wilb3r.data.remote.mock

import com.google.gson.Gson
import com.wilb3r.domain.model.result.TopStoriesDto

object DataProvider {
    private val TopStories = """
        {
            "status": "OK",
            "copyright": "Copyright (c) 2024 The New York Times Company. All Rights Reserved.",
            "section": "home",
            "last_updated": "2024-02-18T22:07:25-05:00",
            "num_results": 21,
            "results": [
                {
                    "section": "world",
                    "subsection": "europe",
                    "title": "Navalny’s Death Shocked the World, but Will It Galvanize Opposition to Putin?",
                    "abstract": "His death united world leaders and demonstrators in grief, but it also left Russia without a charismatic counterweight to its leader’s increasingly repressive policies.",
                    "url": "https://www.nytimes.com/2024/02/18/world/europe/navalny-putin-russia-legacy.html",
                    "uri": "nyt://article/d4d3166f-eaa4-56f8-915b-5ff9933275da",
                    "byline": "By Mark Landler",
                    "item_type": "Article",
                    "updated_date": "2024-02-18T20:06:01-05:00",
                    "created_date": "2024-02-18T12:58:30-05:00",
                    "published_date": "2024-02-18T12:58:30-05:00",
                    "material_type_facet": "",
                    "kicker": "",
                    "des_facet": [
                        "Political Prisoners"
                    ],
                    "org_facet": [
                        "European Union",
                        "Republican Party"
                    ],
                    "per_facet": [
                        "Navalnaya, Yulia B",
                        "Navalny, Aleksei A",
                        "Putin, Vladimir V"
                    ],
                    "geo_facet": [
                        "Russia"
                    ],
                    "multimedia": [
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18navalny-galvanize-zvwk/18navalny-galvanize-zvwk-superJumbo.jpg",
                            "format": "Super Jumbo",
                            "height": 1365,
                            "width": 2048,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "An image of Aleksei Navalny projected on the Russian Embassy in London on Friday.",
                            "copyright": "Peter Nicholls/Reuters"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18navalny-galvanize-zvwk/18navalny-galvanize-zvwk-threeByTwoSmallAt2X.jpg",
                            "format": "threeByTwoSmallAt2X",
                            "height": 400,
                            "width": 600,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "An image of Aleksei Navalny projected on the Russian Embassy in London on Friday.",
                            "copyright": "Peter Nicholls/Reuters"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18navalny-galvanize-zvwk/18navalny-galvanize-zvwk-thumbLarge.jpg",
                            "format": "Large Thumbnail",
                            "height": 150,
                            "width": 150,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "An image of Aleksei Navalny projected on the Russian Embassy in London on Friday.",
                            "copyright": "Peter Nicholls/Reuters"
                        }
                    ],
                    "short_url": ""
                },
                {
                    "section": "world",
                    "subsection": "europe",
                    "title": "Arrested for Leaving Flowers, Navalny Mourners Fear Worse to Come",
                    "abstract": "At least 366 people were detained over the weekend, leading to concern that the arrests could signal greater government repression ahead of Russia’s elections in March.",
                    "url": "https://www.nytimes.com/2024/02/18/world/europe/russia-arrests-navalny-memorials.html",
                    "uri": "nyt://article/ac582051-44d7-5906-acd3-ada0143b84c0",
                    "byline": "By Valerie Hopkins",
                    "item_type": "Article",
                    "updated_date": "2024-02-18T21:45:24-05:00",
                    "created_date": "2024-02-18T18:35:05-05:00",
                    "published_date": "2024-02-18T18:35:05-05:00",
                    "material_type_facet": "",
                    "kicker": "",
                    "des_facet": [
                        "Political Prisoners"
                    ],
                    "org_facet": [],
                    "per_facet": [
                        "Navalny, Aleksei A",
                        "Putin, Vladimir V"
                    ],
                    "geo_facet": [
                        "Russia"
                    ],
                    "multimedia": [
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18RUSSIA-REPRESSION-hbwz/18RUSSIA-REPRESSION-hbwz-superJumbo.jpg",
                            "format": "Super Jumbo",
                            "height": 1365,
                            "width": 2048,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "A police officer stood guard at the Wall of Sorrow in Moscow, where Russians paid tribute to Alexei A. Navalny on Sunday.",
                            "copyright": "Alexander Zemlianichenko/Associated Press"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18RUSSIA-REPRESSION-hbwz/18RUSSIA-REPRESSION-hbwz-threeByTwoSmallAt2X.jpg",
                            "format": "threeByTwoSmallAt2X",
                            "height": 400,
                            "width": 600,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "A police officer stood guard at the Wall of Sorrow in Moscow, where Russians paid tribute to Alexei A. Navalny on Sunday.",
                            "copyright": "Alexander Zemlianichenko/Associated Press"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18RUSSIA-REPRESSION-hbwz/18RUSSIA-REPRESSION-hbwz-thumbLarge.jpg",
                            "format": "Large Thumbnail",
                            "height": 150,
                            "width": 150,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "A police officer stood guard at the Wall of Sorrow in Moscow, where Russians paid tribute to Alexei A. Navalny on Sunday.",
                            "copyright": "Alexander Zemlianichenko/Associated Press"
                        }
                    ],
                    "short_url": ""
                },
                {
                    "section": "movies",
                    "subsection": "",
                    "title": "Life Imitates Art as a ‘Master and Margarita’ Movie Stirs Russia",
                    "abstract": "An American director’s adaptation of the beloved novel is resonating with moviegoers, who may recognize some similarities in its satire of authoritarian rule.",
                    "url": "https://www.nytimes.com/2024/02/16/movies/master-and-margarita-movie-russia-reaction.html",
                    "uri": "nyt://article/c62e8544-c9bd-5d19-b60e-e80e35b8b8e3",
                    "byline": "By Paul Sonne",
                    "item_type": "Article",
                    "updated_date": "2024-02-18T18:29:34-05:00",
                    "created_date": "2024-02-16T00:01:41-05:00",
                    "published_date": "2024-02-16T00:01:41-05:00",
                    "material_type_facet": "",
                    "kicker": "",
                    "des_facet": [
                        "The Master and Margarita (Book)",
                        "Movies",
                        "Censorship"
                    ],
                    "org_facet": [
                        "Universal Pictures"
                    ],
                    "per_facet": [
                        "Bulgakov, Mikhail",
                        "Putin, Vladimir V",
                        "Diehl, August"
                    ],
                    "geo_facet": [
                        "Russia"
                    ],
                    "multimedia": [
                        {
                            "url": "https://static01.nyt.com/images/2024/02/19/multimedia/15russia-movia-01-lmbq/15russia-movia-01-lmbq-superJumbo.jpg",
                            "format": "Super Jumbo",
                            "height": 1365,
                            "width": 2048,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Yevgeny Tsyganov as the Master in “The Master and Margarita,” which has been a hit at the Russian box office.",
                            "copyright": "Mars Media"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/19/multimedia/15russia-movia-01-lmbq/15russia-movia-01-lmbq-threeByTwoSmallAt2X.jpg",
                            "format": "threeByTwoSmallAt2X",
                            "height": 400,
                            "width": 600,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Yevgeny Tsyganov as the Master in “The Master and Margarita,” which has been a hit at the Russian box office.",
                            "copyright": "Mars Media"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/19/multimedia/15russia-movia-01-lmbq/15russia-movia-01-lmbq-thumbLarge.jpg",
                            "format": "Large Thumbnail",
                            "height": 150,
                            "width": 150,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Yevgeny Tsyganov as the Master in “The Master and Margarita,” which has been a hit at the Russian box office.",
                            "copyright": "Mars Media"
                        }
                    ],
                    "short_url": ""
                },
                {
                    "section": "us",
                    "subsection": "politics",
                    "title": "For Harris, Promises to Ukraine Prove Harder to Make Amid G.O.P. Resistance",
                    "abstract": "Vice President Kamala Harris tried to reassure European and Ukrainian leaders that America would come through with security aid. But worries persist as House Republican leaders block the measure.",
                    "url": "https://www.nytimes.com/2024/02/18/us/politics/kamala-harris-ukraine-munich.html",
                    "uri": "nyt://article/55fb8e00-0926-59cb-a032-37effbb5f8e4",
                    "byline": "By Peter Baker",
                    "item_type": "Article",
                    "updated_date": "2024-02-18T12:21:36-05:00",
                    "created_date": "2024-02-18T12:21:36-05:00",
                    "published_date": "2024-02-18T12:21:36-05:00",
                    "material_type_facet": "",
                    "kicker": "White House Memo",
                    "des_facet": [
                        "United States Politics and Government",
                        "International Relations",
                        "United States International Relations",
                        "Russian Invasion of Ukraine (2022)"
                    ],
                    "org_facet": [
                        "North Atlantic Treaty Organization",
                        "Republican Party",
                        "House of Representatives"
                    ],
                    "per_facet": [
                        "Biden, Joseph R Jr",
                        "Harris, Kamala D",
                        "Johnson, Mike (1972- )",
                        "Navalny, Aleksei A",
                        "Putin, Vladimir V",
                        "Trump, Donald J",
                        "Zelensky, Volodymyr"
                    ],
                    "geo_facet": [
                        "Ukraine",
                        "Russia"
                    ],
                    "multimedia": [
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18dc-memo1-lmhw/18dc-memo1-lmhw-superJumbo.jpg",
                            "format": "Super Jumbo",
                            "height": 1365,
                            "width": 2048,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Vice President Kamala Harris with President Volodymyr Zelensky of Ukraine at the Munich Security Conference, where Ms. Harris tried to reassure nervous Ukrainians and Europeans of her administration’s resolve on aid for Kyiv.",
                            "copyright": "Pool photo by Tobias Schwarz"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18dc-memo1-lmhw/18dc-memo1-lmhw-threeByTwoSmallAt2X.jpg",
                            "format": "threeByTwoSmallAt2X",
                            "height": 400,
                            "width": 600,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Vice President Kamala Harris with President Volodymyr Zelensky of Ukraine at the Munich Security Conference, where Ms. Harris tried to reassure nervous Ukrainians and Europeans of her administration’s resolve on aid for Kyiv.",
                            "copyright": "Pool photo by Tobias Schwarz"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18dc-memo1-lmhw/18dc-memo1-lmhw-thumbLarge-v2.jpg",
                            "format": "Large Thumbnail",
                            "height": 150,
                            "width": 150,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Vice President Kamala Harris with President Volodymyr Zelensky of Ukraine at the Munich Security Conference, where Ms. Harris tried to reassure nervous Ukrainians and Europeans of her administration’s resolve on aid for Kyiv.",
                            "copyright": "Pool photo by Tobias Schwarz"
                        }
                    ],
                    "short_url": ""
                },
                {
                    "section": "us",
                    "subsection": "politics",
                    "title": "Republicans Push Hard Line on Russia While Defending Trump’s NATO Comments",
                    "abstract": "Fearful of antagonizing the former president, congressional Republicans downplayed the remarks, instead lauding the former president’s record and criticizing President Biden.",
                    "url": "https://www.nytimes.com/2024/02/18/us/politics/republicans-trump-russia.html",
                    "uri": "nyt://article/7d2d9eff-8b51-5ad9-ade9-c78beafa5217",
                    "byline": "By Annie Karni",
                    "item_type": "Article",
                    "updated_date": "2024-02-18T16:52:44-05:00",
                    "created_date": "2024-02-18T14:39:43-05:00",
                    "published_date": "2024-02-18T14:39:43-05:00",
                    "material_type_facet": "",
                    "kicker": "",
                    "des_facet": [
                        "United States Politics and Government",
                        "Presidential Election of 2024",
                        "Russian Invasion of Ukraine (2022)",
                        "Foreign Aid"
                    ],
                    "org_facet": [
                        "House of Representatives",
                        "North Atlantic Treaty Organization",
                        "Republican Party",
                        "Senate"
                    ],
                    "per_facet": [
                        "Cheney, Liz",
                        "Graham, Lindsey",
                        "Johnson, Mike (1972- )",
                        "Navalny, Aleksei A",
                        "Putin, Vladimir V",
                        "Scott, Timothy Eugene",
                        "Trump, Donald J",
                        "Turner, Michael R"
                    ],
                    "geo_facet": [],
                    "multimedia": [
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18dc-repub1-kfbh/18dc-repub1-kfbh-superJumbo.jpg",
                            "format": "Super Jumbo",
                            "height": 1365,
                            "width": 2048,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Senator Tim Scott, Republican of South Carolina, ignored the fact that former President Donald J. Trump has remained silent in the days after the death of the Russian opposition leader Aleksei A. Navalny.",
                            "copyright": "Kendrick Brinson for The New York Times"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18dc-repub1-kfbh/18dc-repub1-kfbh-threeByTwoSmallAt2X.jpg",
                            "format": "threeByTwoSmallAt2X",
                            "height": 400,
                            "width": 600,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Senator Tim Scott, Republican of South Carolina, ignored the fact that former President Donald J. Trump has remained silent in the days after the death of the Russian opposition leader Aleksei A. Navalny.",
                            "copyright": "Kendrick Brinson for The New York Times"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18dc-repub1-kfbh/18dc-repub1-kfbh-thumbLarge.jpg",
                            "format": "Large Thumbnail",
                            "height": 150,
                            "width": 150,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Senator Tim Scott, Republican of South Carolina, ignored the fact that former President Donald J. Trump has remained silent in the days after the death of the Russian opposition leader Aleksei A. Navalny.",
                            "copyright": "Kendrick Brinson for The New York Times"
                        }
                    ],
                    "short_url": ""
                },
                {
                    "section": "us",
                    "subsection": "politics",
                    "title": "Intelligence Chairman Defends His Hints About a Russian Space Weapon",
                    "abstract": "Representative Michael R. Turner, who drew criticism last week after releasing a cryptic statement about a new threat, said he wanted to avoid “an international crisis.”",
                    "url": "https://www.nytimes.com/2024/02/18/us/politics/mike-turner-russia-nuclear-space.html",
                    "uri": "nyt://article/94351841-8d33-5b47-b1c3-c255324c47c9",
                    "byline": "By Minho Kim",
                    "item_type": "Article",
                    "updated_date": "2024-02-18T16:09:16-05:00",
                    "created_date": "2024-02-18T16:09:16-05:00",
                    "published_date": "2024-02-18T16:09:16-05:00",
                    "material_type_facet": "",
                    "kicker": "",
                    "des_facet": [
                        "United States Politics and Government",
                        "Classified Information and State Secrets",
                        "Russian Invasion of Ukraine (2022)",
                        "Foreign Aid",
                        "Nuclear Weapons"
                    ],
                    "org_facet": [
                        "House Committee on Intelligence"
                    ],
                    "per_facet": [
                        "Turner, Michael R",
                        "Biden, Joseph R Jr"
                    ],
                    "geo_facet": [
                        "Russia",
                        "Ukraine"
                    ],
                    "multimedia": [
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18dc-turner-fgkb/18dc-turner-fgkb-superJumbo.jpg",
                            "format": "Super Jumbo",
                            "height": 1365,
                            "width": 2048,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Representative Michael R. Turner faced anger from the White House after his committee called for the release of classified material without mentioning what it was.",
                            "copyright": "Haiyun Jiang for The New York Times"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18dc-turner-fgkb/18dc-turner-fgkb-threeByTwoSmallAt2X.jpg",
                            "format": "threeByTwoSmallAt2X",
                            "height": 400,
                            "width": 600,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Representative Michael R. Turner faced anger from the White House after his committee called for the release of classified material without mentioning what it was.",
                            "copyright": "Haiyun Jiang for The New York Times"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18dc-turner-fgkb/18dc-turner-fgkb-thumbLarge.jpg",
                            "format": "Large Thumbnail",
                            "height": 150,
                            "width": 150,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Representative Michael R. Turner faced anger from the White House after his committee called for the release of classified material without mentioning what it was.",
                            "copyright": "Haiyun Jiang for The New York Times"
                        }
                    ],
                    "short_url": ""
                },
                {
                    "section": "realestate",
                    "subsection": "",
                    "title": "In New York, the Trump Brand Is Costing Some Condo Owners",
                    "abstract": "When Donald J. Trump became president, condominiums in buildings emblazoned with his name began selling for less, according to an analysis.",
                    "url": "https://www.nytimes.com/2024/02/18/realestate/trump-condos-prices-nyc.html",
                    "uri": "nyt://article/3bcd5528-94bb-5e1b-9df2-a4f742fe803e",
                    "byline": "By Rukmini Callimachi",
                    "item_type": "Article",
                    "updated_date": "2024-02-18T10:44:59-05:00",
                    "created_date": "2024-02-18T05:06:28-05:00",
                    "published_date": "2024-02-18T05:06:28-05:00",
                    "material_type_facet": "",
                    "kicker": "",
                    "des_facet": [
                        "Real Estate and Housing (Residential)",
                        "Condominiums",
                        "Trademarks and Trade Names",
                        "Suits and Litigation (Civil)"
                    ],
                    "org_facet": [
                        "CityRealty.com",
                        "Trump Organization",
                        "Trump Tower (Manhattan, NY)"
                    ],
                    "per_facet": [
                        "Trump, Donald J"
                    ],
                    "geo_facet": [
                        "Manhattan (NYC)"
                    ],
                    "multimedia": [
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18trumpbrand8-wmpj/18trumpbrand8-wmpj-superJumbo.jpg",
                            "format": "Super Jumbo",
                            "height": 1365,
                            "width": 2048,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Condos in buildings branded with the Trump logo, like this one, have dropped in price in recent years. ",
                            "copyright": "Ahmed Gaber for The New York Times"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18trumpbrand8-wmpj/18trumpbrand8-wmpj-threeByTwoSmallAt2X.jpg",
                            "format": "threeByTwoSmallAt2X",
                            "height": 400,
                            "width": 600,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Condos in buildings branded with the Trump logo, like this one, have dropped in price in recent years. ",
                            "copyright": "Ahmed Gaber for The New York Times"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18trumpbrand8-wmpj/18trumpbrand8-wmpj-thumbLarge.jpg",
                            "format": "Large Thumbnail",
                            "height": 150,
                            "width": 150,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Condos in buildings branded with the Trump logo, like this one, have dropped in price in recent years. ",
                            "copyright": "Ahmed Gaber for The New York Times"
                        }
                    ],
                    "short_url": ""
                },
                {
                    "section": "us",
                    "subsection": "politics",
                    "title": "How Two First Ladies Weathered a Most Unusual Presidential Transition",
                    "abstract": "Jill Biden wanted to keep teaching. Melania Trump just wanted to go home. In nearly every way, the two women are a study in contrasts in their approach to the role of first lady.",
                    "url": "https://www.nytimes.com/2024/02/17/us/politics/how-two-first-ladies-weathered-a-most-unusual-presidential-transition.html",
                    "uri": "nyt://article/8ffe54fa-f8d6-5e5b-b712-49c744b253e2",
                    "byline": "By Katie Rogers",
                    "item_type": "Article",
                    "updated_date": "2024-02-18T13:51:28-05:00",
                    "created_date": "2024-02-17T05:02:09-05:00",
                    "published_date": "2024-02-17T05:02:09-05:00",
                    "material_type_facet": "",
                    "kicker": "",
                    "des_facet": [
                        "First Ladies (US)",
                        "Content Type: Personal Profile",
                        "White House Building (Washington, DC)",
                        "Storming of the US Capitol (Jan, 2021)",
                        "United States Politics and Government"
                    ],
                    "org_facet": [
                        "Northern Virginia Community College"
                    ],
                    "per_facet": [
                        "Biden, Jill Tracy Jacobs",
                        "Trump, Melania",
                        "Biden, Joseph R Jr",
                        "Trump, Donald J"
                    ],
                    "geo_facet": [],
                    "multimedia": [
                        {
                            "url": "https://static01.nyt.com/images/2024/02/16/us/politics/16dc-flotus/16dc-flotus-superJumbo.jpg",
                            "format": "Super Jumbo",
                            "height": 1365,
                            "width": 2048,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "The winter of 2021 was an unusual transition period for Jill Biden and Melania Trump.",
                            "copyright": "Left, Maansi Srivastava/The New York Times; Erin Scott for The New York Times"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/16/us/politics/16dc-flotus/16dc-flotus-threeByTwoSmallAt2X.jpg",
                            "format": "threeByTwoSmallAt2X",
                            "height": 400,
                            "width": 600,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "The winter of 2021 was an unusual transition period for Jill Biden and Melania Trump.",
                            "copyright": "Left, Maansi Srivastava/The New York Times; Erin Scott for The New York Times"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/16/us/politics/16dc-flotus/16dc-flotus-thumbLarge.jpg",
                            "format": "Large Thumbnail",
                            "height": 150,
                            "width": 150,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "The winter of 2021 was an unusual transition period for Jill Biden and Melania Trump.",
                            "copyright": "Left, Maansi Srivastava/The New York Times; Erin Scott for The New York Times"
                        }
                    ],
                    "short_url": ""
                },
                {
                    "section": "us",
                    "subsection": "politics",
                    "title": "Poll Ranks Biden as 14th-Best President, With Trump Last",
                    "abstract": "President Biden may owe his place in the top third to his predecessor: Mr. Biden’s signature accomplishment, according to the historians, was evicting Donald J. Trump from the Oval Office.",
                    "url": "https://www.nytimes.com/2024/02/18/us/politics/biden-trump-presidential-rankings.html",
                    "uri": "nyt://article/30a1abea-8160-5131-bda7-c5209201b317",
                    "byline": "By Peter Baker",
                    "item_type": "Article",
                    "updated_date": "2024-02-18T16:40:58-05:00",
                    "created_date": "2024-02-18T16:40:58-05:00",
                    "published_date": "2024-02-18T16:40:58-05:00",
                    "material_type_facet": "",
                    "kicker": "",
                    "des_facet": [
                        "United States Politics and Government",
                        "Presidents and Presidency (US)",
                        "Polls and Public Opinion"
                    ],
                    "org_facet": [],
                    "per_facet": [
                        "Biden, Joseph R Jr",
                        "Buchanan, James",
                        "Bush, George",
                        "Bush, George W",
                        "Clinton, Bill",
                        "Eisenhower, Dwight David",
                        "Grant, Ulysses S",
                        "Jackson, Andrew",
                        "Jefferson, Thomas",
                        "Johnson, Andrew",
                        "Lincoln, Abraham",
                        "Obama, Barack",
                        "Pierce, Franklin",
                        "Reagan, Ronald Wilson",
                        "Roosevelt, Franklin Delano",
                        "Trump, Donald J",
                        "Washington, George (1732-99)",
                        "Wilson, Woodrow"
                    ],
                    "geo_facet": [],
                    "multimedia": [
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18dc-presidents-kqwh/18dc-presidents-kqwh-superJumbo.jpg",
                            "format": "Super Jumbo",
                            "height": 1366,
                            "width": 2048,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "A poll of historians ranks President Biden just ahead of Woodrow Wilson, Ronald Reagan and Ulysses S. Grant.",
                            "copyright": "Haiyun Jiang for The New York Times"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18dc-presidents-kqwh/18dc-presidents-kqwh-threeByTwoSmallAt2X.jpg",
                            "format": "threeByTwoSmallAt2X",
                            "height": 400,
                            "width": 600,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "A poll of historians ranks President Biden just ahead of Woodrow Wilson, Ronald Reagan and Ulysses S. Grant.",
                            "copyright": "Haiyun Jiang for The New York Times"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18dc-presidents-kqwh/18dc-presidents-kqwh-thumbLarge.jpg",
                            "format": "Large Thumbnail",
                            "height": 150,
                            "width": 150,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "A poll of historians ranks President Biden just ahead of Woodrow Wilson, Ronald Reagan and Ulysses S. Grant.",
                            "copyright": "Haiyun Jiang for The New York Times"
                        }
                    ],
                    "short_url": ""
                },
                {
                    "section": "business",
                    "subsection": "economy",
                    "title": "Nature Has Value. Could We Literally Invest in It?",
                    "abstract": "“Natural asset companies” would put a market price on improving ecosystems, rather than on destroying them.",
                    "url": "https://www.nytimes.com/2024/02/18/business/economy/natural-assets.html",
                    "uri": "nyt://article/ff7aab49-8f67-5ef0-b965-08aeb6b7325d",
                    "byline": "By Lydia DePillis",
                    "item_type": "Article",
                    "updated_date": "2024-02-18T10:28:24-05:00",
                    "created_date": "2024-02-18T05:03:02-05:00",
                    "published_date": "2024-02-18T05:03:02-05:00",
                    "material_type_facet": "",
                    "kicker": "",
                    "des_facet": [
                        "Conservation of Resources",
                        "Stocks and Bonds",
                        "Land Use Policies",
                        "Forests and Forestry",
                        "Environment",
                        "United States Politics and Government",
                        "Regulation and Deregulation of Industry"
                    ],
                    "org_facet": [
                        "Intrinsic Exchange Group Inc"
                    ],
                    "per_facet": [],
                    "geo_facet": [],
                    "multimedia": [
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/magazine/18mag-bigidea/18mag-bigidea-superJumbo.jpg",
                            "format": "Super Jumbo",
                            "height": 2048,
                            "width": 2048,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "",
                            "copyright": "Photo Illustration by Alex Merto"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/magazine/18mag-bigidea/18mag-bigidea-threeByTwoSmallAt2X.jpg",
                            "format": "threeByTwoSmallAt2X",
                            "height": 400,
                            "width": 600,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "",
                            "copyright": "Photo Illustration by Alex Merto"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/magazine/18mag-bigidea/18mag-bigidea-thumbLarge.jpg",
                            "format": "Large Thumbnail",
                            "height": 150,
                            "width": 150,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "",
                            "copyright": "Photo Illustration by Alex Merto"
                        }
                    ],
                    "short_url": ""
                },
                {
                    "section": "world",
                    "subsection": "middleeast",
                    "title": "Overwhelmed by War, Another Gazan Hospital Is Declared ‘Not Functional’",
                    "abstract": "Conditions at Nasser Hospital in the southern Gaza Strip were described as desperate after Israeli forces raided it in search of Hamas militants.",
                    "url": "https://www.nytimes.com/2024/02/18/world/middleeast/haza-nasser-hospital-rafah.html",
                    "uri": "nyt://article/1600694f-eb58-511a-94f8-8b85a8edf2d9",
                    "byline": "By Isabel Kershner, Vivek Shankar and Talmon Joseph Smith",
                    "item_type": "Article",
                    "updated_date": "2024-02-18T19:54:11-05:00",
                    "created_date": "2024-02-18T19:00:13-05:00",
                    "published_date": "2024-02-18T19:00:13-05:00",
                    "material_type_facet": "",
                    "kicker": "",
                    "des_facet": [
                        "Israel-Gaza War (2023- )",
                        "Hospitals",
                        "Refugees and Displaced Persons",
                        "Palestinians"
                    ],
                    "org_facet": [
                        "World Health Organization",
                        "Hamas"
                    ],
                    "per_facet": [
                        "Tedros Adhanom Ghebreyesus"
                    ],
                    "geo_facet": [
                        "Khan Younis (Gaza Strip)",
                        "Rafah (Gaza Strip)",
                        "Gaza Strip"
                    ],
                    "multimedia": [
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18mideast-ledeall-mtlz/18mideast-ledeall-mtlz-superJumbo.jpg",
                            "format": "Super Jumbo",
                            "height": 1365,
                            "width": 2048,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Khan Younis, in southern Gazam on Sunday.",
                            "copyright": "Said Khatib/Agence France-Presse — Getty Images"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18mideast-ledeall-mtlz/18mideast-ledeall-mtlz-threeByTwoSmallAt2X.jpg",
                            "format": "threeByTwoSmallAt2X",
                            "height": 400,
                            "width": 600,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Khan Younis, in southern Gazam on Sunday.",
                            "copyright": "Said Khatib/Agence France-Presse — Getty Images"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18mideast-ledeall-mtlz/18mideast-ledeall-mtlz-thumbLarge.jpg",
                            "format": "Large Thumbnail",
                            "height": 150,
                            "width": 150,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Khan Younis, in southern Gazam on Sunday.",
                            "copyright": "Said Khatib/Agence France-Presse — Getty Images"
                        }
                    ],
                    "short_url": ""
                },
                {
                    "section": "nyregion",
                    "subsection": "",
                    "title": "How a Notorious Jail Became a Literary Hotbed",
                    "abstract": "A court fight over Rikers Island’s future has produced thousands of pages about the jail complex’s troubled state. Inmate authors have produced thousands more.",
                    "url": "https://www.nytimes.com/2024/02/18/nyregion/rikers-island-authors.html",
                    "uri": "nyt://article/5ccc6ef4-52d4-55d4-8b86-41c992b61bfa",
                    "byline": "By Corey Kilgannon",
                    "item_type": "Article",
                    "updated_date": "2024-02-18T14:57:37-05:00",
                    "created_date": "2024-02-18T03:00:42-05:00",
                    "published_date": "2024-02-18T03:00:42-05:00",
                    "material_type_facet": "",
                    "kicker": "",
                    "des_facet": [
                        "Books and Literature",
                        "Book Trade and Publishing",
                        "Prisons and Prisoners",
                        "Prison Guards and Corrections Officers",
                        "audio-neutral-informative"
                    ],
                    "org_facet": [
                        "Rikers Island Prison Complex"
                    ],
                    "per_facet": [],
                    "geo_facet": [
                        "New York City"
                    ],
                    "multimedia": [
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/nyregion/18rikers-authors-01-tjgh/00rikers-authors-01-tjgh-superJumbo.jpg",
                            "format": "Super Jumbo",
                            "height": 1536,
                            "width": 2048,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Michele Evans found inspiration for writing all around during an 18-month stint in Rikers.",
                            "copyright": "Ye Fan for The New York Times"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/nyregion/18rikers-authors-01-tjgh/00rikers-authors-01-tjgh-threeByTwoSmallAt2X.jpg",
                            "format": "threeByTwoSmallAt2X",
                            "height": 400,
                            "width": 600,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Michele Evans found inspiration for writing all around during an 18-month stint in Rikers.",
                            "copyright": "Ye Fan for The New York Times"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/nyregion/18rikers-authors-01-tjgh/00rikers-authors-01-tjgh-thumbLarge.jpg",
                            "format": "Large Thumbnail",
                            "height": 150,
                            "width": 150,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Michele Evans found inspiration for writing all around during an 18-month stint in Rikers.",
                            "copyright": "Ye Fan for The New York Times"
                        }
                    ],
                    "short_url": ""
                },
                {
                    "section": "opinion",
                    "subsection": "",
                    "title": "Restoring the Past Won’t Liberate Palestine",
                    "abstract": "When is ‘decolonization’ helpful? And when does it set us back?",
                    "url": "https://www.nytimes.com/2024/02/18/opinion/israel-gaza-palestine-decolonization.html",
                    "uri": "nyt://article/a30687e2-01da-5804-b92e-eceed8023ff3",
                    "byline": "By Lydia Polgreen",
                    "item_type": "Article",
                    "updated_date": "2024-02-18T09:36:21-05:00",
                    "created_date": "2024-02-18T07:24:54-05:00",
                    "published_date": "2024-02-18T07:24:54-05:00",
                    "material_type_facet": "",
                    "kicker": "Lydia Polgreen",
                    "des_facet": [
                        "Israel-Gaza War (2023- )",
                        "Colonization",
                        "Jews and Judaism",
                        "Palestinians",
                        "Indigenous People",
                        "Politics and Government",
                        "Books and Literature"
                    ],
                    "org_facet": [],
                    "per_facet": [
                        "Fanon, Frantz",
                        "Said, Edward W",
                        "Taiwo, Olufemi O"
                    ],
                    "geo_facet": [
                        "Israel",
                        "Gaza Strip"
                    ],
                    "multimedia": [
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/opinion/18polgreen/18polgreen-superJumbo.jpg",
                            "format": "Super Jumbo",
                            "height": 1800,
                            "width": 1800,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "",
                            "copyright": "Shuhua Xiong"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/opinion/18polgreen/18polgreen-threeByTwoSmallAt2X.jpg",
                            "format": "threeByTwoSmallAt2X",
                            "height": 400,
                            "width": 600,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "",
                            "copyright": "Shuhua Xiong"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/opinion/18polgreen/18polgreen-thumbLarge.jpg",
                            "format": "Large Thumbnail",
                            "height": 150,
                            "width": 150,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "",
                            "copyright": "Shuhua Xiong"
                        }
                    ],
                    "short_url": ""
                },
                {
                    "section": "opinion",
                    "subsection": "",
                    "title": "Could Long Covid Be the Senate’s Bipartisan Cause?",
                    "abstract": "After four long years, there’s reason to hope that the condition will get the attention that it and the many who suffer from it deserve.",
                    "url": "https://www.nytimes.com/2024/02/18/opinion/long-covid-research-funding.html",
                    "uri": "nyt://article/7b11a9ca-931e-5e46-94bc-53ec23af6564",
                    "byline": "By Zeynep Tufekci",
                    "item_type": "Article",
                    "updated_date": "2024-02-18T09:00:21-05:00",
                    "created_date": "2024-02-18T09:00:21-05:00",
                    "published_date": "2024-02-18T09:00:21-05:00",
                    "material_type_facet": "",
                    "kicker": "Zeynep Tufekci",
                    "des_facet": [
                        "United States Politics and Government",
                        "Long Covid",
                        "Chronic Condition (Health)",
                        "Clinical Trials"
                    ],
                    "org_facet": [
                        "President's Emergency Plan for AIDS Relief",
                        "National Institutes of Health",
                        "Senate"
                    ],
                    "per_facet": [],
                    "geo_facet": [],
                    "multimedia": [
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/opinion/18tufekci-image/18tufekci-image-superJumbo.png",
                            "format": "Super Jumbo",
                            "height": 2048,
                            "width": 2048,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "",
                            "copyright": "Allie Sullberg"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/opinion/18tufekci-image/18tufekci-image-threeByTwoSmallAt2X.png",
                            "format": "threeByTwoSmallAt2X",
                            "height": 400,
                            "width": 600,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "",
                            "copyright": "Allie Sullberg"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/opinion/18tufekci-image/18tufekci-image-thumbLarge.png",
                            "format": "Large Thumbnail",
                            "height": 150,
                            "width": 150,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "",
                            "copyright": "Allie Sullberg"
                        }
                    ],
                    "short_url": ""
                },
                {
                    "section": "opinion",
                    "subsection": "",
                    "title": "MAGA’s Violent Threats Are Warping Life in America",
                    "abstract": "Nowhere is this more true than in red states.",
                    "url": "https://www.nytimes.com/2024/02/18/opinion/magas-violent-threats-are-warping-life-in-america.html",
                    "uri": "nyt://article/ed40847c-02c3-5a83-b44f-d0a38b6283a7",
                    "byline": "By David French",
                    "item_type": "Article",
                    "updated_date": "2024-02-18T09:14:33-05:00",
                    "created_date": "2024-02-18T09:00:22-05:00",
                    "published_date": "2024-02-18T09:00:22-05:00",
                    "material_type_facet": "",
                    "kicker": "David French",
                    "des_facet": [
                        "Right-Wing Extremism and Alt-Right",
                        "Threats and Threatening Messages",
                        "United States Politics and Government",
                        "Cyberharassment",
                        "Elections"
                    ],
                    "org_facet": [],
                    "per_facet": [
                        "Trump, Donald J"
                    ],
                    "geo_facet": [],
                    "multimedia": [
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/opinion/18french/18french-superJumbo.jpg",
                            "format": "Super Jumbo",
                            "height": 2048,
                            "width": 1640,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "",
                            "copyright": "Yifei Fang/Getty Images"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/opinion/18french/18french-threeByTwoSmallAt2X.jpg",
                            "format": "threeByTwoSmallAt2X",
                            "height": 400,
                            "width": 600,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "",
                            "copyright": "Yifei Fang/Getty Images"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/opinion/18french/18french-thumbLarge.jpg",
                            "format": "Large Thumbnail",
                            "height": 150,
                            "width": 150,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "",
                            "copyright": "Yifei Fang/Getty Images"
                        }
                    ],
                    "short_url": ""
                },
                {
                    "section": "opinion",
                    "subsection": "",
                    "title": "The Most Important Writing Exercise I’ve Ever Assigned",
                    "abstract": "I share an important exercise with my writing students that asks them to stand in another person’s shoes. They’re finding it harder and harder to do.",
                    "url": "https://www.nytimes.com/2024/02/18/opinion/radical-empathy-fiction.html",
                    "uri": "nyt://article/e1a6cf91-094e-5ac6-a7a6-69f05dbeb2fe",
                    "byline": "By Rachel Kadish",
                    "item_type": "Article",
                    "updated_date": "2024-02-18T14:53:30-05:00",
                    "created_date": "2024-02-18T09:00:02-05:00",
                    "published_date": "2024-02-18T09:00:02-05:00",
                    "material_type_facet": "",
                    "kicker": "Guest Essay",
                    "des_facet": [
                        "Writing and Writers",
                        "Books and Literature",
                        "Empathy",
                        "Who's Irish? (Book)"
                    ],
                    "org_facet": [],
                    "per_facet": [],
                    "geo_facet": [],
                    "multimedia": [
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/opinion/18kadish/18kadish-superJumbo-v4.jpg",
                            "format": "Super Jumbo",
                            "height": 2048,
                            "width": 2048,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "",
                            "copyright": "André Derainne"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/opinion/18kadish/18kadish-threeByTwoSmallAt2X-v4.jpg",
                            "format": "threeByTwoSmallAt2X",
                            "height": 400,
                            "width": 600,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "",
                            "copyright": "André Derainne"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/opinion/18kadish/18kadish-thumbLarge-v4.jpg",
                            "format": "Large Thumbnail",
                            "height": 150,
                            "width": 150,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "",
                            "copyright": "André Derainne"
                        }
                    ],
                    "short_url": ""
                },
                {
                    "section": "movies",
                    "subsection": "",
                    "title": "‘Oppenheimer’ Sweeps the BAFTAs With 7 Awards Including Best Film",
                    "abstract": "“The Holdovers” and “Poor Things” were also honored at the British equivalent of the Oscars, while “Saltburn” and “Barbie” left empty-handed.",
                    "url": "https://www.nytimes.com/2024/02/18/movies/baftas-winners-2024-oppenheimer.html",
                    "uri": "nyt://article/7d82f448-7be0-5e2f-83eb-fe08d5dd436f",
                    "byline": "By Alex Marshall",
                    "item_type": "Article",
                    "updated_date": "2024-02-18T16:32:47-05:00",
                    "created_date": "2024-02-18T15:45:25-05:00",
                    "published_date": "2024-02-18T15:45:25-05:00",
                    "material_type_facet": "",
                    "kicker": "",
                    "des_facet": [
                        "Movies",
                        "The Holdovers (Movie)",
                        "Oppenheimer (Movie)",
                        "Poor Things (Movie)",
                        "Anatomy of a Fall (Movie)",
                        "Killers of the Flower Moon (Movie)"
                    ],
                    "org_facet": [
                        "British Academy of Film and Television"
                    ],
                    "per_facet": [
                        "Nolan, Christopher",
                        "Triet, Justine",
                        "Payne, Alexander",
                        "Scorsese, Martin",
                        "Lanthimos, Yorgos",
                        "Stone, Emma",
                        "Murphy, Cillian",
                        "Downey, Robert Jr",
                        "Glazer, Jonathan",
                        "Randolph, Da'Vine Joy"
                    ],
                    "geo_facet": [
                        "London (England)"
                    ],
                    "multimedia": [
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18bafta-oppenheimer2-pwjt/18bafta-oppenheimer2-pwjt-superJumbo.jpg",
                            "format": "Super Jumbo",
                            "height": 1365,
                            "width": 2048,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Cillian Murphy as the title character of “Oppenheimer.” He won the best actor BAFTA for his performance, and “Oppenheimer” swept the honors, taking best director, best film and others.",
                            "copyright": "Melinda Sue Gordon/Universal Pictures"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18bafta-oppenheimer2-pwjt/18bafta-oppenheimer2-pwjt-threeByTwoSmallAt2X.jpg",
                            "format": "threeByTwoSmallAt2X",
                            "height": 400,
                            "width": 600,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Cillian Murphy as the title character of “Oppenheimer.” He won the best actor BAFTA for his performance, and “Oppenheimer” swept the honors, taking best director, best film and others.",
                            "copyright": "Melinda Sue Gordon/Universal Pictures"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18bafta-oppenheimer2-pwjt/18bafta-oppenheimer2-pwjt-thumbLarge.jpg",
                            "format": "Large Thumbnail",
                            "height": 150,
                            "width": 150,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "Cillian Murphy as the title character of “Oppenheimer.” He won the best actor BAFTA for his performance, and “Oppenheimer” swept the honors, taking best director, best film and others.",
                            "copyright": "Melinda Sue Gordon/Universal Pictures"
                        }
                    ],
                    "short_url": ""
                },
                {
                    "section": "world",
                    "subsection": "asia",
                    "title": "Dozens Killed in Papua New Guinea Massacre, Official Says",
                    "abstract": "The bloodshed in Enga Province, which has been plagued by violence between tribal groups, left at least 53 people dead, the official said.",
                    "url": "https://www.nytimes.com/2024/02/18/world/asia/papua-new-guinea-killings.html",
                    "uri": "nyt://article/0b3978d1-70fe-57bc-891b-221e8c54d974",
                    "byline": "By Natasha Frost",
                    "item_type": "Article",
                    "updated_date": "2024-02-18T21:47:09-05:00",
                    "created_date": "2024-02-18T21:47:09-05:00",
                    "published_date": "2024-02-18T21:47:09-05:00",
                    "material_type_facet": "",
                    "kicker": "",
                    "des_facet": [],
                    "org_facet": [],
                    "per_facet": [],
                    "geo_facet": [
                        "Papua New Guinea"
                    ],
                    "multimedia": null,
                    "short_url": ""
                },
                {
                    "section": "us",
                    "subsection": "",
                    "title": "No, Your Honor, You Can’t Call Yourself ‘High Justice’ on the Ballot in Chinese",
                    "abstract": "San Francisco has printed candidate names in Chinese characters since 1999. But now the city is cracking down on ones that some argue go overboard with flattering, flowery phrases.",
                    "url": "https://www.nytimes.com/2024/02/18/us/chinese-ballot-names-san-francisco.html",
                    "uri": "nyt://article/e4b41604-a61a-5ac3-9ba8-dc92ab79e3f9",
                    "byline": "By Heather Knight and Amy Qin",
                    "item_type": "Article",
                    "updated_date": "2024-02-18T05:00:35-05:00",
                    "created_date": "2024-02-18T05:00:35-05:00",
                    "published_date": "2024-02-18T05:00:35-05:00",
                    "material_type_facet": "",
                    "kicker": "",
                    "des_facet": [
                        "Chinese-Americans",
                        "Chinese Language",
                        "Elections"
                    ],
                    "org_facet": [],
                    "per_facet": [
                        "Breed, London",
                        "Lurie, Daniel"
                    ],
                    "geo_facet": [
                        "San Francisco Bay Area (Calif)",
                        "San Francisco (Calif)"
                    ],
                    "multimedia": [
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18nat-chinese-ballot-zklt/18nat-chinese-ballot-zklt-superJumbo.jpg",
                            "format": "Super Jumbo",
                            "height": 1365,
                            "width": 2048,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "A Chinese language ballot in San Francisco in 2020.",
                            "copyright": "Jim Wilson/The New York Times"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18nat-chinese-ballot-zklt/18nat-chinese-ballot-zklt-threeByTwoSmallAt2X.jpg",
                            "format": "threeByTwoSmallAt2X",
                            "height": 400,
                            "width": 600,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "A Chinese language ballot in San Francisco in 2020.",
                            "copyright": "Jim Wilson/The New York Times"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/multimedia/18nat-chinese-ballot-zklt/18nat-chinese-ballot-zklt-thumbLarge.jpg",
                            "format": "Large Thumbnail",
                            "height": 150,
                            "width": 150,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "A Chinese language ballot in San Francisco in 2020.",
                            "copyright": "Jim Wilson/The New York Times"
                        }
                    ],
                    "short_url": ""
                },
                {
                    "section": "your-money",
                    "subsection": "",
                    "title": "Money in College Savings Accounts Can Now Go Toward Retirement",
                    "abstract": "But there are caveats to moving the money into Roth I.R.A.s, and the government still has to issue guidelines about the option.",
                    "url": "https://www.nytimes.com/2024/02/16/your-money/college-savings-accounts-retirement.html",
                    "uri": "nyt://article/9130f4b0-7704-534b-a66a-1aa1c53d2c41",
                    "byline": "By Ann Carrns",
                    "item_type": "Article",
                    "updated_date": "2024-02-16T21:49:31-05:00",
                    "created_date": "2024-02-16T09:00:21-05:00",
                    "published_date": "2024-02-16T09:00:21-05:00",
                    "material_type_facet": "",
                    "kicker": "your money adviser",
                    "des_facet": [
                        "529 Savings Plans",
                        "Personal Finances",
                        "Tax Credits, Deductions and Exemptions",
                        "Tuition",
                        "Prices (Fares, Fees and Rates)",
                        "Retirement",
                        "Content Type: Service",
                        "Savings",
                        "Individual Retirement Accounts"
                    ],
                    "org_facet": [
                        "College Savings Plans Network"
                    ],
                    "per_facet": [],
                    "geo_facet": [],
                    "multimedia": [
                        {
                            "url": "https://static01.nyt.com/images/2024/02/17/business/16adviser/16adviser-superJumbo.jpg",
                            "format": "Super Jumbo",
                            "height": 2045,
                            "width": 2048,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "",
                            "copyright": "Till Lauer"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/17/business/16adviser/16adviser-threeByTwoSmallAt2X.jpg",
                            "format": "threeByTwoSmallAt2X",
                            "height": 400,
                            "width": 600,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "",
                            "copyright": "Till Lauer"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/17/business/16adviser/16adviser-thumbLarge.jpg",
                            "format": "Large Thumbnail",
                            "height": 150,
                            "width": 150,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "",
                            "copyright": "Till Lauer"
                        }
                    ],
                    "short_url": ""
                },
                {
                    "section": "t-magazine",
                    "subsection": "",
                    "title": "What Do We Gain by Eating With Our Hands?",
                    "abstract": "The sense of touch can be a crucial part of dining, one thing that some cultures have understood better than others.",
                    "url": "https://www.nytimes.com/2024/02/18/t-magazine/eating-with-hands.html",
                    "uri": "nyt://article/88c3380c-e2b8-5cf1-9949-c398ef726a89",
                    "byline": "By Ligaya Mishan and Kyoko Hamada",
                    "item_type": "Article",
                    "updated_date": "2024-02-18T05:00:36-05:00",
                    "created_date": "2024-02-18T05:00:36-05:00",
                    "published_date": "2024-02-18T05:00:36-05:00",
                    "material_type_facet": "",
                    "kicker": "Food Matters",
                    "des_facet": [
                        "Utensils and Cutlery",
                        "Touch (Sense)",
                        "Customs, Etiquette and Manners",
                        "Food",
                        "Cooking and Cookbooks"
                    ],
                    "org_facet": [],
                    "per_facet": [],
                    "geo_facet": [],
                    "multimedia": [
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/t-magazine/18tmag-eatinghands-slide-LBTP-copy/18tmag-eatinghands-slide-LBTP-copy-superJumbo.jpg",
                            "format": "Super Jumbo",
                            "height": 1366,
                            "width": 2048,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "An array of miniatures including, second from bottom left, West African maafé (groundnut stew).",
                            "copyright": "Photograph by Kyoko Hamada. Set design by Suzy Kim"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/t-magazine/18tmag-eatinghands-slide-LBTP-copy/18tmag-eatinghands-slide-LBTP-copy-threeByTwoSmallAt2X.jpg",
                            "format": "threeByTwoSmallAt2X",
                            "height": 400,
                            "width": 600,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "An array of miniatures including, second from bottom left, West African maafé (groundnut stew).",
                            "copyright": "Photograph by Kyoko Hamada. Set design by Suzy Kim"
                        },
                        {
                            "url": "https://static01.nyt.com/images/2024/02/18/t-magazine/18tmag-eatinghands-slide-LBTP-copy/18tmag-eatinghands-slide-LBTP-copy-thumbLarge.jpg",
                            "format": "Large Thumbnail",
                            "height": 150,
                            "width": 150,
                            "type": "image",
                            "subtype": "photo",
                            "caption": "An array of miniatures including, second from bottom left, West African maafé (groundnut stew).",
                            "copyright": "Photograph by Kyoko Hamada. Set design by Suzy Kim"
                        }
                    ],
                    "short_url": ""
                }
            ]
        }
    """.trimIndent()

    val topStories = Gson().fromJson(TopStories, TopStoriesDto::class.java)
}