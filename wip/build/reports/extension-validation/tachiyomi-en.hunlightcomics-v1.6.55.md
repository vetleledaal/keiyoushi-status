# Extension Validation Report

- Extension: tachiyomi-en.hunlightcomics-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 3876544289472679486
- Source name: Hunlight Comics
- Source language: en
- Selected manga input: popular offset 0: Reincarnated Fighting Gamer (`.../88`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Reincarnated Fighting Gamer (`.../88`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 7 | The Outcast Swordsman, Drawn to Power, Masters the Hidden Dungeon (`.../105`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | The Strongest Earthbound Spirit and the Guy With No Spiritual Sense (`.../160`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 7 | Isekai Cheat Survival Food (`.../174`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Reincarnated Fighting Gamer (`.../88`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Reincarnated Fighting Gamer (`.../88`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 26 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 68 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Reincarnated Fighting Gamer, URL=`88` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hunlightcomics.com/.../tensei-kaku-gamer-cover-website-350x476.jpg` (image/jpeg, 67596 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `88` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hunlightcomics.com/.../tensei-kaku-gamer-cover-website-193x278.jpg` (image/jpeg, 26814 bytes, 193x278) |  |  |  |
| details author | PASS | Yamaguchi Mikoto |  |  |  |
| details artist | PASS | Oginouehei |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kairu Mitsushima, a middle-aged fighting game player who had his life changed after meeting the “living legend” of the fighting game world, Daigo Umehara, is reincarnated into another world after a traffic accident… This world turns out to be a brutal place where battles are fought using fighting game knowledge and techniques…!?<br><br>Alternative Names: Tensei Kaku Gamer ~Oji demo Kateru Isekai Kouryaku~ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 26 chapters |  |  |  |
| chapter dates | PASS | 26 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 68 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hunlightcomics.com/.../00.jpg` (image/jpeg, 358309 bytes, 1350x2070) |  |  |  |
