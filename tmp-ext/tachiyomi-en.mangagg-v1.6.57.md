# Extension Validation Report

- Extension: tachiyomi-en.mangagg-v1.6.57
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8173282214298911566
- Source name: MangaGG
- Source language: en
- Selected manga input: popular offset 0: The Symbiotic Relationship Between the Rabbit and the Black Panther (`.../472`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | The Symbiotic Relationship Between the Rabbit and the Black Panther (`.../472`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | I’m The One and Only God! (`.../9570`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | It’s A Misunderstanding That I’m Dating The Villain (`.../45301`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | The Symbiotic Relationship Between the Rabbit and the Black Panther (`.../472`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Symbiotic Relationship Between the Rabbit and the Black Panther (`.../472`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Symbiotic Relationship Between the Rabbit and the Black Panther (`.../472`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 24 | Chapter 183 (`.../chapter-183`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Symbiotic Relationship Between the Rabbit and the Black Panther, URL=`472` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangagg.com/.../A-Symbiotic-Relationship-Between-A-Rabbit-And-A-Black-Panther-1-175x238.jpg` (image/jpeg, 13152 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `472` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangagg.com/.../A-Symbiotic-Relationship-Between-A-Rabbit-And-A-Black-Panther-1-193x278.jpg` (image/jpeg, 17986 bytes, 193x278) |  |  |  |
| details author | PASS | Boicha, 야식먹는중 |  |  |  |
| details artist | PASS | Boicha, 야식먹는중 |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Drama, Fantasy, Live Action, Manhwa, Romance, Shoujo, Shoujo Ai, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Read hot manhwa series The Symbiotic Relationship Between the Rabbit and the Black Panther on top manhwa com<br><br>Description about this manhwa hot:<br><br>I was a rabbit shapeshifter who couldn’t even transform into a human by my coming of age ceremony. My family said that I was just a halfling and placed me in a basket… “You’re crying? Go on, cry more.” Then I was then picked up by a black panther with an awful personality. “You’re lacking in stamina. I’ll eat you the day after tomorrow, so keep trying.” This fierce beast. Staring at my trembling face, the black panther’s eyes glistened. “How thrilling.” Mom, I think he’s crazy! To survive a fairly crazy black panther. “The wild beasts are possessive, no matter what it is.” ….Is it possible?<br><br>Manhwaraw other name:<br><br>Maybe you like this series:<br><br>Top manhwa to read in here<br><br>Top of the world manhwa all time that you can find out now<br><br>Manhwa top 10 that We recommend for you should read<br><br><br><br><br><br>Alternative Names: The Symbiotic Relationship Between A Rabbit And A Black Panther, Symbiotic Relationship Between Rabbit And Black Panther, 토끼와 흑표범의 공생 관계 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 24 chapters |  |  |  |
| chapter dates | PASS | 24 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://s3.mangagg.com/.../ch_216_1.jpg` (image/jpeg, 543050 bytes, 720x8000) |  |  |  |
