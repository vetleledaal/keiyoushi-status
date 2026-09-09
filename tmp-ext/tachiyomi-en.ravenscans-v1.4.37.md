# Extension Validation Report

- Extension: tachiyomi-en.ravenscans-v1.4.37
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 5160001879976399540
- Source name: Raven Scans
- Source language: en
- Selected manga input: popular offset 0: My Gift LVL 9999 Unlimited Gacha (`.../my-gift-lvl-9999-unlimited-gacha`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 95 | My Gift LVL 9999 Unlimited Gacha (`.../my-gift-lvl-9999-unlimited-gacha`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 95 | Chronicles of Heavenly Demon (`.../chronicles-of-heavenly-demon`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 95 | A Retired Old Sage Takes His Disciple on a Journey (`.../a-retired-old-sage-takes-his-disciple-on-a-journey`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 95 | I Quit the Hero’s Party (`.../i-quit-the-heros-party`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | My Gift LVL 9999 Unlimited Gacha (`.../my-gift-lvl-9999-unlimited-gacha`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | My Gift LVL 9999 Unlimited Gacha (`.../my-gift-lvl-9999-unlimited-gacha`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 218 | Chapter 1 (`.../my-gift-lvl-9999-unlimited-gacha-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 48 |  |  | 1-10s |

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
| popular listing | PASS | 95 entries |  |  |  |
| latest listing | PASS | 95 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My Gift LVL 9999 Unlimited Gacha, URL=`.../my-gift-lvl-9999-unlimited-gacha` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 381/381 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 381/381 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ravenscans.org/.../my-gift-lvl-9999-unlimited-gacha.jpg` (image/jpeg, 39198 bytes, 281x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../my-gift-lvl-9999-unlimited-gacha` |  |  |  |
| details thumbnail URL | PASS | `https://ravenscans.org/.../my-gift-lvl-9999-unlimited-gacha.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Fantasy, Harem, Shounen, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | There are six races in this world: human, beast, dragon, elf, dwarf, and demon. Humans are discriminated against and looked down on as the most inferior race. The “Gathering of Races” was a party with members from each race gathered to dispel such discrimination, but they also had a hidden purpose. They were ordered by the non-human countries to search for the human “Master,” and take it to their own country. Light, a human boy with the gift “Infinite Gacha,” was welcomed into the Gathering of Races as he was suspected of being a Master. But in the end, their investigation showed that Light was not a Master. Just as Light was about to be killed by his teammates, he accidentally stepped on a transfer trap and was teleported to the lowest level of the dungeon. In the deepest dungeon, he was attacked by a mythical level 1000 demon. In a desperate situation, Light used “Infinite Gacha” repeatedly. Luckily, he draws the SUR level 9999 card “Mei the Seeker Maid.” Mei helped Light repel the demons and saved his life. After finally escaping from the crisis, Light decides to take revenge on his former comrades. Mei advises him to remain in the dungeon and use Infinite Gacha to increase his number of trustworthy friends. Light agreed began building up the power necessary to oppose the non-human nations. Three years later, Light had built the strongest nation in the depths of the dungeon. Once again, he will return to the surface to take revenge on his former comrades and search for the truth that nearly killed him.<br><br>Alternative Names: 信じていた仲間達にダンジョン奥地で殺されかけたがギフト『無限ガチャ』でレベル９９９９の仲間達を手に入れて元パーティーメンバーと世界に復讐＆『ざまぁ！』します！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 218 chapters |  |  |  |
| chapter dates | PASS | 218 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn1.ravenscans.org/.../0.jpg` (image/jpeg, 488238 bytes, 1200x1710) |  |  |  |
