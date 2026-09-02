# Extension Validation Report

- Extension: tachiyomi-en.orionscans-v1.6.26
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
- Source ID: 7776050777496310004
- Source name: Orion Scans
- Source language: en
- Selected manga input: popular offset 0: A Livid Lady's Guide to Getting Even: How I Crushed My Homeland with My Mighty Grimoires (`.../a-livid-lady's-guide-to-getting-even:-how-i-crushed-my-homeland-with-my-mighty-grimoires`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | A Livid Lady's Guide to Getting Even: How I Crushed My Homeland with My Mighty Grimoires (`.../a-livid-lady's-guide-to-getting-even:-how-i-crushed-my-homeland-with-my-mighty-grimoires`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | The Lowest Adventurer. When the Guild is Expelled, Efforts Are Rewarded and He Gets (Unconditional Victory) (`.../the-lowest-adventurer.-when-the-guild-is-expelled-efforts-are-rewarded-and-he-gets-(unconditional-victory)`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Little Fenrir and the Huge Dungeon (`.../little-fenrir-and-the-huge-dungeon`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | MMO! Playing the Game Freely Led to Superhuman Abilities (`.../mmo!-playing-the-game-freely-led-to-superhuman-abilities`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A Livid Lady's Guide to Getting Even: How I Crushed My Homeland with My Mighty Grimoires (`.../a-livid-lady's-guide-to-getting-even:-how-i-crushed-my-homeland-with-my-mighty-grimoires`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Livid Lady's Guide to Getting Even: How I Crushed My Homeland with My Mighty Grimoires (`.../a-livid-lady's-guide-to-getting-even:-how-i-crushed-my-homeland-with-my-mighty-grimoires`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 12 | Chapter 43 (`.../chapter-43`) |  | <1s |
| pages | `getPageList(chapter)` | success | 31 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Livid Lady's Guide to Getting Even: How I Crushed My Homeland with My Mighty Grimoires, URL=`a-livid-lady's-guide-to-getting-even:-how-i-crushed-my-homeland-with-my-mighty-grimoires#135` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.orion-scans.com/.../d35595a7-3497-442f-82cf-049c5c80b2ea.jpg` (image/jpeg, 816883 bytes, 864x1229) |  |  |  |
| details identity | PASS | Details preserved selected URL `a-livid-lady's-guide-to-getting-even:-how-i-crushed-my-homeland-with-my-mighty-grimoires#135` |  |  |  |
| details thumbnail URL | PASS | `https://storage.orion-scans.com/.../d35595a7-3497-442f-82cf-049c5c80b2ea.jpg` |  |  |  |
| details author | PASS | Hagure Metabo |  |  |  |
| details artist | PASS | OONO Imo |  |  |  |
| details genres | PASS | Manga, Shounen, Drama, Adventure, Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | From J-Novel Club: Elizabeth Leiston, the daughter of Haldoria’s powerful prime minister, is the picture of a refined noble lady and the perfect future queen. But when her fiancé publicly humiliates her, calls off their engagement, and starts spreading nasty rumors about her, Elizabeth reaches her breaking point. Why should her only friend be her loyal maid, and why should she continue to serve a country that doesn’t respect her? Elizabeth concludes she won't stand it any longer and will bring down the kingdom, even if it's the last thing she does! As such, she uses her quick wit and, more importantly, her seven magic grimoires to embark on a quest for revenge. And let her tell you, there will be hell to pay!<br><br>Alternative Names: A Livid Lady's Guide to Getting Even: How I Crushed My Homeland with My Mighty Grimoires / Buchigire Reijou wa Houfuku wo Chikaimashita. / ブチ切れ令嬢は報復を誓いました。　～魔導書の力で祖国を叩き潰します～ / 열받은 영애는 복수를 다짐했습니다 ~마도서의 힘으로 조국을 부숴버릴게요~ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | PASS | 12 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://storage.orion-scans.com/.../page-0001_0_1783569234772-871525.jpg` (image/jpeg, 309129 bytes, 1024x1044) |  |  |  |
