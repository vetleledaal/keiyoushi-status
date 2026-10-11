# Extension Validation Report

- Extension: tachiyomi-en.mangade-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3447999145778061665
- Source name: MangaDE
- Source language: en
- Selected manga input: popular offset 0: One Piece (`.../one-piece <redacted query values: mid>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | One Piece (`.../one-piece <redacted query values: mid>`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | The Four Of Us Have A 0 Chon Relationship (`.../the-four-of-us-have-a-0-chon-relationship <redacted query values: mid>`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | A Rank Party Wo Ridatsu Shita Ore Wa, Moto Oshiego Tachi To Meikyuu Shinbu Wo Mezasu (`.../a-rank-party-wo-ridatsu-shita-ore-wa-moto-oshiego-tachi-to-meikyuu-shinbu-wo-mezasu <redacted query values: mid>`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Night Light Hounds (`.../night-light-hounds <redacted query values: mid>`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | One Piece (`.../one-piece <redacted query values: mid>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../one-piece <redacted query values: mid>`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1192 | chapter 1 (`.../chapter-1 <redacted query values: cid and mid>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 54 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece, URL=`.../one-piece <redacted query values: mid>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s3-load.ttr.group/.../1755917583401_image.jpg` (image/png, 469806 bytes, 386x556; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../one-piece <redacted query values: mid>` |  |  |  |
| details thumbnail URL | PASS | `https://s3-load.ttr.group/.../1755917583401_image.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Drama, Fantasy, Action, Adventure, Shounen |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | If you’re a fan of anime and manga, then you definitely know One Piece. It’s a Japanese manga series by Eiichiro Oda, a world-renowned manga writer and illustrator. It was released nearly two decades ago back in July of 1997. Since then, the manga has been adapted into an anime series and OVA. There have also been numerous One Piece animated feature films and television specials. One Piece merchandise is also some of the best-selling items in all of anime.&nbsp;    follows the adventurous and funny story of Monkey D. Luffy. As a boy, Luffy has always wanted to be the Pirate King. His body obtained the properties of rubber after eating a Devil Fruit. Together with a diverse crew of wannabe pirates, Luffy sets out on the ocean in an attempt to find the world’s ultimate treasure, One Piece.  When talking about the most successful manga and anime series of all time, One Piece will always enter the conversation. Just the mere fact of it running for almost decades goes to show how loved it is by millions of fans worldwide. What’s interesting is that there are still plenty of folks who are eager to get started on their One Piece adventure. It doesn’t matter if they have to read countless manga chapters or watch hundreds of anime episodes. The undeniable lure of One Piece continues to fascinate fans around the world.  The series boasts of some jaw-dropping numbers. The manga consists of over 800 chapters while the anime series has more than 700 episodes. And there are no signs of slowing down. One Piece has even made it to the Guinness Book of World Records. The manga has 320 million copies in print worldwide as of June 2015.  It’s never too late to join Luffy and his crew of amazing pirates. You can choose to jump straight to the anime series, but many hardcore fans recommend that starters begin with the manga. There are plenty of places where you can read online. Usually, it all boils down to personal preference. You can check out community forums and see a list of the most suggested manga websites. The official version from Viz Media is a good place to start.       One huge determining factor of what manga website to use is how fast it is in releasing new chapters. Most websites are able to upload a new chapter after a day or two from being released. But there are some out there which can release on the same day. Thousands of fans flock to these sites in order to get the first glimpse of the new chapter. After all, you want to be the first in action and avoid getting spoiled in community forums or on social media.  It’s time to begin your own adventure and look for the best place to read online. It shouldn’t be too difficult to find several manga websites. Just be sure to try multiple sites to see their differences so you can come up with an informed decision.  If you are a fan of One Piece, you know that new chapters of this pirate tale are coming out soon. Not every manga website can offer these chapters license-free. That means you may hit a snag when you go to read the newest chapter.  Even if you use the same fan website as before to read chapters you can sometimes discover that you are unable to view the whole story. Make sure to check the website&#039;s terms and agreements.  It is probably more boring to read terms and conditions than One Piece manga, but your time will be well spent. You might find that the website can no longer display licensed content for free. In this instance you may need to apply for a paid account.  It helps to pay for an account so that you get to read the content you crave while the creator&#039;s rights are protected. Besides this, if you sign up for an account, you usually get a choice to read online or on a smart phone or tablet using the app that the website offers.  Always find legitimate websites to read your favorite manga. You will get access to everything with no disappointments. In addition, you have options to read the chapters from a computer or from an app that you download. This lets you have the convenience of reading the story while on a train, in a car, on a plane or wherever you are when the mood to manga hits.  If you want to try a chapter before you sign up for an account at a website that licenses the work, you could take a peek over at a site that is run by a fan. Fans like you are often happy to post chapters which they have translated.  Other attractive Manga : |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1192 chapters |  |  |  |
| chapter dates | PASS | 1192 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s3-load.ttr.group/.../1755917813856_533_image.jpg` (image/jpeg, 159252 bytes, 1200x884) |  |  |  |
