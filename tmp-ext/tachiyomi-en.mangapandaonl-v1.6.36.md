# Extension Validation Report

- Extension: tachiyomi-en.mangapandaonl-v1.6.36
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7661417715431651982
- Source name: MangaPanda.onl
- Source language: en
- Selected manga input: popular offset 0: One Piece (`.../one-piece_122`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | One Piece (`.../one-piece_122`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Red Storm (`.../red-storm_119`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Shinka no Mi (`.../shinka-no-mi`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Kamen Rider W: Fuuto Tantei (`.../kamen-rider-w-fuuto-tantei`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | One Piece (`.../one-piece_122`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../one-piece_122`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1216 | Chapter 1 - Romance Dawn (`.../chapter-1.0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 54 |  |  | <1s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece, URL=`.../one-piece_122` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 124/124 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 124/124 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://thumb.mghcdn.com/.../one-piece.jpg` (image/jpeg, 25393 bytes, 222x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../one-piece_122` |  |  |  |
| details thumbnail URL | PASS | `https://thumb.mghcdn.com/.../one-piece.jpg` |  |  |  |
| details author | PASS | Oda Eiichirou (尾田栄一郎) |  |  |  |
| details artist | PASS | Oda Eiichirou (尾田栄一郎) |  |  |  |
| details genres | PASS | Sci-Fi, Action, Comedy, Adventure, Drama, Fantasy, Monsters, Animals, Gore, Award Winning, Shounen, Suggestive |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | If you’re a fan of anime and manga, then you definitely know One Piece. It’s a Japanese manga series by Eiichiro Oda, a world-renowned manga writer and illustrator. It was released nearly two decades ago back in July of 1997. Since then, the manga has been adapted into an anime series and OVA. There have also been numerous One Piece animated feature films and television specials. One Piece merchandise is also some of the best-selling items in all of anime. <br><br><br><br> follows the adventurous and funny story of Monkey D. Luffy. As a boy, Luffy has always wanted to be the Pirate King. His body obtained the properties of rubber after eating a Devil Fruit. Together with a diverse crew of wannabe pirates, Luffy sets out on the ocean in an attempt to find the world’s ultimate treasure, One Piece.<br><br>When talking about the most successful manga and anime series of all time, One Piece will always enter the conversation. Just the mere fact of it running for almost decades goes to show how loved it is by millions of fans worldwide. What’s interesting is that there are still plenty of folks who are eager to get started on their One Piece adventure. It doesn’t matter if they have to read countless manga chapters or watch hundreds of anime episodes. The undeniable lure of One Piece continues to fascinate fans around the world.<br><br>The series boasts of some jaw-dropping numbers. The manga consists of over 800 chapters while the anime series has more than 700 episodes. And there are no signs of slowing down. One Piece has even made it to the Guinness Book of World Records. The manga has 320 million copies in print worldwide as of June 2015.<br><br>It’s never too late to join Luffy and his crew of amazing pirates. You can choose to jump straight to the anime series, but many hardcore fans recommend that starters begin with the manga. There are plenty of places where you can read online. Usually, it all boils down to personal preference. You can check out community forums and see a list of the most suggested manga websites. The official version from Viz Media is a good place to start.<br><br><br><br><br><br><br>One huge determining factor of what manga website to use is how fast it is in releasing new chapters. Most websites are able to upload a new chapter after a day or two from being released. But there are some out there which can release on the same day. Thousands of fans flock to these sites in order to get the first glimpse of the new chapter. After all, you want to be the first in action and avoid getting spoiled in community forums or on social media.<br><br>It’s time to begin your own adventure and look for the best place to read  online. It shouldn’t be too difficult to find several manga websites. Just be sure to try multiple sites to see their differences so you can come up with an informed decision.<br><br>If you are a fan of One Piece, you know that new chapters of this pirate tale are coming out soon. Not every manga website can offer these chapters license-free. That means you may hit a snag when you go to read the newest chapter.<br><br>Even if you use the same  fan website as before to read chapters you can sometimes discover that you are unable to view the whole story. Make sure to check the website's terms and agreements.<br><br>It is probably more boring to read terms and conditions than One Piece manga, but your time will be well spent. You might find that the website can no longer display licensed content for free. In this instance you may need to apply for a paid account.<br><br>It helps to pay for an account so that you get to read the content you crave while the creator's rights are protected. Besides this, if you sign up for an account, you usually get a choice to read online or on a smart phone or tablet using the app that the website offers.<br><br>Always find legitimate websites to read your favorite manga. You will get access to everything with no disappointments. In addition, you have options to read the chapters from a computer or from an app that you download. This lets you have the convenience of reading the story while on a train, in a car, on a plane or wherever you are when the mood to manga hits.<br><br>If you want to try a chapter before you sign up for an account at a website that licenses the work, you could take a peek over at a site that is run by a fan. Fans like you are often happy to post chapters which they have translated.<br><br>Other attractive Manga : |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1216 chapters |  |  |  |
| chapter dates | PASS | 1216 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://imgx.mghcdn.com/.../1.jpg` (image/jpeg, 159252 bytes, 1200x884) |  |  |  |
